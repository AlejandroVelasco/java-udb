<%-- 
    Document   : agregar
    Created on : 5 jun. 2021, 14:53:04
    Author     : aleev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar categoria</title>
        
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    </head>
    <body>
        
        <%@include file="/menu.jsp"%>
        <div class="container">
            <form method="post" action="${pageContext.request.contextPath}/CategoriaControl">
                <div class="mb-3">
                  <label for="nombreCategoria" class="form-label">Nombre</label>
                  <input type="text" class="form-control" name="nombreCategoria">
                </div>
                
                <button type="submit" class="btn btn-primary">Submit</button>
                
                <br/>
                <h3>  <%=(request.getAttribute("mensaje") != null) ? request.getAttribute("mensaje") : ""%></h3>
           
            </form>
     
        </div>

    </body>
    
        <script src="https://code.jquery.com/jquery-3.5.1.js"></script> 
        <script src="${pageContext.request.contextPath}/resources/js/datatable.js"></script> 
        <script src="https://cdn.datatables.net/1.10.24/js/dataTables.bootstrap5.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script> 
        <script>           
            $(document).ready(function () {
                   $('#categorias').DataTable();
               });
       </script>
</html>
