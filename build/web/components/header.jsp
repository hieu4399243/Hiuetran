<%-- 
    Document   : header
    Created on : Mar 7, 2022, 3:59:05 AM
    Author     : Admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <main class="main">
            <header class="header">
                <div class="header-container-unfixed hide-on-mobile-tablet">
                    <nav class="header-unfixed">
                        <a href="" class="header-unfixed__logo">
                            <svg class="header-unfixed__logo-img" xmlns="http://www.w3.org/2000/svg" width="360.924" height="377.662" viewBox="0 0 360.924 377.662">
                            <g id="Group_1" data-name="Group 1" transform="translate(-780 -352)">
                            <path id="Path_1" data-name="Path 1" d="M430.02,451.951a17.843,17.843,0,0,0-12.232-4.277,19.964,19.964,0,0,0-8.957,1.936,6.417,6.417,0,0,0-3.918,6.139,5.257,5.257,0,0,0,1.874,4.339,6.65,6.65,0,0,0,4.327,1.515,6.9,6.9,0,0,0,4.624-1.635,5.158,5.158,0,0,0,1.931-4.094,6.355,6.355,0,0,0-.877-3.1,5.242,5.242,0,0,0-2.4-2.284c.388-.706,1.561-1.053,3.508-1.053a14.206,14.206,0,0,1,9.544,3.456,10.614,10.614,0,0,1,4.037,8.365,9.152,9.152,0,0,1-2.226,5.968q-2.221,2.7-7.841,5.267a82.335,82.335,0,0,1-8.542,3.286q-4.689,1.512-11.708,3.508l-8.314,2.46q-8.071,2.81-12.117,6.964a13.981,13.981,0,0,0-4.038,10.125q0,6.79,4.391,10.244a15.933,15.933,0,0,0,10.13,3.457,17.824,17.824,0,0,0,9.6-2.694,8.311,8.311,0,0,0,4.334-7.38,6.328,6.328,0,0,0-1.7-4.567,6,6,0,0,0-4.51-1.754,6.639,6.639,0,0,0-4.624,1.64,5.705,5.705,0,0,0-1.817,4.448,5.083,5.083,0,0,0,1.64,4.094A8.455,8.455,0,0,0,398,508.194c-.233.781-1.127,1.413-2.688,1.88a15.216,15.216,0,0,1-4.327.7,12.027,12.027,0,0,1-7.323-2.58,8.063,8.063,0,0,1-3.451-6.782A7.612,7.612,0,0,1,382.9,495.5a24.57,24.57,0,0,1,7.613-4.271q4.33-1.64,13.462-4.453,6.909,2.7,9.367,7.494a20.661,20.661,0,0,1,2.454,9.481,16.861,16.861,0,0,1-4.151,11.3,26.7,26.7,0,0,1-11.241,7.494,43.884,43.884,0,0,1-15.4,2.631,41.17,41.17,0,0,1-16.036-2.984,25.523,25.523,0,0,1-11.241-8.718,22.109,22.109,0,0,1-4-11.19c-.063-.78-.1-1.577-.1-2.392q0-14.631,15.221-19.2c1.794.786,3.354,1.406,4.681,1.873a11.481,11.481,0,0,0,3.866.712,4.269,4.269,0,0,0,2.4-.592,1.853,1.853,0,0,0,.877-1.64,2.195,2.195,0,0,0-1.293-1.993,7.053,7.053,0,0,0-3.388-.7,43.69,43.69,0,0,0-7.26.7,17.462,17.462,0,0,1-5.968-13.337q0-6.56,3.747-10.244a13.4,13.4,0,0,1,9.828-3.69,13.975,13.975,0,0,1,5.917,1.116,5.37,5.37,0,0,1,2.984,2.625,6.805,6.805,0,0,0-4.453,2.056,6.083,6.083,0,0,0-1.754,4.39,5.366,5.366,0,0,0,1.816,4.266,6.283,6.283,0,0,0,4.277,1.588,6.8,6.8,0,0,0,4.561-1.7,5.631,5.631,0,0,0,1.993-4.51,9.137,9.137,0,0,0-1.116-4.152,12.738,12.738,0,0,0-3.217-3.923q-4.339-3.51-12.175-3.508a25.685,25.685,0,0,0-10.711,2.05,15.961,15.961,0,0,0-6.788,5.381,12.472,12.472,0,0,0-2.289,7.2,14.1,14.1,0,0,0,3.046,8.542,20.827,20.827,0,0,0,8.781,6.56,37.833,37.833,0,0,0-9.128,3.8,27.048,27.048,0,0,0-8.724,8.074,21.874,21.874,0,0,0-3.8,13.058,24.326,24.326,0,0,0,5.148,15.392A32.911,32.911,0,0,0,364.58,530.26a49.322,49.322,0,0,0,18.911,3.571,42.945,42.945,0,0,0,18.957-3.918,30.72,30.72,0,0,0,12.413-10.358,24.114,24.114,0,0,0,4.328-13.7,22.837,22.837,0,0,0-3.1-11.879,19.939,19.939,0,0,0-9.657-8.017q12.872-3.981,17.322-6.088a21.465,21.465,0,0,0,8.08-6.617,16.1,16.1,0,0,0,3.041-9.777Q434.877,456.225,430.02,451.951Z" transform="translate(592.898 157.092)" fill="#fff"></path>
                            <path id="Path_2" data-name="Path 2" d="M526.194,390.13c-11.139-13.6-25.383-23.437-47.512-29.849-.553-.143-2.178-.55-3.628-.9-2.739-.649-3.316-.825-6.215-1.389-4.458-1.054-9.133-1.976-14.059-2.773l-.2-.017v-.536q38.257-11.607,55.953-33.893a78.969,78.969,0,0,0,17.676-50.39q0-34.4-26.394-55.23c-17.618-13.883-42.161-20.244-75.1-20.244-7.756,0-2.505.057-8.61,0l-65.417.376L231.524,427.343c-15.745,24.276-24.412,41.7-44.422,41.7v9.589c9.584-.962,23.33-.325,37.709-.325,16.365,0,31.23.052,47.041.052,7.822,0,10.615,5.244,13.792,9.6,15.694,21.531,29.554,57.588,72.781,74.085v.017c15.568,6.9,43.978,12,64.671,10.113,36.575-3.325,54.769-11,71.488-19.987s30.983-26.36,39.975-42.492q13.461-24.182,13.467-55.526Q548.026,416.792,526.194,390.13ZM391.15,245.19q0-17.433,2.9-26.16t10.421-12.124q7.508-3.374,22.532-3.388c23.889,0,31.132,7.323,39.366,17.79,9.9,12.59,15.335,30.169,15.335,54.4q0,35.857-15.745,57.406c-10.495,14.372-15.882,21.547-42.349,21.547h-2.4v-.005H391.15Zm-36.438-19.2V354.66H285.758Zm55.742,330.487c-.654,0-1.412.006-2.243.012-90.6-4.186-81.225-83.161-75.656-88.731-7.289.023-44.678.188-66.722.188-5.726,0-7.952-2.4-11.526-5.207-6.443-5.07-7.767-11.91-7.767-21.813,0-12.755,5.057-21.992,13.286-37.873l21.485-40.089h73.4v80.143c15.881-6.042,22.584-6.212,36.438-4.664V363.463h29.258q43.2,0,62.941,22.544t19.748,65.97C503.1,516.114,468.361,556.481,410.454,556.481Z" transform="translate(592.898 157.092)" fill="#fff"></path>
                            </g>
                            </svg>
                        </a>
                        <ul class="header-unfixed__list">
                            <li class="header-unfixed__list-item">
                                <a href="Home.jsp" class="header-unfixed__item-link">Trang ch???</a>
                            </li>
                            <li class="header-unfixed__list-item">
                                <a href="/ProjectAssignment/tours" class="header-unfixed__item-link">Tours</a>
                            </li>   
                            <li class="header-unfixed__list-item">
                                <a href="/ProjectAssignment/food" class="header-unfixed__item-link">??n u???ng</a>
                            </li>
                            <li class="header-unfixed__list-item">
                                <a href="Home.jsp" class="header-unfixed__item-link">About us</a>
                            </li>

                            <li class="header-unfixed__list-item">
                                <a href="Home.jsp" class="header-unfixed__item-link">Contact Us</a>
                            </li>
                            <li class="header-unfixed__list-item">
                                <c:choose>
                                    <c:when test="${sessionScope.contact != null}">
                                        <button class="header-unfixed__item-link" style="background-color:greenyellow;border-radius: 5px; margin-right: 10px">${sessionScope.contact.displayName}</button>
                                        <a href="logout" class="header-unfixed__item-link" style="color: black">????ng xu???t</a>
                                    </c:when>
                                    <c:otherwise>
                                        <a href="Sign.jsp" class="header-unfixed__item-link" style="color:black">????ng K??</a>
                                    </c:otherwise>
                                </c:choose>
                            </li>
                        </ul>
                        <ul class="header-unfixed__search">
                            <li class="header-unfixed__search-item">
                                <a href="" class="header-unfixed__search-item-link">
                                    <i class="far fa-search header-fixed__search-icon"></i>
                                </a>
                            </li>
                            <li class="header-unfixed__search-item">
                                <a href="" class="header-unfixed__search-item-link">
                                    <i class="fal fa-heart header-fixed__search-icon"></i>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
                <div class="header-container-fixed">
                    <nav class="header-fixed">
                        <a class="header-fixed__logo">
                            <svg class="header-fixed__logo-img" xmlns="http://www.w3.org/2000/svg" width="360.924" height="377.662" viewBox="0 0 360.924 377.662">
                            <g id="Group_1" data-name="Group 1" transform="translate(-780 -352)">
                            <path id="Path_1" data-name="Path 1" d="M430.02,451.951a17.843,17.843,0,0,0-12.232-4.277,19.964,19.964,0,0,0-8.957,1.936,6.417,6.417,0,0,0-3.918,6.139,5.257,5.257,0,0,0,1.874,4.339,6.65,6.65,0,0,0,4.327,1.515,6.9,6.9,0,0,0,4.624-1.635,5.158,5.158,0,0,0,1.931-4.094,6.355,6.355,0,0,0-.877-3.1,5.242,5.242,0,0,0-2.4-2.284c.388-.706,1.561-1.053,3.508-1.053a14.206,14.206,0,0,1,9.544,3.456,10.614,10.614,0,0,1,4.037,8.365,9.152,9.152,0,0,1-2.226,5.968q-2.221,2.7-7.841,5.267a82.335,82.335,0,0,1-8.542,3.286q-4.689,1.512-11.708,3.508l-8.314,2.46q-8.071,2.81-12.117,6.964a13.981,13.981,0,0,0-4.038,10.125q0,6.79,4.391,10.244a15.933,15.933,0,0,0,10.13,3.457,17.824,17.824,0,0,0,9.6-2.694,8.311,8.311,0,0,0,4.334-7.38,6.328,6.328,0,0,0-1.7-4.567,6,6,0,0,0-4.51-1.754,6.639,6.639,0,0,0-4.624,1.64,5.705,5.705,0,0,0-1.817,4.448,5.083,5.083,0,0,0,1.64,4.094A8.455,8.455,0,0,0,398,508.194c-.233.781-1.127,1.413-2.688,1.88a15.216,15.216,0,0,1-4.327.7,12.027,12.027,0,0,1-7.323-2.58,8.063,8.063,0,0,1-3.451-6.782A7.612,7.612,0,0,1,382.9,495.5a24.57,24.57,0,0,1,7.613-4.271q4.33-1.64,13.462-4.453,6.909,2.7,9.367,7.494a20.661,20.661,0,0,1,2.454,9.481,16.861,16.861,0,0,1-4.151,11.3,26.7,26.7,0,0,1-11.241,7.494,43.884,43.884,0,0,1-15.4,2.631,41.17,41.17,0,0,1-16.036-2.984,25.523,25.523,0,0,1-11.241-8.718,22.109,22.109,0,0,1-4-11.19c-.063-.78-.1-1.577-.1-2.392q0-14.631,15.221-19.2c1.794.786,3.354,1.406,4.681,1.873a11.481,11.481,0,0,0,3.866.712,4.269,4.269,0,0,0,2.4-.592,1.853,1.853,0,0,0,.877-1.64,2.195,2.195,0,0,0-1.293-1.993,7.053,7.053,0,0,0-3.388-.7,43.69,43.69,0,0,0-7.26.7,17.462,17.462,0,0,1-5.968-13.337q0-6.56,3.747-10.244a13.4,13.4,0,0,1,9.828-3.69,13.975,13.975,0,0,1,5.917,1.116,5.37,5.37,0,0,1,2.984,2.625,6.805,6.805,0,0,0-4.453,2.056,6.083,6.083,0,0,0-1.754,4.39,5.366,5.366,0,0,0,1.816,4.266,6.283,6.283,0,0,0,4.277,1.588,6.8,6.8,0,0,0,4.561-1.7,5.631,5.631,0,0,0,1.993-4.51,9.137,9.137,0,0,0-1.116-4.152,12.738,12.738,0,0,0-3.217-3.923q-4.339-3.51-12.175-3.508a25.685,25.685,0,0,0-10.711,2.05,15.961,15.961,0,0,0-6.788,5.381,12.472,12.472,0,0,0-2.289,7.2,14.1,14.1,0,0,0,3.046,8.542,20.827,20.827,0,0,0,8.781,6.56,37.833,37.833,0,0,0-9.128,3.8,27.048,27.048,0,0,0-8.724,8.074,21.874,21.874,0,0,0-3.8,13.058,24.326,24.326,0,0,0,5.148,15.392A32.911,32.911,0,0,0,364.58,530.26a49.322,49.322,0,0,0,18.911,3.571,42.945,42.945,0,0,0,18.957-3.918,30.72,30.72,0,0,0,12.413-10.358,24.114,24.114,0,0,0,4.328-13.7,22.837,22.837,0,0,0-3.1-11.879,19.939,19.939,0,0,0-9.657-8.017q12.872-3.981,17.322-6.088a21.465,21.465,0,0,0,8.08-6.617,16.1,16.1,0,0,0,3.041-9.777Q434.877,456.225,430.02,451.951Z" transform="translate(592.898 157.092)" fill="#fff"></path>
                            <path id="Path_2" data-name="Path 2" d="M526.194,390.13c-11.139-13.6-25.383-23.437-47.512-29.849-.553-.143-2.178-.55-3.628-.9-2.739-.649-3.316-.825-6.215-1.389-4.458-1.054-9.133-1.976-14.059-2.773l-.2-.017v-.536q38.257-11.607,55.953-33.893a78.969,78.969,0,0,0,17.676-50.39q0-34.4-26.394-55.23c-17.618-13.883-42.161-20.244-75.1-20.244-7.756,0-2.505.057-8.61,0l-65.417.376L231.524,427.343c-15.745,24.276-24.412,41.7-44.422,41.7v9.589c9.584-.962,23.33-.325,37.709-.325,16.365,0,31.23.052,47.041.052,7.822,0,10.615,5.244,13.792,9.6,15.694,21.531,29.554,57.588,72.781,74.085v.017c15.568,6.9,43.978,12,64.671,10.113,36.575-3.325,54.769-11,71.488-19.987s30.983-26.36,39.975-42.492q13.461-24.182,13.467-55.526Q548.026,416.792,526.194,390.13ZM391.15,245.19q0-17.433,2.9-26.16t10.421-12.124q7.508-3.374,22.532-3.388c23.889,0,31.132,7.323,39.366,17.79,9.9,12.59,15.335,30.169,15.335,54.4q0,35.857-15.745,57.406c-10.495,14.372-15.882,21.547-42.349,21.547h-2.4v-.005H391.15Zm-36.438-19.2V354.66H285.758Zm55.742,330.487c-.654,0-1.412.006-2.243.012-90.6-4.186-81.225-83.161-75.656-88.731-7.289.023-44.678.188-66.722.188-5.726,0-7.952-2.4-11.526-5.207-6.443-5.07-7.767-11.91-7.767-21.813,0-12.755,5.057-21.992,13.286-37.873l21.485-40.089h73.4v80.143c15.881-6.042,22.584-6.212,36.438-4.664V363.463h29.258q43.2,0,62.941,22.544t19.748,65.97C503.1,516.114,468.361,556.481,410.454,556.481Z" transform="translate(592.898 157.092)" fill="#fff"></path>
                            </g>
                            </svg>
                        </a>
                        <ul class="header-fixed__list hide-on-mobile-tablet">
                            <li class="header-fixed__list-item">
                                <a href="Home.jsp" class="header-fixed__item-link">Trang ch???</a>

                            </li>
                            <li class="header-fixed__list-item">
                                <a href="/ProjectAssignment/tours" class="header-fixed__item-link">Tours</a>
                            </li>
                            <li class="header-fixed__list-item">
                                <a href="/ProjectAssignment/food" class="header-fixed__item-link">??n u???ng</a>
                            </li>
                            <li class="header-fixed__list-item">
                                <a href="Home.jsp" class="header-fixed__item-link">About us</a>
                            </li>

                            <li class="header-fixed__list-item">
                                <a href="Home.jsp" class="header-fixed__item-link">Contact Us</a>
                            </li>
                            <li class="header-unfixed__list-item">
                                <c:choose>
                                    <c:when test="${sessionScope.contact != null}">
                                        <button class="header-unfixed__item-link" style="background-color:greenyellow;border-radius: 5px; margin-right: 10px">${sessionScope.contact.displayName}</button>
                                        <a href="logout" class="header-unfixed__item-link" style="color: black">????ng xu???t</a>
                                    </c:when>
                                    <c:otherwise>
                                        <a href="Sign.jsp" class="header-unfixed__item-link" style="color:black">????ng K??</a>
                                    </c:otherwise>
                                </c:choose>
                            </li>
                        </ul>
                        <ul class="header-fixed__search">
                            <li class="header-fixed__search-item">
                                <a href="" class="header-fixed__search-item-link">
                                    <i class="header-fixed__search-icon far fa-search"></i>
                                </a>
                            </li>
                            <li class="header-fixed__search-item  hide-on-mobile-tablet">
                                <a href="" class="header-fixed__search-item-link">
                                    <i class="header-fixed__search-icon far fa-heart"></i>
                                </a>
                            </li>
                            <li class="header-fixed__search-item">
                                <label for="mobile-menu-input" class="header-fixed__search-item-link">
                                    <i class="fal fa-bars"></i>
                                </label>
                                <input type="checkbox" id="mobile-menu-input">
                                <div class="mobile-menu">
                                    <label for="mobile-menu-input" class="mobile-menu-close">
                                        <i class="fal fa-times-circle mobile-menu-close__icon"></i>
                                    </label>
                                    <div class="mobile-menu-container">
                                        <ul class="mobile-menu-list">
                                            <li class="mobile-menu-list__item">
                                                <a href="" class="mobile-menu-list__item-link">Home</a>
                                            </li>
                                            <li class="mobile-menu-list__item">
                                                <a href="" class="mobile-menu-list__item-link">Tailored Experiences</a>
                                            </li>
                                            <li class="mobile-menu-list__item">
                                                <a href="" class="mobile-menu-list__item-link">Destinations</a>
                                            </li>
                                            <li class="mobile-menu-list__item">
                                                <a href="" class="mobile-menu-list__item-link">Private Rentals</a>
                                            </li>
                                            <li class="mobile-menu-list__item">
                                                <a href="" class="mobile-menu-list__item-link">About us</a>
                                            </li>
                                            <li class="mobile-menu-list__item">
                                                <a href="" class="mobile-menu-list__item-link">Blog & press</a>
                                            </li>
                                            <li class="mobile-menu-list__item">
                                                <a href="" class="mobile-menu-list__item-link">Contact Us</a>
                                            </li>
                                        </ul>
                                        <ul class="mobile-menu-social">
                                            <li class="mobile-menu-social__item">
                                                <a href="" class="mobile-menu-social__item-link">
                                                    <i class="fab fa-facebook-f mobile-menu-social__item-icon"></i>
                                                </a>
                                                <a href="" class="mobile-menu-social__item-link">
                                                    <i class="fab fa-twitter mobile-menu-social__item-icon"></i>
                                                </a>
                                                <a href="" class="mobile-menu-social__item-link">
                                                    <i class="fab fa-instagram mobile-menu-social__item-icon"></i>
                                                </a>
                                                <a href="" class="mobile-menu-social__item-link">
                                                    <i class="fab fa-linkedin-in mobile-menu-social__item-icon"></i>
                                                </a>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </nav>
                </div>
                <button class="scroll-top-button">
                    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="Layer_1" x="0px" y="0px" viewBox="0 0 19 10.9" style="enable-background:new 0 0 19 10.9;" xml:space="preserve" class="">
                    <style>
                        .st0{
                            fill:none;
                            stroke:#FFFFFF;
                            stroke-width:1.5;
                        }
                    </style>
                    <g id="Group_16" transform="translate(9.778 18.493) rotate(180)">
                    <path id="Path_13" class="st0" d="M-8.7,8.2l9.2,9.2l8.7-9.2"></path>
                    </g>
                    </svg>
                </button>
                <label for="close-checkbox" class="btn chat-with-us hide-on-mobile-tablet">Chat with us</label>
                <input id="close-checkbox" class="close-input" type="checkbox">
                <div class="header-chat-form hide-on-mobile">
                    <div class="chat-form-close">
                        <label for="close-checkbox" class="chat-form-close__label">
                            Close
                            <div class="chat-form-close__icon">
                                <i class="fal fa-times"></i>
                            </div>
                        </label>
                    </div>
                    <div class="chat-form-group">
                        <h4 class="chat-form__heading chat-form-animation">Have a chat with our team</h4>
                        <div class="chat-form__phone chat-form-animation">
                            <a href="tel:1-800-894-5712" class="chat-form__phone-link">US Toll Free: 1-800-894-5712</a>
                            <a href="tel:1-800-764-042" class="chat-form__phone-link">Australia Toll Free:1-800-764-042</a>
                            <a href="tel:+353-1-288-9355" class="chat-form__phone-link">Ireland: +353-1-288-9355</a>
                        </div>
                        <span class="chat-form__introduction chat-form-animation">Or fill in the form below and we'll be in touch</span>
                        <form action="" class="chat-form__form chat-form-animation">
                            <div class="form-input-group">
                                <input type="text" placeholder="First Name" class="form-input form-input--first-name">
                                <input type="text" placeholder="Last Name" class="form-input form-input--last-name">
                            </div>
                            <div class="form-input-group">
                                <input type="email" placeholder="Email" class="form-input form-email">
                            </div>
                            <div class="form-input-group form-input-group--dark-text">
                                <input id="phone" class="form-input form-input--phone" name="phone" type="tel" autocomplete="off" data-intl-tel-input-id="0" placeholder="Phone">
                            </div>
                            <div class="form-input-group">
                                <textarea name="" id="" class="form-input form-input--message" cols="30" rows="10" placeholder="Where do you like to go?"></textarea>
                            </div>
                            <div class="form-input-group">
                                <input id="form-input-agreement" type="checkbox" class="form-input--agree">
                                <label class="form-input__agree-text" for="form-input-agreement">Sign up to receive travel inspiration, exclusive offers & our latest news.</label>
                            </div>
                            <div class="form-input--recapcha">
                                <div>   
                                    <iframe title="reCAPTCHA" src="https://www.google.com/recaptcha/api2/anchor?ar=1&amp;k=6Lcwd9wZAAAAAOY6Kvt50j4iOOele826OztQ7LTA&amp;co=aHR0cHM6Ly93d3cuYWRhbXNhbmRidXRsZXIuY29tOjQ0Mw..&amp;hl=en&amp;v=Eyd0Dt8h04h7r-D86uAD1JP-&amp;theme=light&amp;size=normal&amp;cb=q3vo33l02pxy" width="304" height="78" role="presentation" name="a-s3ql7135gxk0" frameborder="0" scrolling="no" sandbox="allow-forms allow-popups allow-same-origin allow-scripts allow-top-navigation allow-modals allow-popups-to-escape-sandbox" tabindex="7">
                                    </iframe>
                                </div>
                            </div>
                            <div class="form-input--submit">
                                <buttom href="" class="btn form-btn-submit">
                                    Submit
                                </buttom>
                            </div>
                        </form>
                    </div>
                </div>
            </header>
            <div class="content">
                <section class="content-heading">
                    <div class="content-heading-group">
                        <div class="content-heading__background">
                            <video id="content-heading__video" width="100%" height="100%" playsinline="" muted="" autoplay="" loop="">
                                <source src="https://chuong3x.github.io/natalieandcharlie/asset/img/videos/intro-Vid-V2-No-Sound-copy.mp4" type="video/mp4">
                                Your browser does not support the video tag.
                            </video>
                        </div>
                        <div class="content-heading__foreground">
                            <div class="grid wide">
                                <div class="row">
                                    <div class="col l-12 m-12 s-12 slow-appear">
                                        <h1 class="content-heading__brand">Du l???ch Royal To??n Ch??m</h1>
                                    </div>
                                    <div class="col l-12 m-12 s-12 slow-appear">
                                        <h3 class="content-heading__slogan">Du l???ch World</h3>
                                    </div>
                                </div>
                                <div class="row no-gutters mt-34">
                                    <div class="col l-12 m-12 s-12">
                                        <div class="content-heading__nav slow-appear">
                                            <a href="" class="content-heading__link">
                                                <span class="content-heading-link__name">?????t m??n</span>
                                                <span class="content-heading-link__icon">
                                                    <svg xmlns="http://www.w3.org/2000/svg" width="7.325" height="12.173" viewBox="0 0 7.325 12.173" class="">
                                                    <g id="Group_16" data-name="Group 16" transform="translate(9.248 11.643) rotate(180)">
                                                    <path id="Path_13" data-name="Path 13" d="M5.718,0,0,5.718,5.718,11.1" transform="translate(3 0)" fill="none" stroke="#fff" stroke-width="1.5"></path>
                                                    </g>
                                                    </svg>
                                                </span>
                                            </a>
                                            <a href="" class="content-heading__link">
                                                <span class="content-heading-link__name">Th?????ng th???c</span>
                                                <span class="content-heading-link__icon">
                                                    <svg xmlns="http://www.w3.org/2000/svg" width="7.325" height="12.173" viewBox="0 0 7.325 12.173" class="">
                                                    <g id="Group_16" data-name="Group 16" transform="translate(9.248 11.643) rotate(180)">
                                                    <path id="Path_13" data-name="Path 13" d="M5.718,0,0,5.718,5.718,11.1" transform="translate(3 0)" fill="none" stroke="#fff" stroke-width="1.5"></path>
                                                    </g>
                                                    </svg>
                                                </span>
                                            </a>
                                            <a href="" class="content-heading__link">
                                                <span class="content-heading-link__name">????nh gi??</span>
                                                <span class="content-heading-link__icon">
                                                    <svg xmlns="http://www.w3.org/2000/svg" width="7.325" height="12.173" viewBox="0 0 7.325 12.173" class="">
                                                    <g id="Group_16" data-name="Group 16" transform="translate(9.248 11.643) rotate(180)">
                                                    <path id="Path_13" data-name="Path 13" d="M5.718,0,0,5.718,5.718,11.1" transform="translate(3 0)" fill="none" stroke="#fff" stroke-width="1.5"></path>
                                                    </g>
                                                    </svg>
                                                </span>
                                            </a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="grid">
                                <div class="row">
                                    <div class="col l-4 ml-4 m-12 s-12 slow-appear content-heading-member__group">
                                        <a href="" class="content-heading__member">
                                            <img class="content-heading__member-logo content-heading__member--virtuoso" src="https://chuong3x.github.io/natalieandcharlie/asset/img/brand/logo/licenced_footer.svg" alt="Virtuoso Member">
                                        </a>
                                    </div>
                                    <div class="col l-8 ml-8 m-12 s-12 slow-appear content-heading-member__group content-heading-member__group--flex-right">
                                        <span class="content-heading__member">
                                            <img class="content-heading__member-logo content-heading__member--iata" src="https://chuong3x.github.io/natalieandcharlie/asset/img/members/virtuoso_member_logo_hero.svg" alt="IATA Member">
                                        </span>
                                        <span class="content-heading__member">
                                            <img class="content-heading__member-logo content-heading__member--alist" src="https://chuong3x.github.io/natalieandcharlie/asset/img/members/luxury_travel_logo-400x144.png" alt="AList Member">
                                        </span>
                                        <span class="content-heading__member">
                                            <img class="content-heading__member-logo content-heading__member--luxury-travel" src="https://chuong3x.github.io/natalieandcharlie/asset/img/members/luxury_travel_logo-400x144.png" alt="Luxury Travel Member">
                                        </span>
                                        <span class="content-heading__member">
                                            <img class="content-heading__member-logo content-heading__member--condenast" src="https://chuong3x.github.io/natalieandcharlie/asset/img/members/Conde%CC%81_Nast_logo.svg" alt="Conde Nast Member">
                                        </span>
                                        <span class="content-heading__member">
                                            <img class="content-heading__member-logo content-heading__member--thenewyorktimes" src="https://chuong3x.github.io/natalieandcharlie/asset/img/members/Conde%CC%81_Nast_logo.svg" alt="The New York Times Member">
                                        </span>
                                        <span class="content-heading__member">
                                            <img class="content-heading__member-logo content-heading__member--ustravel" src="https://chuong3x.github.io/natalieandcharlie/asset/img/members/US-TRAVELSPECIALISTS-2021-SEAL-with-wm-01.svg" alt="US Travel Special list Member">
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </div>
        </main>
        
    </body>
</html>
