/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control.sync;

import dao.CateToursDAO;
import dao.ToursDAO;
import entity.CateTour;
import entity.Tours;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ToursControlller", urlPatterns = {"/tours"})
public class ToursControlller extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            final int PAGE_SIZE=6;
        List<CateTour> listCategoriesTours = new CateToursDAO().getAllCategories();
        HttpSession session = request.getSession();
        session.setAttribute("listCategoriesTours", listCategoriesTours);
        
        int page=1;
        String pageStr=request.getParameter("page");
        if(pageStr!=null){
            page = Integer.parseInt(pageStr);
        }
        ToursDAO toursDAO = new ToursDAO();
        List<Tours> listTours = toursDAO.getAllTours();
        
        int totalTours = toursDAO.getTotalTours();
        int totalPage = totalTours / PAGE_SIZE;
        if (totalTours % PAGE_SIZE != 0) {
            totalPage += 1;
        }
        
        request.setAttribute("page", page);
        request.setAttribute("totalPage", totalPage);
        session.setAttribute("UrlHistory", "tours");
        request.setAttribute("listTours", listTours.subList((page-1)*PAGE_SIZE,page*PAGE_SIZE));
        request.getRequestDispatcher("Tours.jsp").forward(request, response);
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
