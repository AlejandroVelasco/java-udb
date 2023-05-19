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
        <title>Respuesta</title>
    </head>
    <body>
        <h1>Datos recibidos</h1>
        <%= request.getParameter("nombre")%>
        <%= request.getParameter("apellidos")%> <br/>
        <%= request.getParameter("email")%> <br/>
        <%= request.getParameter("genero")%> <br/><br/>
        
        <h3>Conocimientos</h3> 
        <ul>
           <%
               String[] opc = request.getParameterValues("opc");
               if(opc != null){
                   for (int i = 0; i< opc.length; i++){
           %>
           <li>
               <%= opc[i]%>
           </li>
           <%
                   }
               }
           %>
       </ul>
       
       
        <br/><br/>
        <h3>Idiomas</h3>   
        <ul>
           <%
               String[] idiomas = request.getParameterValues("idioma");
               if(idiomas != null){
                   for (int i = 0; i< idiomas.length; i++){
           %>
           <li>
               <%= idiomas[i]%>
           </li>
           <%
                   }
               }
           %>
       </ul>
       
       
        <br/><br/>
        
        <h3>Comentarios adicionales</h3>
        <%= request.getParameter("comentario")%> 
        
    </body>
</html>