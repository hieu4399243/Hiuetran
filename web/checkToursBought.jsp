<%-- 
    Document   : checkToursBought
    Created on : Mar 13, 2022, 1:49:34 AM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Tours Bought</title>
    </head>
    <body>
       <%@include file="components/header.jsp" %>




        <!-- Product section-->
        <section class="py-5">

            <div class="container" style="min-height: 1000px">
                <h1>Check Bought</h1>
                <form action="ordertours" method="post">
                    <div class="row">
                        <div class="col-md-8" style="border: 1px solid #ccc; border-radius: 5px; padding: 1rem">
                            <h3>List Tours</h3>
                            <table class="table">
                                <thead>
                                    <tr>
                                        <th scope="col">STT</th>
                                        <th scope="col">Image</th>
                                        <th scope="col">Name</th>
                                        <th scope="col">Price</th>
                                        <th scope="col">Quantity</th>
                                        <th scope="col">Total Price</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${carttours}" var="C">
                                        <tr>
                                    <input type="hidden" name="toursId" value="${C.value.tours.id}"/>
                                    <th scope="row">${C.value.tours.id}</th>
                                    <td><img name="img" value="${C.value.tours.imageUrl}" src="img/tours/${C.value.tours.imageUrl}" width="100"/></td>
                                    <td><input readonly name="pname" value="${C.value.tours.name}" /></td>
                                    <td><input readonly name="" value="${C.value.tours.price}" /></td>
                                    <td><input readonly name="quantity" value="${C.value.quantity}" /></td>
                                    <td><input readonly name="price" value="${C.value.tours.price*C.value.quantity}" ></td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                            <h3>Total Amount: $${totalMoney}</h3>
                        </div>
                        <div class="col-md-4" style="border: 1px solid #ccc; border-radius: 5px; padding: 1rem">
                            <h3>Information of customer</h3>

                            <div class="mb-3">
                                <label for="name" class="form-label">Name</label>
                                <input type="text" class="form-control" id="name" name="name" aria-describedby="emailHelp">
                            </div>
                            <div class="mb-3">
                                <label for="phone" class="form-label">Phone</label>
                                <input type="text" class="form-control" id="phone" name="phone" aria-describedby="emailHelp">
                            </div>
                            <div class="mb-3">
                                <label for="email" class="form-label">Email</label>
                                <input type="text" class="form-control" id="email" name="email" aria-describedby="emailHelp">
                            </div>
                            <div class="mb-3">
                                <label for="note" class="form-label">Note</label>
                                <textarea class="form-control" id="note" name="note" rows="3"></textarea>
                            </div>
                            <button type="submit" class="btn btn-primary w-100">Submit</button>

                        </div>
                    </div>
                </form>
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
