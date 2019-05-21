<%-- 
    Document   : index
    Created on : 20-may-2019, 20:35:25
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
        </center>
    
        <form action="test.jsp" method="POST">
            
            <p><b>PREGUNTA 1) ¿Qué opción está bien escrita?</b></p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta1" value="1"/>system.out.println(\"Hola Mundo!\");</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta1" value="2"/>System.out.print(\"Hola Mundo!\")</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta1" value="3"/>System.out.print(Hola Mundo!)</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta1" value="4"/>Ninguna de las anteriores es correcta</p> <%-- 4 --%>
            
            <br/>
            
            <p><b>PREGUNTA 2) ¿Las dos asignaciones están correctamente escritas?</b></p>
            <p>double decimal1 = 0.0;</p>
            <p>double decimal2 = 0;</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta2" value="1"/>Sí</p> <%-- 1 --%>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta2" value="2"/>No</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta2" value="3"/>Solo es correcta la primera</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta2" value="4"/>Solo es correcta la segunda</p>
            
            <br/>
            
            <p><b>PREGUNTA 3) ¿Se puede utilizar la funcionalidad .next de Scanner para leer un número?</b></p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta3" value="1"/>Sí, pero no puedo operar con él</p> <%-- 1 --%>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta3" value="2"/>Sí y encima puedo operar con él porque Scanner es ma-ra-vi-llo-so.</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta3" value="3"/>Sí y punto</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta3" value="4"/>Todas las respuestas son correctas</p>
            
            <br/>
            
            <p><b>PREGUNTA 4) El if se utiliza para muchas condiciones y el switch para pocos casos</b></p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta4" value="1"/>Verdad tio, ese if poderoso que circula en la siudá</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta4" value="2"/>Falso, a mi no me vengas con tonterías eh</p> <%-- 2 --%>
            
            <br/>
            
            <input type="submit" value="Enviar test" />
        </form>
    
    </body>
</html>
