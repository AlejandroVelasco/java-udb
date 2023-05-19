<%-- 
    Document   : index
    Created on : 29-may-2021, 14:26:19
    Author     : Salvador Peña Menjívar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    </head>
    <body>
        <%@include file="menu.jsp"%>
        <center>
            <img alt="fondo" src="${pageContext.request.contextPath}/resources/images/fondo.jpg"/>
        </center>
    </body>
</html>
