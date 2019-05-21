<%-- index.jsp (proyecto GatosConClase) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="daw1.Gato"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="estiloGatosConClase.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gatos con clase</title>
    </head>
    <body id="cuerpo">
        <h1 id="titulo">Gatos con clase</h1>
        <hr>
        <%
            Gato g1 = new Gato("Pepe", "gato.gif");
            Gato g2 = new Gato("Garfield", "garfield.jpg");
            Gato g3 = new Gato("Tom", "tom.jpg");
            out.println(g1);
            out.println(g2);
            out.println(g3);
            out.println(g1.maulla());
            out.println(g2.come("sardinas"));
        %>
    </body>
</html>
