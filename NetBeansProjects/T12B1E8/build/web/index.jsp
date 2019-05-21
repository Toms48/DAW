<%-- 
    Document   : index
    Created on : 20-may-2019, 16:20:26
    Author     : Familia
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
            <h1>Tablas de multiplicar</h1>
            
            <br/>
            
            <form action="tablaMultiplicar.jsp" method="POST">
                <input type="text" name="numero" size="5" />
                <br/>
                <br/>
                <input type="submit" value="Mostrar tabla" />
            </form>
        </center>
    </body>
</html>
