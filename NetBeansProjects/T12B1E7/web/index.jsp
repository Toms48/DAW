<%-- 
    Document   : index
    Created on : 20-may-2019, 13:14:53
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
            <img src="pesetas-euros.jpg" width="423" height="226" alt="Imagen"/>
            <h1>CONVERSOR Pst-Eu</h1>
            <form action="conversorMoneda.jsp" method="POST">
                <select name="opcion">
                    <option>Pesetas - Euros</option>
                    <option>Euros - Pesetas</option>
                </select>
                <p><input type="text" name="dinero"/></p>
                <p><input type="submit" value="CONVERTIR"/></p>
            </form>
        </center>
    </body>
</html>
