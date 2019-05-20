<%-- 
    Document   : index
    Created on : 20-may-2019, 21:44:44
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
            <h1>CALENDEITOR</h1>
            <hr/>
            
            <br/>
            <br/>
            <div>
                <form action="creaMes.jsp" method="POST">
                    <p>Mes:  
                    <select name="mes">
                        <option>Enero</option>
                        <option>Febrero</option>
                        <option>Marzo</option>
                        <option>Abril</option>
                        <option>Mayo</option>
                        <option>Junio</option>
                        <option>Julio</option>
                        <option>Agosto</option>
                        <option>Septiembre</option>
                        <option>Octubre</option>
                        <option>Noviembre</option>
                        <option>Diciembre</option>
                    </select>
                    </p>

                    <p>Año:  <input type="text" name="anio" value="2000" /></p>

                    <p>Texto:  <input type="text" name="texto"/></p>

                    <p>Día de la semana:  
                        <select name="dia">
                            <option>Lunes</option>
                            <option>Martes</option>
                            <option>Miercoles</option>
                            <option>Jueves</option>
                            <option>Viernes</option>
                            <option>Sabado</option>
                            <option>Domingo</option>
                        </select>
                    </p>

                    <p>Días del mes:  
                        <select name="numeroDias">
                            <option>28</option>
                            <option>29</option>
                            <option>30</option>
                            <option>31</option>
                        </select>
                    </p>

                    <br/>
            
                    <input type="submit" value="Enviar" />
                    
                </form>
            </div>
            
        </center>
        
    </body>
</html>
