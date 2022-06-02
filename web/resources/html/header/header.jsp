<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="banner_bg_main">

    <div class="header_section mt-5">
        <div class="container">
            <div class="containt_main">
                <div id="mySidenav" class="sidenav">
                    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
                    <a href="home">Home</a>
                    <a href="products">Fashion</a>
                    <a href="#">Electronic</a>
                    <a href="#">Jewellery</a>
                </div>
                <span class="toggle_icon" onclick="openNav()"><img src="resources/image/toggle-icon.png"></span>
                <div class="dropdown">
                    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">All Category 
                    </button>
                    <form class="dropdown-menu" aria-labelledby="dropdownMenuButton" method="get" action="${contextPath}/filter-product">

                        <c:if test="${categoryList != null}">
                            <c:forEach items="${categoryList}" var="category">
                                <div class="dropdown-item">
                                    <input type="submit" name="filterCategory" id="shop-filter_${category.getId()}" value="${category.getId()}">
                                    <label for="shop-filter_${category.getId()}">${category.getName()}</label>
                                </div>
                            </c:forEach>
                        </c:if>



                    </form>
                </div>
                  <input id="dataName" hidden value="${nameProduct}">
                <div class="main">
                    <!-- Another variation with a button -->
                    
                    <form class="input-group" autocomplete="off" action="/ProjectWeb/products" method="get">
                        <div class="autocomplete" style="width:100%;">
                            <input id="myInput" type="text" style="width:100%;"
                                   class="form-control" name="search" placeholder="Search product">
                           
                        </div>
                        <div class="input-group-append">
                            <button class="btn btn-secondary" type="submit" style="background-color: #f26522; border-color:#f26522 ">
                                <i class="fa fa-search"></i>
                            </button>
                        </div>


                    </form>

                   
                </div>
                <div class="header_box">

                    <div class="login_menu">
                        <ul>
                            <li style="    margin-top: 6px;">
                                <a href="cart">
                                    <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                                    <span class="padding_10">Cart</span></a>
                            </li>
                            <li>
                                <div class="lang_box ">
                                    <a href="#" title="Language" class="nav-link" data-toggle="dropdown" aria-expanded="true">
                                        <i class="fa fa-user" aria-hidden="true"></i>
                                        <span class="padding_10">Account</span></a
                                    </a>

                                    <div class="dropdown-menu ">
                                        <c:if test="${user == null}" >
                                            <a href="login" class="dropdown-item">
                                                Login
                                            </a>
                                            <a href="register" class="dropdown-item">
                                                Sign Up
                                            </a>
                                        </c:if>
                                        <c:if test="${user != null}" >
                                            <a href="#" class="dropdown-item">
                                                Hi, ${user.getFirstName()}
                                            </a>
                                            <a href="profile" class="dropdown-item">
                                                Account Setting
                                            </a>
                                            <c:if test="${user.getRole() == 1}" >
                                                <a href="admin" class="dropdown-item">
                                                    Admin
                                                </a>
                                            </c:if>
                                            <a href="listOrders" class="dropdown-item">
                                                Pendding order
                                            </a>
                                            <a href="logout" class="dropdown-item">
                                                Logout
                                            </a>
                                        </c:if>

                                    </div>


                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- header section end -->
    <!-- banner section start -->
    <div class="banner_section layout_padding">
        <div class="container">
            <div id="my_slider" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="row">
                            <div class="col-sm-12">
                                <h1 class="banner_taital">Get Start <br>Your favriot shoping</h1>
                                <div class="buynow_bt"><a href="products">Buy Now</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="row">
                            <div class="col-sm-12">
                                <h1 class="banner_taital">Get Start <br>Your favriot shoping</h1>
                                <div class="buynow_bt"><a href="products">Buy Now</a></div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="row">
                            <div class="col-sm-12">
                                <h1 class="banner_taital">Get Start <br>Your favriot shoping</h1>
                                <div class="buynow_bt"><a href="products">Buy Now</a></div>
                            </div>
                        </div>
                    </div>
                </div>
                <a class="carousel-control-prev" href="#my_slider" role="button" data-slide="prev">
                    <i class="fa fa-angle-left"></i>
                </a>
                <a class="carousel-control-next" href="#my_slider" role="button" data-slide="next">
                    <i class="fa fa-angle-right"></i>
                </a>
            </div>
        </div>
    </div>
    <!-- banner section end -->
</div>