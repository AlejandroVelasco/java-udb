<%-- 
    Document   : lista
    Created on : 29-may-2021, 14:50:05
    Author     : Salvador Peña Menjívar
--%>
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
                <form method="post" action="${pageContext.request.contextPath}/CategoriaControl">
                    <h2 style="margin-top: 80px">Agregar nueva categoría</h2>
                    <table style="width: 50%;" class="table table-hover table-striped table-condensed table-bordered">
                        <tr>
                            <td>
                                Nombre de la categoría:
                            </td>
                            <td>
                                <input type="text" name="nombreCategoria" value="" placeholder="Escriba la categoria"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" style="text-align: center">
                                <a href="${pageContext.request.contextPath}/Catalogos/Categorias/lista.jsp">Regresar a categorías</a>
                            </td>
                        </tr>
                    </table>
                    <button class="btn btn-secondary" type="submit">
                        Guardar Categoría
                    </button> 
                    <br/>
                    <%= (request.getAttribute("mensaje") != null) ? request.getAttribute("mensaje") : " "%>
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
