package Tema7Parte1;/*
 *   Nombre: Tema7Parte1.t7Ej11
 *
 *   Comentario:    Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 *
 *   				A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello una tabla.
 *
 *   				Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el resto de números
 *   				(los que no son primos) de tal forma que no se pierda ninguno.
 *
 *   				Al final se debe mostrar el array resultante.
 *
 *   Análisis:
 *
 *       Entradas: 10 ints
 *
 *       Salidas: Por pantalla
 *
 * */

//PG
	//Inicio
		//Leer y cargar numeros
		//Para contador=0, mientras contador sea menor o igual que 9, aumentar contador
			//Si hay dos numeros divisibles
				//Cargar array final
				//Aumentar contador de primos
			//Fin_Si
		//Fin_Para
		
		//Para contador=0, mientras contador sea menor o igual que 9, aumentar contador
			//Si no hay dos numeros divisibles
				//Cargar array final
				//Aumentar contador de no primos
			//Fin_Si
		//Fin_Para
		//Mostrar array final
	//Fin

import java.util.Scanner;

public class t7Ej11 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int[] arrayInicial = new int[10];
		int[] arrayFinal = new int[10];
		
		int contadorPrimos = 0;
		int contadorNoPrimos = 0;
		
		int divisible = 0;
		
		//Inicializacion
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y cargar numeros
			for(int i=0; i<=9; i++){
				System.out.print("Escriba el numero para la posicion " +(i+1) +" del array: ");
				arrayInicial[i] = teclado.nextInt();
			}
		
			System.out.println(" ");
			
			System.out.println("o---------------o");
			System.out.println("| Array Inicial |");
			System.out.println("o---------------o");
			for(int i=0; i<=9; i++){
				System.out.printf("Posicion %2d ---> "+arrayInicial[i] +"\n", (i+1));
			}
			
			//Para contador=0, mientras contador sea menor o igual que 9, aumentar contador
			for(int i=0; i<=9; i++) {
				
				for(int j=1; j<=arrayInicial[i]; j++){
					if(arrayInicial[i]%j == 0){
						divisible++;
					}
				}
				
				//Si hay dos numeros divisibles
				if(divisible == 2) {
					//Cargar array final
					arrayFinal[contadorPrimos] = arrayInicial[i];
					
					//Aumentar contador de primos
					contadorPrimos++;
				}//Fin_Si
				
				divisible = 0;
				
			}//Fin_Para
		
			contadorNoPrimos = contadorPrimos;
			
			//Para contador=0, mientras contador sea menor o igual que 9, aumentar contador
			for(int i=0; i<=9; i++) {
				
				for(int j=1; j<=arrayInicial[i]; j++){
					if(arrayInicial[i]%j == 0){
						divisible++;
					}
				}
				
				//Si no hay dos numeros divisibles
				if(divisible != 2) {
					//Cargar array final
					arrayFinal[contadorNoPrimos] = arrayInicial[i];
					
					//Aumentar contador de no primos
					contadorNoPrimos++;
				}//Fin_Si
				
				divisible = 0;
				
			}//Fin_Para
			
			System.out.println(" ");
		
		System.out.println("o---------------o");
		System.out.println("|  Array Final  |");
		System.out.println("o---------------o");
			//Mostrar array final
			for(int i=0; i<=9; i++){
				System.out.printf("Posicion %2d ---> " +arrayFinal[i] +"\n", (i+1));
				//System.out.printf("Posicion %2d ---> "+arrayInicial[i] +"\n", (i+1));
			}
		//Fin
	}
}
