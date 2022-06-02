<%-- 
    Document   : listCart
    Created on : Feb 28, 2022, 8:14:40 PM
    Author     : window
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
        <title>Fashion</title>
        <link href="resources/css/cart/cart.css" rel="stylesheet" />
    </head>
    <body >
        <div class="card">
            <div class="row">
                <div class="col-md-12 cart">
                    <div class="title">
                        <div class="row">
                            <div class="col">
                                <h4><b>List orders Shopping</b></h4>
                            </div>
                            <div class="col align-self-center text-right text-muted">${ordersList.size()} items</div>
                        </div>
                    </div>

                    <c:if test="${listCartsInUser != null}">
                        <div class="row border-top border-bottom">

                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Cost</th>
                                        <th>Address</th>
                                        <th>Note</th>
                                        <th>State</th>
                                        <th>Order Date</th>
                                        <th>Receive order Date</th>

                                        <th></th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${listCartsInUser}" var="cart">
                                        <c:if test="${cart.isCheckPay() eq true}">
                                            <tr>
                                                <td>${cart.getId()}</td>
                                                <td>${cart.getTotalPriceOfProduct()}</td>
                                                <td>${cart.getAddress()}</td>
                                                <td>${cart.getNote()}</td>
                                                <c:if test="${cart.getState().equals('not accept') == true}">
                                                    <td>  <span style="color:red">
                                                            ${cart.getState()}
                                                        </span>
                                                    </td>
                                                </c:if>

                                                <c:if test="${cart.getState().equals('accept') == true}">
                                                    <td>  <span style="color:greenyellow">
                                                            ${cart.getState()}
                                                        </span>
                                                    </td>
                                                </c:if>
                                                <c:if test="${cart.getState().equals('pendding') == true}">
                                                    <td>  <span style="color:yellow">
                                                            ${cart.getState()}
                                                        </span>
                                                    </td>
                                                </c:if>
                                                <td>${cart.getFromOrder()}</td>
                                                <td>${cart.getToOrder()}</td>
                                                <td><a class="btn btn-primary" href="listOrders?cartId=${cart.getId()}">See more</a></td>

                                                <td> <button hidden="" id="clickButton"
                                                             type="button" class="btn btn-primary" 
                                                             data-toggle="modal" data-target="#myModal"></button></td>
                                            </tr>
                                        </c:if>

                                    </c:forEach>
                                </tbody>
                            </table>

                        </div>

                    </c:if>

                    <div class="back-to-shop"><a href="home">&leftarrow;</a><span class="text-muted">Back to shop</span></div>
                </div>

            </div>
        </div>
    </body>
    <div class="modal fade " id="myModal">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">

                <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Product items</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>

                <!-- Modal body -->
                <div class="modal-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID. </th>
                                <th>Image</th>
                                <th>Name</th>
                                <th>Quantity</th>
                                <th>Size</th>
                                <th>Color</th>
                                <th>Cost</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:if test="${ordersList != null}">
                                <c:forEach items="${ordersList}"  var="order">
                                    <tr>
                                        <td>${order.getProductId()}</td>
                                        <td><img style="width: 100px;height: 100px"
                                                 <c:forEach items="${productInCart}" var="product">
                                                     <c:if test="${product.getId() eq order.getProductId()}">
                                                         src="uploads/product/${product.getImage().split(" ")[0]}"
                                                     </c:if>
                                                 </c:forEach>
                                                 ></td>

                                        <td><c:forEach items="${productInCart}" var="product">
                                                <c:if test="${product.getId() eq order.getProductId()}">
                                                    ${product.getName()}
                                                </c:if>
                                            </c:forEach></td>
                                        <td>${order.getQuantity()}</td>
                                        <td><c:forEach items="${productInCart}" var="product">
                                                <c:if test="${product.getId() eq order.getProductId()}">
                                                    ${product.getSize()}
                                                </c:if>
                                            </c:forEach></td>
                                        <td><c:forEach items="${productInCart}" var="product">
                                                <c:if test="${product.getId() eq order.getProductId()}">
                                                    ${product.getColor()}
                                                </c:if>
                                            </c:forEach></td>
                                        <td>${order.getTotalPrice()}</td>


                                    </tr>
                                </c:forEach>
                            </c:if>
                        </tbody>
                    </table>
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>

            </div>
        </div>
    </div>
    <c:if test="${cartId != null}">
        <script >
            window.onload = function () {
                document.getElementById('clickButton').click();
            }
        </script>
    </c:if>

    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/vendor/bootstrap/js/popper.min.js"></script>
    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="resources/vendor/jquery/jquery-3.2.1.min.js"></script>
</html>
