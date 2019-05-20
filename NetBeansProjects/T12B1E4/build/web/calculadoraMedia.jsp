<%-- 
    Document   : calculadoraMedia
    Created on : 17-may-2019, 10:02:16
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
            <h1><b>MEDIA DE TRES NOTAS</b></h1>
            <%
            Double nota1 = Double.parseDouble(request.getParameter("nota1"));
            Double nota2 = Double.parseDouble(request.getParameter("nota2"));
            Double nota3 = Double.parseDouble(request.getParameter("nota3"));
            Double media = 0.0;
            
            media = (nota1+nota2+nota3)/3;
            
            out.println("La media es: " +media);
            %>
        </center>
    </body>
</html>
