

<h3>Create new product</h3>
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

<form class="mt-5" method="post" action="${contextPath}/create-product"
      enctype="multipart/form-data">
    <div class="row">
        <div class="col-md-6">
            <label for="name">Name</label>
            <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
        </div>
        <div class="col-md-6">
            <label for="category">Category</label>

            <select class="form-control" id="category" name="categoryId">
                <c:if test="${categoryList != null}">
                    <c:forEach items="${categoryList}" var="category">
                        <option value="${category.getId()}">${category.getName()}</option>
                    </c:forEach>
                </c:if>
            </select>
        </div>
        <div class="col-md-3">
            <label for="size">Size:</label>
            <select class="form-control" id="size" name="size">
                <option value="XXS">XXS</option>
                <option value="XS ">XS </option>
                <option value="S">S</option>
                <option value="M ">M </option>
                <option value="L ">L </option>
                <option value="XL ">XL </option>
                <option value="XXL  ">XXL  </option>

            </select>
        </div>
        <div class="col-md-3">
            <label for="color">Color:</label>
            <select class="form-control" id="color" name="color">
                <option value="red">red</option>
                <option value="blue">blue</option>
                <option value="white">white</option>
                <option value="black">black</option>
                <option value="pink">pink</option>

            </select>
        </div>
        <div class="col-md-3">
            <label for="price">Price:</label>

            <input type="text" class="form-control" id="price" placeholder="Enter price" name="price">

        </div>
        <div class="col-md-3">
            <label for="quantity">Quantity:</label>
            <input type="text" class="form-control" id="quantity" placeholder="Enter quantity" name="quantity">
        </div>

        <div class="col-md-3">
            <label for="file">Choose image:</label>
            <input type="file" name="file" class="form-control" id="file"  onchange="loadFile(event)"/>
        </div>
        <div class="col-md-9">
            <label for="exampleFormControlTextarea1">Description:</label>
            <textarea class="form-control" id="exampleFormControlTextarea1" rows="5" placeholder="Enter description" name="description"></textarea>
        </div>


        <div class="col-md-3 mt-3">
            <input type="submit" value="Upload" class="btn btn-dark"/>
        </div>
         <div class="col-md-6 mt-3">
            <p><img id="output" width="90%" /></p>
        </div>
         <div class="col-md-3 mt-3">
            
        </div>           


    </div>
    <script>
        var loadFile = function (event) {
            var image = document.getElementById('output');
            image.src = URL.createObjectURL(event.target.files[0]);
        };
    </script>

</form>