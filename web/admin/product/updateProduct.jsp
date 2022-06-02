<%-- 
    Document   : updateProduct
    Created on : Feb 18, 2022, 10:15:57 PM
    Author     : window
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h3>Update product</h3>
<c:if test="${messageSus != null}">
    <div class="alert alert-success">
        <strong>${messageSus}!</strong>
    </div>
</c:if>
<c:if test="${messageError != null}">
    <div class="alert alert-danger">
        <strong>${messageError}!</strong>
    </div>
</c:if>
<form class="mt-5" method="post" action="${contextPath}/update-product"
      enctype="multipart/form-data">
    <div class="row">
        <div class="col-md-6">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" placeholder="Enter name" name="name"
                   <c:if test="${productUpdate != null}">
                       value="${productUpdate.getName()}"
                   </c:if>

                   >
        </div>
        <div class="col-md-6">
            <label for="category">Category</label>

            <select class="form-control" id="category" name="categoryId">
                <c:if test="${categoryList != null}">
                    <c:forEach items="${categoryList}" var="category">
                        <option value="${category.getId()}"
                                <c:if test="${productUpdate != null && productUpdate.getCategoryId() eq category.getId()}">
                                    selected
                                </c:if>
                                >${category.getName()}</option>
                    </c:forEach>
                </c:if>
            </select>
        </div>
        <div class="col-md-3">
            <label for="size">Size:</label>
            <select class="form-control" id="size" name="size">
                <c:forEach items="${arraySize}" var="size">
                    <option value="${size}"
                            <c:if test="${productUpdate != null && productUpdate.getSize() eq size}">
                                selected
                            </c:if>
                            >${size}</option>
                </c:forEach>


            </select>
        </div>
        <div class="col-md-3">
            <label for="color">Color:</label>
            <select class="form-control" id="color" name="color">
                <c:forEach items="${arrayColor}" var="color">
                    <option value="${color}"
                            <c:if test="${productUpdate != null && productUpdate.getColor() eq color}">
                                selected
                            </c:if>
                            >${color}</option>
                </c:forEach>

            </select>
        </div>
        <div class="col-md-3">
            <label for="price">Price:</label>

            <input type="text" class="form-control" id="price" placeholder="Enter price" name="price"
                   <c:if test="${productUpdate != null}">
                       value="${productUpdate.getUnitPrice()}"
                   </c:if>
                   >

        </div>
        <div class="col-md-3">
            <label for="quantity">Quantity:</label>
            <input type="text" class="form-control" id="quantity" placeholder="Enter quantity" name="quantity"
                   <c:if test="${productUpdate != null}">
                       value="${productUpdate.getUnitInStock()}"
                   </c:if>

                   >
        </div>
        <div class="col-md-6">
            <label for="exampleFormControlTextarea1">Description:</label>
            <textarea class="form-control" id="exampleFormControlTextarea1" rows="5" placeholder="Enter description" name="description"><c:if test="${productUpdate != null}"> ${productUpdate.getDescription()} </c:if></textarea>
            <input type="text" name="id" class="form-control" hidden value="${productUpdate.getId()}" />

        </div>  
        <div class="col-md-3">
            <label >Selling or not:</label>
            <select class="form-control" name="selectSell">
                <option value="1" 
                        <c:if test="${productUpdate != null && productUpdate.getStatus() == 1}">
                            selected
                        </c:if>>Selling</option>
                <option value="0"
                        <c:if test="${productUpdate != null && productUpdate.getStatus() == 0}">
                            selected
                        </c:if>
                        >Not selling</option>
            </select>
        </div>
        <div class="col-md-3">
            <label for="file">Delete All image:</label>
            <input type="checkbox" name="clearFile" class="form-control"  value="1"/>
        </div>
        <div class="col-md-3">
            <label for="file">Choose image:</label>
            <input type="text" name="fileOld" class="form-control" hidden value="${productUpdate.getImage()}" />
            <input type="file" name="file" class="form-control" id="file"  onchange="loadFile(event)"/>

        </div>



        <div class="col-md-3 mt-3">
            <input type="submit" value="Upload" class="btn btn-dark"/>
        </div>
        <div class="col-md-9 mt-3">

        </div>
        <c:if test="${images != null}">

            <c:forEach items="${images}" var="image">
                <div class="col-md-6 mt-3">
                    <p><img src="uploads/product/${image}" width="60%"/></p>
                </div>
            </c:forEach>
            <div class="col-md-6 mt-3">
                <p><img id="output" width="60%" /></p>
            </div>

        </c:if>




    </div>
    <script>
        var loadFile = function (event) {
            var image = document.getElementById('output');
            image.src = URL.createObjectURL(event.target.files[0]);
        };
    </script>

</form>