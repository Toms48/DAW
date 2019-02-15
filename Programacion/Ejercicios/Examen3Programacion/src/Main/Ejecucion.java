/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Gestora.Funciones;

import java.util.Scanner;
/**
 *
 * @author joaquinjimenez
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        //REGISTRO DE GESTOR DE ANUNCIANTES
        System.out.println("Bienvenido al gestor de anuncios de MotoGP");
        System.out.println("");
        System.out.println("");
        
        System.out.println("¿Cuántos anunciantes quiere gestionar?");
        int numeroAnunciantes = sc.nextInt();
        
        String[] anunciantes = new String[numeroAnunciantes];
        String anunciante="";
        
        for (int i=0; i<numeroAnunciantes; i++) {
        
            
            do {
            
            System.out.println("Introduzca el nombre del anunciante ("+(i+1)+"):");
            anunciante = s.nextLine();
            } while (anunciante.equalsIgnoreCase(""));

            String anuncianteFormateado = anunciante.toUpperCase();
            
            if (anuncianteFormateado.length()<5) {
            
                String anuncianteMasGuiones = anuncianteFormateado;
                
                for (int n=0; n<(5-anuncianteFormateado.length());n++) {
                    
                    anuncianteMasGuiones = anuncianteMasGuiones+"-";
                    
                }
                
                anunciantes[i] = anuncianteMasGuiones;
            }
            
            else {
            
                anunciantes[i] = anuncianteFormateado;
                
            }
        
        }
                System.out.println("");
                System.out.println("El listado de marcas es: ");
                System.out.println(""); 
        for (int i=0; i<numeroAnunciantes; i++) {
            
            System.out.print(anunciantes[i]+" ");
            
        }
                System.out.println("");
                System.out.println("");
                System.out.println("");
        
        
        
        //FIN DEL REGISTRO DE GESTOR DE ANUNCIANTES
        
  
        //REGISTRO DE ANUNCIOS
        boolean salir = false;
        int nAnuncios = 0;
        int tiempoTotal = 0;
            
        do {
        
            System.out.println("Bienvenido al gestor de anuncios de televisión.");
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1. Registro de anuncios.");
            System.out.println("2. Importe gastado.");
            System.out.println("3. Porcentaje de descuento.");
            System.out.println("4. Total a pagar.");
            System.out.println("5. Salir");
            
            System.out.print("Qué opción quiere elegir: ");
            int seleccion = sc.nextInt();
            int seleccion2;
            int hora;
            switch (seleccion) {
            
                case 1:
 
                    do {
                        
                    for (int i=0;i<numeroAnunciantes;i++) {
                    
                        System.out.println((i+1)+" "+anunciantes[i]);
                    
                    }
                    
                        System.out.println("¿Qué anunciante quiere elegir?");
                        seleccion2 = sc.nextInt();
                    
                    } while (seleccion2<1 || seleccion2>5);
                    
                    System.out.println("");
                    System.out.println("Usted ha elegido el anunciante "+anunciantes[seleccion2-1]);
                    System.out.println("");
                    
                    
                    do{
                      System.out.print("¿En qué hora da comienzo el anuncio? (escriba solo la hora): ");
                      hora = sc.nextInt();
                      
                      if (hora<0 || hora>23) {
                          System.out.println("Escriba una hora válida (0-23)");
                      }
                        
                    
                    } while(hora<0 || hora>23);
                    
                    
                    System.out.println("El anunciante "+ Funciones.abreviar(anunciantes[seleccion2-1])+" ha registrado un anuncio a las "+hora+" horas." );
                    
                    System.out.print("Duración del anuncio (en segundos): ");
                    int duracion = sc.nextInt();
                    tiempoTotal = tiempoTotal + duracion;
                    nAnuncios++;
      
                break;
     
                case 2:
                    System.out.println("Su compañía lleva "+nAnuncios+" anuncios, con un tiempo total de "
                            + tiempoTotal+" segundos. El importe total por el momento es: "+Funciones.precioTotal(nAnuncios, tiempoTotal)+"€");
 
                break;
                
                
                case 3:
                    System.out.println("Usted tiene un descuento del "+Funciones.descuento(nAnuncios)+"%.");
                break;
                
                
                case 4:
                    System.out.println("Lleva gastado "+Funciones.descuentoAplicado(Funciones.precioTotal(nAnuncios, tiempoTotal), Funciones.descuento(nAnuncios)));
                break;

                case 5:
                    salir = true;
                    
                    if (Funciones.descuentoAplicado(Funciones.precioTotal(nAnuncios, tiempoTotal), Funciones.descuento(nAnuncios))>=15000) {
                    System.out.println("¡Hasta pronto");
                    }
                    
                    else {
                    System.out.println("¡Contrata más anuncios la próxima vez para conseguir más descuento!");
                    }
  
                break;
  
            }
            
  
        } while (salir==false);
        
        //FIN DEL REGISTRO DE ANUNCIOS
        
        
        //RESUMEN
            System.out.println("");
            System.out.println("");
            System.out.println("");
        System.out.print("El número de anuncios registrados es "+nAnuncios+
                    " perteneciendo a los anunciantes (tal y como fueron registrados) ");
            
            for (int i=0;i<numeroAnunciantes;i++) {
            
                System.out.print(Funciones.abreviar(anunciantes[i])+" ");
            
            }

            System.out.println("El precio final de los anuncios es "+Funciones.descuentoAplicado(Funciones.precioTotal(nAnuncios, tiempoTotal), Funciones.descuento(nAnuncios)));
            System.out.println("Se le ha aplicado un descuento de "+Funciones.descuento(nAnuncios)+"%.");       
        }   
    }
    

