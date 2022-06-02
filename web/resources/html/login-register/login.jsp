<%-- 
    Document   : login
    Created on : Feb 14, 2022, 10:25:15 PM
    Author     : window
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="resources/vendor/animate/animate.css">
        <link rel="stylesheet" type="text/css" href="resources/vendor/css-hamburgers/hamburgers.min.css">
        <link rel="stylesheet" type="text/css" href="resources/vendor/select2/select2.min.css">
        <link rel="stylesheet" type="text/css" href="resources/css/util.css">
        <link rel="stylesheet" type="text/css" href="resources/css/main.css">

    </head>
    <body>

        <div class="limiter">
            <div class="container-login100">
                <div class="wrap-login100">

                    <div class="login100-pic js-tilt" data-tilt>
                        <img src="<c:url value = "resources/image/img-01.png"/>" alt="IMG">
                    </div>

                    <form class="login100-form validate-form" method="post" action="${contextPath}/login">
                        <c:if test="${error.equals('must-login') == true}">
                            <div class="alert alert-danger alert-dismissible">
                                <button type="button" class="close" data-dismiss="alert">&times;</button>
                                You should login to buy
                            </div>
                        </c:if> 
                        <span class="login100-form-title">
                            Member Login
                        </span>

                        <div class="wrap-input100 validate-input" data-validate = "username is required">
                            <input class="input100" type="text" name="username" placeholder="Username">
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-user" aria-hidden="true"></i>
                            </span>
                        </div>

                        <div class="wrap-input100 validate-input" data-validate = "Password is required">
                            <input class="input100" type="password" name="password" placeholder="Password">
                            <span class="focus-input100"></span>
                            <span class="symbol-input100">
                                <i class="fa fa-lock" aria-hidden="true"></i>
                            </span>
                        </div>
                        <c:if test="${messageError != null}">
                            <p class="text-danger text-center" >${messageError} </p>
                        </c:if>
                        <div class="container-login100-form-btn">
                            <input type="submit" value="Login" class="login100-form-btn">

                        </div>

                        <div class="text-center p-t-12">
                            <span class="txt1">
                                Forgot
                            </span>
                            <a class="txt2" href="forgetPassword">
                                Username / Password?
                            </a>
                        </div>

                        <div class="text-center p-t-136">
                            <a class="txt2" href="register">
                                Create your Account
                                <i class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
                            </a>
                        </div>
                    </form>
                    <a class="btn-close" href="home"><i class="fa fa-times" aria-hidden="true"></i></a>
                </div>
            </div>
        </div>
    </body>
    <script src="<c:url value = "resources/vendor/jquery/jquery-3.2.1.min.js"/>"></script>
    <script src="<c:url value = "resources/vendor/bootstrap/js/popper.js"/>"></script>
    <script src="<c:url value = "resources/vendor/bootstrap/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value = "resources/vendor/select2/select2.min.js"/>"></script>
   <script src="<c:url value = "resources/vendor/tilt/tilt.jquery.min.js"/>"></script>
    <script >
        $('.js-tilt').tilt({
            scale: 1.1
        })
    </script>
     <script src="<c:url value = "resources/js/main.js"/>"></script>
    
</html>
