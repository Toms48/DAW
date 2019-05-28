<%-- 
    Document   : 5Cartas
    Created on : 22-may-2019, 16:16:13
    Author     : Familia
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.BufferedWriter"%>
<%@page import="Clases.Carta"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Baraja"%>
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
            <h1><img src="imagenes/logoCartas.png" height="142px" width="auto"/></h1>
            <hr/>
            <hr/>

            <br/>
            
            <%
                ArrayList<Carta> manoJugador = new ArrayList();
                ArrayList<Carta> manoRival = new ArrayList();
                
                String nJ1 = request.getParameter("nJ1");
                String nJ2 = request.getParameter("nJ2");
                
                Baraja baraja = new Baraja();
                baraja.barajar();
                
                for(int i=0; i<=4; i++){
                    manoJugador.add(baraja.getCartaDeArriba());
                    manoRival.add(baraja.getCartaDeArriba());
                }
                
                out.print("<div id=\"tapete\">");
                for(Carta dato : manoJugador){
                    out.println(dato.toString());
                }
                out.print("<div id=\"marcador\"><b>" +nJ1 +"</b></div>");
                out.print("</div>");
                
                out.print("<br/><br/><br/>");
                
                out.print("<div id=\"tapete\">");
                for(Carta dato : manoRival){
                    out.println(dato.toString());
                }
                out.print("<div id=\"marcador\"><b>" +nJ2 +"</b></div>");
                out.print("</div>");
                
                out.print("<br/><br/><br/>");%>
                <p><div id="marcador"><b> <%=nJ1%> </b></div>
                <div id="marcador"><b> <%=nJ2%> </b></div></p>
    
                <form action="tresNuevasCartas.jsp" method="POST">
                    <select  name = "cambiaCartaJ1">
                            <option value=0> 0 </option>
                            <option value=1> 1 </option>
                            <option value=2> 2 </option>
                            <option value=3> 3 </option>
                            <option value=4> 4 </option>
                            <option value=5> 5 </option>
                    </select>
                    
                    <select  name = "cambiaCartaJ2">
                            <option value=0> 0 </option>
                            <option value=1> 1 </option>
                            <option value=2> 2 </option>
                            <option value=3> 3 </option>
                            <option value=4> 4 </option>
                            <option value=5> 5 </option>
                    </select>
                    <input type="hidden" name="nJ1" value=<%=nJ1%>>
                    <input type="hidden" name="nJ2" value=<%=nJ2%>>
                    
                <p><input type="submit" value="Cambiar" /></p>
                </form>
                
                <%out.print("<br/><br/><br/>");
            %>
        </center>
    </body>
</html>
