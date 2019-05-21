<%-- 
    Document   : index
    Created on : 21-may-2019, 10:27:21
    Author     : t-m-1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1>Aleatorios y primos en color</h1>
            <hr/>
            
            <%
                int aleatorio = 0;
                int contadorDivisibles = 0;
                
                for(int i=1; i<=100; i++){
                        //Crea y mostrar numero aleatorio
                        aleatorio = (int)(Math.random()*199)+1;
                        contadorDivisibles = 0;
                        
                        //Comprobar si es primo
			for(int j=1; j<=aleatorio; j++){
				if(aleatorio%j == 0){
					contadorDivisibles++;
				}
			}
			
			//Si es divisible por dos numeros
			if(contadorDivisibles == 2){
				//Mostrar mensaje de primo
				out.println("<p id=\"primo\"><b>" +aleatorio +"</b></p>");
			}
			else{
				//Mostrar mensaje de no primo
				out.println("<p>" +aleatorio +"</p>");
			}//Fin_Si
                }//Fin_Para
            %>
            
        </center>
    </body>
</html>
