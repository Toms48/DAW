/*
 * Nombre: t5Ej16
 * 
 * Comentario: Escribe un programa que diga si un número introducido por teclado es o no primo.
 * 				Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * 
 * Análisis
 * 
 * 		Entradas: int para el numero introducido
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Incio
		//Leer el numero del usuario
		//Comprobar si es primo
		//Si es primo
			//Mostrar mensaje de primo
		//Sino
			//Mostrar mensaje de no primo
		//Fin_Si
	//Fin

import java.util.Scanner;

public class t5Ej16 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int numero = 0;
		int contadorDivisibles = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Incio
			//Leer el numero del usuario
			System.out.print("Por favor introduzca un numero para saber si es primo: ");
			numero = teclado.nextInt();
			
			//Comprobar si es primo
			for(int i=1; i<=numero; i++){
				if(numero%i == 0){
					contadorDivisibles++;
				}
				
			}
			
			//Si es divisible por dos numeros
			if(contadorDivisibles == 2){
				//Mostrar mensaje de primo
				System.out.println(" ");
				System.out.println("Su numero es primo");
			}
			else{
				//Mostrar mensaje de no primo
				System.out.println(" ");
				System.out.println("Su numero no es primo");
			}//Fin_Si
		//Fin
		
	}
}

