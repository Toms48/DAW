/*
 * Nombre: ej9Extra
 * 
 * Comentario: Escribir una aplicaci�n que pida el a�o actual y el de nacimiento de un usuario.
 * 				Debe calcular su edad, suponiendo que en el a�o en curso el usuario ya ha cumplido a�os.
 * 
 * An�lisis:
 * 		Entradas: 
 * 			un int para el a�o actual 
 * 			un int para el a�o del nacimiento del usuario
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer a�o actual
		//Preguntar y leer a�o de nacimiento del usuario
		//Calcular edad del usuario
		//Mostrar edad del usuario
	//Fin

import java.util.Scanner;

public class ej9Extra {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int anioActual = 0;
		int anioUsuario = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Preguntar y leer a�o actual
		System.out.print("Introduzca el a�o actual: ");
		anioActual = teclado.nextInt();
		
		//Preguntar y leer a�o de nacimiento del usuario
		System.out.print("Introduzca su a�o de nacimiento: ");
		anioUsuario = teclado.nextInt();
		
		//Calcular y mostrar edad del usuario
		System.out.println("Su edad es: " +(anioActual-anioUsuario));
		
	}
}

