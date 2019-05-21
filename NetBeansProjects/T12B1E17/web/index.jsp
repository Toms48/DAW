<%-- 
    Document   : index
    Created on : 21-may-2019, 19:03:34
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
            <hr/>
            <img src="logoTesla.png" style="width:300px; height:auto;">
            <hr/>
            
            <br/>
        </center>
    
        <form action="teslaMieo.jsp" method="POST">
            <p><b>TAPICERÍA</b></p>
            <p><input type="radio" name="tapiceria" value="1" /> Color Negro</p>
            <p><input type="radio" name="tapiceria" value="2" /> Color Blanco</p>
            <p><input type="radio" name="tapiceria" value="3" /> Color Berengena</p>

            <br/>

            <p><b>ADORNOS</b></p>
            <p><input type="radio" name="adorno" value="1" /> Carbono</p>
            <p><input type="radio" name="adorno" value="2" /> Madera</p>

            <br/>

            <input type="submit" value="Dame mi pedazo de coche ya." />
        </form>
    </body>
</html>
