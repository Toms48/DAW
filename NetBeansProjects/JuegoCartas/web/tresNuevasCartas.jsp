<%-- 
    Document   : tresNuevasCartas
    Created on : 22-may-2019, 16:16:13
    Author     : Familia
--%>

<%@page import="java.time.LocalDateTime"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.FileNotFoundException"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.BufferedWriter"%>
<%@page import="Clases.Carta"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Clases.Baraja"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="cssMieo.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body id="cuerpo">
        <center>
            <hr/>
            <hr/>
            <h1><img src="imagenes/logoCartas.png" height="142px" width="auto"/></h1>
            <hr/>
            <hr/>

            <br/>
            
            <%
                LocalDateTime now = LocalDateTime.now();
                int year = now.getYear();
                int month = now.getMonthValue();
                int day = now.getDayOfMonth();
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                
                ArrayList<Carta> manoJugador =  
                (ArrayList<Carta>)request.getAttribute("arrayJ1"); 
                for(Carta s : manoJugador){
                    out.println(s.toString());
                }
                
                /*if (request.getAttribute("arrayJ1") != null) {
                    ArrayList manoJugador = (ArrayList) request.getAttribute("arrayJ1");
                    out.println(manoJugador);
                    out.println(manoJugador.size());
                    for (int i=0; i < manoJugador.size(); i++) {
                        out.println(manoJugador.get(i));
                    }
                }
                else {
                    out.println("no data in array");
                }*/
                
                ArrayList<Carta> manoRival = new ArrayList();
                
                String nJ1 = request.getParameter("nJ1");
                String nJ2 = request.getParameter("nJ2");
                
                int cJ1 = 0;
                int cJ2 = 0;
                
                if(request.getParameter("cambiaCartaJ1") != null){
                    cJ1 = Integer.parseInt(request.getParameter("cambiaCartaJ1"));
                }
                
                if(request.getParameter("cambiaCartaJ2") != null){
                    cJ2 = Integer.parseInt(request.getParameter("cambiaCartaJ2"));
                }
                int puntuacionJugador = 0;
                int puntuacionRival = 0;
                
                Baraja baraja = new Baraja();
                baraja.barajar();
                
                /*for(int i=0; i<=4; i++){
                    manoJugador.add(baraja.getCartaDeArriba());
                    manoRival.add(baraja.getCartaDeArriba());
                }*/
                out.print("Jugador1: " +cJ1);
                out.print("Jugador2: " +cJ2);
                out.print("<div id=\"tapete\">");
                /*for(Carta dato : manoJugador){
                    out.println(dato.toString());
                    puntuacionJugador += dato.getValor();
                }*/
                out.print("<div id=\"marcador\"><b>" +nJ1 +"</b></div>");
                out.print("</div>");
                
                out.print("<br/><br/><br/>");
                out.print("<br/><br/><br/>");
                
                
                out.print("<div id=\"tapete\">");
                for(Carta dato : manoRival){
                    out.println(dato.toString());
                    puntuacionRival += dato.getValor();
                }
                out.print("<div id=\"marcador\"><b>" +nJ2 +"</b></div>");
                out.print("</div>");
                
                out.print("<br/><br/><br/>");
                
                out.print("<div id=\"puntos\">");
                out.print("<p>PUNTOS</p>");
                out.print("<br/>");
                out.print("<p>" +nJ1 +" ===> " +puntuacionJugador +"   |||||   " +puntuacionRival +" <=== " +nJ2 +"</p>");
                out.print("</div>");
                
                out.print("<br/><br/><br/>");
                
                try{
                    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Documents\\NetBeansProjects\\JuegoCartas\\build\\web\\recuerdos\\recuerdo" +year +month +day +hour +minute+ second +".txt"));
                    //BufferedWriter bw = new BufferedWriter(new FileWriter("recuerdos\\recuerdo1.txt"));
                    
                    bw.write("  RESULTADOS  ");
                    bw.newLine();
                    bw.write("==============");
                    bw.newLine();
                    
                    if(puntuacionJugador > puntuacionRival){
                        out.print("<div id=\"ganador\">GANADOR ===> " +nJ1 +"</div>");
                        bw.write("GANADOR  ===> " +nJ1);
                        bw.newLine();
                        bw.write("PERDEDOR ===> " +nJ2);
                    }
                    else{
                        if(puntuacionJugador < puntuacionRival){
                            out.print("<div id=\"ganador\">GANADOR ===> " +nJ2 +"</div>");
                            bw.write("GANADOR  ===> " +nJ2);
                            bw.newLine();
                            bw.write("PERDEDOR ===> " +nJ1);
                        }
                        else{
                            out.print("<div id=\"empate\">EMPATE</div>");
                            bw.write("EMPATE");
                        }
                    }
                    
                    bw.newLine();
                    bw.newLine();
                    bw.newLine();
                    
                    bw.write("  PUNTUACION  ");
                    bw.newLine();
                    bw.write("==============");
                    bw.newLine();
                    bw.write(nJ1 +" ===> " +puntuacionJugador);
                    bw.newLine();
                    bw.write(nJ2 +" ===> " +puntuacionRival);
                    
                    bw.close();
		}
		catch (FileNotFoundException e){
			out.println("No se ha encontrado el fichero");
		}
		catch (IOException e){
			out.println("No se ha podido escribir en el fichero");
		}
                
            %>
        </center>
    </body>
</html>
