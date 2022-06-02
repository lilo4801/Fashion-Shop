<%-- 
    Document   : listProducts
    Created on : Feb 17, 2022, 7:45:28 AM
    Author     : window
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>List Product</h2>
<div class="dropdown">
  <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown">
    Category
  </button>
  <div class="dropdown-menu">
      <c:if test="${listCategory != null}">
          <c:forEach items="${listCategory}" var="category">
               <a class="dropdown-item" href="list-product?categoryId=${category.getId()}">${category.getName()}</a>
          </c:forEach>
      </c:if>
   
    
  </div>
</div>
<table class="table table-hover">
    <thead>
        <tr>
            <th>ID. </th>
            <th>Name</th>
            <th>Color</th>
            <th>Size</th>
            <th>Unit In Stock</th>
            <th>Unit Price</th>
            <th>Rating</th>
            <th>Description</th>
            <th>Image</th>
            <th>Edit</th>
            
        </tr>
    </thead>
    <tbody>
        <c:if test="${listProduct != null}">
            <c:forEach items="${listProduct}"  var="product">
                <tr>
                    <td>${product.getId()}</td>
                    <td>${product.getName()}</td>
                    <td>${product.getColor()}</td>
                    <td>${product.getSize()}</td>
                    <td>${product.getUnitInStock()}</td>
                    <td>${product.getUnitPrice()}</td>
                    <td>${product.getRating()}</td>
                    <td>${product.getDescription()}</td>
                    <td>${product.getImage()}</td>
                    <td><a  href="update-product?idProduct=${product.getId()}" class="btn btn-warning">Edit</a></td>
                    

                </tr>
            </c:forEach>
        </c:if>


    </tbody>
</table>