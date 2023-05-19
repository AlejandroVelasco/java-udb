<%-- 
    Document   : lista
    Created on : 29 may. 2021, 15:22:26
    Author     : aleev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="sv.edu.udb.entidades.Categoria" %>
<%@ page import="sv.edu.udb.modelo.CategoriaDao" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de categorias</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/table.css"/>
    </head>
    <body>  
        <%@include file="/menu.jsp"%>
        <div class="container">
            
            <h2 class="my-3">Catalogo de categorias</h2>
            <a class="btn btn-success btn-sm m-1" href="${pageContext.request.contextPath}/Catalogos/Categorias/agregar.jsp">Agregar</a>
            <form>
                <table id="categorias" class="table table-striped table-condensed">
                    <thead>
                        <tr>
                            <th>CODIGO</th>
                            <th>NOMBRE</th>
                            <th>ACCIONES</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            List<Categoria> lstCategorias = CategoriaDao.listarCategorias();
                            for(Categoria cat: lstCategorias){

                        %>

                        <tr>
                            <td><%= cat.getCodCategoria() %></td>
                            <td><%= cat.getNombre() %></td>
                          <td>
                                <div class="d-flex justify-content-end">
                                    <a
                                        href="${pageContext.request.contextPath}/CategoriaControl?accion=verModificar&codCategoria=<%= cat.getCodCategoria()%> "
                                        class="btn btn-secondary btn-sm m-1">MODIFICAR</a>
                                    <a 
                                        href="${pageContext.request.contextPath}/CategoriaControl?accion=borrar&codCategoria=<%= cat.getCodCategoria()%> "
                                        class="btn btn-danger btn-sm m-1">BORRAR</a>
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
