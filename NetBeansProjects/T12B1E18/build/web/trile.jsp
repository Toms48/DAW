<%-- 
    Document   : trile
    Created on : 21-may-2019, 21:43:54
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
            <hr/>
            <h1>TRILE</h1>
            <hr/>
            
            <br/>
            
            <%
                int aleatorio = (int)(Math.random()*3)+1;
                
                //out.print(aleatorio); //Para saber en que puesto se genera la bolita
                
                if(request.getParameter("1") != null && aleatorio==1) {
                    //out.println("AQUÍ ESTÁ LA BOLITA");
                    out.print("<img  src = \"vasoBolita.png\" width = \"400\" height = \"600\" alt = \"vaso\" / >");
                    out.print("<img  src = \"vaso.png\" width = \"400\" height = \"600\" alt = \"vaso\" / >");
                    out.print("<img  src = \"vaso.png\" width = \"400\" height = \"600\" alt = \"vaso\" / >");
                }
                else{
                    if(request.getParameter("2") != null && aleatorio==2) {
                        //out.println("AQUÍ ESTÁ LA BOLITA");
                        out.print("<img  src = \"vaso.png\" width = \"400\" height = \"600\" alt = \"vaso\" / >");
                        out.print("<img  src = \"vasoBolita.png\" width = \"400\" height = \"600\" alt = \"vaso\" / >");
                        out.print("<img  src = \"vaso.png\" width = \"400\" height = \"600\" alt = \"vaso\" / >");
                    }
                    else{
                        if(request.getParameter("3") != null && aleatorio==3) {
                            //out.println("AQUÍ ESTÁ LA BOLITA");
                            out.print("<img  src = \"vaso.png\" width = \"400\" height = \"600\" alt = \"vaso\" / >");
                            out.print("<img  src = \"vaso.png\" width = \"400\" height = \"600\" alt = \"vaso\" / >");
                            out.print("<img  src = \"vasoBolita.png\" width = \"400\" height = \"600\" alt = \"vaso\" / >");
                        }
                        else{
                            //out.println("Pos no, aquí no está la bolita.");
                            out.println("<h3><b>Has perdido, ahí no estaba la bolita, pero mira que guapo, un loro en bici</b></h3>");
                            out.println("<img src = \"loro.gif\" width = \"316\" height = \"199\" alt = \"loro\" / >");
                        }
                    }
                }
            %>
        </center>
    </body>
</html>
