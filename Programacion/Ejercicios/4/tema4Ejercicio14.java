/*
 * Nombre: tema4Ejercicio14
 * 
 * Comentario: Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- int para el número introducido por el usuario
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer número
		//Si el numero es par
			//Si el numero es divisible entre 5
				//Mostrar mensaje Divisible entre 5 y Par
			//Sino
				//Mostrar mensaje Par
			//Fin_Si
		//Sino
			//Si el numero es divisible entre 5
				//Mostrar mensaje divisible entre 5
			//Sino
				//Mostrar mensaje No divisible entre 5 y no par
		//Fin_Si
	//Fin

import java.util.Scanner;

public class tema4Ejercicio14 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int numero = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar y leer número
			System.out.print("Introduzca un numero por favor: ");
			numero = teclado.nextInt();
			
			//Si el numero es par
			if(numero%2 == 0){
				//Si el numero es divisible entre 5
				if((numero%10 == 0) || (numero%10 == 5)){
					//Mostrar mensaje Divisible entre 5 y Par
					System.out.println("Su numero es par y divisible entre 5");
				}
				else{
					//Mostrar mensaje Par
					System.out.println("Su numero es par");
				}//Fin_Si
			}
			else{
				//Si el numero es divisible entre 5
				if((numero%10 == 0) || (numero%10 == 5)){
					//Mostrar mensaje divisible entre 5
					System.out.println("Su numero es divisible entre 5");
				}
				else{
					//Mostrar mensaje No divisible entre 5 y no par
					System.out.println("Su numero ni es par ni divisible entre 5");
					
				}//Fin_Si	
			}//Fin_Si
		//Fin
	
	}
}

