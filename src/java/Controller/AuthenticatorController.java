/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB.DBCart;
import DB.DBUser;
import Model.Cart;
import Model.User;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.servlet.ServletContext;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author window
 */
public class AuthenticatorController extends HttpServlet {

    DBUser dbUser;
    DBCart dbCart;

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        dbUser = new DBUser();
        dbCart = new DBCart();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @return
     * @throws java.net.MalformedURLException
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

    void deleteCookie(String nameCook, HttpServletResponse response) {
        Cookie cookie = new Cookie(nameCook, "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }

    void addCookie(String nameCook, String value, HttpServletResponse response) {
        Cookie c = new Cookie(nameCook, value);
        response.addCookie(c);
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
        request.setAttribute("contextPath", request.getContextPath());
        String url = getCurrentUrl(request);

        if (userId == null && url.equals("/ProjectWeb/login")) {
            String error = request.getParameter("error");
            if (error != null) {
                request.setAttribute("error", error);
            }
            request.getRequestDispatcher("/resources/html/login-register/login.jsp").forward(request, response);

        } else if (userId == null && url.equals("/ProjectWeb/register")) {
            request.getRequestDispatcher("resources/html/login-register/register.jsp").forward(request, response);
        } else if (url.equals("/ProjectWeb/logout")) {
            deleteCookie("userId", response);
            deleteCookie("cartId", response);
            deleteCookie("userRole", response);
            request.getRequestDispatcher("./resources/html/login-register/login.jsp").forward(request, response);
        } else if (userId != null && url.equals("/ProjectWeb/profile")) {
            User user = null;
            String error = request.getParameter("error");

            if (error != null) {
                request.setAttribute("error", error);
            }
            try {
                user = dbUser.loadUserById(Long.parseLong(userId));
            } catch (Exception e) {
            }

            request.setAttribute("user", user);
            request.getRequestDispatcher("./resources/html/login-register/userProfile.jsp").forward(request, response);
        } else if (url.equals("/ProjectWeb/forgetPassword")) {
            request.getRequestDispatcher("./resources/html/login-register/forgetPassword.jsp").forward(request, response);

        } else if (userId != null) {
            response.sendRedirect("home");
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
        String userId = getCookies("userId", request);

        if (userId == null && url.equals("/ProjectWeb/login")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            Long id = dbUser.login(username, password);
            if (id != null) {
                addCookie("userId", id + "", response);
                Cart cart = dbCart.findReccentCart(id);
                if (cart != null && !cart.isCheckPay()) {
                    addCookie("cartId", cart.getId() + "", response);
                } else {
                    Long cartId = dbCart.insertCart(new Cart(id, 0, false));
                    addCookie("cartId", cartId + "", response);
                }

                response.sendRedirect("home");
            } else {
                request.setAttribute("messageError", "username or password wrong!");
                doGet(request, response);
            }
        } else if (userId == null && url.equals("/ProjectWeb/register")) {

            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String passwordConfirm = request.getParameter("passwordConfirm");
            String genderStr = request.getParameter("gender");
            boolean gender = genderStr.equals("male");
            String email = request.getParameter("email");

            if (firstName != null && password != null && username != null && lastName != null) {
                if (firstName.equals("") || password.equals("") || username.equals("") || lastName.equals("")) {
                    request.setAttribute("messageError", "Pls fill out all infomation");
                    doGet(request, response);
                } else {
                    List<User> listUser = dbUser.loadUsers();
                    boolean isCheckUsername = true;
                    boolean isCheckPassword = true;
                    boolean isCheckEmail = true;
                    if (!username.equals("")) {
                        for (int i = 0; i < listUser.size(); i++) {
                            if (username.equalsIgnoreCase(listUser.get(i).getUsername())) {
                                isCheckUsername = false;
                                request.setAttribute("errorUsername", "username exited!");
                                doGet(request, response);
                            }
                        }
                    }
                    if (!password.equals("") && !passwordConfirm.equals("")) {
                        if (!password.equals(passwordConfirm)) {
                            isCheckPassword = false;
                            request.setAttribute("errorPassword", "password and password confirm must be same");
                            doGet(request, response);
                        }
                    }
                    if (!email.equals("")) {
                        for (int i = 0; i < listUser.size(); i++) {
                            if (email.equalsIgnoreCase(listUser.get(i).getEmail())) {
                                isCheckEmail = false;
                                request.setAttribute("errorEmail", "email exited!");
                                doGet(request, response);
                            }
                        }
                    }
                    if (isCheckEmail && isCheckPassword && isCheckUsername) {
                        User user = new User();
                        user.setFirstName(firstName);
                        user.setLastName(lastName);
                        user.setEmail(email);
                        user.setPassword(password);
                        user.setUsername(username);
                        user.setGender(gender);
                        Long id = dbUser.register(user);
                        addCookie("userId", id + "", response);
                        Long cartId = dbCart.insertCart(new Cart(id, 0, false));
                        addCookie("cartId", cartId + "", response);
                        response.sendRedirect("home");
                    }

                }
            } else {
                doGet(request, response);
            }

        } else if (userId != null && url.equals("/ProjectWeb/profile")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String genderStr = request.getParameter("gender");
            boolean gender = genderStr.equals("male");
            String email = request.getParameter("email");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");

            try {
                Long userIdL = Long.parseLong(userId);
                dbUser.update(new User(userIdL, firstName, lastName, gender, address, email, phone));
            } catch (Exception e) {
            }

            response.sendRedirect("profile");
        } else if (userId != null && url.equals("/ProjectWeb/uploadFileU")) {

            HashMap<String, String> fields = uploadFile(request, response);
            String nameImage = fields.get("file");
            try {
                Long id = Long.parseLong(userId);
                dbUser.updateByImage(nameImage, id);
            } catch (Exception e) {
            }
            response.sendRedirect("profile");
        } else if (userId != null && url.equals("/ProjectWeb/changePassword")) {

            String oldPassword = request.getParameter("oldPassword");
            String newPassword = request.getParameter("newPassword");
            String newPasswordConfirm = request.getParameter("newPasswordConfirm");
            try {
                Long id = Long.parseLong(userId);
                User user = dbUser.loadUserById(id);
                if (user != null) {
                    if (oldPassword != null && oldPassword.equals(user.getPassword())) {
                        if (newPassword != null && newPasswordConfirm != null) {
                            if (!newPassword.equals("") || !newPasswordConfirm.equals("")) {
                                if (newPassword.equals(newPasswordConfirm)) {

                                    dbUser.updateByPassword(newPassword, id);
                                    response.sendRedirect("profile");
                                } else {
                                    response.sendRedirect("profile?error=wrong-confirm-password");
                                }
                            } else {
                                response.sendRedirect("profile?error=empty-password");
                            }
                        } else {
                            response.sendRedirect("profile?error=fail-update");
                        }
                    } else {
                        response.sendRedirect("profile?error=wrong-password");
                    }
                }
            } catch (Exception e) {
                response.sendRedirect("notfound");
            }

        } else if ( url.equals("/ProjectWeb/forgetPassword")) {
            String username = request.getParameter("username");
            String email = request.getParameter("email");
            int min = 100;
            int max = 100000;

            
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            User user = dbUser.findUserByUsernameandEmail(username, email);
         
            if(user != null) {
                dbUser.updateByPassword(random_int+"", user.getId());
                request.setAttribute("newPassword", random_int);
                doGet(request, response);
            }else{
                request.setAttribute("error", "Something wrong!");
                doGet(request, response);
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
                    fields.put("file", item.getName());

                    if (filename == null || filename.equals("")) {
                        break;
                    } else {
                        Path path = Paths.get(filename);
                        String storePath = servletContext.getRealPath("/uploads/user");
                        File uploadFile = new File(storePath + "/" + path.getFileName());
                        item.write(uploadFile);
                        System.out.println(storePath + "/" + path.getFileName());

                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return fields;
    }
}
