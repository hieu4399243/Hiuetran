<%-- 
    Document   : Food
    Created on : Feb 23, 2022, 9:49:56 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1, shrink-to-fit=no"
            />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Gọi và đặt món - Du Lịch  </title>

        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css"
            rel="stylesheet"
            />
        <link rel="icon" href="./img/brand/icon/favicon.png" sizes="32x32">
        <link rel="icon" href="./img/brand/icon/favicon.png" sizes="192x192">
        <link href="css/resetcss.css" rel="stylesheet" type="text/css"/>
        <link href="css/food.css" rel="stylesheet" type="text/css"/>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/responsive.css" rel="stylesheet" type="text/css"/>
        <link href="css/base.css" rel="stylesheet" type="text/css"/>
        <link href="css/swiper-bundle.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/grid.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>

    </head>
    <body>
         <%@include file="components/header.jsp" %>


        <!-- Section-->
        
        <form action="search" class=" d-flex mx-auto">
            
            <input type="search" id="search" name="keyword" placeholder="Search" style="margin-right: 5px;
                   margin-left:600px; margin-top: 100px;padding: 7px 30px;
                   border: 2px solid red;
                   border-radius: 3px"><br><br>
            
            <button class="btn btn-outline-success" type="submit" style="margin-top: 100px">Search</button>
        </form>
        
        
        <section class="py-5">
            <div class="container px-4 px-lg-5 mt-5">
                <div class="row">
                    <div class="col-md-3 mb-5">
                        <h3 style="color:red">Các món ăn được ưa thích</h3>
                        <ul class="list-group">
                            <c:forEach items="${sessionScope.listCategories}" var="C">
                                <li class="list-group-item"><a href="categoryfind?categoryID=${C.id}">${C.name}</a></li>

                            </c:forEach>


                        </ul>
                    </div>

                    <div class="col-md-9">
                        <h3 style="color: red; text-align: center; font: 20px">Đặt món ngay</h3>
                        <c:choose>
                            <c:when test="${listProducts==null || listProducts.size()==0}">
                                Not founds
                            </c:when>
                            <c:otherwise>
                                <nav aria-label="Page navigation example" class="d-flex justify-content-center">
                                    <ul class="pagination">
                                        <li class="page-item"><a class="page-link" href="food?page=${page-1}">Previous</a></li>
                                            <c:forEach begin="1" end="${totalPage}" var="i">
                                            <li class="page-item ${i == page?"active":""}"><a class="page-link" href="food?page=${i}">${i}</a></li>
                                            </c:forEach>
                                        <li class="page-item"><a class="page-link" href="food?page=${page+1}">Next</a></li>
                                    </ul>
                                </nav>
                            </c:otherwise>
                        </c:choose>

                        <br><br>
                        <div
                            class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 justify-content-center"
                            >
                            <c:forEach items="${listProducts}" var="P">


                                <div class="col mb-5">

                                    <div class="card h-100">
                                        <!-- Sale badge-->
                                        <div
                                            class="badge bg-dark text-white position-absolute"
                                            style="top: 0.5rem; right: 0.5rem"
                                            >
                                            Sale
                                        </div>
                                        <!-- Product image-->
                                        <a href="detail?productId=${P.id}">
                                        <img
                                            class="card-img-top"
                                            src="img/food/${P.imageUrl}"
                                            alt="..."
                                            />
                                        </a>
                                        <!-- Product details-->
                                        <div class="card-body p-4">
                                            <div class="text-center">
                                                <!-- Product name-->
                                                <h5 class="fw-bolder">${P.name}</h5>
                                                <!-- Product reviews-->
                                                <div
                                                    class="d-flex justify-content-center small text-warning mb-2"
                                                    >
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                    <div class="bi-star-fill"></div>
                                                </div>
                                                <!-- Product price-->
                                                <span class="text-muted text-decoration-line-through"
                                                      >$20.00</span
                                                >
                                                $${P.price}
                                            </div>
                                        </div>
                                        <!-- Product actions-->
                                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                            <div class="text-center">
                                                <a class="btn btn-outline-dark mt-auto" href="add?productId=${P.id}"
                                                   >Đặt món</a
                                                >
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>

                        </div>

                    </div>
                </div>
            </div>

        </section>
         <div>
            <a href="carts" style="    
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
               <span>${sessionScope.carts.size()}</span>
            </a>
        </div>
         <%@include file="components/footer.jsp" %>
    </body>
</html>