<%-- 
    Document   : facil
    Created on : 22-may-2019, 13:35:13
    Author     : t-m-1
--%>

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

            <table border="2" cellpadding="5">
                <thead>
                    <tr>
                        <th></th>
                        <th>1</th>
                        <th>2</th>
                        <th>3</th>
                        <th>4</th>
                        <th>5</th>
                        <th>6</th>
                        <th>7</th>
                        <th>8</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        for(int i=1; i<=8; i++){ //Filas
                            out.print("<tr>");
                            for(int j=1; j<=8; j++){ //Columnas
                                if(j==1){
                                    out.print("<th>" +i +"</th>");
                                }
                                out.println("<th><input type=\"submit\" value=\"\" /></th>");
                            }
                            out.print("</tr>");
                        }
                    %>
                </tbody>
            </table>

            
            <%/*
                public void NivelFacil(){

                    Casilla[][] tableroFacil;
                    int i;
                    int j;

                    tableroFacil = CrearTableroFacil();

                    PintarTableroJugador(tableroFacil);

                    do{

                        PintarTablero(tableroFacil, i-1, j-1, 7);
                    }
                    while((DescubrirCasilla(tableroFacil, i-1, j-1, 7) != -1) && (ContadorNoDescubierto(tableroFacil) != 10));

                    if(DescubrirCasilla(tableroFacil, i-1, j-1, 7) == -1){
                        System.out.println("\nPa tu casa.");
                    }

                    if(ContadorNoDescubierto(tableroFacil) == 10){
                        System.out.println("\nMieo, has ganao");
                    }
                }
            */%>
        </center>
    </body>
</html>
