<%-- 
    Document   : respuesta
    Created on : 05-29-2021, 01:10:15 PM
    Author     : aleev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="../resources/css/main.css"/>
    </head>
    <body>
        <h1>Datos recibidos</h1>
        <%= request.getParameter("nombres")%>
        <%= request.getParameter("apellidos")%> <br/>
        <%= request.getParameter("direccion")%> <br/>
        <%= request.getParameter("genero")%> <br/>
        <%= request.getParameter("pais")%> <br/>
    </body>
</html>
