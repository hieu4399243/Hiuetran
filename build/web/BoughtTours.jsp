<%-- 
    Document   : BoughTours
    Created on : Mar 13, 2022, 1:16:01 AM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Tours</title>
    </head>
    <body>
       <%@include file="components/header.jsp" %>




        <!-- Product section-->
        <section class="py-5">
            <div class="container" style="min-height: 1000px">
                <c:choose>
                    <c:when test="${sessionScope.carttours==null||sessionScope.carttours.size()==0}">
                        <h1>Không có tour nào được mua</h1>
                    </c:when>
                    <c:otherwise>
                        <h3>Danh Sách Tours</h3>
                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">STT</th>
                                    <th scope="col">Image</th>
                                    <th scope="col">Tên Tour</th>
                                    <th scope="col">Đơn Gía</th>
                                    <th scope="col">Số lượng mua</th>
                                    <th scope="col">Tổng Gía</th>
                                    <th scope="col">Action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${carttours}" var="C">
                                <form action="updatetours">
                                    <tr>
                                    <input type="hidden" name="toursId" value="${C.value.tours.id}"/>
                                    <th scope="row">${C.value.tours.id}</th>
                                    
                                    <td><img src="img/tours/${C.value.tours.imageUrl}" width="50"/></td>
                                    <td>${C.value.tours.name}</td>
                                    <td>${C.value.tours.price}</td>
                                    <td><input onchange="this.form.submit()" type="number" name="quantitytours" value="${C.value.quantity}"/></td>
                                    <td>${C.value.tours.price*C.value.quantity}</td>
                                    <td><a href="deletetours?toursId=${C.value.tours.id}" class="btn btn-outline-danger"><i class="bi bi-trash"></i>Delete</a></td>
                                    </tr>
                                </form>
                            </c:forEach>
                            </tbody>
                        </table>
                        <h3>Total Amount: $${totalMoney}</h3>
                        <a href="ordertours" class="btn btn-success w-25">Đặt Tours</a>
                    </c:otherwise>
                </c:choose>
            </div>
        </section>


        <form>
            <button type="submit" style="    
                    position: fixed;
                    bottom: 200px;
                    right: 50px;
                    background-color: red;
                    width: 80px;
                    height: 80px;
                    display: flex;
                    align-items: center;
                    justify-content: center;
                    border-radius: 50%;
                    color: white;
                    flex-direction: column;">
                <i class="bi-cart-fill me-1"></i>
                Bought
                <span>${sessionScope.carttours.size()}</span>
            </button>
        </form>

        <%@include file="components/footer.jsp" %>
    </body>
</html>
