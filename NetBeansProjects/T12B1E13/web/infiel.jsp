<%-- 
    Document   : infiel
    Created on : 21-may-2019, 9:37:26
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
            <h1>ANT-I-NFILEDINAITOR</h1>
            <hr/>
            
            <%
                int pregunta1 = Integer.parseInt(request.getParameter("pregunta1"));
                int pregunta2 = Integer.parseInt(request.getParameter("pregunta2"));
                int pregunta3 = Integer.parseInt(request.getParameter("pregunta3"));
                int pregunta4 = Integer.parseInt(request.getParameter("pregunta4"));
                int pregunta5 = Integer.parseInt(request.getParameter("pregunta5"));

                int total = pregunta1+pregunta2+pregunta3+pregunta4+pregunta5;

                if(total>=0 && total<=1){
                        //Mostrar mensaje
                        out.println("<br/>");
                        out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
                }
                else{
                        //Si la puntuación está entre 11 y 22 (incluidos)
                        if(total>=2 && total<=4){
                                //Mostrar mensaje
                                out.println("<br/>");
                                out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
                        }
                        else{
                                //Mostrar mensaje
                                out.println("<br/>");
                                out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.");
                                out.println("Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
                        }//Fin_Si
                }//Fin_Si

            %>
            
        </center>
    </body>
</html>
