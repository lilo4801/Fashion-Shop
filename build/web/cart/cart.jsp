<%-- 
    Document   : cart
    Created on : Feb 24, 2022, 10:08:57 AM
    Author     : window
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fashion</title>
        <link rel="stylesheet" type="text/css" href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">

        <link href="resources/css/cart/cart.css" rel="stylesheet" />
    </head>
    <body>
        <div class="card">
            <div class="row">
                <div class="col-md-8 cart">
                    <div class="title">
                        <div class="row">
                            <div class="col">
                                <h4><b>Shopping Cart</b></h4>
                            </div>
                            <div class="col align-self-center text-right text-muted">${ordersList.size()} items</div>
                        </div>
                    </div>
                    <c:if test="${error == '1'}">
                        <div class="alert alert-danger alert-dismissible">
                            <button type="button" class="close" data-dismiss="alert">&times;</button>
                            <c:if test="${ordersList.size() != 0}">
                                You should fill out the address
                            </c:if>
                            <c:if test="${ordersList.size() == 0}">
                                Your cart empty now!!
                            </c:if>
                        </div>
                        
                    </c:if>
                    <c:if test="${ordersList != null}">
                        <c:forEach items="${ordersList}" var="order">
                            <div class="row border-top border-bottom">
                                <div class="row main align-items-center">
                                    <div class="col-2"><img class="img-fluid"
                                                            <c:forEach items="${productInCart}" var="product">
                                                                <c:if test="${product.getId() eq order.getProductId()}">
                                                                    src="uploads/product/${product.getImage().split(" ")[0]}"
                                                                </c:if>
                                                            </c:forEach>
                                                            ></div>
                                    <div class="col">
                                        <div class="row text-muted">Shirt</div>
                                        <div class="row">
                                            <c:forEach items="${productInCart}" var="product">
                                                <c:if test="${product.getId() eq order.getProductId()}">
                                                    ${product.getName()}
                                                </c:if>
                                            </c:forEach>

                                        </div>
                                    </div>
                                    <div class="col"> <a href="#">-</a><a href="#" class="border">${order.getQuantity()}</a><a href="#">+</a> </div>
                                    <div class="col">&euro; ${order.getTotalPrice()} <a href="removeFromCart?orderId=${order.getId()}" ><span class="close">&#10005;</span></a></div>
                                </div>
                            </div>
                        </c:forEach>
                    </c:if>

                    <div class="back-to-shop"><a href="products">&leftarrow;</a><span class="text-muted">Back to shop</span></div>
                </div>
                <div class="col-md-4 summary">
                    <div>
                        <h5><b>Summary</b></h5>
                    </div>
                    <hr>
                    <div class="row">
                        <div class="col" style="padding-left:0;">ITEMS ${ordersList.size()}</div>
                        <div class="col text-right">&dollar; <c:if test="${cart != null}">
                                ${cart.getTotalPriceOfProduct()}
                            </c:if></div>
                    </div>
                    <form action="${contextPath}/checkout" method="post">
                        <p>SHIPPING</p> <select>
                            <option class="text-muted">Standard-Delivery- &dollar;5.00</option>
                        </select>
                        <p>Address</p> <input id="address" name="address" placeholder="Enter your address">
                        <p>Note</p> <input id="note" name="note" placeholder="Enter your note">

                        <div class="row" style="border-top: 1px solid rgba(0,0,0,.1); padding: 2vh 0;">
                            <div class="col">TOTAL PRICE</div>
                            <div class="col text-right">&dollar;  <c:if test="${cart != null}">
                                    ${cart.getTotalPriceOfProduct()}
                                </c:if></div>
                        </div>

                        <input type="submit" class="btn" value="CHECKOUT">
                    </form>

                </div>
            </div>
        </div>
    </body>

    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/vendor/bootstrap/js/popper.min.js"></script>
    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="resources/vendor/jquery/jquery-3.2.1.min.js"></script>
</html>
