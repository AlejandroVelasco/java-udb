<%-- 
    Document   : formulario
    Created on : 05-29-2021, 10:50:07 AM
    Author     : aleev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="../resources/css/main.css"/>
        <title>Encuesta</title>
    </head>
    <body>
        <h1>Formulario para recoger datos de encuesta</h1>
        <p>Indica cual de los siguientes temas te gusta más</p>
        
        <form name='preguntas' action='respuesta.jsp' method="post">
            <table>
                <tr>
                    <td>Participante</td>
                    <td> <input type='text' name='participante'/></td>
                </tr>
                <tr>
                    <td>Programacion Orientada a Objetos</td>
                    <td> <input type='checkbox' name="opc" value='poo'/></td>
                </tr>
                                <tr>
                    <td>Frameworks en Java</td>
                    <td> <input type='checkbox' name="opc" value='framework'/></td>
                </tr>
                <tr>
                    <td>Web Services</td>
                    <td> <input type='checkbox' name="opc" value='ws'/></td>
                </tr>
                <tr>
                    <td> <input type='submit' value='Aceptar' name='ws'/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
