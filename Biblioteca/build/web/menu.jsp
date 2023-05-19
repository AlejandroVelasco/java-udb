<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">  
        <a class="navbar-brand" href="#">Módulo 4 2021</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDarkDropdown" aria-controls="navbarNavDarkDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDarkDropdown">
            <ul class="nav navbar-nav">      
                <a class="navbar-brand" href="#">Inicio</a>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDarkDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Catálogos
                    </a>
                    <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Catalogos/Categorias/lista.jsp">Categorias</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Catalogos/Libros/lista.jsp">Libros</a></li>
                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Catalogos/Editoriales/lista.jsp">Editorial</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#"  role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Procesos
                    </a>
                    <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                        <li><a class="dropdown-item" href="#">Préstamo de libros</a></li>
                        <li><a class="dropdown-item" href="#">Inactivar libro</a></li>
                        <li><a class="dropdown-item" href="#">Compras</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#"  role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Reportes
                    </a>
                    <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="navbarDarkDropdownMenuLink">
                        <li><a class="dropdown-item" href="#">Libros prestados</a></li>
                        <li><a class="dropdown-item" href="#">Inventario de libros</a></li>
                        <li><a class="dropdown-item" href="#">Clientes</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

