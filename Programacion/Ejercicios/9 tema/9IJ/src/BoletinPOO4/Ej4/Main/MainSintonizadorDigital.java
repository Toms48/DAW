/*
 *   Nombre:	MainSintonizadorDigital
 *
 *   Comentario:    Sintonizador de radio digital que salta de 0.5 en 0.5 desde 80 hasta 108 como minimo y maximo.
 *
 *   Análisis:
 *
 *       Entradas: Un int para la opcion del menu
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos:
 *
 * */

/*

//PG
	//Inicio
		//Hacer
			//Mostrar sintonizador
			//Mostrar menu
			//Leer y validar opcion del menu
			//Segun
				//Caso 1: Subir emisora
				//Caso 2: Bajar emisora
			//Fin_Segun
		//Mientras opcion no sea salir
	//Fin
	
*/

package BoletinPOO4.Ej4.Main;

import BoletinPOO4.Ej4.Clases.SintonizadorDigital;

import java.util.Scanner;

public class MainSintonizadorDigital {
	
	public static void mostrarMenu(){
		System.out.println("1. Subir");
		System.out.println("2. Bajar");
		System.out.println("0. Salir");
		System.out.print  ("Su opcion del menu es: ");
	}
	
	public static void main(String[] args){
		
		//Dreclaraciones de variables
		int opcionMenu = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		SintonizadorDigital sd = new SintonizadorDigital();
		
		//Inicio
			//Hacer
			do {
				//Mostrar sintonizador
				System.out.println(sd.toString());
				
				System.out.println();
				
				//Mostrar menu
				mostrarMenu();
				
				//Leer y validar opcion del menu
				//Segun
				//Caso 1: Subir emisora
				//Caso 2: Bajar emisora
				//Fin_Segun
			}
			while(opcionMenu != 0);	//Mientras opcion no sea salir
		//Fin
	
	}
}
