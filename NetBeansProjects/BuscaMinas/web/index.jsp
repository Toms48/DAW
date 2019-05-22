<%-- 
    Document   : index
    Created on : 22-may-2019, 13:11:19
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
            <hr/>
            <h1><b>BM</b></h1>
            <hr/>

            <br/>

            <form action="facil.jsp" method="POST">
                <input type="submit" value="FÁCIL" />
            </form>
            <form action="medio.jsp" method="POST">
                <input type="submit" value="MEDIO" />
            </form>
            <form action="dificil.jsp" method="POST">
                <input type="submit" value="DIFÍCIL" />
            </form>
        </center>
    </body>
</html>
