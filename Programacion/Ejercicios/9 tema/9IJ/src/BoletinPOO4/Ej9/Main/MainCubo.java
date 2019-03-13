/*
 *   Nombre:	MainCubo
 *
 *   Comentario:    Ejercicio de cubos.
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un int para la opción del menu
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: No tiene
 *
 * */

/*

//PG
	//Inicio
		//Hacer
			//Leer y validar cantidad y contenido de los cubos
			//Mostrar menu, leer y validar opcionMenu
			//Segun opcion del menu
			
			//Fin_Segun
		//Mientras la opcion no sea salir
	//Fin
	
*/

package BoletinPOO4.Ej9.Main;

import BoletinPOO4.Ej9.Clases.Cubo;

import java.util.Scanner;
import java.util.SortedSet;

public class MainCubo {
	
	public static void mostrarMenu(){
		System.out.println();
		System.out.println("Elija una opción del menu");
		System.out.println("1. Mostrar capacidad del cubo 1");
		System.out.println("2. Mostrar capacidad del cubo 2");
		System.out.println("3. Mostrar contenido del cubo 1");
		System.out.println("4. Mostrar contenido del cubo 2");
		System.out.println("5. Pasar agua del cubo 1 al cubo 2");
		System.out.println("6. Pasar agua del cubo 2 al cubo 1");
		System.out.println("0. Salir");
		System.out.print ("Su opción es: ");
	}
	
	public static void main(String[] args){
		
		//Declaraciones de variables
		int opcionMenu = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		int capacidadCubo = 0;
		int contenidoCubo = 0;
		
		//Inicio
			//Leer y validar cantidad y contenido de los cubos
			do{
				System.out.print("Introduzca la capacidad de litros del primer cubo (> 0): ");
				capacidadCubo = teclado.nextInt();
				
			}
			while(capacidadCubo <= 0);
			
			do{
				System.out.print("Introduzca el contenido de litros del primer cubo (entre 0 y " +capacidadCubo +"): ");
				contenidoCubo = teclado.nextInt();
				
			}
			while(contenidoCubo<0 || contenidoCubo>capacidadCubo);
			
			Cubo cubo1 = new Cubo(capacidadCubo, contenidoCubo);
			
			do{
				System.out.print("Introduzca la capacidad de litros del segundo cubo (> 0): ");
				capacidadCubo = teclado.nextInt();
				
			}
			while(capacidadCubo <= 0);
			
			do{
				System.out.print("Introduzca el contenido de litros del segundo cubo (entre 0 y " +capacidadCubo +"): ");
				contenidoCubo = teclado.nextInt();
				
			}
			while(contenidoCubo<0 || contenidoCubo>capacidadCubo);
			
			Cubo cubo2 = new Cubo(capacidadCubo, contenidoCubo);
			
			//Hacer
			do {
				//Mostrar menu, leer y validar opcionMenu
				do{
					mostrarMenu();
					opcionMenu = teclado.nextInt();
				}
				while(opcionMenu>6 || opcionMenu<0);
				
				System.out.println();
				
				//Segun opcion del menu
				switch(opcionMenu){
					case 1:
						System.out.println("La capacidad del cubo 1 es: " +cubo1.getCapacidad() +"l");
					break;
						
					case 2:
						System.out.println("La capacidad del cubo 2 es: " +cubo2.getCapacidad() +"l");
					break;
						
					case 3:
						System.out.println("El contenido del cubo 1 es: " +cubo1.getContenido() +"l");
					break;
					
					case 4:
						System.out.println("El contenido del cubo 2 es: " +cubo2.getContenido() +"l");
					break;
					
					case 5:
						cubo1.verterEn(cubo2);
					break;
					
					case 6:
						cubo2.verterEn(cubo1);
					break;
				}//Fin_Segun
			}
			while(opcionMenu != 0);	//Mientras la opcion no sea salir
		
			System.out.println("Ashta luego!");
		
		//Fin
	}
}
