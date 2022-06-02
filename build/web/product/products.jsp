<%-- 
    Document   : products
    Created on : Feb 28, 2022, 8:49:05 PM
    Author     : window
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fashion</title>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" />
        <link href="resources/css/product/products.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="resources/css/mainIndex/mainIndex.css">

    </head>
    <body style="background:#f1f2f7;">
        <%@include file="../resources/html/header/header.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-sm-4 col-md-3">
                    <form action="${contextPath}/products" method="get"> 
                        <div class="well">
                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="input-group">
                                        <input type="text" class="form-control" name="search" placeholder="Search products...">
                                        <span class="input-group-btn">
                                            <button class="btn btn-primary" type="submit">
                                                <i class="fa fa-search"></i>
                                            </button>
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </form>

                    <!-- Filter -->
                    <form class="shop__filter" method="get" action="${contextPath}/products">
                        <!-- Checkboxes -->
                        <!-- Radios -->
                        <h3 class="headline mt-3">
                            <span>Category</span>
                        </h3>

                        <c:if test="${categoryList != null}">
                            <c:forEach items="${categoryList}" var="category">
                                <div class="radio">
                                    <input type="radio" name="filterCategory" id="shop-filter-radio_${category.getId()}" value="${category.getId()}">
                                    <label for="shop-filter-radio_${category.getId()}">${category.getName()}</label>
                                </div>
                            </c:forEach>
                        </c:if>


                        <!-- Price -->
                        <h3 class="headline">
                            <span>Price</span>
                        </h3>

                        <div class="form-group shop-filter__price">
                            <div class="row">
                                <div class="col-xs-4">
                                    <label for="shop-filter-price_from" class="sr-only"></label>
                                    <input id="shop-filter-price_from" name="filterPriceFrom" type="number" min="0" class="form-control" placeholder="From" >
                                </div>
                                <div class="col-xs-4">
                                    <label for="shop-filter-price_to" class="sr-only"></label>
                                    <input id="shop-filter-price_to" name="filterPriceTo"type="number" min="0" class="form-control" placeholder="To" >
                                </div>

                            </div>
                        </div>

                        <!-- Radios -->
                        <h3 class="headline">
                            <span>Size</span>
                        </h3>
                        <c:if test="${arraySize !=null}">
                            <c:forEach items="${arraySize}" var="size">
                                <div class="radio">
                                    <input type="radio" name="filterSize" id="shop-filter-radio_${size}" value="${size}">
                                    <label for="shop-filter-radio_${size}">${size}</label>
                                </div>
                            </c:forEach>
                        </c:if>



                        <!-- Colors -->
                        <h3 class="headline">
                            <span>Colors</span>
                        </h3>
                        <c:if test="${arrayColor !=null}">
                            <c:forEach items="${arrayColor}" var="color">
                                <div class="shop-filter__color">
                                    <input  type="radio" name="filterColor" id="shop-filter-color_${color}" value="${color}" data-input-color="${color}">
                                    <label for="shop-filter-color_${color}" style="background-color: ${color};"></label>
                                </div>
                            </c:forEach>
                        </c:if>
                        <h3 class="headline">
                            <input type="submit" class="btn btn-primary" value="Filter">
                        </h3>


                    </form>
                </div>

                <div class="col-sm-8 col-md-9">
                    <!-- Filters -->
                    <ul class="shop__sorting">
                        <li ><a href="#">Popular</a></li>
                        <li><a href="#">Newest</a></li>
                        <li><a href="#">Bestselling</a></li>
                        <li <c:if test="${orderBy != null && orderBy.equals('low')}">class="active"</c:if>>
                            <a href="products?orderBy=low&search=${search}&filterCategory=${filterCategory}&filterColor=${filterColor}&filterSize=${filterSize}&filterPriceFrom=${filterPriceFrom}&filterPriceTo=${filterPriceTo}">Price (low)</a></li>
                        <li <c:if test="${orderBy != null && orderBy.equals('high')}">class="active"</c:if>>
                            <a href="products?orderBy=high&search=${search}&filterCategory=${filterCategory}&filterColor=${filterColor}&filterSize=${filterSize}&filterPriceFrom=${filterPriceFrom}&filterPriceTo=${filterPriceTo}">Price (high)</a></li>
                    </ul>

                    <div class="row">
                        <c:if test="${listProducts != null}">
                            <c:forEach items="${listProducts}"
                                       var="product" 
                                       begin="${pageStart}"
                                       end="${pageEnd}">
                                <div class="col-sm-6 col-md-4">
                                    <div class="shop__thumb">
                                        <a href="product?idProduct=${product.getId()}">
                                            <div class="shop-thumb__img">
                                                <img src="uploads/product/${product.getImage().split(" ")[0]}" class="img-responsive" alt="...">
                                            </div>
                                            <h5 class="shop-thumb__title">
                                                ${product.getName()}
                                            </h5>
                                            <div class="shop-thumb__price">
                                                <span class="shop-thumb-price_old">$80.99</span>
                                                <span class="shop-thumb-price_new">$ ${product.getUnitPrice()}</span>
                                            </div>
                                        </a>
                                    </div>
                                </div>
                            </c:forEach>
                        </c:if>



                    </div> <!-- / .row -->

                    <form method="post"  action="${contextPath}/pageproduct">
                        <!-- Pagination -->

                        <div>

                            <div class="row">
                                <div class="col-sm-12">
                                    <ul class="pagination pagination-lg pull-right">
                                        <c:if test="${page != 1}">
                                            <li class="page-item">
                                                <label for="head"  class="page-link">
                                                    <i class="fa fa-angle-double-left" aria-hidden="true"></i>
                                                </label>
                                                <input type="submit" name="head" id="head" hidden value="head"/>
                                            </li>
                                        </c:if>
                                        <c:if test="${preBtn == true}">
                                            <li class="page-item">
                                                <label for="btnPre"  class="page-link">
                                                    <i class="fa fa-angle-left" aria-hidden="true"></i>
                                                </label>
                                                <input type="submit" name="btnPre"id="btnPre" hidden value="Pre"/>
                                            </li>

                                        </c:if>
                                        <c:forEach var="i" begin ="${begin}" end="${end}">
                                            <li class="page-item"><input  class="page-link" type="submit" name="btn${i}"  value="${i}"/> </li>
                                            </c:forEach>
                                            <c:if test="${nextBtn == true}">
                                            <li class="page-item">
                                                <label for="btnNext"  class="page-link">
                                                    <i class="fa fa-angle-right" aria-hidden="true"></i>
                                                </label>
                                                <input type="submit"  name="btnNext" hidden id="btnNext" value="Next"/>
                                            </li>
                                        </c:if>
                                        <c:if test="${page != totalPage}">
                                            <li class="page-item">
                                                <label for="tail"  class="page-link">
                                                    <i class="fa fa-angle-double-right" aria-hidden="true"></i>
                                                </label>
                                                <input type="submit" name="tail" id="tail" hidden value="tail"/>
                                            </li>
                                        </c:if>
                                    </ul>
                                </div>
                            </div> <!-- / .row -->

                        </div>

                        <input type="text" hidden name="orderBy" value="${orderBy}"/>
                        <input type="text" hidden name="filterSize"   value="${filterSize}"/>
                        <input type="text" hidden name="filterColor"   value="${filterColor}"/>
                        <input type="text" hidden name="filterCategory"   value="${filterCategory}"/>
                        <input type="text" hidden name="filterPriceFrom"   value="${filterPriceFrom}"/>
                        <input type="text" hidden name="filterPriceTo"   value="${filterPriceTo}"/>
                        <input type="text" hidden name="search"   value="${search}"/>
                        <input type="text" hidden name="currentPage"   value="${page}"/>
                        <input type="text" hidden name="numberRecordInPage"   value="9"/>
                        <input type="text" hidden name="totalSize"   value="${totalPage}"/>
                    </form>
                </div> <!-- / .col-sm-8 -->
            </div> <!-- / .row -->
        </div>
        <div class="footer_section layout_padding mt-5">
            <div class="container">
                <div class="footer_logo"><a href="index.html"><img src="images/footer-logo.png"></a></div>
                <div class="input_bt">
                    <input type="text" class="mail_bt" placeholder="Your Email" name="Your Email">
                    <span class="subscribe_bt" id="basic-addon2"><a href="#">Subscribe</a></span>
                </div>
                <div class="footer_menu">
                    <ul>
                        <li><a href="#">Best Sellers</a></li>
                        <li><a href="#">Gift Ideas</a></li>
                        <li><a href="#">New Releases</a></li>
                        <li><a href="#">Today's Deals</a></li>
                        <li><a href="#">Customer Service</a></li>
                    </ul>
                </div>
                <div class="location_main">Help Line  Number : <a href="#">+1 1800 1200 1200</a></div>
            </div>
        </div>
    </body>
    <script src="resources/vendor/jquery/jquery.min.js"></script>
    <script src="resources/vendor/bootstrap/js/popper.min.js"></script>
    <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <script src="resources/vendor/jquery/jquery-3.2.1.min.js"></script>
    <script src="resources/js/search.js"></script>
    <script>
        function openNav() {
            document.getElementById("mySidenav").style.width = "250px";
        }

        function closeNav() {
            document.getElementById("mySidenav").style.width = "0";
        }
    </script>
</html>
