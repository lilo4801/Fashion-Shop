<%-- 
    Document   : register
    Created on : Feb 14, 2022, 8:46:53 PM
    Author     : window
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Required meta tags-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


        <!-- Title Page-->
        <title>Sign Up</title>

        <!-- Icons font CSS-->
        <link href="<c:url value = "resources/vendor/mdi-font/css/material-design-iconic-font.min.css"/>" rel="stylesheet" media="all">
        <link href="<c:url value = "resources/vendor/font-awesome-4.7/css/font-awesome.min.css"/>" rel="stylesheet" media="all">
        <!-- Font special for pages-->
        <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <!-- Vendor CSS-->
        <link href="<c:url value = "resources/vendor/select2/select2.min.css"/>" rel="stylesheet" media="all">
        <link href="<c:url value = "resources/vendor/datepicker/daterangepicker.css"/>" rel="stylesheet" media="all">

        <!-- Main CSS-->
        <link href="<c:url value = "resources/css/register.css"/>" rel="stylesheet" media="all">
        <link href="<c:url value = "resources/css/main.css"/>" rel="stylesheet" media="all">
    </head>

    <body>
        <div class="page-wrapper bg-gra-02 p-t-60 p-b-100 font-poppins">
            <div class="wrapper wrapper--w680">
                <div class="card card-4" style="position: relative">
                    <div class="card-body">
                        <h2 class="title">Sign Up</h2>
                        <form method="POST" action="${contextPath}/register">
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">first name</label>
                                        <input class="input--style-4" type="text" name="firstName">
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">last name</label>
                                        <input class="input--style-4" type="text" name="lastName">
                                    </div>
                                </div>
                            </div>
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <div class="input-group">
                                            <label class="label">Username</label>
                                            <input class="input--style-4" type="text" name="username">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">Gender</label>
                                        <div class="p-t-10">
                                            <label class="radio-container m-r-45">Male
                                                <input type="radio" checked="checked" name="gender" value="male">
                                                <span class="checkmark"></span>
                                            </label>
                                            <label class="radio-container">Female
                                                <input type="radio" name="gender" name="gender" value="female">
                                                <span class="checkmark"></span>
                                            </label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <c:if test="${errorUsername != null}">
                                <p class="text-error">
                                    ${errorUsername}
                                </p>

                            </c:if>
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">Password</label>
                                        <input class="input--style-4" type="password" name="password">
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">Password Confirm</label>
                                        <input class="input--style-4" type="password" name="passwordConfirm">
                                    </div>
                                </div>
                            </div>
                            <c:if test="${errorPassword != null}">
                                <p class="text-error">
                                    ${errorPassword}
                                </p>

                            </c:if>
                            <div class="input-group">
                                <div class="input-group">
                                    <label class="label">Email</label>
                                    <input class="input--style-4" type="email" name="email">
                                </div>
                            </div>
                            <c:if test="${errorEmail != null}">
                                <p class="text-error">
                                    ${errorEmail}
                                </p>

                            </c:if>
                            <c:if test="${messageError != null}">
                                <p class="text-error">
                                    ${messageError}
                                </p>

                            </c:if>
                            <div class="p-t-15">
                                <button class="btn btn--radius-2 btn--blue" type="submit">Submit</button>
                            </div>
                        </form>
                    </div>
                    <a class="btn-close" href="home"><i class="fa fa-times" aria-hidden="true"></i></a>
                </div>
            </div>
        </div>

        <!-- Jquery JS-->
        <script src="<c:url value = "resources/vendor/jquery/jquery.min.js"/>"></script>
        <!-- Vendor JS-->
        <script src="<c:url value = "resources/vendor/select2/select2.min.js"/>"></script>
        <script src="<c:url value = "resources/vendor/datepicker/moment.min.js"/>"></script>
        <script src="<c:url value = "resources/vendor/datepicker/daterangepicker.js"/>"></script>

        <!-- Main JS-->
        <script src="<c:url value = "resources/js/global.js"/>"></script>

    </body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->