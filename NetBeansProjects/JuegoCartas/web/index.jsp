<%-- 
    Document   : index
    Created on : 22-may-2019, 16:09:46
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="cssMieo.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body id="cuerpo">
        <center>
            <hr/>
            <hr/>
            <%--<h1><img src="imagenes/logoCartas.png" height="142px" width="auto"/></h1>--%>
            <h1>CARTAS</h1>
            <hr/>
            <hr/>

            <br/>
            
            <form action="5cartas.jsp" method="POST">
                <p>Nombre J1 <input type="text" name="nJ1" value="Jugador1" /></p>
                <p>Nombre J2 <input type="text" name="nJ2" value="Jugador2" /></p>
                <p><input type="submit" value="¡JUGAR!" /></p>
            </form>
            
            
        </center>
        
    </body>
</html>
