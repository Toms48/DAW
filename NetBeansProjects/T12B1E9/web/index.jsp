<%-- 
    Document   : index
    Created on : 20-may-2019, 16:41:34
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <center>
                <img src="icono_pato.png" width="32" height="32" alt="icono_pato"/>
                 <h1>Piramineitor</h1>
            
            <br/>
            
            <form action="piramide.jsp" method="POST">
                <input type="text" name="altura" size="5" />
                <br/>
                <br/>
                <input type="submit" value="Mostrar pat... digo, pirámide" />
            </form>
        </center>
    </body>
</html>
