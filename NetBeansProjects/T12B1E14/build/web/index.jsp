<%-- 
    Document   : index
    Created on : 21-may-2019, 9:57:24
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
            <h1>Fibonacci</h1>
            <hr/>
            
            <form action="fibonacci.jsp" method="POST">
                Introduzca la cantidad de números que quiere ver: <input type="text" name="n"/>
                <input type="submit" value="Enviar" />
            </form>
            
        </center>
    </body>
</html>
