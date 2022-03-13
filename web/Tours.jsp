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
        <title>Đặt Tours - Du Lịch  </title>

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

        <form action="searchtours" class=" d-flex mx-auto" style="
              background-color: yellowgreen;
              
              background-size: cover;
              background-repeat: no-repeat;
              width: 100%;
              height: 200px;
              position: absolute;
              ">



              <input type="searchtours" id="search" name="keyword" placeholder="Nhập tours cần tìm" 
               style="
               position: relative;
               margin-right: 5px;
               margin-left:600px; 
               margin-top: 50px;
               margin-bottom: 50px;
               padding: 0px 120px;
               
               border: 2px solid red;
               border-radius: 3px">
            <br><br>

            <button class="btn btn-outline-success" type="submit" style="
                    margin-top: 50px;
                    margin-bottom: 50px">Search</button>
        </form>


        <section class="py-5">
            <div class="container px-4 px-lg-5 mt-5">
                <div class="row">
                    <div class="col-md-3 mb-5">
                        <h3 style="
                            color:red;
                            font-size: 20px;
                            margin-top: 200px;
                            font-weight: bold;
                            
                            ">Lựa chọn Tours Du Lịch</h3>
                        <ul class="list-group" style="
                            margin-top: 40px;
                            border: 2px solid yellow;
                            background-color: coral">
                            <c:forEach items="${sessionScope.listCategoriesTours}" var="C">
                                <li class="list-group-item" style="
                                    background-color: chartreuse;
                                    font-size: 15px;
                                    font-weight: bold"><a href="toursfind?categorytoursID=${C.id}">${C.name}</a></li>

                            </c:forEach>


                        </ul>
                        <img src="img/tours/poter.jpg" alt="" style="
                             width: 95%;
                             height: 550px;
                             margin-top: 50px"/>
                    </div>

                    <div class="col-md-9">
                        <h3 style="
                            color: red;
                            text-align: center; 
                            margin-top: 150px;
                            font-weight: bold;
                            font-size: 50px
                            ">Đặt Tours</h3>
                        <c:choose>
                            <c:when test="${listTours==null || listTours.size()==0}">
                                Not founds
                            </c:when>
                            <c:otherwise>
                                <nav aria-label="Page navigation example" class="d-flex justify-content-center">
                                    <ul class="pagination">
                                        <li class="page-item"><a class="page-link" href="tours?page=${page-1}">Previous</a></li>
                                            <c:forEach begin="1" end="${totalPage}" var="i">
                                            <li class="page-item ${i == page?"active":""}"><a class="page-link" href="tours?page=${i}">${i}</a></li>
                                            </c:forEach>
                                        <li class="page-item"><a class="page-link" href="tours?page=${page+1}">Next</a></li>
                                    </ul>
                                </nav>
                            </c:otherwise>
                        </c:choose>

                        <br><br>
                        <div
                            class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 justify-content-center"
                            >
                            <c:forEach items="${listTours}" var="P">


                                <div class="col mb-5">

                                    <div class="card h-100">
                                        <!-- Sale badge-->
                                        
                                        <!-- Product image-->
                                        <a href="detailtours?toursId=${P.id}">
                                            <img
                                                class="card-img-top"
                                                src="img/tours/${P.imageUrl}"
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
                                                      >$50.000</span
                                                >
                                                ${P.price}
                                            </div>
                                        </div>
                                        <!-- Product actions-->
                                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                                            <div class="text-center">
                                                <a class="btn btn-outline-warning" href="addtours?toursId=${P.id}"
                                                   >Đặt Tour</a
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
            <a href="carttours" style="    
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
            </a>
        </div>
        <%@include file="components/footer.jsp" %>
    </body>
</html>