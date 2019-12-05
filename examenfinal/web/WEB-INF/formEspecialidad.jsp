<%-- 
    Document   : formEspecialidad
    Created on : 05/12/2019, 09:02:02 AM
    Author     : lab01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro Especialidad</h1>
        <form method="post" action="grabarEspecialidad">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombre"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Registrar"></td>
                </tr>
            </table>
            
        </form>
    </body>
</html>
