<%-- 
    Document   : test
    Created on : 20-may-2019, 21:04:31
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
            <h1>TEST PREGUNTAS</h1>
            <hr/>
            
            <%
                int pregunta1 = Integer.parseInt(request.getParameter("pregunta1"));
                int pregunta2 = Integer.parseInt(request.getParameter("pregunta2"));
                int pregunta3 = Integer.parseInt(request.getParameter("pregunta3"));
                int pregunta4 = Integer.parseInt(request.getParameter("pregunta4"));
                
                int puntos = 0;
                
                if(pregunta1 == 4){
                    puntos++;
                }
                
                if(pregunta2 == 1){
                    puntos++;
                }
                
                if(pregunta3 == 1){
                    puntos++;
                }
                
                if(pregunta4 == 2){
                    puntos++;
                }
                
                out.println("<p>Has acertado  <b>" +puntos +"</b> preguntas.</p>");
            %>
            
        </center>
    
    </body>
</html>
