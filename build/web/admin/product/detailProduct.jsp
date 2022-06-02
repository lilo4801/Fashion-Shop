<%-- 
    Document   : detailProduct
    Created on : Feb 21, 2022, 8:32:32 PM
    Author     : window
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
        <link rel="stylesheet" type="text/css" href="<c:url value ="resources/css/product/product.css"/>">
        <!--Important link from https://bootsnipp.com/snippets/XqvZr-->
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.carousel.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/assets/owl.theme.default.min.css"><div class="pd-wrap">
        <link rel="stylesheet" type="text/css" href="resources/css/review/review.css"><div class="pd-wrap">

            </head>
            <body>

                <div class="container">
                    <div class="icon-close">
                        <a href="products"> <i class="fa fa-arrow-left" aria-hidden="true" style="font-size: 25px"></i></a>
                    </div>
                    <c:if test="${error.equals('not-selling') == true}">
                        <div class="alert alert-danger alert-dismissible">
                            <button type="button" class="close" data-dismiss="alert">&times;</button>
                            Product is not selling!
                        </div>
                    </c:if>
                    <c:if test="${error.equals('submited-review') == true}">
                        <div class="alert alert-danger alert-dismissible">
                            <button type="button" class="close" data-dismiss="alert">&times;</button>
                            You submited. Please update review to submit new rating!
                        </div>
                    </c:if>
                    <c:if test="${error.equals('non-quantity') == true}">
                        <div class="alert alert-danger alert-dismissible">
                            Please add product more than 0
                        </div>
                    </c:if>
                    <c:if test="${error.equals('over-quantity') == true}">
                        <div class="alert alert-danger alert-dismissible">
                            Product in store. Not enough!
                        </div>
                    </c:if>
                    <div class="heading-section">
                        <h2>Product Details</h2>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div id="slider" class="owl-carousel product-slider"> 
                                <c:if test="${images != null}">
                                    <c:forEach items="${images}" var="image">
                                        <div class="item">
                                            <img src="uploads/product/${image}" />
                                        </div>
                                    </c:forEach>

                                </c:if>
                                <div class="item active ">
                                    <img src="uploads/product/${product.getImage()}" />
                                </div>

                            </div>
                            <div id="thumb" class="owl-carousel product-thumb">
                                <c:if test="${images != null}">
                                    <c:forEach items="${images}" var="image">
                                        <div class="item">
                                            <img src="uploads/product/${image}" />
                                        </div>
                                    </c:forEach>

                                </c:if>
                                <div class="item">
                                    <!--<img src="https://images.unsplash.com/photo-1505740420928-5e560c06d30e?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&w=1000&q=80" />-->
                                </div>
                                <div class="item">
                                    <!--<img src="https://i.ytimg.com/vi/PJ_zomNMK_s/maxresdefault.jpg" />-->
                                </div>
                                <div class="item">
                                    <!--<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQI6nUmObt62eDkqNSmIvCN_KkQExtbpJmUbVx_eTh_Y3v3r-Jw" />-->
                                </div>
                                <div class="item">
                                    <!--<img src="https://i.ytimg.com/vi/PJ_zomNMK_s/maxresdefault.jpg" />-->
                                </div>
                                <div class="item">
                                    <!--<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQI6nUmObt62eDkqNSmIvCN_KkQExtbpJmUbVx_eTh_Y3v3r-Jw" />-->
                                </div>
                                <div class="item">
                                    <!--<img src="https://i.ytimg.com/vi/PJ_zomNMK_s/maxresdefault.jpg" />-->
                                </div>
                                <div class="item">
                                    <!--<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQI6nUmObt62eDkqNSmIvCN_KkQExtbpJmUbVx_eTh_Y3v3r-Jw" />-->
                                </div>

                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="product-dtl">
                                <div class="product-info">
                                    <div class="product-name">${product.getName()}</div>

                                    <c:if test="${product != null}">
                                        <c:forEach var="i" begin="1" end="5">
                                            <c:if test="${i <= product.getRating()}">
                                                <span class="fa fa-star checked"></span>
                                            </c:if>
                                            <c:if test="${i > product.getRating()}">
                                                <span class="fa fa-star"></span>
                                            </c:if>
                                        </c:forEach>
                                    </c:if>

                                    <span>${reviews.size()} Reviews</span>

                                    <div class="product-price-discount"><span>
                                            <c:if test="${product != null}">
                                                $${product.getUnitPrice()}
                                            </c:if>
                                        </span><span class="line-through">$29.00</span>
                                        <span>Sold (${soldProduct})</span>
                                    </div>

                                </div>
                                <pre><c:if test="${product != null}">${product.getDescription()}</c:if></pre>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <label for="size">Size</label>
                                            <select id="size" name="size" class="form-control">
                                                <option>${product.getSize()}</option>

                                        </select>
                                    </div>
                                    <div class="col-md-6">
                                        <label for="color">Color</label>
                                        <select id="color" name="color" class="form-control">
                                            <option>${product.getColor()}</option>

                                        </select>
                                    </div>
                                </div>
                                <div class="product-count">
                                    <label for="size">Quantity</label>
                                    <form action="${contextPath}/addToCart" class="display-flex" method="post">

                                        <div class="qtyminus">-</div>
                                        <input type="text" name="quantity" value="1" class="qty" style="height: 35px">
                                        <div class="qtyplus" style="margin-right: 20px">+</div>

                                        <c:if test="${product != null && product.getStatus() == 0}"> 
                                            <span>Not selling</span>
                                        </c:if>
                                        <c:if test="${product != null && product.getUnitInStock() == 0}"> 
                                            <span>Not available</span>
                                        </c:if>
                                        <c:if test="${product != null && product.getUnitInStock() != 0}"> 
                                            <span>Available</span>
                                        </c:if>
                                        <br/>
                                        <input type="text" class="round-black-btn" name="productId" hidden
                                               <c:if test="${product != null}">
                                                   value="${product.getId()}"
                                                   accept="" </c:if>>
                                               <input type="submit" class="round-black-btn" value="Add to Cart"/>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                        <c:forEach items="${listProductsByCategory}" var="product">
                            <div class="col-md-3">
                                <a href="product?idProduct=${product.getId()}" >
                                    <div class="card" style="width:100%;">
                                        <img class="card-img-top" src="uploads/product/${product.getImage().split(" ")[0]}" alt="Card image" style="width:100%;height: 10%;">
                                        <div class="card-body">
                                            <h4 class="card-title" style="font-size: 14px">${product.getName()}</h4>
                                            <p class="card-text">$ ${product.getUnitPrice()}</p>

                                        </div>
                                    </div>
                                </a>

                            </div>  
                        </c:forEach>

                    </div>            
                    <div class="product-info-tabs">
                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link " id="description-tab" data-toggle="tab" href="#description" role="tab" aria-controls="description" aria-selected="true">Description</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active" id="review-tab" data-toggle="tab" href="#review" role="tab" aria-controls="review" aria-selected="true">Reviews (${reviews.size()})</a>
                            </li>
                        </ul>
                        <div class="tab-content" id="myTabContent">

                            <div class="tab-pane fade show active" id="review" role="tabpanel" aria-labelledby="review-tab">
                                <div class="review-heading">REVIEWS</div>
                                <c:if test="${reviews != null && reviews.size() == 0}">
                                    <p class="mb-20">There are no reviews yet.</p>
                                </c:if>

                                <c:if test="${reviews != null }">

                                    <%@include file="../../resources/html/pageNext/loadPage.jsp" %>
                                </c:if>


                                <c:if test="${rved == null}">
                                    <form class="review-form" action="${contextPath}/review" method="post">
                                        <div class="form-group">
                                            <label>Your rating</label>
                                            <c:if test="${error.equals('not-rating') == true}">
                                                <div class="alert alert-danger alert-dismissible">
                                                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                                                    Please rating!!
                                                </div>
                                            </c:if>
                                            <div class="reviews-counter">
                                                <div class="rate">
                                                    <input type="radio" id="star5" name="rate" value="5" />
                                                    <label for="star5" title="text">5 stars</label>
                                                    <input type="radio" id="star4" name="rate" value="4" />
                                                    <label for="star4" title="text">4 stars</label>
                                                    <input type="radio" id="star3" name="rate" value="3" />
                                                    <label for="star3" title="text">3 stars</label>
                                                    <input type="radio" id="star2" name="rate" value="2" />
                                                    <label for="star2" title="text">2 stars</label>
                                                    <input type="radio" id="star1" name="rate" value="1" />
                                                    <label for="star1" title="text">1 star</label>
                                                </div>
                                            </div>

                                        </div>
                                        <div class="form-group">
                                            <label>Your message</label>
                                            <textarea class="form-control" rows="10" name="comment"></textarea>
                                        </div>

                                        <input type="text" id="star1" hidden name="idProduct" value="${product.getId()}" />

                                        <button class="round-black-btn">Submit Review</button>
                                    </form>
                                </c:if>
                                <c:if test="${rved != null}">
                                    <form class="review-form" action="${contextPath}/review" method="post">
                                        <div class="form-group">
                                            <label>Your rating</label>
                                            <c:if test="${error.equals('not-rating') == true}">
                                                <div class="alert alert-danger alert-dismissible">
                                                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                                                    Please rating!!
                                                </div>
                                            </c:if>
                                            <div class="reviews-counter">
                                                <div class="rate">
                                                    <input type="radio" id="star5" name="rate" value="5" />
                                                    <label for="star5" title="text">5 stars</label>
                                                    <input type="radio" id="star4" name="rate" value="4" />
                                                    <label for="star4" title="text">4 stars</label>
                                                    <input type="radio" id="star3" name="rate" value="3" />
                                                    <label for="star3" title="text">3 stars</label>
                                                    <input type="radio" id="star2" name="rate" value="2" />
                                                    <label for="star2" title="text">2 stars</label>
                                                    <input type="radio" id="star1" name="rate" value="1" />
                                                    <label for="star1" title="text">1 star</label>
                                                </div>
                                            </div>

                                        </div>
                                        <div class="form-group">
                                            <label>Your message</label>
                                            <textarea class="form-control" rows="10"  name="comment">${rved.getComment()}</textarea>
                                        </div>

                                        <input type="text" id="star1" hidden name="idProduct" value="${product.getId()}" />

                                        <button class="round-black-btn">Update Review</button>
                                    </form>
                                </c:if>

                            </div>
                        </div>
                    </div>

                    <div style="text-align:center;font-size:14px;padding-bottom:20px;">See more products at <a href="products" target="_blank" style="color:#ff5e63;font-weight:bold;">www.fashion.in</a></div>
                </div>
        </div>
    </body>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/OwlCarousel2/2.3.4/owl.carousel.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="	sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>


    <script src="resources/js/product.js"></script>
</html>
