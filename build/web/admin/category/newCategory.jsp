<%-- 
    Document   : newCategory
    Created on : Feb 16, 2022, 8:06:41 PM
    Author     : window
--%>



<div class="form-category">

    <h3>Create new category</h3> <br/>
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
    <form action="${contextPath}/create-category" method="post">
        <div class="form-group">
            <label for="name">Name category:</label>
            <input type="text" class="form-control" placeholder="Enter name" id="name" name="name" size="15">
        </div>
        <div class="form-group">
            <label for="description">Description</label>
            <input type="text" class="form-control" placeholder="Enter description" id="description" name="description" size="15">
        </div>
        <input type="text" hidden id="description" name="role" value="${user.getRole()}">
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>



</div>
