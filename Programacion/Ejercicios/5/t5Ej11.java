/*
 * Nombre: t5Ej11
 * 
 * Comentario: Escribe un programa que muestre en tres columnas, el cuadrado y el cubo
 * 				de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 * 
 * Análisis
 * 
 * 		Entradas: int para el numero
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer numero
		//Para i=0 mientras i<5 aumentando 1
			//Para j=0 mientras j<3 aumentando 1
				//Mostrar columnas
			//Fin_Para
		//Fin_Para
	//Fin

import java.util.Scanner;

public class t5Ej11 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int numero = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer numero
			System.out.print("Introduzca un numero: ");
			numero = teclado.nextInt();
			
			//Para i=0 mientras i<5 aumentando 1
				//Para j=0 mientras j<3 aumentando 1
					//Mostrar columnas
				//Fin_Para
			//Fin_Para
		//Fin
		
	}
}

