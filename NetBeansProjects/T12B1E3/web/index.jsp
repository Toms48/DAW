<%-- 
    Document   : index
    Created on : 17-may-2019, 9:36:22
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
            <h1>Introduzca su nombre</h1>
            <form name="lanzador" action="mostrarNombre.jsp" method="POST">
                <input  type="text" name="nombre"/>
                <input type="submit" value="Enviar" name="boton" />
            </form>
        </center> 
    </body>
</html>
