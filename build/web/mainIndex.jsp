<%-- 
    Document   : mainIndex
    Created on : Feb 18, 2022, 8:08:45 PM
    Author     : window
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- site metas -->
        <title>Fashion</title>
        <!-- bootstrap css -->
        <link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/mainIndex/mainIndex.css"></c:url>">
        <!-- Responsive-->
        <link rel="stylesheet" href="resources/css/mainIndex/responsive.css">

        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="resources/css/mainIndex/jquery.mCustomScrollbar.min.css">
       <!-- fonts -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap" rel="stylesheet">
        <!-- font awesome -->
        <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        
        <!-- owl stylesheets -->
        <link href="https://fonts.googleapis.com/css?family=Great+Vibes|Poppins:400,700&display=swap&subset=latin-ext" rel="stylesheet">
        <link rel="stylesheet" href="resources/css/mainIndex/owl.carousel.min.css">
        <link rel="stylesoeet" href="resources/css/mainIndex/owl.theme.default.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
    </head>
    <body>
        <!-- banner bg main start --> 
        <%@include file="./resources/html/header/header.jsp" %>
        <!-- banner bg main end -->
        <!-- fashion section start -->
        <div class="fashion_section">
            <div id="main_slider" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="container">
                            <h1 class="fashion_taital">Man & Woman Fashion</h1>
                            <div class="fashion_section_2">
                                <div class="row">
                                    <c:if test="${productListID1 != null}">
                                        <c:forEach items="${productListID1}" begin="0" end="2" var="product" >
                                            <c:if test="${product.getStatus() == 1}">
                                                <div class="col-lg-4 col-sm-4">
                                                    <div class="box_main">
                                                        <h4 class="shirt_text">${product.getName()}</h4>
                                                        <p class="price_text">Price  <span style="color: #262626;">$ ${product.getUnitPrice()}</span></p>
                                                        <div class="tshirt_img"><img src="uploads/product/${product.getImage().split(" ")[0]}"></div>
                                                        <div class="btn_main">
                                                            <div class="buy_bt"><a href="products">Buy Now</a></div>
                                                            <div class="seemore_bt"><a href="product?idProduct=${product.getId()}">See More</a></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:if>

                                        </c:forEach>
                                    </c:if>          
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="container">
                            <h1 class="fashion_taital">Man & Woman Fashion</h1>
                            <div class="fashion_section_2">
                                <div class="row">
                                    <c:if test="${productListID1 != null}">
                                        <c:forEach items="${productListID1}" begin="3" end="5" var="product" >
                                            <c:if test="${product.getStatus() == 1}">
                                                <div class="col-lg-4 col-sm-4">
                                                    <div class="box_main">
                                                        <h4 class="shirt_text">${product.getName()}</h4>
                                                        <p class="price_text">Price  <span style="color: #262626;">$ ${product.getUnitPrice()}</span></p>
                                                        <div class="tshirt_img"><img src="uploads/product/${product.getImage().split(" ")[0]}"></div>
                                                        <div class="btn_main">
                                                            <div class="buy_bt"><a href="products">Buy Now</a></div>
                                                            <div class="seemore_bt"><a href="product?idProduct=${product.getId()}">See More</a></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:if>
                                        </c:forEach>
                                    </c:if>  


                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="container">
                            <h1 class="fashion_taital">Man & Woman Fashion</h1>
                            <div class="fashion_section_2">
                                <div class="row">
                                    <c:if test="${productListID1 != null}">
                                        <c:forEach items="${productListID1}" begin="6" end="8" var="product" >
                                            <c:if test="${product.getStatus() == 1}">
                                                <div class="col-lg-4 col-sm-4">
                                                    <div class="box_main">
                                                        <h4 class="shirt_text">${product.getName()}</h4>
                                                        <p class="price_text">Price  <span style="color: #262626;">$ ${product.getUnitPrice()}</span></p>
                                                        <div class="tshirt_img"><img src="uploads/product/${product.getImage().split(" ")[0]}"></div>
                                                        <div class="btn_main">
                                                            <div class="buy_bt"><a href="products">Buy Now</a></div>
                                                            <div class="seemore_bt"><a href="product?idProduct=${product.getId()}">See More</a></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:if>
                                        </c:forEach>
                                    </c:if>  
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#main_slider" role="button" data-slide="prev">
                    <i class="fa fa-angle-left"></i>
                </a>
                <a class="carousel-control-next" href="#main_slider" role="button" data-slide="next">
                    <i class="fa fa-angle-right"></i>
                </a>
            </div>
        </div>
        <!-- fashion section end -->
        <!-- electronic section start -->
        <div class="fashion_section">
            <div id="electronic_main_slider" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="container">
                            <h1 class="fashion_taital">Pants</h1>
                            <div class="fashion_section_2">
                                <div class="row">
                                    <c:if test="${productListID3 != null}">
                                        <c:forEach items="${productListID3}" begin="0" end="2" var="product" >
                                            <c:if test="${product.getStatus() == 1}">
                                                <div class="col-lg-4 col-sm-4">
                                                    <div class="box_main">
                                                        <h4 class="shirt_text">${product.getName()}</h4>
                                                        <p class="price_text">Price  <span style="color: #262626;">$ ${product.getUnitPrice()}</span></p>
                                                        <div class="tshirt_img"><img src="uploads/product/${product.getImage().split(" ")[0]}"></div>
                                                        <div class="btn_main">
                                                            <div class="buy_bt"><a href="products">Buy Now</a></div>
                                                            <div class="seemore_bt"><a href="product?idProduct=${product.getId()}">See More</a></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:if>
                                        </c:forEach>
                                    </c:if>   
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="container">
                            <h1 class="fashion_taital">Pants</h1>
                            <div class="fashion_section_2">
                                <div class="row">
                                    <c:if test="${productListID3 != null}">
                                        <c:forEach items="${productListID3}" begin="3" end="5" var="product" >
                                            <c:if test="${product.getStatus() == 1}">
                                                <div class="col-lg-4 col-sm-4">
                                                    <div class="box_main">
                                                        <h4 class="shirt_text">${product.getName()}</h4>
                                                        <p class="price_text">Price  <span style="color: #262626;">$ ${product.getUnitPrice()}</span></p>
                                                        <div class="tshirt_img"><img src="uploads/product/${product.getImage().split(" ")[0]}"></div>
                                                        <div class="btn_main">
                                                            <div class="buy_bt"><a href="products">Buy Now</a></div>
                                                            <div class="seemore_bt"><a href="product?idProduct=${product.getId()}">See More</a></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:if>
                                        </c:forEach>
                                    </c:if>   
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="container">
                            <h1 class="fashion_taital">Pants</h1>
                            <div class="fashion_section_2">
                                <div class="row">
                                    <c:if test="${productListID3 != null}">
                                        <c:forEach items="${productListID3}" begin="6" end="8" var="product" >
                                            <c:if test="${product.getStatus() == 1}">
                                                <div class="col-lg-4 col-sm-4">
                                                    <div class="box_main">
                                                        <h4 class="shirt_text">${product.getName()}</h4>
                                                        <p class="price_text">Price  <span style="color: #262626;">$ ${product.getUnitPrice()}</span></p>
                                                        <div class="tshirt_img"><img src="uploads/product/${product.getImage().split(" ")[0]}"></div>
                                                        <div class="btn_main">
                                                            <div class="buy_bt"><a href="products">Buy Now</a></div>
                                                            <div class="seemore_bt"><a href="product?idProduct=${product.getId()}">See More</a></div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:if>
                                        </c:forEach>
                                    </c:if> 
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#electronic_main_slider" role="button" data-slide="prev">
                    <i class="fa fa-angle-left"></i>
                </a>
                <a class="carousel-control-next" href="#electronic_main_slider" role="button" data-slide="next">
                    <i class="fa fa-angle-right"></i>
                </a>
            </div>
        </div>
        <!-- electronic section end -->
        <!-- jewellery  section start -->
        <div class="jewellery_section">
            <div id="jewellery_main_slider" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="container">
                            <h1 class="fashion_taital"> Jacket</h1>
                            <div class="fashion_section_2">
                                <div class="row">
                                    <c:if test="${productListID5 != null}">
                                        <c:forEach items="${productListID5}" begin="0" end="2" var="product" >
                                            <div class="col-lg-4 col-sm-4">
                                                <div class="box_main">
                                                    <h4 class="shirt_text">${product.getName()}</h4>
                                                    <p class="price_text">Start Price  <span style="color: #262626;">$ ${product.getUnitPrice()}</span></p>
                                                    <div class="jewellery_img"><img src="uploads/product/${product.getImage().split(" ")[0]}"></div>
                                                    <div class="btn_main">
                                                        <div class="buy_bt"><a href="products">Buy Now</a></div>
                                                        <div class="seemore_bt"><a href="product?idProduct=${product.getId()}">See More</a></div>
                                                    </div>
                                                </div>
                                            </div>

                                        </c:forEach>
                                    </c:if> 
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="container">
                            <h1 class="fashion_taital"> Jacket</h1>
                            <div class="fashion_section_2">
                                <div class="row">
                                    <c:if test="${productListID5 != null}">
                                        <c:forEach items="${productListID5}" begin="6" end="8" var="product" >
                                            <div class="col-lg-4 col-sm-4">
                                                <div class="box_main">
                                                    <h4 class="shirt_text">${product.getName()}</h4>
                                                    <p class="price_text">Start Price  <span style="color: #262626;">$ ${product.getUnitPrice()}</span></p>
                                                    <div class="jewellery_img"><img src="uploads/product/${product.getImage().split(" ")[0]}"></div>
                                                    <div class="btn_main">
                                                        <div class="buy_bt"><a href="products">Buy Now</a></div>
                                                        <div class="seemore_bt"><a href="product?idProduct=${product.getId()}">See More</a></div>
                                                    </div>
                                                </div>
                                            </div>

                                        </c:forEach>
                                    </c:if> 
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="container">
                            <h1 class="fashion_taital"> Jacket</h1>
                            <div class="fashion_section_2">
                                <div class="row">
                                    <c:if test="${productListID5 != null}">
                                        <c:forEach items="${productListID5}" begin="3" end="5" var="product" >
                                            <div class="col-lg-4 col-sm-4">
                                                <div class="box_main">
                                                    <h4 class="shirt_text">${product.getName()}</h4>
                                                    <p class="price_text">Start Price  <span style="color: #262626;">$ ${product.getUnitPrice()}</span></p>
                                                    <div class="jewellery_img"><img src="uploads/product/${product.getImage().split(" ")[0]}"></div>
                                                    <div class="btn_main">
                                                        <div class="buy_bt"><a href="products">Buy Now</a></div>
                                                        <div class="seemore_bt"><a href="product?idProduct=${product.getId()}">See More</a></div>
                                                    </div>
                                                </div>
                                            </div>

                                        </c:forEach>
                                    </c:if> 
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#jewellery_main_slider" role="button" data-slide="prev">
                    <i class="fa fa-angle-left"></i>
                </a>
                <a class="carousel-control-next" href="#jewellery_main_slider" role="button" data-slide="next">
                    <i class="fa fa-angle-right"></i>
                </a>
                <div class="loader_main">
                    <div class="loader"></div>
                </div>
            </div>
        </div>
        <!-- jewellery  section end -->
        <!-- footer section start -->
        <div class="footer_section layout_padding">
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
        <!-- footer section end -->
        <!-- copyright section start -->
        <div class="copyright_section">
            <div class="container">
                <p class="copyright_text">© 2020 All Rights Reserved. </p>
            </div>
        </div>
        <!-- copyright section end -->
        <!-- Javascript files-->
        <script src="resources/vendor/jquery/jquery.min.js"></script>
        <script src="resources/vendor/bootstrap/js/popper.min.js"></script>
        <script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="resources/vendor/jquery/jquery-3.2.1.min.js"></script>
        <script src="resources/js/plugin.js"></script>
        <!-- sidebar -->
        <script src="resources/js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="resources/js/custom.js"></script>
        <script src="resources/js/search.js"></script>
        <script>
            function openNav() {
                document.getElementById("mySidenav").style.width = "250px";
            }

            function closeNav() {
                document.getElementById("mySidenav").style.width = "0";
            }
        </script>
    </body>
</html>