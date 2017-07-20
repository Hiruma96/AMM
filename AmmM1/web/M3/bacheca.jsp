<%-- 
    Document   : bacheca
    Created on : 19-lug-2017, 16.51.29
    Author     : Andrea
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Nerdbook-Bacheca</title>
        <link rel="stylesheet" type="text/css" href="style.css" media="screen">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="author" content="Andrea Catania">
        <meta name="keywords" content="Social Network">
    </head>
    <body>
        <c:set var="title" value="Bacheca personale" scope="request"/>
        <jsp:include page="header.jsp"/>
        
        
        <c:set var="page" value="bacehca" scope="request"/>
        <jsp:include page="nav.jsp"/>
    
       
    
        <br/>
        
        <div id="lato">
            <div id="Persone">
                <h3>Persone</h3>
                <ul>
                    <li>Saitama</li>
                    <li>Beerus</li>
                    <li>Megan Fox</li>
                </ul>
            </div>
            
            <div id="Gruppi">
                <h3>Gruppi</h3>
                <ul>
                    <li>Persone</li>
                    <li>Personaggi</li>
                </ul>
            </div>
        </div>
        
        <div id="post">    
            <div id="Post1">
                <img class="img" title="profilo" alt="Foto di Saitama" src="img/Saitama.png">
                <div class="name"> Saitama:</div>
                <br/>
                <div class="txt">Ok</div>
            </div>
        
            <br/>
       
            <div id="Post2">
                <img class="img" title="profilo" alt="Foto di Beerus" src="img/Beerus.jpg">
                <div class="name">Beerus:</div>
                <br/>
            
                <div class="txt">GIURO CHE E' FORTE!!!!
                
                </div>
                <img id="imgpost" title="post" alt="Foto di Monaca" src="img/monaca.png">
            </div>
       
            <br/>
       
            <div id="Post3">
                <img class="img" title="profilo" alt="Foto di Megan Fox" src="img/MeganFox.jpg">
                <div class="name">Megan (solo gnocca) Fox:</div>
                <br/>
               
                <nav>
                    <a id="link" href="megan.html" target='_blank'>[SCHERZO FINITO MALE]</a>
                </nav>
                
            </div>
        </div>
    </body> 
</html>
