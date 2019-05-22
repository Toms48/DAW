<%-- 
    Document   : index
    Created on : 22-may-2019, 8:28:11
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
            <hr/>
            <h1><b>Apuesta y Gana</b></h1>
            <hr/>
            
            <form action="apuestaGana.jsp" method="POST">
                <input type="text" name="dinero"/>
                <input type="submit" value="Enviar" />
            </form>
            
        </center>
    </body>
</html>
