<%-- 
    Document   : teslaMieo
    Created on : 21-may-2019, 19:14:39
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
            <img src="logoTesla.png" style="width:300px; height:auto;">
            <hr/>
            
            <br/>
            
            <%
                int tapiceria = Integer.parseInt(request.getParameter("tapiceria"));
                int adorno = Integer.parseInt(request.getParameter("adorno"));
                
                switch(adorno){
                    case 1:
                        switch(tapiceria){
                            case 1:
                                out.print("<img src=\"CN.png\" style=\"width:1000px; height:auto;\">");
                                break;
                                
                            case 2:
                                out.print("<img src=\"CB.png\" style=\"width:1000px; height:auto;\">");
                                break;
                                
                            case 3:
                                out.print("<img src=\"CBe.png\" style=\"width:1000px; height:auto;\">");
                                break;
                        }
                        break;
                        
                    case 2:
                        switch(tapiceria){
                            case 1:
                                out.print("<img src=\"MN.png\" style=\"width:1000px; height:auto;\">");
                                break;
                                
                            case 2:
                                out.print("<img src=\"MB.png\" style=\"width:1000px; height:auto;\">");
                                break;
                                
                            case 3:
                                out.print("<img src=\"MBe.png\" style=\"width:1000px; height:auto;\">");
                                break;
                        }
                        break;
                }
            %>
            
        </center>
    </body>
</html>
