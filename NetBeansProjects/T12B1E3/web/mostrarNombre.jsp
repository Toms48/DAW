<%-- 
    Document   : mostrarNombre
    Created on : 17-may-2019, 9:48:38
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
            <%
            String nombre = request.getParameter("nombre");
            out.println("Hola " +nombre);
            %>
        </center>
    </body>
</html>
