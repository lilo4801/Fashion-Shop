<%-- 
    Document   : listProducts
    Created on : Feb 17, 2022, 7:45:28 AM
    Author     : window
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>List orders checkout</h2>

<table class="table table-hover">
    <thead>
        <tr>
            <th>ID. </th>
            <th>Total Price</th>
            <th>
                <div class="dropdown">
                    <button class="dropbtn">Checkout  </button>
                    <div class="dropdown-content">
                        <a href="list-cart">Both</a>
                        <a href="list-cart?checkout=1">Yes (checked out)</a>
                        <a href="list-cart?checkout=0">No(Not yet)</a>
                    </div>
                </div> 
            </th>
            <th>Address</th>
            <th>Note</th>
            <th>State</th>
            <th>Send Product</th>
        </tr>
    </thead>
    <tbody>
        <c:if test="${listCarts != null}">
            <c:forEach items="${listCarts}" 
                       var="cart" 
                       begin="${pageStart}"
                       end="${pageEnd}" >

                <tr>
                    <td>${cart.getId()}</td>
                    <td>${cart.getTotalPriceOfProduct()}</td>
                    <c:if test="${cart.isCheckPay() eq true}">
                        <td>Yes</td>
                    </c:if>
                    <c:if test="${cart.isCheckPay() eq false}">
                        <td>Not yet</td>
                    </c:if>
                    <td>${cart.getAddress()}</td>
                    <td>${cart.getNote()}</td>
                    <td>${cart.getState()}</td>
                    <c:if test="${cart.isCheckPay() eq true}">
                        <td>
                            <form method="get" action="${contextPath}/list-product-cart">
                                <input type="text" hidden name="cartId" value="${cart.getId()}"/>
                                <input type="submit" class="btn btn-primary" value="See cart"/>
                            </form>                           
                        </td>
                    </c:if>

                </tr>



            </c:forEach>
        </c:if>


    </tbody>
</table>

<form method="post"  action="${contextPath}/pagelistorders">
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
    <c:if test="${listCarts != null}">

        <input type="text" hidden name="checkout"   value="${checkout}"/>

    </c:if>

    <input type="text" hidden name="currentPage"   value="${page}"/>
    <input type="text" hidden name="numberRecordInPage"   value="9"/>
    <input type="text" hidden name="totalSize"   value="${totalPage}"/>
</form>
<h3 class="mt-5">Sold Product</h3>
<table class="table table-hover">
    <thead>
        <tr>
            <th>ID. </th>
            <th>Image</th>
            <th>Name</th>
            <th>Quantity</th>
            <th>Size</th>
            <th>Color</th>

        </tr>
    </thead>
    <tbody>
        <c:if test="${listSoldProduct != null}">
            <c:forEach items="${listSoldProduct}"  var="product">
                <tr>
                    <td>${product.getId()}</td>
                    <td><img style="width: 100px;height: 100px"

                             src="uploads/product/${product.getImage().split(" ")[0]}"

                             ></td>

                    <td>
                        ${product.getName()}
                    </td>
                    <td>${product.getUnitInStock()}

                    </td>
                    <td>
                        ${product.getSize()}
                    </td>
                    <td>
                        ${product.getColor()}
                    </td>



                </tr>
            </c:forEach>
        </c:if>
    </tbody>
</table>