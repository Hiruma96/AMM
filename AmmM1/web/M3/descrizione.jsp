<%-- 
    Document   : descrizione
    Created on : 19-lug-2017, 16.49.25
    Author     : Andrea
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Nerdbook-Descrizione</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Andrea Catania">
        <meta name="keywords" content="Social Network">
    </head>
    
    
    
    
    
    <body>
        
        <c:set var="page" value="descrizione" scope="request"/>
        <jsp:include page="nav.jsp"/>
        
        
        <c:set var="title" value="Bacheca personale" scope="request"/>
        <jsp:include page="header.jsp"/>
        
        <nav>
            <ol>
                <li><a href="#infoGen">Info Generali</a></li>
                <li><a href="#ModIscr">Modalità Iscrizione</a>
                    <ol>
                        <li><a href="#DoppiAcc">Doppi account</a></li>
                        <li><a href="#Falzi">Account falzissimi</a></li>
                    </ol>
                </li>
            </ol>
        </nav>
        

        <div id="divBody">
            <div id="infoGenerali">
                <a id="infoGen">
                <h1>Informazioni Generali</h1>
                </a>
                    <p>Questo social è del tutto gratuito,<br>
                    è rivolto a chiunque non piacia farsi gli affari propri.</p>
            </div>
            
            
            <div id="modIscrizione">
                <a id="ModIscr">
                <h2>Modalità di Iscrizione</h2>
                </a>
                    <p>Ci si iscrive come fai sempre per qualsiasi sito, easy no?</p>
                <a id="DoppiAcc">
                <h3>Doppi account</h3>
                </a>
                <p>Non si possono avere doppi account, pena: ridare il progetto di pr1.</p>
                <a id="Falzi">
                <h3>Account falzissimi</h3>
                </a>
                <p>Come sopra.</p>
            </div>
        </div>
    </body>
</html>
