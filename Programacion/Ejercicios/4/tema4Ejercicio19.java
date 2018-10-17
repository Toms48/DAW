/*
 * Nombre: tema4Ejercicio19
 * 
 * Comentario: Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero entero que puede ser positivo o negativo.
 * 				Se permiten n�meros de hasta 5 d�gitos.
 * 
 * An�lisis
 * 
 * 		Entradas:
 * 			- String para el numero pedido al el usuario
 * 
 * 		Salidas: Por pantalla
 * 
 * Requisitos: El numero no puede tener m�s de 5 cifras
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
				System.out.print("Illo, �pos no te he dicho que ten�a que ser un n�mero con maximo 5 cifras?");
			}//Fin_Si
		//Fin
		
	}
}

