<%-- 
    Document   : nav
    Created on : 19-lug-2017, 17.21.03
    Author     : Andrea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <nav>
            <c:if test="${page=='descrizione'}">class="active"</c:if>><a href="descrizione.html">Descrizione</a>
            <c:if test="${page=='profilo'}">class="active"</c:if>><a href="profilo.html">Profilo</a>
            <c:if test="${page=='bacheca'}">class="active"</c:if>> <a href="bacheca.html">Bacheca</a>
            <c:if test="${page=='login'}">class="active"</c:if>> <a href="login.html">Login</a>
        </nav>
</html>
