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
		//Para i=1 mientras i<=5 aumentando 1
				//Mostrar columnas
		//Fin_Para
	//Fin

import java.util.Scanner;
import java.util.Formatter;

public class t5Ej11 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int numero = 0;
		int aux = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer numero
			System.out.print("Introduzca un numero: ");
			numero = teclado.nextInt();
			
			System.out.println(" ");
			System.out.println("o----------o----------o----------o");
			System.out.println("|  Número  | Cuadrado |   Cubo   |");
			System.out.println("o----------o----------o----------o");
			
			aux = numero;
			
			//Para i=0 mientras i<5 aumentando 1
			for(int i=1; i<=5; i++){
				//Mostrar numero, cuadrado y cubo
				numero = aux+i;
				
				System.out.printf("|%10d|%10d|%10d|\n", (numero),(numero*numero),(numero*numero*numero));
			}//Fin_Para
			
			System.out.println("o----------o----------o----------o");
			
		//Fin
		
	}
}

//Para j=0 mientras j<3 aumentando 1
				/*for(j=0; j<3; j++){
					//Mostrar columnas
					
				}*///Fin_Para

