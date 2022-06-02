/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author window
 */
@WebServlet(name = "BTNProcessController", urlPatterns = {"/pagereview", "/pageproduct",
    "/pagelistorders"})
public class BTNProcessController extends HttpServlet {

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
        int j = 1;
        String url = getCurrentUrl(request);
        try {
            if (request.getParameter("btnNext") != null) {

                j = Integer.parseInt(request.getParameter("currentPage")) + 1;
            } else if (request.getParameter("btnPre") != null) {
                j = Integer.parseInt(request.getParameter("currentPage")) - 1;
            } else if (request.getParameter("head") != null) {
                j = 1;
            } else if (request.getParameter("tail") != null) {
                j = Integer.parseInt(request.getParameter("totalSize"));
            } else {
                for (j = 1;; j++) {
                    if (request.getParameter("btn" + j) != null) {
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }
        int nrip = Integer.parseInt(request.getParameter("numberRecordInPage"));
        HttpSession ses = request.getSession();

        ses.setAttribute("nrip", nrip);
        ses.setAttribute("page", j);
        if (url.equals("/ProjectWeb/pagereview")) {
            String idProduct = request.getParameter("idProduct");
            response.sendRedirect("product?page=" + j + "&idProduct=" + idProduct);
        } else if (url.equals("/ProjectWeb/pageproduct")) {
            String orderBy = request.getParameter("orderBy");
            String search = request.getParameter("search");
            String filterColor = request.getParameter("filterColor");
            String filterSize = request.getParameter("filterSize");
            String filterCategory = request.getParameter("filterCategory");
            String filterPriceFrom = request.getParameter("filterPriceFrom");
            String filterPriceTo = request.getParameter("filterPriceTo");

            response.sendRedirect("products?page=" + j + "&orderBy=" + orderBy
                    + "&search=" + search + "&filterCategory=" + filterCategory
                    + "&filterColor=" + filterColor + "&filterSize=" + filterSize + "&filterPriceFrom=" + filterPriceFrom + "&filterPriceTo=" + filterPriceTo
            );

        } else if (url.equals("/ProjectWeb/pagelistorders")) {

            if (request.getParameter("checkout") != null && !request.getParameter("checkout").equals("")) {
                response.sendRedirect("list-cart?page=" + j + "&checkout=" + request.getParameter("checkout"));
            } else {
                response.sendRedirect("list-cart?page=" + j);
            }

        }

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    public String getCurrentUrl(HttpServletRequest request) throws MalformedURLException {

        URL url = new URL(request.getRequestURL().toString());

        String path = url.getFile();

        return path;
    }

}
