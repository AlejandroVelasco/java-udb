<%-- 
    Document   : agregar
    Created on : 01-26-2019, 02:21:30 PM
    Author     : Salvador Peña Menjívar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    </head>
    <body>
        <%@include file="/menu.jsp"%>
    <center>
        <form action="${pageContext.request.contextPath}/CategoriaControl"
              method="get">
            <h2>Modificar Categoría</h2>
            <table class="table table-hover table-striped table-bordered"
                   style="width: 40%">
                <tr>
                    <td>
                        <label class="control-label">Código de la categoría</label>
                    </td>
                    <td>
                        <input type="text" name="codCategoria" value="${categoria.codCategoria}" 
                               readonly="true"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label class="control-label">Nombre de la categoría</label>
                    </td>
                    <td>
                        <input type="text" name="nombre" value="${categoria.nombre}" 
                               placeholder="Nombre de categoria"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center">
                        <a href="${pageContext.request.contextPath}/Catalogos/Categorias/lista.jsp">Regresar a categorías</a>
                    </td>
                </tr>
                <input type='hidden' name='accion' id='numero' value="modificar" />

                <button class="btn btn-success" type="submit">
                    Guardar Modificación
                </button>

                <%=(request.getAttribute("mensaje") != null) ? request.getAttribute("mensaje") : ""%>

        </form>
    </center>

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
