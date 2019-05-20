<%-- 
    Document   : piramide
    Created on : 20-may-2019, 19:29:03
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
            <h1>Piramineitor</h1>
            
            <br/>
            
            <%
                int altura = Integer.parseInt(request.getParameter("altura"));
                
                /*for(int i=0; i<=altura-1; i++){
                    out.print("*");
                    for(int j=1; j<=i+(i*1); j++){
                        out.print("*");
                    }
                    out.println("<br/>");
                }*/
                
                for(int i=0; i<=altura-1; i++){
                    out.print("<img src=\"icono_pato.png\" width=\"32\" height=\"32\" alt=\"icono_pato\"/>");
                    for(int j=1; j<=i+(i*1); j++){
                        out.print("<img src=\"icono_pato.png\" width=\"32\" height=\"32\" alt=\"icono_pato\"/>");
                    }
                    out.println("<br/>");
                }
            %>
        </center>
    </body>
</html>
