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
 *       Salidas:
 *       	- Por pantalla
 *       	- Dos double para
 *       		- resta()
 *       		- suam()
 *       		- division()
 *       		- multiplicacion()
 *
 *       Requisitos: La opción del menu tiene que ser entre 0 y 5
 *
 * */

/*

//PG
	//Inicio
		//Hacer
		    //Mostrar menu
			//Mostrar, leer y validar opcion del menu
			//Segun opcion del menu
				//caso 1: Introducir valores
				//caso 2: Suma
				//caso 3: Resta
				//caso 4: Multiplicación
				//caso 5: División
				//caso 0: Salir
			//Fin_Segun
		//Mientras opcion del menu no sea 0
	//Fin

*/

package Main;

import Excepciones.ExcepcionCalculadora;
import Gestora.GestoraCalculadora;

//import java.io.IOException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCalculadora {

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("[1] Introducir operadores");
        System.out.println("[2] Suma");
        System.out.println("[3] Resta");
        System.out.println("[4] Multiplicación");
        System.out.println("[5] División");
        System.out.println("[0] Salir");
    }

    public static void main(String args[]){

        //Declaraciones de variables
        int opcionMenu = 9;
		
		double numero1 = 0;
		double numero2 = 0;

        //Inicializaciones
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
        GestoraCalculadora Gestora = new GestoraCalculadora();

        //Inicio
            //Hacer
            do{
                //Mostrar menu
				System.out.println("Operando 1: " +numero1);
				System.out.println("Operando 2: " +numero2);
                mostrarMenu();

                //Mostrar, leer y validar opcion del menu
                do{
					try{
						System.out.print("Su opción del menu es: ");
						opcionMenu = Integer.parseInt(tecladoS.nextLine());
					}
					catch(NumberFormatException e){
						System.out.println("Solo puedes meter valores numericos");
					}
                
                }
                while(opcionMenu<0 || opcionMenu>5);

                System.out.println();

                //Segun opcion del menu
                switch(opcionMenu){
					case 1:
						try{
							System.out.print("Introduzca el primer numero: ");
							numero1 = Double.parseDouble(tecladoS.nextLine());
							
							System.out.print("Introduzca el segundo numero: ");
							numero2 = Double.parseDouble(tecladoS.nextLine());
						}
						catch(NumberFormatException e){
							System.out.println("Solo puedes meter valores numericos");
							numero1 = 0;
							numero2 = 0;
						}
						break;
						
                    case 2:
						System.out.println("El resultado de la suma es: " +Gestora.suma(numero1, numero2));
                        break;

                    case 3:
                        //System.out.println("RESTA WIP");
                        try{
                            System.out.println("El resultado de la resta es: " +Gestora.resta(numero1, numero2));
                        }
                        catch(ExcepcionCalculadora error){
                            System.out.println(error.getMessage());
                        }
                        break;

                    case 4:
                        //System.out.println("MULTIPLICACIÓN WIP");
						System.out.println("El resultado de la multiplicacion es: " +Gestora.multiplicacion(numero1, numero2));
                        break;

                    case 5:
                        //System.out.println("DIVISIÓN WIP");
                        try{
                            System.out.println("El resultado de la division es: " +Gestora.division(numero1, numero2));
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
