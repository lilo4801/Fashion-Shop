<%-- 
    Document   : userProfile
    Created on : Feb 15, 2022, 7:50:49 PM
    Author     : window
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Account Settings UI Design</title>
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" type="text/css" href="resources/vendor/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/vendor/font-awesome-4.7/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="resources/css/userProfile.css">
    </head>
    <body>
        <section class="py-5">
            <div class="container">
                <h1 class="mb-5">Account Settings</h1>
                <div class="bg-white shadow rounded-lg d-block d-sm-flex">
                    <div class="profile-tab-nav border-right">
                        <div class="p-4">
                            <div class="img-circle text-center mb-3">
                                <img src="uploads/user/${user.getImage()}" alt="Image"   class="shadow" id="output">
                            </div>
                            <h4 class="text-center">
                                <c:if test="${user != null && user.getFirstName() != null && user.getLastName() != null}">
                                    ${user.getFirstName()} ${ user.getLastName()}
                                </c:if>
                            </h4>
                        </div>
                        <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                            <a class="nav-link active" id="account-tab" data-toggle="pill" href="#account" role="tab" aria-controls="account" aria-selected="true">
                                <i class="fa fa-home text-center mr-1"></i> 
                                Account
                            </a>
                            <a class="nav-link" id="password-tab" data-toggle="pill" href="#password" role="tab" aria-controls="password" aria-selected="false">
                                <i class="fa fa-key text-center mr-1"></i> 
                                Password
                            </a>
                            <a class="nav-link" id="security-tab" data-toggle="pill" href="#security" role="tab" aria-controls="security" aria-selected="false">
                                <i class="fa fa-user text-center mr-1"></i> 
                                Security
                            </a>
                            <a class="nav-link" id="application-tab" data-toggle="pill" href="#application" role="tab" aria-controls="application" aria-selected="false">
                                <i class="fa fa-tv text-center mr-1"></i> 
                                Upload Image
                            </a>
                            <a class="nav-link" id="notification-tab" data-toggle="pill" href="#notification" role="tab" aria-controls="notification" aria-selected="false">
                                <i class="fa fa-bell text-center mr-1"></i> 
                                Notification
                            </a>
                        </div>
                    </div>
                    <div class="tab-content p-4 p-md-5" id="v-pills-tabContent">
                        <form class="tab-pane fade show active" id="account" role="tabpanel" aria-labelledby="account-tab"
                              method="post" action="${contextPath}/profile"
                              >
                            <h3 class="mb-4">Account Settings</h3>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>First Name</label>
                                        <input type="text" class="form-control" name="firstName"
                                               <c:if test="${user != null && user.getFirstName() != null}">
                                                   value="${user.getFirstName()}"
                                               </c:if>
                                               >
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Last Name</label>
                                        <input type="text" class="form-control"  name="lastName"
                                               <c:if test="${user != null && user.getLastName() != null}">
                                                   value="${user.getLastName()}"
                                               </c:if>
                                               >
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Email</label>
                                        <input type="text" class="form-control"  name="email"
                                               <c:if test="${user != null && user.getEmail() != null}">
                                                   value="${user.getEmail()}"
                                               </c:if>
                                               >
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Phone number</label>
                                        <input type="text" class="form-control"  name="phone"
                                               <c:if test="${user != null && user.getPhone() != null}">
                                                   value="${user.getPhone()}"
                                               </c:if>

                                               >
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Address</label>
                                        <input type="text" class="form-control" name="address"
                                               <c:if test="${user != null && user.getAddress() != null}">
                                                   value="${user.getAddress()}"
                                               </c:if>
                                               >
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Gender</label> <br/>
                                        <label class="radio-container m-r-45">Male
                                            <input type="radio"  name="gender" value="male"
                                                   <c:if test="${user != null && user.isGender() == true}">
                                                       checked="checked"
                                                   </c:if>
                                                   >
                                            <span class="checkmark"></span>
                                        </label>
                                        <label class="radio-container">Female
                                            <input type="radio" name="gender" name="gender" value="female"
                                                   <c:if test="${user != null && user.isGender() == false}">
                                                       checked="checked"
                                                   </c:if>
                                                   >
                                            <span class="checkmark"></span>
                                        </label>

                                    </div>
                                </div>

                            </div>

                            <div>
                                <button type="submit" class="btn btn-primary">Update</button>
                                <a class="btn btn-light" href="home">Cancel</a>
                            </div>
                        </form>

                        <form method="post" action="${contextPath}/changePassword" class="tab-pane fade" id="password" role="tabpanel" aria-labelledby="password-tab">
                            <h3 class="mb-4">Password Settings</h3>
                            <c:if test="${error != null}">
                                <div class="alert alert-danger alert-dismissible mt-5">
                                    <button type="button" class="close" data-dismiss="alert">&times;</button>
                                    ${error}
                                </div>
                            </c:if>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Old password</label>
                                        <input type="password" name="oldPassword" class="form-control">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>New password</label>
                                        <input type="password" name="newPassword" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Confirm new password</label>
                                        <input type="password" name="newPasswordConfirm" class="form-control">
                                    </div>
                                </div>
                            </div>
                            <div>
                                <button type="submit" class="btn btn-primary">Update</button>
                                <a class="btn btn-light" href="home">Cancel</a >
                            </div>


                        </form>
                        <div class="tab-pane fade" id="security" role="tabpanel" aria-labelledby="security-tab">
                            <h3 class="mb-4">Security Settings</h3>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Login</label>
                                        <input type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Two-factor auth</label>
                                        <input type="text" class="form-control">
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <div class="form-check">
                                            <input class="form-check-input" type="checkbox" value="" id="recovery">
                                            <label class="form-check-label" for="recovery">
                                                Recovery
                                            </label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div>
                                <button class="btn btn-primary">Update</button>
                                <button class="btn btn-light">Cancel</button>
                            </div>
                        </div>
                        <div class="tab-pane fade" id="application" role="tabpanel" aria-labelledby="application-tab">
                            <h3 class="mb-4">Application Settings</h3>
                            <div class="row">
                                <div class="col-md-6">


                                    <form action="${contextPath}/uploadFileU" method="post"
                                          enctype="multipart/form-data"
                                          >
                                        <div class="form-group">
                                            <label for="file">Upload file:</label>
                                            <input type="file" class="form-control" onchange="loadFile(event)" id="file" name="file">
                                        </div>
                                        <button type="submit" class="btn btn-primary">Upload</button>
                                    </form>


                                    <!--                                        <div class="form-check">
                                                                                <input class="form-check-input" type="checkbox" value="" id="defaultCheck2" >
                                                                                <label class="form-check-label" for="defaultCheck2">
                                    
                                                                                </label>
                                                                            </div>-->

                                </div>
                            </div>
                            <!--                            <div>
                                                            <button class="btn btn-primary">Update</button>
                                                            <button class="btn btn-light">Cancel</button>
                                                        </div>-->
                        </div>
                        <div class="tab-pane fade" id="notification" role="tabpanel" aria-labelledby="notification-tab">
                            <h3 class="mb-4">Notification Settings</h3>
                            <div class="form-group">
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" value="" id="notification1">
                                    <label class="form-check-label" for="notification1">
                                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolorum accusantium accusamus, neque cupiditate quis
                                    </label>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" value="" id="notification2" >
                                    <label class="form-check-label" for="notification2">
                                        hic nesciunt repellat perferendis voluptatum totam porro eligendi.
                                    </label>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" value="" id="notification3" >
                                    <label class="form-check-label" for="notification3">
                                        commodi fugiat molestiae tempora corporis. Sed dignissimos suscipit
                                    </label>
                                </div>
                            </div>
                            <div>
                                <button class="btn btn-primary">Update</button>
                                <button class="btn btn-light">Cancel</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <script>
            var loadFile = function (event) {
                var image = document.getElementById('output');
                image.src = URL.createObjectURL(event.target.files[0]);
            };
        </script>                                  
        <script src="<c:url value = "resources/vendor/jquery/jquery-3.2.1.min.js"/>"></script>
        <script src="<c:url value = "resources/vendor/bootstrap/js/popper.js"/>"></script>
        <script src="<c:url value = "resources/vendor/bootstrap/js/bootstrap.min.js"/>"></script>

    </body>
</html>