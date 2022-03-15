<%-- 
    Document   : Edit
    Created on : Mar 15, 2022, 11:44:29 PM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Product</title>
        <link href="css/Sign.css" rel="stylesheet" type="text/css"/>
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
            rel="stylesheet"
            />
    </head>
    <body>
        <section>

            <div class="color"></div>
            <div class="color"></div>
            <div class="color"></div>
            <div class="box">
                <div class="square" style="--i:0;"></div>
                <div class="square" style="--i:1;"></div>
                <div class="square" style="--i:2;"></div>
                <div class="square" style="--i:3;"></div>
                <div class="square" style="--i:4;"></div>
                <div class="container">
                    <div class="form">
                        <form action="edit" method="post">
                            <div class="inputBox">						
                                <h4 class="modal-title">Edit Product</h4>
                                
                            </div>
                            <div class="inputBox">
                                <div class="inputBox">
                                    <label>ID</label>
                                    <input value="${product.id}" name="id" type="text" class="form-control" readonly required>
                                </div>
                                <div class="form-group">
                                    <label>Name</label>
                                    <input value="${product.name}" name="name" type="text" class="form-control" required>
                                </div>
                                <div class="inputBox">
                                    <label>Quantity</label>
                                    <input value="${product.quantity}" name="quantity" type="text" class="form-control" required>
                                </div>
                                <div class="inputBox">
                                    <label>Price</label>
                                    <input value="${product.price}" name="price" type="text" class="form-control" required>
                                </div>
                                <div class="inputBox">
                                    <label>Image</label>
                                    <input value="${product.imageUrl}" name="image" type="text" class="form-control" required>
                                </div>
                                

                                <div class="inputBox">
                                    <label>Category</label>
                                    <select name="category" class="form-select" aria-label="Default select example">
                                        <c:forEach items="${listCategories}" var="o">
                                            <option value="${o.id}">${o.name}</option>
                                        </c:forEach>
                                    </select>
                                </div>

                            </div>
                            <div class="inputBox">
                                
                                <input type="submit" class="btn btn-info" value="Save">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>

       
    </body>
</html>
