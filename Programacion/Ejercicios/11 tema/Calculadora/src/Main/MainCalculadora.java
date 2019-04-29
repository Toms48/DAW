/*
 *   Nombre:	MainCalculadora
 *
 *   Comentario:    Una pequeña calculadora que suma, resta, multiplica y divide pero con la novedad de las excepciones
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un int para la opcion del menu
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: La opción del menu tiene que ser entre 0 y 4
 *
 * */

/*

//PG
	//Inicio
		//Hacer
		    //Mostrar menu
			//Mostrar, leer y validar opcion del menu
			//Segun opcion del menu
				//caso 1: Suma
				//caso 2: Resta
				//caso 3: Multiplicación
				//caso 4: División
				//caso 0: Salir
			//Fin_Segun
		//Mientras opcion del menu no sea 0
	//Fin

*/

package Main;

import Excepciones.ExcepcionCalculadora;
import Gestora.GestoraCalculadora;

//import java.io.IOException;
import java.util.Scanner;

public class MainCalculadora {

    public static void mostrarMenu(){
        System.out.println("[1] Suma");
        System.out.println("[2] Resta");
        System.out.println("[3] Multiplicación");
        System.out.println("[4] División");
        System.out.println("[0] Salir");
    }

    public static void main(String args[]){

        //Declaraciones de variables
        int opcionMenu = 0;

        //Inicializaciones
        Scanner tecladoN = new Scanner(System.in);
        GestoraCalculadora Gestora = new GestoraCalculadora();

        //Inicio
            //Hacer
            do{
                //Mostrar menu
                mostrarMenu();

                //Mostrar, leer y validar opcion del menu
                do{
                    System.out.print("Su opción del menu es: ");
                    opcionMenu = tecladoN.nextInt();
                }
                while(opcionMenu<0 || opcionMenu>4);

                System.out.println();

                //Segun opcion del menu
                switch(opcionMenu){
                    case 1:
                        try{
                            System.out.println("El resultado de la suma es: " +Gestora.suma());
                        }
                        catch(ExcepcionCalculadora error){
                            System.out.println(error.getMessage());
                        }
                        break;

                    case 2:
                        //System.out.println("RESTA WIP");
                        try{
                            System.out.println("El resultado de la resta es: " +Gestora.resta());
                        }
                        catch(ExcepcionCalculadora error){
                            System.out.println(error.getMessage());
                        }
                        break;

                    case 3:
                        //System.out.println("MULTIPLICACIÓN WIP");
                        try{
                            System.out.println("El resultado de la multiplicacion es: " +Gestora.multiplicacion());
                        }
                        catch(ExcepcionCalculadora error){
                            System.out.println(error.getMessage());
                        }
                        break;

                    case 4:
                        //System.out.println("DIVISIÓN WIP");
                        try{
                            System.out.println("El resultado de la division es: " +Gestora.division());
                        }
                        catch(ExcepcionCalculadora error){
                            System.out.println(error.getMessage());
                        }
                        break;
                }//Fin_Segun

                System.out.println();
            }
            while(opcionMenu != 0); //Mientras opcion del menu no sea 0

            System.out.println("Ashta lueh!");
        //Fin

    }
}
