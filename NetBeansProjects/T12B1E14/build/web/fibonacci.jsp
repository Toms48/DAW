<%-- 
    Document   : fibonacci
    Created on : 21-may-2019, 10:21:17
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
            <h1>Fibonacci</h1>
            <hr/>
            
            <%
                int n = Integer.parseInt(request.getParameter("n"));
                int numero1 = 0;
		int numero2 = 1;
		int aux = 0;
                
                for(int i=0; i<n; i++){
                        //Mostrar Fibonacci
                        out.println(numero1);

                        //Calcular Fibonacci
                        aux = numero2;
                        numero2 = numero1+numero2;

                        numero1 = aux;
                }//Fin_Para
                
                %>
            
        </center>
    </body>
</html>
