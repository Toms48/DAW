/*
 * Nombre: tema4Ejercicio19
 * 
 * Comentario: Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo.
 * 				Se permiten números de hasta 5 dígitos.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- String para el numero pedido al el usuario
 * 
 * 		Salidas: Por pantalla
 * 
 * Requisitos: El numero no puede tener más de 5 cifras
 * 
 */

//PG
	//Inicio
		//Preguntar y leer numero
		
		//Si el numero es negativo
			//Pasarlo a positivo
		//Fin_Si
		
		//Si el numero tiene entre 1 y 5 cifras
			//Mostrar cantidad de cifras
		//Sino
			//Mostrar mensaje de error
		//Fin_Si
		
	//Fin

import java.util.Scanner;

public class tema4Ejercicio19 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int numero = 0;
		String sNumero = "";
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer numero
			System.out.print("Introduzca un numero de hasta 5 cifras: ");
			numero = teclado.nextInt();
			
			//Si el numero es negativo
			if(numero<0){
				//Pasarlo a positivo
				numero = numero*-1;
			}//Fin_Si
			
			sNumero = Integer.toString(numero);
			
			//Si el numero tiene entre 1 y 5 cifras
			if(sNumero.length()>=1 && sNumero.length()<=5){
				//Mostrar cantidad de cifras
				System.out.println("");
				System.out.println("Su numero tiene " +sNumero.length() +" cifras");
			}
			else{//Sino
				//Mostrar mensaje de error
				System.out.print(" ");
				System.out.print("Illo, ¿pos no te he dicho que tenía que ser un número con maximo 5 cifras?");
			}//Fin_Si
		//Fin
		
	}
}

