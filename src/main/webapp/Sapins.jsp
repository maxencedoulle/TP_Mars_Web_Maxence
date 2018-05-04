<%-- 
    Document   : Sapins
    Created on : 3 avr. 2018, 16:57:08
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
        <h1> Mon beaux sapins, roi des forêts, ... </h1>
        
        <form action="Servlet_Sapins" method="post">
            <label> Type  de Sapins : </label> 
            <select name="type_sapins" placeholder=" (plein, vide ou couché)" required > 
                <option value="1"> Sapins Couché  </option>
                <option value="2"> Sapins Plein </option>
                <option value="3"> Sapins vide </option>
            </select> 
            
            
            
            
            <br>  <br>
            <label> Hauteur du Sapins : </label>
            <input type="text" name="hauteur_sapins" placeholder="Quel heuteur de sapins " required /> <br> <br>  
            <input class="input_OK" type="submit" value=" OK " />
        </form>
        
         <a class="lien" href="index.jsp"> Liens vers l'écran d'acceuil </a>
        
    </body>
</html>
