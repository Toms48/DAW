<%-- 
    Document   : index
    Created on : 17-may-2019, 9:57:01
    Author     : t-m-1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <br>
            <h1><b>MEDIA DE TRES NOTAS</b></h1>
            <form action="calculadoraMedia.jsp" method="POST">
                <input type="text" name="nota1"/>
                <input type="text" name="nota2"/>
                <input type="text" name="nota3"/>
                <input type="submit" value="Enviar" name="boton" />
            </form>
        </center>
    </body>
</html>
