<%-- 
    Document   : loadStudent1
    Created on : Feb 8, 2022, 11:39:42 AM
    Author     : window
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="container">
    <div id="reviews" class="review-section">
        <div class="d-flex align-items-center justify-content-between mb-4">
            <h4 class="m-0">${reviews.size()} Reviews</h4>
            <select class="custom-select custom-select-sm border-0 shadow-sm ml-2 select2-hidden-accessible" data-select2-id="1" tabindex="-1" aria-hidden="true">
                <option data-select2-id="3">Most Relevant</option>
                <option>Most Recent</option>
            </select>
            <span class="select2 select2-container select2-container--default" dir="ltr" data-select2-id="2" style="width: 188px;">
                <span class="selection">
                    <span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-labelledby="select2-qd66-container">
                        <span class="select2-selection__rendered" id="select2-qd66-container" role="textbox" aria-readonly="true" title="Most Relevant">Most Relevant</span>
                        <span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span>
                    </span>
                </span>
                <span class="dropdown-wrapper" aria-hidden="true"></span>
            </span>
        </div>
        <div class="row">
            <div class="col-md-6">
                <table class="stars-counters">
                    <tbody>
                        <c:if test="${listRating != null}">

                            <c:forEach items="${listRating}" var="item" >
                                <tr class="">
                                    <td>
                                        <span>
                                            <button class="fit-button fit-button-color-blue fit-button-fill-ghost fit-button-size-medium stars-filter">${item.getKey()} Stars</button>
                                        </span>
                                    </td>
                                    <td class="progress-bar-container">
                                        <div class="fit-progressbar fit-progressbar-bar star-progress-bar">
                                            <div class="fit-progressbar-background">
                                                <span class="progress-fill" style="width: ${item.getValue()/reviews.size()*100}%" ></span>
                                            </div>
                                        </div>
                                    </td>
                                    <td class="star-num">(${item.getValue()})</td>
                                </tr>
                            </c:forEach>


                        </c:if>



                    </tbody>
                </table>
            </div>
            <div class="col-md-6">
                <div class="ranking">
                    <h6 class="text-display-7">Rating Breakdown</h6>
                    <ul>
                        <li>
                            Seller communication level<span>5<span class="review-star rate-10 show-one"></span></span>
                        </li>
                        <li>
                            Recommend to a friend<span>5<span class="review-star rate-10 show-one"></span></span>
                        </li>
                        <li>
                            Service as described<span>4.9<span class="review-star rate-10 show-one"></span></span>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div class="review-list">


        <c:if test="${reviews.size() != 0}">
            <c:forEach items="${reviews}" var="review"
                       begin="${pageStart}"
                       end="${pageEnd}"
                       >
                <ul>
                    <li>
                        <div class="d-flex">
                            <div class="left">
                                <span>
                                    <img class="profile-pict-img img-fluid" alt="" 
                                         <c:if test="${listUserReviewProduct !=null}">
                                             <c:forEach items="${listUserReviewProduct}" var="user">
                                                 <c:if test="${review.getUserId() == user.getId()}">
                                                     src="uploads/user/${user.getImage()}" 
                                                 </c:if>
                                             </c:forEach>
                                         </c:if>
                                         />
                                </span>
                            </div>
                            <div class="right">
                                <h4>
                                    <c:if test="${listUserReviewProduct !=null}">
                                        <c:forEach items="${listUserReviewProduct}" var="user">
                                            <c:if test="${review.getUserId() == user.getId()}">
                                                ${user.getFirstName()} ${user.getLastName()} 
                                            </c:if>
                                        </c:forEach>
                                    </c:if>
                                    <span class="gig-rating text-body-2">
                                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1792 1792" width="15" height="15">
                                        <path
                                            fill="currentColor"
                                            d="M1728 647q0 22-26 48l-363 354 86 500q1 7 1 20 0 21-10.5 35.5t-30.5 14.5q-19 0-40-12l-449-236-449 236q-22 12-40 12-21 0-31.5-14.5t-10.5-35.5q0-6 2-20l86-500-364-354q-25-27-25-48 0-37 56-46l502-73 225-455q19-41 49-41t49 41l225 455 502 73q56 9 56 46z"
                                            ></path>
                                        </svg>
                                        ${review.getRating()}
                                    </span>
                                </h4>

                                <div class="review-description">
                                    <p>
                                        ${review.getComment()}
                                    </p>
                                </div>
                                <span class="publish py-3 d-inline-block w-100">Published 4 weeks ago</span>  
                            </div>
                        </div>
                    </li>
                </ul>
            </c:forEach>
        </c:if>


        <form method="post"  action="${contextPath}/pagereview">
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


            <input type="text" hidden name="currentPage"   value="${page}"/>
            <input type="text" hidden name="idProduct"  value="${product.getId()}"/>
            <input type="text" hidden name="numberRecordInPage"   value="3"/>
            <input type="text" hidden name="totalSize"   value="${end}"/>
        </form>
    </div>
</div>
</div>
