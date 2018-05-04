/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sapins;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Formation
 */
public class Servlet_Sapins extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            out.println(" <h1> Nombre de Saisie de Chiffres </h1> ");
            
            int hauteur = 0;
            int Type = 0;

            if (request.getParameter("hauteur_sapins") != null) {
                hauteur = Integer.parseInt(request.getParameter("hauteur_sapins"));
            }
            if (request.getParameter("type_sapins") != null) {
                Type = Integer.parseInt(request.getParameter("type_sapins"));
            }

            if (Type == 1) {

                for (int i = 1; i <= hauteur + 1; i++) { // Les niveaux 
                    out.println("<br/>");
                    for (int j = 0; j < 2 * i - 1; j++) {
                        out.print("*");
                    }
                }
            }
            if (Type == 2) {

                for (int i = 1; i < hauteur + 1; i++) { // Les niveaux 
                    out.println("<br/>");
                    for (int j = 0; j < hauteur - i; j++) {
                        out.print("&ensp;"); // espace entre les mots
                    }
                    for (int j = 0; j < 2 * i - 1; j++) {
                        out.print("*");
                    }
                }
            }
            if (Type == 3) {

                for (int i = 1; i < hauteur + 1; i++) { // Les niveaux 
                    out.println("<br/>");
                    for (int j = 0; j < hauteur - i; j++) {
                        out.print("&ensp;");
                    }
                    if (i !=1) { // Affiche les étoiles 
                        out.print("*");
                    }
                    for (int j = 0; j < 2 * i - 3; j++) { // le "-1" 

                        if (i == hauteur) {
                            out.print("*");
                        } else {
                            out.print("&ensp;");
                        }
                    }
                    out.print("*");
                }
            }

            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<a class=\"lien\" href=\"index.jsp\"> Liens vers l'écran d'acceuil </a>");
            out.println("</body>");
            out.println("</html>");
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
