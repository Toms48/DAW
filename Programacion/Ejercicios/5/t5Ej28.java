/*
 * Nombre: t5Ej28
 * 
 * Comentario:  Escribe un programa que muestre por pantalla todos los números enteros positivos
 * 				menores a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- Un int para el numero del usuario
 * 			- Un int para el numero por el que dividir
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Leer y validar numero maximo
		//Leer numero por el que dividir
		//Mostrar los menores divisibles por otro numero del usuario
	//Fin

import java.util.Scanner;

public class t5Ej28 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int numeroMax = 0;
		int divisor = 0;
		
		
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer numero maximo
			do{
				System.out.print("Introduzca el numero maximo por favor: ");
				numeroMax = teclado.nextInt();
			}
			while(numeroMax<=0);
			
			//Leer numero por el que dividir
			System.out.print("Introduzca el numero por el que quiere que sean divisible: ");
			divisor = teclado.nextInt();
			
			//Mostrar los menores divisibles por otro numero del usuario
			System.out.println(" ");
			System.out.println("La lista de los numeros menores que " +numeroMax +" es: ");
			
			for(int i=numeroMax; i>=1; i--){
				if(i%divisor==0){
					System.out.println("\t- " +i);
				}
			}
			
			System.out.println(" ");
			
		//Fin
		
	}
}

