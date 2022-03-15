<%-- 
    Document   : Sign
    Created on : Mar 7, 2022, 9:31:02 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng ký tài khoản</title>
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
                        <h2>Sign Up</h2>
                        <form action="signup" method="post">
                            <h3 class="text-danger">${error}</h3>
                            <h3 class="text-danger">${error1}</h3>
                            <div class="inputBox">
                                <input type="text" placeholder="Username" name="user"> 
                            </div>
                            <div class="inputBox">
                                <input type="password" placeholder="Password" name="pass">
                            </div>
                            <div class="inputBox">
                                <input type="password" placeholder="Repeatpass" name="repass">
                            </div>
                            <div class="inputBox">
                                <input type="text" placeholder="Displayname" name="displayname">
                            </div>
                            <br>


                            <br>
                            <button class="btn btn-success btn-block" type="submit"><i class="fas fa-sign-in-alt"></i>Sign up</button>


                        </form>

                    </div>
                </div>
            </div>

        </section>
    </body>
</html>
