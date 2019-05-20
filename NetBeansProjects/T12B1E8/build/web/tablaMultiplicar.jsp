<%-- 
    Document   : tablaMultiplicar
    Created on : 20-may-2019, 16:26:09
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
            
            <table border="2" cellpadding="8">
                <tbody>
                    <%
                        int numero = Integer.parseInt(request.getParameter("numero"));
                        
                        for(int i=1; i<=10; i++){
                            out.print("<tr><td>" +i +" x " +numero +" = " +i*numero +"</td></tr>");
                        }
                    %>
                </tbody>
            </table>

        </center>
    </body>
</html>
