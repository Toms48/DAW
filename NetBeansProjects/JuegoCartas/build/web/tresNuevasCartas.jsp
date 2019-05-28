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
                //Declaraciones de variables
                LocalDateTime now = LocalDateTime.now();
                int year = now.getYear();
                int month = now.getMonthValue();
                int day = now.getDayOfMonth();
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                
                ArrayList<Carta> manoJugador1 = new ArrayList();
                ArrayList<Carta> manoJugador2 = new ArrayList();
                
                String nJ1 = request.getParameter("nJ1");
                String nJ2 = request.getParameter("nJ2");
                
                int cambioCartaJ1 = Integer.parseInt(request.getParameter("cambiaCartaJ1"))-1;
                int cambioCartaJ2 = Integer.parseInt(request.getParameter("cambiaCartaJ2"))-1;
                
                String palosJ1 = request.getParameter("palosJ1");
                String valoresJ1 = request.getParameter("valoresJ1");
                String palosJ2 = request.getParameter("palosJ2");
                String valoresJ2 = request.getParameter("valoresJ2");
                
                int puntuacionJugador = 0;
                int puntuacionRival = 0;
                
                int posicionComa = 0;
                int palo = 0;
                int valor = 0;
                
                Baraja baraja = new Baraja();
                baraja.barajar();
                
                //Inicio
                for(int i=0; i<=4; i++){
                    posicionComa = palosJ1.indexOf(',');
                    palo = Integer.parseInt(palosJ1.substring(0,posicionComa));
                    //out.println(palo);
                    palosJ1 = palosJ1.substring(posicionComa+1);
                    
                    posicionComa = valoresJ1.indexOf(',');
                    valor = Integer.parseInt(valoresJ1.substring(0,posicionComa));
                    //out.println(valor);
                    valoresJ1 = valoresJ1.substring(posicionComa+1);
                    
                    Carta cartaJ1 = new Carta(valor,palo);
                    manoJugador1.add(cartaJ1);
                }
                
                for(int i=0; i<=4; i++){
                    posicionComa = palosJ2.indexOf(',');
                    palo = Integer.parseInt(palosJ2.substring(0,posicionComa));
                    //out.println(palo);
                    palosJ2 = palosJ2.substring(posicionComa+1);
                    
                    posicionComa = valoresJ2.indexOf(',');
                    valor = Integer.parseInt(valoresJ2.substring(0,posicionComa));
                    //out.println(valor);
                    valoresJ2 = valoresJ2.substring(posicionComa+1);
                    
                    Carta cartaJ2 = new Carta(valor,palo);
                    manoJugador2.add(cartaJ2);
                }
                
                for(int i=0; i<=4; i++){
                    baraja.quitarDeLaBaraja(manoJugador1.get(i));
                }
                
                for(int i=0; i<=4; i++){
                    baraja.quitarDeLaBaraja(manoJugador2.get(i));
                }
                
                for(int i=0; i<=4; i++){
                    if(cambioCartaJ1 == i){
                        manoJugador1.set(i, baraja.getCartaDeArriba());
                    }
                    
                    if(cambioCartaJ2 == i){
                        manoJugador2.set(i, baraja.getCartaDeArriba());
                    }
                }
                
                out.print("<div id=\"tapete\">");
                for(Carta dato : manoJugador1){
                    out.println(dato.toString());
                    puntuacionJugador += dato.getValor();
                }
                
                out.print("<div id=\"marcador\"><b>" +nJ1 +"</b></div>");
                out.print("</div>");
                
                out.print("<br/><br/><br/>");
                out.print("<br/><br/><br/>");
                
                
                out.print("<div id=\"tapete\">");
                
                for(Carta dato : manoJugador2){
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
                    //BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Documents\\NetBeansProjects\\JuegoCartas\\build\\web\\recuerdos\\recuerdo" +year +month +day +hour +minute+ second +".txt"));
                    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Familia\\Documents\\NetBeansProjects\\JuegoCartas\\build\\web\\recuerdos\\recuerdo" +year +month +day +hour +minute+ second +".txt"));
                    
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
