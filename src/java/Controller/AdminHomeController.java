/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DBCart;
import DB.DBCategory;
import DB.DBOrder;
import DB.DBProduct;
import DB.DBUser;
import Model.Cart;
import Model.Category;
import Model.Order;
import Model.Product;
import Model.User;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.File;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.*;

public class AdminHomeController extends HttpServlet {

    DBUser dbUser;
    DBCategory dBCategory;
    DBProduct dBProduct;
    DBCart dbCart;
    DBOrder dbOrder;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        dbUser = new DBUser();
        dBCategory = new DBCategory();
        dBProduct = new DBProduct();
        dbCart = new DBCart();
        dbOrder = new DBOrder();
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

    public String getCurrentUrl(HttpServletRequest request) throws MalformedURLException {
        URL url = new URL(request.getRequestURL().toString());
        String path = url.getFile();
        return path;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userId = getCookies("userId", request);
        User user = null;
        String[] arraySize = {"XXS", "XS", "S", "M", "L", "XL", "XXL"};
        String[] arrayColor = {"red", "blue", " white", " black", "pink"};
        if (userId != null) {
            try {
                user = dbUser.loadUserById(Long.parseLong(userId));
            } catch (Exception e) {
            }
        }
        request.setAttribute("contextPath", request.getContextPath());
        request.setAttribute("user", user);
        if (user != null && user.getRole() == 1) {
            String url = getCurrentUrl(request);
            if (url.equals("/ProjectWeb/admin")) {
                List<Cart> listCarts = dbCart.loadCartsBy();
                String isCheckout = request.getParameter("checkout");
                if (isCheckout != null) {
                    List<Cart> listCartsFilter = new ArrayList<>();
                    for (int i = 0; i < listCarts.size(); i++) {
                        if (listCarts.get(i).isCheckPay() && isCheckout.equals("1")) {
                            listCartsFilter.add(listCarts.get(i));
                        }
                        if (!listCarts.get(i).isCheckPay() && isCheckout.equals("0")) {
                            listCartsFilter.add(listCarts.get(i));
                        }
                    }
                    loadPage(request, listCartsFilter.size(), 9);
                    request.setAttribute("listCarts", listCartsFilter);
                } else {
                    loadPage(request, listCarts.size(), 9);
                    request.setAttribute("listCarts", listCarts);
                }
                request.setAttribute("urlCon", 6);
            } else if (url.equals("/ProjectWeb/list-product")) {
                List<Product> listProduct = dBProduct.loadProducts();

                List<Category> listCategory = dBCategory.loadCategories();
                String categoryStr = request.getParameter("categoryId");
                if (categoryStr != null) {
                    try {
                        Long categoryId = Long.parseLong(categoryStr);
                        List<Product> listProductFitler = dBProduct.loadProductsByCategoryNoLimit(categoryId);
                        request.setAttribute("listProduct", listProductFitler);

                    } catch (Exception e) {
                        request.setAttribute("listProduct", listProduct);
                    }
                } else {
                    request.setAttribute("listProduct", listProduct);
                }

                request.setAttribute("listCategory", listCategory);
                request.setAttribute("urlCon", 2);
            } else if (url.equals("/ProjectWeb/create-product")) {
                List<Category> categoryList = dBCategory.loadCategories();
                request.setAttribute("categoryList", categoryList);
                request.setAttribute("urlCon", 3);
            } else if (url.equals("/ProjectWeb/create-category")) {
                request.setAttribute("urlCon", 4);
            } else if (url.equals("/ProjectWeb/update-product")) {

                List<Category> categoryList = dBCategory.loadCategories();
                request.setAttribute("categoryList", categoryList);
                String idProduct = request.getParameter("idProduct");
                if (idProduct != null) {
                    try {
                        Long id = Long.parseLong(idProduct);
                        Product product = dBProduct.loadProductsByID(id);
                        if (product != null) {
                            String images = product.getImage();
                            String[] parts = images.split(" ");
                            request.setAttribute("images", parts);
                        }

                        request.setAttribute("productUpdate", product);
                    } catch (Exception e) {
                    }

                }

                request.setAttribute("urlCon", 5);
                request.setAttribute("arraySize", arraySize);
                request.setAttribute("arrayColor", arrayColor);

            } else if (url.equals("/ProjectWeb/list-cart")) {
                List<Cart> listCarts = dbCart.loadCartsBy();
                String isCheckout = request.getParameter("checkout");
                request.setAttribute("checkout", isCheckout);

                if (isCheckout != null) {
                    List<Cart> listCartsFilter = new ArrayList<>();
                    for (int i = 0; i < listCarts.size(); i++) {
                        if (listCarts.get(i).isCheckPay() && isCheckout.equals("1")) {
                            listCartsFilter.add(listCarts.get(i));
                        }
                        if (!listCarts.get(i).isCheckPay() && isCheckout.equals("0")) {
                            listCartsFilter.add(listCarts.get(i));
                        }
                    }
                    loadPage(request, listCartsFilter.size(), 9);
                    request.setAttribute("listCarts", listCartsFilter);
                } else {
                    loadPage(request, listCarts.size(), 9);
                    request.setAttribute("listCarts", listCarts);
                }

                List<Product> listSoldProduct = dBProduct.getSoldProduct();
                for (int i = 0; i < listSoldProduct.size(); i++) {
                    Product p = dBProduct.loadProductsByID(listSoldProduct.get(i).getId());

                    p.setUnitInStock(listSoldProduct.get(i).getUnitInStock());
                    listSoldProduct.set(i, p);
                }

                request.setAttribute("urlCon", 6);
                request.setAttribute("listSoldProduct", listSoldProduct);

            } else if (url.equals("/ProjectWeb/list-product-cart")) {
                String cartIdStr = request.getParameter("cartId");
                String error = request.getParameter("error");
                try {

                    Long cartId = Long.parseLong(cartIdStr);
                    Cart cart = dbCart.loadCartById(cartId);
                    List<Order> ordersList = dbOrder.loadOrderByCartId(cartId);
                    List<Product> productInCart = new ArrayList<Product>();
                    for (int i = 0; i < ordersList.size(); i++) {
                        Product product = dBProduct.loadProductsByID(ordersList.get(i).getProductId());
                        productInCart.add(product);
                    }

                    request.setAttribute("ordersList", ordersList);
                    request.setAttribute("error", error);

                    request.setAttribute("cart", cart);
                    request.setAttribute("productInCart", productInCart);
                } catch (Exception e) {
                }
                request.setAttribute("urlCon", 7);

            }
            request.getRequestDispatcher("admin/adminMainPage.jsp").forward(request, response);

        } else {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = getCurrentUrl(request);
        String role = getCookies("userRole", request);

        if (role != null && role.equals("1")) {
            if (url.equals("/ProjectWeb/create-category")) {
                String name = request.getParameter("name");
                String description = request.getParameter("description");
                Long id = dBCategory.insertCategory(new Category(null, name, description));
                if (id != null) {
                    request.setAttribute("messageSus", "Create successfully!!");
                } else {
                    request.setAttribute("messageError", "Failure successfully!!");
                }
                doGet(request, response);
            } else if (url.equals("/ProjectWeb/create-product")) {
                try {
                    HashMap<String, String> fields = uploadFile(request, response);
                    String name = fields.get("name");
                    String categoryIdStr = fields.get("categoryId");
                    Long categoryId = Long.parseLong(categoryIdStr);
                    String size = fields.get("size");
                    String color = fields.get("color");
                    String priceStr = fields.get("price");
                    int price = Integer.parseInt(priceStr);
                    String quantityStr = fields.get("quantity");
                    int quantity = Integer.parseInt(quantityStr);
                    String description = fields.get("description");
                    String userIdStr = getCookies("userId", request);
                    Long userId = Long.parseLong(userIdStr);
                    String nameImage = fields.get("file");

                    Product product = new Product(name, description, color, size, quantity, price, nameImage, userId, categoryId);
                    Long id = dBProduct.insertProduct(product);
                    if (id != null) {
                        request.setAttribute("messageSus", "Create successfully!!");
                    } else {
                        request.setAttribute("messageError", "Failure successfully!!");
                    }
                    doGet(request, response);
                } catch (Exception e) {
                    request.setAttribute("messageError", "Failure successfully!!");
                    doGet(request, response);
                }
            } else if (url.equals("/ProjectWeb/update-product")) {
                try {
                    HashMap<String, String> fields = uploadFile(request, response);
                    String name = fields.get("name");
                    String categoryIdStr = fields.get("categoryId");
                    Long categoryId = Long.parseLong(categoryIdStr);
                    String size = fields.get("size");
                    String color = fields.get("color");
                    String priceStr = fields.get("price");
                    int price = Integer.parseInt(priceStr);
                    String quantityStr = fields.get("quantity");
                    int quantity = Integer.parseInt(quantityStr);
                    String description = fields.get("description");
                    String userIdStr = getCookies("userId", request);
                    Long userId = Long.parseLong(userIdStr);
                    String updateImage = "";
                    String nameImage = fields.get("file");
                    String nameImageOld = fields.get("fileOld");
                    String selectSell = fields.get("selectSell");
                    String idStr = fields.get("id");
                    String clearFile = fields.get("clearFile");
                    Long id = Long.parseLong(idStr);
                    if (clearFile != null && clearFile.equals("1") && nameImage == null) {
                        updateImage = "";
                    } else if (clearFile != null && clearFile.equals("1") && nameImage != null) {
                        updateImage = nameImage;
                    } else {
                        if (nameImage.equals("")) {
                            updateImage = nameImageOld;
                        } else if (!nameImage.equals("") && !nameImageOld.equals("")) {
                            updateImage = nameImageOld + " " + nameImage;
                        } else if (!nameImage.equals("")) {
                            updateImage = nameImage;
                        }
                    }

                    Product product = new Product(id, name, description, color, size,
                            quantity, price, updateImage, userId, categoryId, (selectSell.equals("1") ? 1 : 0));

                    dBProduct.update(product);
                    request.setAttribute("messageSus", "Update successfully!!");
                    response.sendRedirect("update-product?idProduct=" + idStr);
                } catch (Exception e) {
                    request.setAttribute("messageError", "Failure successfully!!");
                    doGet(request, response);
                }
            } else if (url.equals("/ProjectWeb/send-product")) {
                String cartIdStr = request.getParameter("cartId");
                String acceptRequest = request.getParameter("acceptRequest");

                if (cartIdStr != null && acceptRequest != null) {

                    try {
                        Long cartId = Long.parseLong(cartIdStr);
                        Cart cart = dbCart.loadCartById(cartId);
                        if (cart != null && !cart.getState().equals("accept")) {
                            String state = "pendding";
                            if (acceptRequest.equals("1")) {
                                state = "accept";
                            } else {
                                state = "not accept";
                            }
                            Date from = cart.getFromOrder();
                            Date d = new Date(from.getTime() + (1 + (int) (Math.random() * ((10 - 1) + 1))) * 86400000);
                            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                            if (state.equals("accept")) {
                                boolean isFlag = true;
                                List<Order> ordersList = dbOrder.loadOrderByCartId(cartId);
                                for (int i = 0; i < ordersList.size(); i++) {
                                    Product p = dBProduct.loadProductsByID(ordersList.get(i).getProductId());
                                    if (p != null && p.getUnitInStock() - ordersList.get(i).getQuantity() >= 0) {
                                        dBProduct.updateByUnitQuantity(p.getUnitInStock() - ordersList.get(i).getQuantity(),
                                                ordersList.get(i).getProductId());

                                    } else {
                                        isFlag = false;
                                    }
                                }
                                if (isFlag) {

                                    dbCart.updateByState(state, cartId, formatter.format(d));
                                } else {
                                    response.sendRedirect("list-product-cart?cartId=" + cartId + "&error=not-enough-product");

                                }
                            } else if (state.equals("not accept")) {
                                dbCart.updateByState(state, cartId, formatter.format(d));
                            }
                            response.sendRedirect("list-cart");

                        } else {
                            response.sendRedirect("list-product-cart?cartId=" + cartId + "&error=cart-already-accept");
                        }

                    } catch (Exception e) {

                    }
                } else {

                }

            }
        }
    }

    public HashMap<String, String> uploadFile(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HashMap<String, String> fields = new HashMap<>();
        try {
            DiskFileItemFactory factory = new DiskFileItemFactory();
            // Configure a repository (to ensure a secure temp location is used)
            ServletContext servletContext = this.getServletConfig().getServletContext();
            File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
            factory.setRepository(repository);
            // Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);
            // Parse the request
            List<FileItem> items = upload.parseRequest(request);
            // Process the uploaded items
            Iterator<FileItem> iter = items.iterator();

            while (iter.hasNext()) {
                FileItem item = iter.next();
                if (item.isFormField()) {
                    fields.put(item.getFieldName(), item.getString());
                    String name = item.getFieldName();
                    String value = item.getString();
                    System.out.println("name= " + name + " value= " + value);
                } else {
                    String filename = item.getName();

                    fields.put("file", filename);

                    if (filename == null || filename.equals("")) {
                        break;
                    } else {
                        Path path = Paths.get(filename);
                        String storePath = servletContext.getRealPath("/uploads/product");
                        File uploadFile = new File(storePath + "/" + path.getFileName());
                        item.write(uploadFile);

                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return fields;
    }

    public void loadPage(HttpServletRequest request, int size, int nrip) {
        HttpSession ses = request.getSession();
        int page = 1;
        if (ses.getAttribute("page") != null) {
            page = (int) ses.getAttribute("page");
        }

        int numberRecordInPage = nrip;
        if (ses.getAttribute("nrip") != null) {
            numberRecordInPage = (int) ses.getAttribute("nrip");
        }

        int totalPage = size / numberRecordInPage + (size % numberRecordInPage == 0 ? 0 : 1);
        if (page > totalPage) {
            page = 1;
        }
        int pageStart = page * numberRecordInPage - numberRecordInPage;
        int pageEnd = page * numberRecordInPage - 1;
        if (pageEnd > size - 1 && size != 0) {
            pageEnd = size - 1;
        }
        int begin = (page / 3) * 3;
        if (begin == 0) {
            begin = 1;
        }

        int end = (page / 3) * 3 + 3;
        if (end > totalPage && totalPage != 0) {
            end = totalPage;
        }
        boolean nextBtn = true;
        boolean preBtn = true;
        if (page == 1) {
            preBtn = false;
        }
        if (page == totalPage) {
            nextBtn = false;
        }

        request.setAttribute("nextBtn", nextBtn);
        request.setAttribute("preBtn", preBtn);
        request.setAttribute("begin", begin);
        request.setAttribute("end", end);
        request.setAttribute("pageStart", pageStart);
        request.setAttribute("pageEnd", pageEnd);
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("nrip", numberRecordInPage);
        request.setAttribute("page", page);

        ses.removeAttribute("nrip");
        ses.removeAttribute("page");

    }
}
