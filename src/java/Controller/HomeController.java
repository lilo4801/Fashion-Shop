/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DBCategory;
import DB.DBProduct;
import DB.DBUser;
import Model.Category;
import Model.Product;
import Model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author window
 */
public class HomeController extends HttpServlet {

    DBUser dbUser;
    DBCategory dbCategory;
    DBProduct dbProduct;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        dbUser = new DBUser();
        dbCategory = new DBCategory();
        dbProduct = new DBProduct();
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
        String userId = getCookies("userId", request);
        List<Category> categoryList = dbCategory.loadCategories();
        List<Product> productListID1 = dbProduct.loadProductsByCategory(1L);
        List<Product> productListID3 = dbProduct.loadProductsByCategory(3L);
        List<Product> productListID5 = dbProduct.loadProductsByCategory(5L);
        User user = null;
        if (userId != null) {
            try {
                user = dbUser.loadUserById(Long.parseLong(userId));
                if (user != null) {
                    Cookie c = new Cookie("userRole", user.getRole() + "");
                    response.addCookie(c);
                }
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < productListID1.size(); i++) {
            if(productListID1.get(i).getStatus() == 0) {
                productListID1.remove(i);
            }
        }
        for (int i = 0; i < productListID3.size(); i++) {
            if(productListID3.get(i).getStatus() == 0) {
                productListID3.remove(i);
            }
        }
        List<Product> allProduct = dbProduct.loadProducts();
        List<String> nameProduct = new ArrayList<>();
        String content = "";
        for (int i = 0; i < allProduct.size(); i++) {
            content += allProduct.get(i).getName()+"|";
           
        }
        
        request.setAttribute("nameProduct", content);
        request.setAttribute("contextPath", request.getContextPath());
        request.setAttribute("user", user);
        request.setAttribute("productListID1", productListID1);
        request.setAttribute("productListID3", productListID3);
        request.setAttribute("productListID5", productListID5);
        request.setAttribute("categoryList", categoryList);
        request.getRequestDispatcher("mainIndex.jsp").forward(request, response);
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

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
