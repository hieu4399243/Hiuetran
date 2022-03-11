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
                        <h2>Login Form</h2>
                        <form action="login" method="post">
                            <div class="inputBox">
                                <input type="text" placeholder="Username" name="user"> 
                            </div>
                            <div class="inputBox">
                                <input type="password" placeholder="password" name="pass">
                            </div>
                            <div class="inputBox">
                                <input name="remember" value="1" type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">Remember me</label>
                            </div>
                            <button class="btn btn-success btn-block" type="submit"><i class="fas fa-sign-in-alt"></i>Sign up</button>
                         
                            <p class="forget">Forgot Password ? <a href="#">Click Here</a></p>
                            <p class="forget">Don't have an account ? <a href="#">Sign up</a></p>
                        </form>
                    </div>
                </div>
            </div>

        </section>
    </body>
</html>
