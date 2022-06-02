<c:if test="${error != null}">
    <div class="alert alert-warning alert-dismissible">
        <button type="button" class="close" data-dismiss="alert">&times;</button>
        <c:if test="${error.equals('not-enough-product') == true}">
            Store is not enough product.
        </c:if>
        <c:if test="${error.equals('cart-already-accept') == true}">
            The cart already accepted.
        </c:if>
    </div>
</c:if>
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
                <td>${order.getId()}</td>
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
            <td>${order.getQuantity()}
                <span style="color:red"><c:forEach items="${productInCart}" var="product">
                        <c:if test="${product.getId() eq order.getProductId()}">
                            &nbsp;&nbsp; available (${product.getUnitInStock()})
                        </c:if>
                    </c:forEach></span>
            </td>
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

<form method="post" action="${contextPath}/send-product">
    <select name="acceptRequest">
        <option value="1" 
    <c:if test="${cart != null && cart.getState().equals('accept')}">
        selected
    </c:if>
    >Accept</option>
    <option value="0"
<c:if test="${cart != null && cart.getState().equals('not accept')}">
    selected
</c:if>
>Not accept</option>
<option value="-1"
<c:if test="${cart != null && cart.getState().equals('pendding')}">
    selected
</c:if>
>Pendding</option>
</select>

<input type="text" hidden name="cartId" value="${cart.getId()}"/>
<input type="submit" class="btn btn-primary" value="Send"/>
</form>
