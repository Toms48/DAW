<%-- 
    Document   : creaMes
    Created on : 20-may-2019, 22:03:14
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
            <h1>CALENDEITOR</h1>
            <hr/>
            
            <br/>
            
            <%
                String anio = request.getParameter("anio");
                String mes = request.getParameter("mes");
                String texto = request.getParameter("texto");

                out.print("<p>" +texto +"</p>");
                out.print("<p><b>" +mes +" - " +anio +"</b></p>");

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
                        String dia = request.getParameter("dia");
                        int diaN = 0;
                        int numeroDias = Integer.parseInt(request.getParameter("numeroDias"));
                        
                        boolean empezado = false;
                        int contador = 1;
                        
                        if(dia.equals("Lunes")){
                            diaN=1;
                        }
                        else{
                            if(dia.equals("Martes")){
                                diaN=2;
                            }
                            else{
                                if(dia.equals("Miercoles")){
                                    diaN=3;
                                }
                                else{
                                    if(dia.equals("Jueves")){
                                        diaN=4;
                                    }
                                    else{
                                        if(dia.equals("Viernes")){
                                            diaN=5;
                                        }
                                        else{
                                            if(dia.equals("Sabado")){
                                                diaN=6;
                                            }
                                            else{
                                                if(dia.equals("Domingo")){
                                                    diaN=7;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        
                        while(contador < numeroDias+1){
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
                        }
                        
                    %>
                </tbody>
            </table>
            
        </center>
    </body>
</html>
