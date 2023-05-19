<%-- 
    Document   : lista
    Created on : 29 may. 2021, 15:22:26
    Author     : aleev
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Libros</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/table.css"/>
         <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap5.min.css"/> 
    </head>
    <body>  
        <%@include file="/menu.jsp"%>
        <div class="container">
            <form>
                <h2 class="my-3">Catalogo de Libros</h2>
                <table id="categorias" class="table table-striped table-condensed">
                    <thead>
                        <tr>
                            <th>ISBN</th>
                            <th>TITULO</th>
                            <th>AUTOR</th>
                            <th>DESCRIPCION</th>
                            <th>FECHA PUBLICACION</th>
                            <th>FECHA REGISTRO</th>
                            <th>ACCIONES</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>El principito</td>
                            <td>Antoine de Saint-Exupery</td>
                            <td>Libro del principito</td>
                            <td>29/05/2021</td>
                            <td>29/05/20211 16:15</td>
                             <td>
                                <div class="d-flex justify-content-end">
                                    <a class="btn btn-secondary btn-sm m-1">MODIFICAR</a>
                                    <a class="btn btn-danger btn-sm m-1">BORRAR</a>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Java como programar</td>
                            <td>DEITEL</td>
                            <td>Libro de programacion</td>
                            <td>29/05/2021</td>
                            <td>29/05/20211 16:15</td>
                             <td>
                                <div class="d-flex justify-content-end">
                                    <a class="btn btn-secondary btn-sm m-1">MODIFICAR</a>
                                    <a class="btn btn-danger btn-sm m-1">BORRAR</a>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>El capital</td>
                            <td>Karl Marx</td>
                            <td>Das Kapital</td>
                            <td>29/05/2021</td>
                            <td>29/05/20211 16:15</td>
                             <td>
                                <div class="d-flex justify-content-end">
                                    <a class="btn btn-secondary btn-sm m-1">MODIFICAR</a>
                                    <a class="btn btn-danger btn-sm m-1">BORRAR</a>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td>4</td>
                            <td>Philosophiæ naturalis principia mathematica</td>
                            <td>Sir Isaac Newton</td>
                            <td>Libro de ciencias</td>
                            <td>29/05/2021</td>
                            <td>29/05/20211 16:15</td>
                             <td>
                                <div class="d-flex justify-content-end">
                                    <a class="btn btn-secondary btn-sm m-1">MODIFICAR</a>
                                    <a class="btn btn-danger btn-sm m-1">BORRAR</a>
                                </div>
                            </td>
                        </tr>
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
