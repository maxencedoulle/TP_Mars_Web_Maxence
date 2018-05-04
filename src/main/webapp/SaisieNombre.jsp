<%-- 
    Document   : SaisieNombre
    Created on : 5 avr. 2018, 10:07:15
    Author     : Formation
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <title> TP Mars du POO Mars </title>
    </head>
    <body>
        <h1> Nombre de Saisie de Chiffres </h1>
        
        <form action="Traitement01" method="post">
            <label> Saisie le nombre : </label> 
            <input type="text" name="NbValeur" required /> <br> <!-- Il est préférable de mettre le "/" à la fin des inputs vis vis à des normes HTML 4 et HTML 5 -->
            <input type="submit" value="Valider" /> <!-- required : le champ "input" est obligatoire --> 
        </form>
        
        <a class="lien" href="index.jsp"> Liens vers l'écran d'acceuil </a>
        
    </body>
</html>
