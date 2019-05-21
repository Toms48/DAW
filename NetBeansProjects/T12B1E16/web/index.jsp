<%-- 
    Document   : index
    Created on : 21-may-2019, 10:46:24
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
            <h1>Dados de Poker</h1>
            <hr/>
            
            <%
                int aleatorio = 0;
                aleatorio = (int)(Math.random()*199)+1;
                
                for(int i=1; i<=3; i++){
                    aleatorio = (int)(Math.random()*6)+1;
                    
                    switch(aleatorio){
                        case 1:
                            out.print("<img src=\"dadoNegro.png\" style=\"width:200px; height:auto;\">");
                            break;
                            
                        case 2:
                            out.print("<img src=\"dadorojo.png\" style=\"width:200px; height:auto;\">");
                            break;
                            
                        case 3:
                            out.print("<img src=\"j.png\" style=\"width:200px; height:auto;\">");
                            break;
                            
                        case 4:
                            out.print("<img src=\"q.png\" style=\"width:200px; height:auto;\">");
                            break;
                            
                        case 5:
                            out.print("<img src=\"k.png\" style=\"width:200px; height:auto;\">");
                            break;
                            
                        case 6:
                            out.print("<img src=\"puntorojo.png\" style=\"width:200px; height:auto;\">");
                            break;
                    }
                    
                }

            %>
            
        </center>
    </body>
</html>
