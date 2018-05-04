<%-- 
    Document   : Deviner_Un_Nombre
    Created on : 3 avr. 2018, 16:58:51
    Author     : Formation
--%>

<%@page import="java.util.Random"%>
<%@page import="java.util.Scanner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1> Deviner un nombre  </h1>
        
        <form action="" method="post">
            <label> Saisir du chiffre :</label>
            <input type="text" placeholder=" Nombre entre 1 et 100"> 
        </form>
        
        <%
            int nbsasie = 0;
            if (session.getAttribute("NbValeur") !=null) {
                nbsasie = (int) session.getAttribute("NbValeur"); // (int) permet de Caster la valeur 
            }
            %>
        
       
        
         <a class="lien" href="index.jsp"> Liens vers l'écran d'acceuil </a>
    </body>
</html>
