<%-- 
    Document   : lista
    Created on : 29 may. 2021, 15:22:26
    Author     : aleev
--%>
<%@page import="sv.edu.udb.modelo.EditorialDao"%>
<%@page import="sv.edu.udb.entidades.Editorial"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de categorias</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/table.css"/>
         <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap5.min.css"/> 
    </head>
    <body>  
        <%@include file="/menu.jsp"%>
        <div class="container">
            <form>
                <h2 class="my-3">Catalogo de Editoriales</h2>
                <table id="categorias" class="table table-striped table-condensed">
                    <thead>
                        <tr>
                            <th>CODIGO</th>
                            <th>NOMBRE</th>
                            <th>TELEFONO</th>
                            <th>DIRECCION</th>
                            <th>EMAIL</th>
                            <th>URL</th>
                            <th>ACCIONES</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            List<Editorial> lstEditorial = EditorialDao.listarEditoriales();
                            for(Editorial editorial : lstEditorial){

                        %>
                        <tr>
                            <td><%= editorial.getCodEditorial() %></td>
                            <td><%= editorial.getNombre() %></td>
                            <td><%= editorial.getTelefono() %></td>
                            <td><%= editorial.getEmail() %></td>
                            <td></td>
                            <td><%= editorial.getUrl() %></td>
                             <td>
                                <div class="d-flex justify-content-end">
                                    <a class="btn btn-secondary btn-sm m-1">MODIFICAR</a>
                                    <a class="btn btn-danger btn-sm m-1">BORRAR</a>
                                </div>
                            </td>
                        </tr>
                        <%
                          }
                        %>
                    
                    </tbody>
                </table>
            </form>
        </div>
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script> 
        <script src="${pageContext.request.contextPath}/resources/js/datatable.js"></script> 
        <script src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap5.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script> 
        <script>           
            $(document).ready(function () {
                   $('#categorias').DataTable();
               });
       </script>
    </body>
</html>
