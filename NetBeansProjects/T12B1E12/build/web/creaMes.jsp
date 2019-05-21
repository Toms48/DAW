<%-- 
    Document   : creaMes
    Created on : 20-may-2019, 22:03:14
    Author     : Familia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1>CALENDEITOR 2.0</h1>
            <hr/>
            
            <br/>
            
            <%
                int anio = Integer.parseInt(request.getParameter("anio"));
                int mes = Integer.parseInt(request.getParameter("mes"));
                String texto = request.getParameter("texto");
                
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.YEAR, anio);
                cal.set(Calendar.MONTH, mes);
                cal.set(Calendar., 1);

                out.print("<p>" +texto +"</p>");
                out.print("<p><b>" + +" - " +anio +"</b></p>");

                %>
            
            <table border="2" cellpadding="8">
                <tbody>
                    <tr>
                        <td>Lunes</td>
                        <td>Martes</td>
                        <td>Miércoles</td>
                        <td>Jueves</td>
                        <td>Viernes</td>
                        <td>Sábado</td>
                        <td>Domingo</td>
                    </tr>
                    
                    <%
                        //int diaN = Calendar.DAY_OF_WEEK;
                        //out.println(diaN);
                        //int numeroDias = ;
                        
                        boolean empezado = false;
                        int contador = 1;
                        
                        
                        
                        /*while(contador < numeroDias+1){
                            out.println("<tr>");
                            for(int i=1; i<=7 && contador<numeroDias+1; i++){
                                if(i!=diaN && empezado==false){
                                    out.println("<td></td>");
                                    contador--;
                                }
                                else{
                                    out.println("<td>" +contador +"</td>");
                                    empezado=true;
                                }
                                
                                contador++;
                            }
                            out.println("</tr>");
                        }*/
                        
                    %>
                </tbody>
            </table>
            
        </center>
    </body>
</html>
