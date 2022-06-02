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
import DB.DBReview;
import DB.DBUser;
import Model.Category;
import Model.Product;
import Model.Review;
import Model.User;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author window
 */
@WebServlet(name = "ProductController", urlPatterns = {"/product", "/products"})
public class ProductController extends HttpServlet {

    DBProduct dbProduct;
    DBReview dbReview;
    DBOrder dbOrder;
    DBCart dbCart;
    DBUser dbUser;
    DBCategory dbCategory;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        dbProduct = new DBProduct();
        dbReview = new DBReview();
        dbOrder = new DBOrder();
        dbCart = new DBCart();
        dbUser = new DBUser();
        dbCategory = new DBCategory();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("contextPath", request.getContextPath());
        String url = getCurrentUrl(request);
        String userId = getCookies("userId", request);
        List<Category> categoryList = dbCategory.loadCategories();
        User userI = null;
        String[] arraySize = {"XXS", "XS", "S", "M", "L", "XL", "XXL"};
        String[] arrayColor = {"red", "blue", " white", " black", "pink"};
        if (userId != null) {
            userI = dbUser.loadUserById(Long.parseLong(userId));
            if (userI != null) {
                Cookie c = new Cookie("userRole", userI.getRole() + "");
                response.addCookie(c);
            }
        }
        request.setAttribute("user", userI);
        request.setAttribute("categoryList", categoryList);
        request.setAttribute("arraySize", arraySize);
        request.setAttribute("arrayColor", arrayColor);
        if (url.equals("/ProjectWeb/product")) {
            String idProduct = request.getParameter("idProduct");
            if (idProduct != null) {
                String error = request.getParameter("error");
                if (error != null) {
                    request.setAttribute("error", error);
                }
                try {
                    Long id = Long.parseLong(idProduct.trim());
                    Product product = dbProduct.loadProductsByID(id);
                    if (product != null) {
                        List<Review> listReview = new ArrayList<>();
                        List<User> listUserReviewProduct = new ArrayList<>();
                        if (product.getImage().contains(" ")) {
                            String images = product.getImage();
                            String[] parts = images.split(" ");
                            request.setAttribute("images", parts);
                        }
                        listReview = dbReview.loadReviewsByProductId(id);
                        request.setAttribute("product", product);
                        // list productbycategory
                        List<Product> listProductsByCategory = dbProduct.loadProductsByCategoryNoLimit(product.getCategoryId());
                        List<Product> listProductsByCategoryRandom = new ArrayList<>();
                        while (listProductsByCategoryRandom.size() < 4) {
                            int randomIndex = (1 + (int) (Math.random() * ((listProductsByCategory.size() - 2) + 1)));
                            if (listProductsByCategory.get(randomIndex).getId() != product.getId()) {
                                if (!isDupplicateProduct(listProductsByCategoryRandom, listProductsByCategory.get(randomIndex).getId())) {
                                    listProductsByCategoryRandom.add(listProductsByCategory.get(randomIndex));
                                }
                            }

                        }

                        request.setAttribute("listProductsByCategory", listProductsByCategoryRandom);

                        // phan page
                        loadPage(request, listReview.size(), 5);
                        for (int i = 0; i < listReview.size(); i++) {
                            if (!isDupplicate(listUserReviewProduct, listReview.get(i).getUserId())) {
                                User user = dbUser.loadUserById(listReview.get(i).getUserId());
                                listUserReviewProduct.add(user);
                            }

                        }
                        if (userId != null) {
                            Review rv = dbReview.loadReviewsByUserId(userI.getId(), id);
                            if (rv != null) {
                                request.setAttribute("rved", rv);
                            }
                        }

                        request.setAttribute("reviews", listReview);
                        request.setAttribute("soldProduct", dbProduct.getProductSold(id));
                        request.setAttribute("listRating", listTotalRating(listReview));
                        request.setAttribute("listUserReviewProduct", listUserReviewProduct);
                        request.getRequestDispatcher("admin/product/detailProduct.jsp").forward(request, response);

                    } else {

                        response.sendRedirect("notfound");

                    }
                } catch (Exception e) {
                    System.out.println("hre");
                    response.sendRedirect("notfound");
                }

            }
        } else if (url.equals("/ProjectWeb/products")) {

            List<Product> listProducts = dbProduct.loadProducts();
            List<String> nameProduct = new ArrayList<>();
            String content = "";
            for (int i = 0; i < listProducts.size(); i++) {
                content += listProducts.get(i).getName() + "|";

            }

            request.setAttribute("nameProduct", content);
            String orderBy = request.getParameter("orderBy");
            String searchValue = request.getParameter("search");
            if (searchValue != null) {
                request.setAttribute("search", searchValue);
                if (!searchValue.equals("")) {
                    listProducts = searchByName(listProducts, searchValue);
                }
            }
            String filterColor = request.getParameter("filterColor");
            String filterSize = request.getParameter("filterSize");
            String filterCategory = request.getParameter("filterCategory");
            String filterPriceFrom = request.getParameter("filterPriceFrom");
            String filterPriceTo = request.getParameter("filterPriceTo");

            // 1 for color
            // 2 for size
            // 3 for category
            // 4 for from price
            // 5 for to price
            if (filterColor != null && !filterColor.equals("")) {
                request.setAttribute("filterColor", filterColor);
                listProducts = filterProduct(1, listProducts, filterColor);
            }
            if (filterSize != null && !filterSize.equals("")) {
                request.setAttribute("filterSize", filterSize);
                listProducts = filterProduct(2, listProducts, filterSize);
            }

            if (filterCategory != null && !filterCategory.equals("")) {
                request.setAttribute("filterCategory", filterCategory);
                listProducts = filterProduct(3, listProducts, filterCategory);
            }
            try {
                if (filterPriceFrom != null && filterPriceTo != null && !filterPriceFrom.equals("") && !filterPriceTo.equals("")) {

                    Long priceTo = Long.parseLong(filterPriceTo);
                    Long priceFrom = Long.parseLong(filterPriceFrom);
                    if (priceFrom <= priceTo) {
                        request.setAttribute("filterPriceFrom", filterPriceFrom);
                        request.setAttribute("filterPriceTo", filterPriceTo);

                        listProducts = filterProduct(4, listProducts, filterPriceFrom);
                        listProducts = filterProduct(5, listProducts, filterPriceTo);
                    }

                } else if (filterPriceFrom != null && filterPriceTo == null && !filterPriceFrom.equals("")) {
                    listProducts = filterProduct(4, listProducts, filterPriceFrom);
                    request.setAttribute("filterPriceFrom", filterPriceFrom);

                } else if (filterPriceFrom == null && filterPriceTo != null && !filterPriceTo.equals("")) {
                    listProducts = filterProduct(5, listProducts, filterPriceFrom);
                    request.setAttribute("filterPriceTo", filterPriceTo);

                }

            } catch (Exception e) {

            }
            if (orderBy != null && orderBy.equals("low")) {
                Collections.sort(listProducts, new Comparator<Product>() {
                    public int compare(Product o1, Product o2) {
                        // compare two instance of `Score` and return `int` as result.
                        if (o1.getUnitPrice() > o2.getUnitPrice()) {
                            return 1;
                        } else {
                            return -1;
                        }
                    }
                });
            } else if (orderBy != null && orderBy.equals("high")) {

                Collections.sort(listProducts, new Comparator<Product>() {
                    public int compare(Product o1, Product o2) {
                        // compare two instance of `Score` and return `int` as result.
                        if (o1.getUnitPrice() > o2.getUnitPrice()) {
                            return -1;
                        } else {
                            return 1;
                        }
                    }
                });
            }

            request.setAttribute("orderBy", orderBy);
            request.setAttribute("listProducts", listProducts);
            loadPage(request, listProducts.size(), 9);
            request.getRequestDispatcher("product/products.jsp").forward(request, response);
        }

    }

    List<Product> searchByName(List<Product> listProducts, String searchValue) {
        List<Product> filterProducts = new ArrayList<>();
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName().toLowerCase().contains(searchValue.toLowerCase())) {
                filterProducts.add(listProducts.get(i));
            }
        }
        return filterProducts;
    }

    boolean isDupplicate(List<User> listUserReviewProduct, Long id) {
        for (int i = 0; i < listUserReviewProduct.size(); i++) {
            if (Objects.equals(listUserReviewProduct.get(i).getId(), id)) {
                return true;
            }
        }
        return false;
    }

    HashMap<String, Integer> listTotalRating(List<Review> listReview) {
        HashMap<String, Integer> listRating = new HashMap<String, Integer>();

        int[] sumRating = new int[5];
        for (int i = 0; i < 5; i++) {
            sumRating[i] = 0;
        }
        for (int i = 0; i < listReview.size(); i++) {
            if (listReview.get(i).getRating() == 1) {
                sumRating[0]++;
            } else if (listReview.get(i).getRating() == 2) {
                sumRating[1]++;
            } else if (listReview.get(i).getRating() == 3) {
                sumRating[2]++;
            } else if (listReview.get(i).getRating() == 4) {
                sumRating[3]++;
            } else if (listReview.get(i).getRating() == 5) {
                sumRating[4]++;
            }
        }
        for (int i = 4; i >= 0; i--) {
            listRating.put((i + 1) + "", sumRating[i]);
        }
        return listRating;
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    boolean isDupplicateProduct(List<Product> products, Long id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    public List<Product> filterProduct(int type, List<Product> listProducts, String value) {
        value = value.trim();
        List<Product> filterProducts = new ArrayList<>();
        switch (type) {
            case 1:
                for (int i = 0; i < listProducts.size(); i++) {
                    if (listProducts.get(i).getColor().trim().equalsIgnoreCase(value)) {
                        filterProducts.add(listProducts.get(i));
                    }
                }
                break;
            case 2:

                for (int i = 0; i < listProducts.size(); i++) {

                    if (listProducts.get(i).getSize().trim().equalsIgnoreCase(value)) {

                        filterProducts.add(listProducts.get(i));
                    }
                }
                break;
            case 3:
                try {
                    Long id = Long.parseLong(value);

                    for (int i = 0; i < listProducts.size(); i++) {
                        if (Objects.equals(listProducts.get(i).getCategoryId(), id)) {
                            filterProducts.add(listProducts.get(i));
                        }
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
                break;
            case 4:
                for (int i = 0; i < listProducts.size(); i++) {
                    try {

                        Long priceFrom = Long.parseLong(value);

                        if (listProducts.get(i).getUnitPrice() >= priceFrom) {
                            filterProducts.add(listProducts.get(i));
                        }

                    } catch (Exception e) {

                    }
                }
                break;
            case 5:
                for (int i = 0; i < listProducts.size(); i++) {
                    try {

                        Long toPrice = Long.parseLong(value);
                        if (listProducts.get(i).getUnitPrice() <= toPrice) {
                            filterProducts.add(listProducts.get(i));
                        }

                    } catch (Exception e) {

                    }
                }
                break;
        }
        return filterProducts;
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

    public String getCurrentUrl(HttpServletRequest request) throws MalformedURLException {

        URL url = new URL(request.getRequestURL().toString());

        String path = url.getFile();

        return path;
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

}
