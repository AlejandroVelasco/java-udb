<%-- 
    Document   : formulario
    Created on : 05-29-2021, 11:53:53 AM
    Author     : aleev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../resources/css/main.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1>Ingrese los datos solicitados</h1>
            <form action="respuesta.jsp" method="post">
                <table>
                    <tr>
                        <td>Nombres</td>
                        <td> <input type='text' name='nombres'/></td>
                    </tr>
                    <tr>
                        <td>Apellido</td>
                        <td> <input type='text' name="apellidos"/></td>
                    </tr>
                    <tr>
                        <td>Direccion</td>
                        <td> <input type='text' name="direccion"/></td>
                    </tr>
                    <tr>
                        <td>Genero</td>
                        <td> 
                            <input 
                                type='radio' 
                                name="genero" 
                                value="Masculino">
                                Masculino
                            </input>
                            <input 
                                type='radio' 
                                name="genero" 
                                value="Femenino">
                                Femenino
                            </input>
                        </td>
                    </tr>
                    <tr>
                        <td>Pais</td>
                        <td>
                            <select name="pais">
                                <option value="El Salvador">El Salvador</option>
                                <option value="Costa Rica">Costa Rica</option>
                                <option value="Panama">Panama</option>
                                
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="Aceptar">
                        </td>
                    </tr>
                </table>
            </form>
        </center>
    </body>
</html>
