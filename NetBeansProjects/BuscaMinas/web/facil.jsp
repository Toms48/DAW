<%-- 
    Document   : facil
    Created on : 22-may-2019, 13:35:13
    Author     : t-m-1
--%>

<%@page import="Gestora.GestoraBuscaMinas"%>
<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Clases.Casilla"%>
<%@page import="Excepciones.ExcepcionCasilla"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <table border="1">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

            <%
                
                 GestoraBuscaMinas gestora = new GestoraBuscaMinas();
                
                gestora.NivelFacil();
            %>
        </center>
    </body>
</html>
