/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moyenne;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Formation
 */
public class ServletTraitement02 extends HttpServlet {

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
            // Traitement des zones de saisie 
            int inbvaleur = 1;
            HttpSession sess = request.getSession();
            List<Double> ListeDesValeurs = new ArrayList<Double>();
            if (sess.getAttribute("NbValeur") != null);
            {
                inbvaleur = (int) sess.getAttribute("NbValeur");
            }

            for (int i = 1; i < inbvaleur; i++) {
                if (request.getParameter("sval" + i) != null);
                {
                    ListeDesValeurs.add(new Double(request.getParameter("sval" + i)));
                }
            }
            // Calculer la SOMME dans la variable Double somme ( NbValeur + NbSaisie)
            Double somme=0.0;
            
            for (Double dval:ListeDesValeurs) {
                somme += dval;
            }
            
            // Calculer la MOYENNE dans la variable Double moyenne
            double moyenne = 0;
            
            moyenne = somme / inbvaleur;
            
           
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletTraitement02</title>");
            out.println("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("<h1> La somme et moyenne de vos nombre saisie </h1>");
            out.println("<h2> Votre somme est de : " + somme + "</h2>"); // Affiche les variables en HTML
            out.println(" <h2> Votre moyenne est de : " + moyenne + "</h2>"); // Affiche les variables en HTML
            out.println(" <a class=\"lien\" href=\"index.jsp\"> Liens vers l'écran d'acceuil </a>");
            
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
