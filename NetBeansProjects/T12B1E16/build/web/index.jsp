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
                            out.print("Puntos negros");
                            break;
                            
                        case 2:
                            out.print("Puntos rojos");
                            break;
                            
                        case 3:
                            out.print("J");
                            break;
                            
                        case 4:
                            out.print("Q");
                            break;
                            
                        case 5:
                            out.print("K");
                            break;
                            
                        case 6:
                            out.print("O");
                            break;
                    }
                    
                }

            %>
            
        </center>
    </body>
</html>
