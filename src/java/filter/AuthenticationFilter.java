/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import dao.ContactDAO;
import entity.Contact;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebFilter(filterName = "AuthenticationFilter", urlPatterns = {"/add","/addtours","/admin/*","/carts","/carttours"})// url chặn tất bất kỳ request nào đều p chạy qua filte này
public class AuthenticationFilter implements Filter {
    

     @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        HttpSession session = req.getSession();
        //Kiểm tra đăng nhập
        Contact contact = (Contact) session.getAttribute("contact");

        if (contact != null) {
            //cho qua
            chain.doFilter(request, response);
        } else {
            //check cookie
            //kiểm tra cookie
            Cookie[] cookies = req.getCookies();
            String user = null;
            String pass = null;
            for (Cookie cooky : cookies) {
                if (cooky.getName().equals("user")) {
                    user = cooky.getValue();
                }
                if (cooky.getName().equals("pass")) {
                    pass = cooky.getValue();
                }
                if (user != null && pass != null) {
                    break;
                }
            }

            if (user != null && pass != null) {
                Contact contactLogin = new ContactDAO().login(user, pass);
                if (contact != null) { //cookie hợp lệ
                    session.setAttribute("contact", contact);
                    chain.doFilter(request, response);
                    return;
                }
            }
            res.sendRedirect("Sign.jsp");
        }
    }


    @Override
    public void destroy() {        
    }


    @Override
    public void init(FilterConfig filterConfig) {        

    }

    
}
