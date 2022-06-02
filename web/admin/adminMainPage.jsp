<%-- 
    Document   : adminPage
    Created on : Feb 14, 2022, 10:00:05 AM
    Author     : window
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8" />

        <title>Admin</title>
        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
        <!--     Fonts and icons     -->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">

        <link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">

        <link href="resources/css/light-bootstrap-dashboard.css?v=2.0.0 " rel="stylesheet" />
        <!-- CSS Just for demo purpose, don't include it in your project -->
        <link href="resources/css/admin.css" rel="stylesheet" />
        <link href="resources/css/homemain.css" rel="stylesheet" />
         
    </head>

    <body>
        <div class="wrapper">
            <div class="sidebar" data-image="../assets/img/sidebar-5.jpg">
                <!--
            Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"
    
            Tip 2: you can also add an image using data-image tag
                -->
                <div class="sidebar-wrapper">
                    <div class="logo">
                        <a href="home" class="simple-text">
                            <img  class="logo-main" src="<c:url value = "resources/image/icon-page.jpg"/>"/>
                        </a>
                    </div>
                    <ul class="nav">
                        <li class="nav-item active">
                            <a class="nav-link" href="list-cart">
                                <i class="fa fa-tachometer" aria-hidden="true"></i>
                                <p>Dashboard</p>
                            </a>
                        </li>
                        <li>
                            <a class="nav-link" href="list-product">
                                <i class="fa fa-table" aria-hidden="true"></i>
                                <p>Table List</p>
                            </a>
                        </li>
                        <li>
                            <a class="nav-link" href="create-product">
                                <i class="fa fa-plus-circle" aria-hidden="true"></i>
                                <p>Create product</p>
                            </a>
                        </li>
                        <li>
                            <a class="nav-link" href="create-category">
                                <i class="fa fa-plus-circle" aria-hidden="true"></i>
                                <p>Create new category</p>
                            </a>
                        </li>
                        <li class="nav-item active active-pro">
                            <a class="nav-link active" href="javascript:;">
                                <i class="nc-icon nc-alien-33"></i>
                                <p><3</p>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="main-panel">
                <!-- Navbar -->
                <nav class="navbar navbar-expand-lg " color-on-scroll="500">
                    <div class="container-fluid">
                        <a class="navbar-brand" href="home">Home</a>
                        <button href="" class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-bar burger-lines"></span>
                            <span class="navbar-toggler-bar burger-lines"></span>
                            <span class="navbar-toggler-bar burger-lines"></span>
                        </button>
                        <ul class="navbar-nav ml-auto mr-3">


                            <c:if test="${user != null}">
                                <li class="nav-item items-vertical"style="margin-left: 450px;">
                                    <a class="nav-link" href="#" ><i class="fa fa-bell icon-user" style="color: black" aria-hidden="true"></i></a>
                                </li>

                                <li class="nav-item items-vertical mr-3">
                                    <div class="dropdown">
                                        <button class="dropbtn">  <i class="fa fa-user icon-user" aria-hidden="true"></i></button>
                                        <div class="dropdown-content">
                                            <a href="#">Hi, ${user.getFirstName()}</a>
                                            <c:if test="${user.getRole() == 1}">
                                                <a href="admin">Admin</a>
                                            </c:if>
                                            <a href="profile">Account Setting</a>
                                            <a href="logout">Logout</a>
                                        </div>
                                    </div>
                                </li>
                                <li class="nav-item items-vertical  mr-3 ">
                                    <i class="fa fa-shopping-cart icon-user" aria-hidden="true" style="color: black"></i>
                                </li>
                            </c:if>
                            <c:if test="${user == null}">
                                <li class="nav-item items-vertical mr-3 " style="margin-left: 450px;">
                                    <a class="nav-link" href="register">Sign Up</a>
                                </li>
                                <li class="nav-item items-vertical mr-3">
                                    <a class="nav-link" href="login">Login</a>
                                </li>
                            </c:if>


                        </ul>
                    </div>
                </nav>
                <!-- End Navbar -->
                <div class="content">
                    <div class="container-fluid">
                        <div class="section">
                             <c:if test="${urlCon == 2}">
                                 <%@include file="./product/listProducts.jsp" %>
                                
                            </c:if>
                            <c:if test="${urlCon == 3}">
                                <%@include file="./product/newProduct.jsp" %>
                                
                            </c:if>
                             <c:if test="${urlCon == 4}">
                                 <%@include file="./category/newCategory.jsp" %>
                                
                            </c:if>
                             <c:if test="${urlCon == 5}">
                                 <%@include file="./product/updateProduct.jsp" %>
                             </c:if>
                            <c:if test="${urlCon == 6}">
                                <%@include file="./manger/listOrders.jsp" %>
                                
                            </c:if>
                            <c:if test="${urlCon == 7}">
                                <%@include file="./product/listProductInCart.jsp" %>
                                
                            </c:if>
                        </div>
                    </div>
                </div>
                <footer class="footer">
                    <div class="container-fluid">
                        <nav>
                            <ul class="footer-menu">
                                <li>
                                    <a href="#">
                                        Home
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        Company
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        Portfolio
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        Blog
                                    </a>
                                </li>
                            </ul>
                            <p class="copyright text-center">
                                ©
                                <script>
                                    document.write(new Date().getFullYear())
                                </script>
                                <a href="http://www.creative-tim.com">Creative Tim</a>, made with love for a better web
                            </p>
                        </nav>
                    </div>
                </footer>
            </div>
        </div>
       
    </body>
    <script src="<c:url value = "resources/vendor/jquery/jquery-3.2.1.min.js"/>"></script>
    <!--===============================================================================================-->
    <script src="<c:url value = "resources/vendor/bootstrap/js/popper.js"/>"></script>
    <script src="<c:url value = "resources/vendor/bootstrap/js/bootstrap.min.js"/>"></script>

</html>
