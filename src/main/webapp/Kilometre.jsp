<%-- 
    Document   : Kilometre
    Created on : 3 avr. 2018, 14:52:33
    Author     : Formation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <title> TP Mars du POO Mars </title>
    </head>
    <body>
        <h1> Chansonnette du kilomètre à pied  </h1>
        
        
        <%
            for (int j = 1; j <= 15; j++) {
                if (j == 1) {
                    out.println("1 kilomètre à pied, ça use, ça use, " + "\n" + " 1 kilomètre à pied ça use les souliers.  ");%>
                    <br> <br>
        <%
                }

                else  { // Pour ajouter le "S" aux killométre jusuq'a 15
out.println( j + " kilomètres à pied, ça use, ça use, " + "\n" + j +"  kilomètres à pied ça use les souliers. "); %> <br> <br> <%
                }
            }
            %>
            <br>
            <br>
            <a class="lien" href="index.jsp"> Liens vers l'écran d'acceuil </a>
    </body>
</html>
