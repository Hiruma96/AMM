/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

import amm.nerdbook.classi.*;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;


/**
 *
 * @author Andrea
 */
public class Profilo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession(false);

        
    List<Gruppi> listaGruppi = GruppiFactory.getInstance().getListaGruppi();

        request.setAttribute("listaGruppi", listaGruppi);

        if (session != null && session.getAttribute("loggedIn") != null && session.getAttribute("loggedIn").equals(true)) {

            String user = request.getParameter("user");

            int userID;

            if (user != null) {
                userID = Integer.parseInt(user);
            } else {
                Integer loggedUserID = (Integer) session.getAttribute("loggedUserID");
                userID = loggedUserID;
            }

            UtentiRegistrati utente = UtentiRegistratiFactory.getInstance().getUserId(userID);

            if (utente != null) {

                if (request.getParameter("aggiorna") != null) {
                    
                                                
                    String nome = request.getParameter("nome");
                    request.setAttribute("nome", nome);

                    String cognome = request.getParameter("cognome");
                    request.setAttribute("cognome", cognome);

                    String img = request.getParameter("img");
                    request.setAttribute("img", img);

                    String data = request.getParameter("data");
                    request.setAttribute("data", data);

                    String email = request.getParameter("email");
                    request.setAttribute("email", email);

                    String password = request.getParameter("password");
                    request.setAttribute("password", password);

                    String frase = request.getParameter("frase");
                    request.setAttribute("frase", frase);
                    
                    request.setAttribute("aggiorna", true);
                    
                } else {
                    request.setAttribute("utente", utente);
                }

                request.getRequestDispatcher("profilo.jsp").forward(request, response);

            } else {

                response.setStatus(HttpServletResponse.SC_NOT_FOUND);

            }

        } else {

            request.setAttribute("nonloggato", true);
            request.getRequestDispatcher("login.jsp").forward(request, response);

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
