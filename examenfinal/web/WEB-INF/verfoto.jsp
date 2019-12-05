<%-- 
    Document   : verfoto
    Created on : 05/12/2019, 09:13:41 AM
    Author     : lab01
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Foto</title>
    </head>
    <body>
        <img src="img/${alumno.foto}" height="400">
        <p>${alumno.nom_alum}</p>
    </body>
</html>
