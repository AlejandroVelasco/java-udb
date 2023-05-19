<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    </head>
    <body>
        <div class="container">
            <h1 class="my-3">Solicitud</h1>
            <p>Despues de introducir tus datos oprime el boton enviar</p>
            <form class="mt-2" action="respuesta.jsp">
                <div class="mb-3">
                  <label for="nombre" class="form-label">Nombre</label>
                  <input type="text" class="form-control" id="nombre" name="nombre">
                </div>
                
                <div class="mb-3">
                  <label for="apellidos" class="form-label">Apellidos</label>
                  <input type="text" class="form-control" id="apellidos" name="apellidos">
                </div>
                
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp">
                </div>
                
                
                <label for="genero" class="form-label">Selecciona Genero:</label>
                <br/>
                <div class="form-check form-check-inline">
                  <input class="form-check-input " name="genero" type="radio" name="inlineRadioOptions" id="inlineRadio1" value="Masculino">
                  <label class="form-check-label" for="inlineRadio1">Masculino</label>
                </div>
                <div class="form-check form-check-inline">
                  <input class="form-check-input" name="genero" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="Femenino">
                  <label class="form-check-label" for="inlineRadio2">Femenino</label>
                </div>   
                
                <br/>
                <br/>
                
                <label for="genero" class="form-label">Selecciona lo que sabes</label>
                <br/>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="checkbox" id="inlineCheckbox1" value="1">
                    <label class="form-check-label" name="opc" value="Java" for="inlineCheckbox1">Java</label>
                 </div>
                <div class="form-check form-check-inline">
                  <input class="form-check-input" type="checkbox" id="inlineCheckbox2" value="2">
                  <label class="form-check-label" name="opc" value="C/C++" for="inlineCheckbox2">C/C++</label>
                </div>
                <div class="form-check form-check-inline">
                  <input class="form-check-input" type="checkbox" id="inlineCheckbox3" value="3">
                  <label class="form-check-label" name="opc" value="Basic" for="inlineCheckbox3">Basic</label>
                </div>
                <div class="form-check form-check-inline">
                  <input class="form-check-input" type="checkbox" id="inlineCheckbox4" value="4">
                  <label class="form-check-label" name="opc" value="HTML" for="inlineCheckbox4">HTML</label>
                </div>
                
                 <div class="mt-4 row justify-content-between">
                    <div class=" col-6">
                        <label>Selecciona los idiomas que manejas</label>
                        <select class="form-select col-4" name="idioma" multiple size="3">
                            <option value="Español">Español</option>
                            <option value="Ingles">Ingles</option>
                            <option value="Frances">Frances</option>
                            <option value="Aleman">Aleman</option>
                        </select>
                    </div>
                    <div class=" col-6">
                        <label>Comentarios adicionales</label>
                        <textarea class="form-control" rows="3" name="comentario"></textarea>
                    </div>
                  </div>

                 <br/>
                 <br/>
                <input type="submit" class="btn btn-primary"></input>
              </form>
        </div>
    </body>
</html>
