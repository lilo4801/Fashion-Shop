/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DBProduct;
import DB.DBReview;
import Model.Product;
import Model.Review;
import java.io.IOException;

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
@WebServlet(name = "ReviewController", urlPatterns = {"/review"})
public class ReviewController extends HttpServlet {

    DBReview dbReview;
    DBProduct dbProduct;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        dbReview = new DBReview();
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

        String idProductStr = request.getParameter("idProduct");
        String rating = request.getParameter("rate");
        String comment = request.getParameter("comment");

        String userIdStr = getCookies("userId", request);

        if (userIdStr != null) {

            if (rating != null && idProductStr != null) {
                int rate = Integer.parseInt(rating);
                Long userId = Long.parseLong(userIdStr);
                Long idProduct = Long.parseLong(idProductStr);
                Review rv = dbReview.loadReviewsByUserId(userId, idProduct);
                if (rv != null) {
                    rv.setRating(rate);
                    rv.setComment(comment);
                    dbReview.updateReview(rv);
                } else {
                    Review re = new Review(comment, rate, idProduct, userId);
                    Long id = dbReview.insertReview(re);
                    if (id == null) {
                        response.sendRedirect("product?idProduct=" + idProductStr + "&error=not-rating");
                    }

                }
                int aveRating = 0;
                int sum = 0;
                List<Review> reviews = dbReview.loadReviewsByProductId(idProduct);
                for (int i = 0; i < reviews.size(); i++) {
                    sum += reviews.get(i).getRating();

                }
                aveRating = sum / reviews.size();
                Product upProduct = new Product();
                upProduct.setId(idProduct);
                upProduct.setRating(aveRating);
                dbProduct.updateByRating(upProduct);
                response.sendRedirect("product?idProduct=" + idProductStr);

            } else {
                response.sendRedirect("product?idProduct=" + idProductStr + "&error=not-rating");
            }

        } else {

            response.sendRedirect("login?error=must-login");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
}
