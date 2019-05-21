<%-- 
    Document   : index
    Created on : 21-may-2019, 8:31:26
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
            <h1>CALENDEITOR 2.0</h1>
            <hr/>
            
            <br/>
            <br/>
            <div>
                <form action="creaMes.jsp" method="POST">
                    <p>Mes:  
                    <select name="mes">
                        <option value="1">Enero</option>
                        <option value="2">Febrero</option>
                        <option value="3">Marzo</option>
                        <option value="4">Abril</option>
                        <option value="5">Mayo</option>
                        <option value="6">Junio</option>
                        <option value="7">Julio</option>
                        <option value="8">Agosto</option>
                        <option value="9">Septiembre</option>
                        <option value="10">Octubre</option>
                        <option value="11">Noviembre</option>
                        <option value="12">Diciembre</option>
                    </select>
                    </p>

                    <p>Año:  <input type="text" name="anio" value="1998" /></p>

                    <p>Texto:  <input type="text" name="texto"/></p>

                    <br/>
            
                    <input type="submit" value="Enviar" />
                    
                </form>
            </div>
            
        </center>
        
    </body>
</html>
