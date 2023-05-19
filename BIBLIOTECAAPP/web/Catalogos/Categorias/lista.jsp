<%-- 
    Document   : lista
    Created on : 29-may-2021, 14:50:05
    Author     : Salvador Peña Menjívar
--%>

<%@page import="java.util.List"%>
<%@page import="sv.udb.edu.entidades.Categoria"%>
<%@page import="sv.edu.udb.modelo.CategoriaDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>        
        <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap5.min.css"/>       
    </head>
    <body>
        <%@include file="/menu.jsp"%>
        <div class="container">
            <center>
                <form>
                    <h2>Catálogo de Categorías</h2>
                    <a href="${pageContext.request.contextPath}/Catalogos/Categorias/agregar.jsp" class="btn btn-primary">
                        Crear nueva categoría   
                    </a>
                    <table id="categorias" class="table table-striped  table-bordered table-condensed 
                           table-hover">
                        <thead>
                            <tr>
                                <th>CODIGO</th>
                                <th>NOMBRE</th>
                                <th>BORRAR</th>
                                <th>MODIFICAR</th>                            
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                List<Categoria> lstCategorias = CategoriaDao.listarCategorias();
                                for (Categoria categoria : lstCategorias) {
                            %>
                            <tr>
                                <td><%= categoria.getCodCategoria()%></td>
                                <td><%= categoria.getNombre()%></td>   
                                <td>
                                    <a class="btn btn-secondary"  href="${pageContext.request.contextPath}/CategoriaControl?accion=borrar&codCategoria=<%= categoria.getCodCategoria()%>">BORRAR</a>
                                </td>
                                <td>
                                    <a class="btn btn-secondary" href="${pageContext.request.contextPath}/CategoriaControl?accion=verModificar&codCategoria=<%=categoria.getCodCategoria()%>">MODIFICAR</a>
                                </td>
                            </tr>                           

                            <%
                                }
                            %>
                        </tbody>
                    </table>
                    <br/>
                    <%= (request.getAttribute("mensaje") != null) ? request.getAttribute("mensaje") : " " %>
                </form>
            </center>
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
