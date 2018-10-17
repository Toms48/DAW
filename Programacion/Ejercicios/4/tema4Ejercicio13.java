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
		int a = 0;
		int b = 0;
		int c = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar y leer tres numeros
			System.out.print("Introduzca un numero: ");
			a = teclado.nextInt();
			
			System.out.print("Introduzca otro numero: ");
			b = teclado.nextInt();
			
			System.out.print("Introduzca un ultimo numero: ");
			c = teclado.nextInt();
			
			//Si a>b
			if(a>b){
				//Si a>c
				if(a>c){
					//Si b>c
					if(b>c){
						//Mostrar a-b-c
						System.out.println("Los numeros en orden son: " +a +"-" +b +"-" +c);
					}
					else{
						//Mostrar a-c-b
						System.out.println("Los numeros en orden son: " +a +"-" +c +"-" +b);
					}//Fin_Si
				}	
				
				else{
					//Mostrar c-a-b
					System.out.println("Los numeros en orden son: " +c +"-" +a +"-" +b);
				}//Fin_Si
			}
			
			else{
				//Si a>c
				if(a>c){
					//Mostrar b-a-c
					System.out.println("Los numeros en orden son: " +b +"-" +a +"-" +c);
				}
				else{
					//Si b>c
					if(b>c){
						//Mostrar b-c-a
						System.out.println("Los numeros en orden son: " +b +"-" +c +"-" +a);
					}
					else{
						//Mostrar c-b-a
						System.out.println("Los numeros en orden son: " +c +"-" +b +"-" +a);
					}//Fin_Si
				}//Fin_Si
			}//Fin_Si
		//Fin
		
	}
}

