/*
 * Nombre: tema4Ejercicio13
 * 
 * Comentario:  Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * Análisis
 * 
 * 		Entradas: Tres int
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer tres numeros
		//Si a>b
			//Si a>c
				//Si b>c
					//Mostrar a-b-c
				//Sino
					//Mostrar a-c-b
				//Fin_Si
			//Sino
				//Mostrar c-a-b
			//Fin_Si
		//Sino
			//Si a>c
				//Mostrar b-a-c
			//Sino
				//Si b>c
					//Mostrar b-c-a
				//Sino
					//Mostrar c-b-a
				//Fin_Si
			//Fin_Si
		//Fin_Si
	//Fin

import java.util.Scanner;

public class tema4Ejercicio13 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		
		//Inicializaciones
		
		//Inicio
			//Preguntar y leer tres numeros
			//Si a>b
				//Si a>c
					//Si b>c
						//Mostrar a-b-c
					//Sino
						//Mostrar a-c-b
					//Fin_Si
				//Sino
					//Mostrar c-a-b
				//Fin_Si
			//Sino
				//Si a>c
					//Mostrar b-a-c
				//Sino
					//Si b>c
						//Mostrar b-c-a
					//Sino
						//Mostrar c-b-a
					//Fin_Si
				//Fin_Si
			//Fin_Si
		//Fin
		
	}
}

