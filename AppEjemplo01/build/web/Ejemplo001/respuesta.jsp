<%-- 
    Document   : respuesta
    Created on : 05-29-2021, 11:22:42 AM
    Author     : aleev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../resources/css/main.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Gracias por responder!</h1>
        <p>
            <%= request.getParameter("participante")%>
        </p>
        
        <ul>
            <%
                String[] temasSeleccionados = request.getParameterValues("opc");
                if(temasSeleccionados != null){
                    for (int i = 0; i< temasSeleccionados.length; i++){
            %>
            <li>
                <%= temasSeleccionados[i]%>
            </li>
            <%
                    }
                }
            %>
        </ul>
    </body>
</html>
