<%-- 
    Document   : index
    Created on : 29 may. 2021, 14:28:43
    Author     : aleev
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
        <div>
            <img src="${pageContext.request.contextPath}/resources/images/fondo.jpg" alt="fondo"/>
        </div>
    </body>

</html>
