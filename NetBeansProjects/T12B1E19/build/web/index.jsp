<%-- 
  19. Crea el juego “Apuesta y gana”. El usuario debe introducir inicialmente una cantidad de
      dinero. A continuación aparecerá por pantalla una imagen de forma aleatoria. Si sale una
      calavera, el usuario pierde todo su dinero y termina el juego. Si sale medio limón, el usuario
      pierde la mitad del dinero y puede seguir jugando con esa cantidad o puede dejar de jugar.
      Si sale el gato chino de la suerte, el usuario multiplica por dos su dinero y puede seguir
      jugando con esa cantidad o puede dejar de jugar.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Relación 12 - Ejercicio 19</title>
    <link href="css/estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Apuesta y gana</h1>
    <div id="principal">
    <form method="post" action="juego.jsp">
      <p>Por favor, introduzca la cantidad que quiere apostar:</p>
      <input type="number" min="1" name="dinero">€<br>
      <input type="submit" value="Aceptar">
    </form>
    </div>
  </body>
</html>




































<%-- 
    Document   : apuestaGana
    Created on : 22-may-2019, 8:47:25
    Author     : t-m-1

<%@page import="java.util.Scanner"%>
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
            <h1><b>Apuesta y Gana</b></h1>
            <hr/>
            
            <%
                String resp = "s";
                int dinero = 1000;
                
                if(resp.equals("s")){
                    out.print("<form action=\"index.jsp\">");
                        out.print("<input type=\"text\" name=\"resp\" id=\"myText\" value=\"\">");
                        out.print("<input type=\"Submit\" value=\"Click to Submit\">");
                    out.print("</form>");

                    resp = request.getParameter("resp");
                }
                
                if (resp == null) {
                    resp = "s";
                }
                else { 
                    if (resp.length() == 0) {
                        out.print("<b>Texto vacío</b>");
                    }
                    else {%>
                        <p><b>Los escrito arriba es: <%= resp %></b></p>
                        <p><b>Dinero: <%= dinero %></b></p>
                    <%}
                }
            %>
            
        </center>
    </body>
</html>









aleatorio = (int)(Math.random()*3)+1;
                    
                    switch(aleatorio){
                        case 1:
                            out.print("CALAVERA  ");
                            dinero = 0;
                            out.print(dinero);
                            break;
                            
                        case 2:
                            out.print("MEDIO LIMÓN  ");
                            dinero = dinero/2;
                            out.print(dinero);
                            break;
                            
                        case 3:
                            out.print("GATO CHINO  ");
                            dinero = dinero*2;
                            out.print(dinero);
                            break;
                    }--%>