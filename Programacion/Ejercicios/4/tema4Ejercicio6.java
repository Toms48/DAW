/*
 * Nombre: tema4Ejercicio6
 * 
 * Comentario:  Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h
 * 				Aplica la fórmula t =√(2h/g)
 * 				Siendo g = 9.81
 * 
 * Análisis: 
 * 		Entradas: double para la altura
 * 		Salidas: por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer altura (h)
		Calcular el tiempo (t)
		Mostrar tiempo
	Fin
*/

import java.util.Scanner;
import java.lang.Math;

public class tema4Ejercicio6 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		double h = 0.0;
		
		double t = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer altura (h)
			System.out.print("Introduzca la altura: ");
			h = teclado.nextDouble();
			
			//Calcular el tiempo (t)
			t = Math.sqrt((2*h)/9.41);
			
			//Mostrar tiempo
			System.out.println("");
			System.out.println("t = " +t);
			System.out.println("");
			
		//Fin
		
	}
}

