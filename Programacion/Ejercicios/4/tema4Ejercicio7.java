/*
 * Nombre: tema4Ejercicio7
 * 
 * Comentario: Calcular la media de tres notas
 * 
 * Análisis:
 * 		Entradas: Tres double para las notas
 * 		Salidas: Por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer tres notas
		Calcular y mostrar media
	Fin
*/

import java.util.Scanner;

public class tema4Ejercicio7 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer tres notas
			System.out.print("Introduzca la primera nota: ");
			nota1 = teclado.nextDouble();
			
			System.out.print("Introduzca la segunda nota: ");
			nota2 = teclado.nextDouble();
			
			System.out.print("Introduzca la tercera nota: ");
			nota3 = teclado.nextDouble();
			
			//Calcular y mostrar media
			System.out.println("");
			System.out.println("La media de las tres notas es: " +((nota1+nota2+nota3)/3) );
			System.out.println("");
			
		//Fin
		
	}
}

