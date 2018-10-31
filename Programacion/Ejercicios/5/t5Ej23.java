/*
 * Nombre: t5Ej23
 * 
 * Comentario:  Escribe un programa que permita ir introduciendo una serie indeterminada de números
 * 				mientras su suma no supere el valor 10000.
 * 				Cuando esto último ocurra, se debe mostrar : 
 * 					- el total acumulado
 * 					- el contador de los números introducidos
 * 					- la media
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- Un int para el numero que introduce el usuario
 * 			- Un caracter para la respuesta del usuario
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: La suma de los numeros introducidos no puede ser mayor que 10000
 * 
 */

//PG
	//Inicio
		//Hacer
			//Leer numero
			//Si sumatorio más el numero es <= 10000
				//Añadir numero al sumatorio
				//Aumentar contador de numeros
			//Sino
				//Actualizar el boolean variable de control de bucle a true
			//Fin_Si
			//Preguntar para seguir introduciendo numeros
		//Mientras que mayor10000 sea false y la respuesta sea s
		//Mostrar el sumatorio (el total de los numeros introducidos)
		//Mostrar cuadntos numeros ha introducido el usuario
		//Mostrar la media
	//Fin

import java.util.Scanner;

public class t5Ej23 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int numero = 0;
		
		int sumatorio = 0;
		int contadorNumeros = 0;
		
		char respuesta = ' ';
		
		boolean mayor10000 = false;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Hacer
			do{
				//Leer numero
				System.out.print("Introduzca un numero por favor: ");
				numero = teclado.nextInt();
				
				if((sumatorio+numero) <= 10000){ //Si sumatorio más el numero es <= 10000
					//Añadir numero al sumatorio
					sumatorio = sumatorio + numero;
					
					//Aumentar contador de numeros
					contadorNumeros++;
				}
				else{
					//Cambiar variable de control de bucle a true
					mayor10000 = true;
				}//Fin_Si
				
				//Leer y validar respuesta para seguir introduciendo numeros
				if(mayor10000 == false){ //Un si para que no vuelva a preguntar si ya nos hemos pasado de 10000
					do{
						System.out.print("Quiere seguir introduciendo numeros? (s/n): ");
						respuesta = Character.toLowerCase(teclado.next().charAt(0));
					}
					while(respuesta !='s' && respuesta !='n' && mayor10000==false);
				}
			}
			while(mayor10000==false && respuesta=='s'); //Mientras que mayor10000 sea false y la respuesta sea s
			
			System.out.println(" ");
			
			//Mostrar el sumatorio (el total de los numeros introducidos)
			System.out.println("o----------------------o-----o");
			System.out.printf ("|       Sumatorio      |%5d|\n", (sumatorio));
			
			//Mostrar cuantos numeros ha introducido el usuario
			System.out.println("o----------------------o-----o");
			System.out.printf ("| Numeros introducidos |%5d|\n", (contadorNumeros));
			
			//Mostrar la media
			System.out.println("o----------------------o-----o");
			System.out.printf ("|         Media        |%5d|\n", (sumatorio/contadorNumeros));
			System.out.println("o----------------------o-----o");
			
		//Fin
		
	}
}

