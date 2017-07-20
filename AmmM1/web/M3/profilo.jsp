<%-- 
    Document   : profilo
    Created on : 19-lug-2017, 16.49.12
    Author     : Andrea
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Nerdbook-Login</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Andrea Catania">
        <meta name="keywords" content="Social Network">
    </head>
    
    
    <body>
        <c:set var="title" value="Bacheca personale" scope="request"/>
        <jsp:include page="header.jsp"/>
    
    
        <form action="servlet.java" method="get">
            <label>Nome Utente</label>
            <input type="text" name="Nome" id="nome"/>
            <br/>
            <label>Cognome Utente</label>
            <input type="text" name="Cognome" id="cognome"/>
            <br/>
        
            <label for="data">Data</label>
            <input name="data" id="data" type="date"/>
            <br/>
            <label>URL img</label>
            <input type="text" name="Img" id="img"/>
            <br/>
            <label>Presentazione</label>
            <br/>
            <textarea rows="4" cols="20" name="Presentazione" id="presentazione"></textarea>
        
            <br/>
            <label for="pswd">Password</label>
            <input type="password" name="pswd" id="pswd"/>
            <br/>
            <label for="pswd">Conferma Password</label>
            <input type="password" name="ConfPswd" id="ConfPswd"/>
            <br/>
            <input type="submit" value="Invio" />
            <input type="reset" value="Reset" />
        </form>
        
        <c:set var="page" value="profilo" scope="request"/>
        <jsp:include page="nav.jsp"/>
    
        
    </body>
</html>