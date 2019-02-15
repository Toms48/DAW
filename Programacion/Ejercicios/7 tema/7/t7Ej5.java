/*
 * Nombre: t7Ej5
 * 
 * Comentario:  Escribe un programa que pida 10 números por teclado y
 * 				que luego muestre los números introducidos junto con las palabras "máximo" y "mínimo" al lado del máximo y del mínimo respectivamente.
 * 
 * Análisis:
 * 
 * 		Entradas: 10 int para los 10 valores del array
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: No tiene
 */

//PG
	//Inicio
		//Para contador igual a 0, mientras contador sea menor o igual que 9, aumentar contador
			//Leer y numero
		//Fin_Para
		//Mostrar numeros y decir quien es el mayor y quien el menor
	//Fin

import java.util.Scanner;

public class t7Ej5 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int min = 2147483647; //maximo valor de int
		int max = -2147483647; //minimo valor de int
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		int[] array = new int[10];
		
		//Inicio
			//Para contador igual a 0, mientras contador sea menor o igual que 9, aumentar contador
			for(int i=0; i<=9; i++){
				//Leer y numero
				System.out.print("Introduzca un numero para el elemento " +(i+1) +" del array: ");
				array[i] = teclado.nextInt();
				
				if(array[i]<min){
					System.out.println("antiguo minimo: " +min);
					min = array[i];
					System.out.println("nuevo minimo: " +min);
				}
	
				if(array[i]>max){
					System.out.println("antiguo maximo: " +max);
					max = array[i];
					System.out.println("antiguo maximo: " +max);
				}
	
			}//Fin_Para
			
			//Mostrar numeros y decir quien es el mayor y quien el menor
			for(int i=0; i<=9; i++){
				
				if(array[i]==min || array[i]==max){
					if(array[i]==min){
					System.out.println(array[i] +" minimo");
					}
					
					if(array[i]==max){
						System.out.println(array[i] +" maximo");
					}
				}
				else{
					System.out.println(array[i]);
				}
			}
			
		//Fin
		
	}
}

