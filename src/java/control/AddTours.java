/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.ToursDAO;
import entity.CarTours;
import entity.Contact;
import entity.Product;
import entity.Tours;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
@WebServlet(name = "AddTours", urlPatterns = {"/addtours"})
public class AddTours extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
           /* TODO output your page here. You may use following sample code. */
            int toursId = Integer.parseInt(request.getParameter("toursId"));
            //map    productId | cart
            HttpSession session = request.getSession();
            
            Map<Integer, CarTours> carttours = (Map<Integer, CarTours>) session.getAttribute("carttours");
            if (carttours == null) {
                carttours = new LinkedHashMap<>();
            }

            if (carttours.containsKey(toursId)) {//sản phẩm đã có trên giỏ hàng
                int oldQuantity = carttours.get(toursId).getQuantity();
                carttours.get(toursId).setQuantity(oldQuantity + 1);
            } else {//sản phẩm chưa có trên giỏ hàng
                Tours tours = new ToursDAO().getToursByID(toursId);
                carttours.put(toursId, CarTours.builder().tours(tours).quantity(1).build());
            }
            //lưu carts lên session
            session.setAttribute("carttours", carttours);
           
            String urlHistory = (String) session.getAttribute("urlHistory");
            if (urlHistory == null) {
                urlHistory = "tours";
            }
            response.sendRedirect(urlHistory);
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
