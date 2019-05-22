<%-- 
    Document   : apuestaGana
    Created on : 22-may-2019, 8:47:25
    Author     : t-m-1
--%>

<%@page import="java.util.Scanner"%>
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
            <h1><b>Apuesta y Gana</b></h1>
            <hr/>
            
            <form action = "apuestaGana.jsp">
                                <input type="text" name="resp" id="resp" value="">
                                <input type="Submit" value="Click to Submit">
                            </form>
            
            <%
                int dinero = Integer.parseInt(request.getParameter("dinero"));
                int aleatorio = 0;
                
                String respuesta = "s";
                
                    aleatorio = (int)(Math.random()*3)+1;
                    
                    switch(aleatorio){
                        case 1:
                            out.print("CALAVERA  ");
                            dinero = 0;
                            out.print(dinero);
                            break;
                            
                        case 2:
                            out.print("MEDIO LIMÓN  ");
                            dinero = dinero/2;
                            out.print(dinero);
                            break;
                            
                        case 3:
                            out.print("GATO CHINO  ");
                            dinero = dinero*2;
                            out.print(dinero);
                            break;
                    }
                            
                            respuesta = request.getParameter("resp");
                        
                            if(respuesta == null){
                            }
                            else { 
                                if (respuesta.length() == 0) {
                                }
                                else{%>
                                    <b>Respuesta :) <%= respuesta %></b>
                                <% }
                            }

            %>
            
        </center>
    </body>
</html>
