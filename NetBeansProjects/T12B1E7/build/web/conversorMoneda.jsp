<%-- 
    Document   : conversorMoneda
    Created on : 20-may-2019, 13:18:12
    Author     : t-m-1
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <img src="pesetas-euros.jpg" width="423" height="226" alt="Imagen"/>
            <h1>CONVERSOR Pst-Eu</h1>
            <br/>
            <%
                String opcion = request.getParameter("opcion");
                Double dinero = Double.parseDouble(request.getParameter("dinero"));
                DecimalFormat df = new DecimalFormat("0.00");
                
                if(opcion.equals("Pesetas - Euros")){
                    out.println(dinero +"Pst son: " +df.format(dinero/166) +"€");
                }
                else{
                    out.println(dinero +"€ son: " +df.format(dinero*166) +"Pst");
                }
              %>  
        </center>
    </body>
</html>
