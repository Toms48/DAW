package Main;

/*
 *   Nombre:	MainCalculadora
 *
 *   Comentario:    Muestra un menú con las distintas opciones de los ejercicios del boletín, desde el 1 al 14
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un int para la opcion del menu
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: La opción del menu tiene que ser entre 0 y 14
 *
 * */

/*

//PG
	//Inicio
		//Mostrar, leer y validar opcion del menu
		//Leer y validar opcion del menu
		//Segun opcion del menu
			//caso 0: salir
			//caso 1:  ejercicio 1
			
			//caso 14: ejercicio 14
		//Fin_Segun
	//Fin

*/

import Gestora.Gestora8IJ;
import Gestora.CambiosBase8IJ;

import java.util.Scanner;

public class MainCalculadora {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int opcionMenu = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Hacer
			do{
				//Mostrar, leer y validar opcion del menu
				do{
					Gestora8IJ.mostrarMenuCalculadora();
					opcionMenu = teclado.nextInt();
				}
				while(opcionMenu<0 || opcionMenu>14);
				
				//Segun opcion del menu
				switch(opcionMenu){
					case 0:
						System.out.println("Ashta lue");
						break;
					
					case 1:
						System.out.println("WIP");
						break;
					
					case 2:
						System.out.println("WIP");
						break;
					
					case 3:
						System.out.println("WIP");
						break;
					
					case 4:
						System.out.println("WIP");
						break;
					
					case 5:
						System.out.println("WIP");
						break;
					
					case 6:
						System.out.println("WIP");
						break;
					
					case 7:
						System.out.println("WIP");
						break;
					
					case 8:
						System.out.println("WIP");
						break;
					
					case 9:
						System.out.println("WIP");
						break;
					
					case 10:
						System.out.println("WIP");
						break;
					
					case 11:
						System.out.println("WIP");
						break;
					
					case 12:
						System.out.println("WIP");
						break;
					
					case 13:
						System.out.println("WIP");
						break;
					
					case 14:
						System.out.println("WIP");
						break;
				}
				//Fin_Segun
			}
			while(opcionMenu!=0);
		
		//Fin
		
	}
}
