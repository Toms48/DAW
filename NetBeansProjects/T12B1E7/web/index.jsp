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
            <h1>CONVERSOR Pst-Eu</h1>
            <form action="conversorMoneda.jsp" method="POST">
                
                <select name="opcion">
                    <option>Pesetas - Euros</option>
                    <option>Euros - Pesetas</option>
                </select>
                <input type="submit" value="CONVERTIR" name="convertir" />
            </form>
        </center>
    </body>
</html>
