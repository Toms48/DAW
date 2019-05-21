<%-- 
    Document   : index
    Created on : 21-may-2019, 9:26:25
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
        </center>
    
        <form action="infiel.jsp" method="POST">
            
            <p><b>PREGUNTA 1) Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.</b></p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta1" value="1"/>Sí</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta1" value="0"/>No</p>
            
            <br/>
            
            <p><b>PREGUNTA 2) Ha aumentado sus gastos de vestuario.</b></p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta2" value="1"/>Sí</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta2" value="0"/>No</p>
            
            <br/>
            
            <p><b>PREGUNTA 3) Ha perdido el interés que mostraba anteriormente por ti.</b></p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta3" value="1"/>Sí</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta3" value="0"/>No</p>
            
            <br/>
            
            <p><b>PREGUNTA 4) Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).</b></p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta4" value="1"/>Sí</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta4" value="0"/>No</p>
            
            <br/>
            
            <p><b>PREGUNTA 5) No te deja que mires la agenda de su teléfono móvil.</b></p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta5" value="1"/>Sí</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="radio" name="pregunta5" value="0"/>No</p>
            
            
            <br/>
            
            <input type="submit" value="Enviar test" />
        </form>
    </body>
</html>
