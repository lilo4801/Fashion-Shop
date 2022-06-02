package Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DB.DBCart;
import DB.DBOrder;
import DB.DBProduct;
import Model.Cart;
import Model.Order;
import Model.Product;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author window
 */
@WebServlet(urlPatterns = {"/cart", "/checkout", "/removeFromCart", "/addToCart", "/listOrders"})
public class CartController extends HttpServlet {

    DBOrder dbOrder;
    DBProduct dbProduct;
    DBCart dbCart;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        dbOrder = new DBOrder();
        dbProduct = new DBProduct();
        dbCart = new DBCart();
    }

    String getCookies(String nameCook, HttpServletRequest request) {
        String value = null;
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie aCookie : cookies) {
                String name = aCookie.getName();
                if (name.equals(nameCook)) {
                    value = aCookie.getValue();
                    break;
                }
            }
        }

        return value;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = getCurrentUrl(request);
        String cartIdStr = getCookies("cartId", request);
        request.setAttribute("contextPath", request.getContextPath());
        if (cartIdStr != null) {

            if (url.equals("/ProjectWeb/cart")) {
                String error = request.getParameter("error");
                if (error != null) {
                    request.setAttribute("error", error);
                }

                try {

                    Long cartId = Long.parseLong(cartIdStr);
                    List<Order> ordersList = dbOrder.loadOrderByCartId(cartId);
                    List<Product> productInCart = new ArrayList<>();
                    for (int i = 0; i < ordersList.size(); i++) {
                        Product product = dbProduct.loadProductsByID(ordersList.get(i).getProductId());
                        productInCart.add(product);
                    }
                    Cart cart = dbCart.loadCartById(cartId);
                    request.setAttribute("ordersList", ordersList);
                    request.setAttribute("cart", cart);
                    request.setAttribute("productInCart", productInCart);
                    request.getRequestDispatcher("cart/cart.jsp").forward(request, response);
                } catch (Exception e) {
                }

            } else if (url.equals("/ProjectWeb/removeFromCart")) {
                try {
                    String orderIdStr = request.getParameter("orderId");
                    Long cartId = Long.parseLong(cartIdStr);

                    if (orderIdStr != null) {
                        Long orderId = Long.parseLong(orderIdStr);
                        dbOrder.deleteFromCart(orderId);
                        List<Order> ordersList = dbOrder.loadOrderByCartId(cartId);
                        float totalPriceCart = totalPriceCart(ordersList);
                        dbCart.updateByPrice(totalPriceCart, cartId);
                        response.sendRedirect("cart");
                    }
                } catch (Exception e) {
                    response.sendRedirect("notfound");
                }

            } else if (url.equals("/ProjectWeb/listOrders")) {
                String userIdStr = getCookies("userId", request);
                String cartIdStrSelect = request.getParameter("cartId");
                request.setAttribute("cartId", cartIdStrSelect);
                if (cartIdStrSelect != null) {
                    Long cartId = Long.parseLong(cartIdStrSelect);
                    List<Order> ordersList = dbOrder.loadOrderByCartId(cartId);
                    List<Product> productInCart = new ArrayList<Product>();
                    for (int i = 0; i < ordersList.size(); i++) {
                        Product product = dbProduct.loadProductsByID(ordersList.get(i).getProductId());
                        productInCart.add(product);
                    }
                    Cart cart = dbCart.loadCartById(cartId);
                    request.setAttribute("ordersList", ordersList);

                    request.setAttribute("productInCart", productInCart);
                }
                try {
                    Long userId = Long.parseLong(userIdStr);
                    List<Cart> listCartsInUser = dbCart.loadCartsByUSerId(userId);
                    request.setAttribute("listCartsInUser", listCartsInUser);
                } catch (Exception e) {
                    response.sendRedirect("notfound");
                }

                request.getRequestDispatcher("cart/listCart.jsp").forward(request, response);

            }
        } else {
            request.getRequestDispatcher("cart/cart.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = getCurrentUrl(request);
        String cartIdStr = getCookies("cartId", request);
        String userIdStr = getCookies("userId", request);
        if (userIdStr != null) {
            if (url.equals("/ProjectWeb/checkout")) {
                if (cartIdStr != null) {
                    try {
                        Long cartId = Long.parseLong(cartIdStr);
                        Cart cart = dbCart.loadCartById(cartId);
                        String address = request.getParameter("address");

                        if (cart != null && cart.getTotalPriceOfProduct() != 0 && !address.equals("")) {

                            Date date = new Date();
                            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

                            deleteCookie("cartId", response);
                            String note = request.getParameter("note");
                            dbCart.checkOutCart(cartId, address, note, formatter.format(date));
                            Long userId = Long.parseLong(userIdStr);
                            Long id = dbCart.insertCart(new Cart(userId, 0, false));
                            Cookie cookieCart = new Cookie("cartId", id + "");
                            response.addCookie(cookieCart);
                            response.sendRedirect("home");

                        } else {
                            response.sendRedirect("cart?error=1");
                        }

                    } catch (Exception e) {

                    }

                }
            } else if (url.equals("/ProjectWeb/addToCart")) {
                String productIdStr = request.getParameter("productId");
                String quantityStr = request.getParameter("quantity");

                Long productId = null;
                Long cartId = null;
                int quantity = 0;
                if (cartIdStr != null && productIdStr != null && quantityStr != null) {
                    try {
                        cartId = Long.parseLong(cartIdStr);
                        productId = Long.parseLong(productIdStr);
                        quantity = Integer.parseInt(quantityStr);
                        Product product = dbProduct.loadProductsByID(productId);
                        List<Order> orderInCart = dbOrder.loadOrderByCartId(cartId);
                        boolean isFlag = true;

                        if (product != null && quantity == 0) {

                            response.sendRedirect("product?idProduct=" + productIdStr + "&error=non-quantity");

                        } else if (product != null && quantity > product.getUnitInStock()) {
                            response.sendRedirect("product?idProduct=" + productIdStr + "&error=over-quantity");

                        } else if (product != null && product.getStatus() == 1) {
                            for (int i = 0; i < orderInCart.size(); i++) {
                                if (orderInCart.get(i).getProductId() == productId) {
                                    int quantityOld = orderInCart.get(i).getQuantity();
                                    float priceOld = orderInCart.get(i).getTotalPrice();
                                    Long orderId = orderInCart.get(i).getId();
                                    isFlag = false;
                                    dbOrder.updateByOrder(quantityOld + quantity, priceOld + product.getUnitPrice() * quantity, orderId);
                                    break;
                                }
                            }
                            Long orderId = null;
                            if (isFlag) {
                                orderId = dbOrder.insertOrder(new Order(productId, cartId, quantity, product.getUnitPrice() * quantity));
                            }

                            List<Order> ordersList = dbOrder.loadOrderByCartId(cartId);
                            float totalPriceCart = totalPriceCart(ordersList);
                            dbCart.updateByPrice(totalPriceCart, cartId);

                            response.sendRedirect("cart");

                        } else {
                            response.sendRedirect("product?idProduct=" + productIdStr + "&error=not-selling");
                        }
                    } catch (Exception e) {
                        response.sendRedirect("product?idProduct=" + productIdStr);
                    }
                }

            }
        } else {
            response.sendRedirect("login?error=must-login");
        }

    }

    public String getCurrentUrl(HttpServletRequest request) throws MalformedURLException {

        URL url = new URL(request.getRequestURL().toString());

        String path = url.getFile();

        return path;
    }

    void deleteCookie(String nameCook, HttpServletResponse response) {
        Cookie cookie = new Cookie(nameCook, "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }

    float totalPriceCart(List<Order> ordersList) {
        float sum = 0;
        for (int i = 0; i < ordersList.size(); i++) {
            sum += ordersList.get(i).getTotalPrice();
        }
        return sum;
    }
}
