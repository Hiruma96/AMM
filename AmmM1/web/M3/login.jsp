<%-- 
    Document   : login
    Created on : 19-lug-2017, 16.51.50
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
        
        <c:set var="page" value="login" scope="request"/>
        <jsp:include page="nav.jsp"/>
        
       
    
    
        <form action="servlet.java" method="get">
            <label for="corto" id="user">Username</label>
            <input type="text" name="Username" id="corto"/>
            <label for="pswd" id="psw">Password</label>
            <input type="password" name="pswd" id="pswd"/>
            <input type="submit" value="Invio" id="invia" />
            <input type="reset" value="Reset" id="reset" />
        </form>
    
        
    </body>
</html>
