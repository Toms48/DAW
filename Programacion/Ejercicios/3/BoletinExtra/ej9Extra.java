/*
 * Nombre: ej9Extra
 * 
 * Comentario: Escribir una aplicación que pida el año actual y el de nacimiento de un usuario.
 * 				Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.
 * 
 * Análisis:
 * 		Entradas: 
 * 			un int para el año actual 
 * 			un int para el año del nacimiento del usuario
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer año actual
		//Preguntar y leer año de nacimiento del usuario
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
		
		//Preguntar y leer año actual
		System.out.print("Introduzca el año actual: ");
		anioActual = teclado.nextInt();
		
		//Preguntar y leer año de nacimiento del usuario
		System.out.print("Introduzca su año de nacimiento: ");
		anioUsuario = teclado.nextInt();
		
		//Calcular y mostrar edad del usuario
		System.out.println("Su edad es: " +(anioActual-anioUsuario));
		
	}
}

