/*
 * Nombre: tema4Ejercicio5
 * 
 * Comentario: Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0)
 * 
 * Análisis:
 * 		Entradas: 
 * 		Salidas: Por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer variables
		Calcular incognita x
		Mostrar resultado de la ecuación
	Fin
*/

import java.util.Scanner;

public class tema4Ejercicio5 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int a = 0;
		int b = 0;
		
		double x = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer variables
			System.out.print("Introduzca el valor de la variable a: ");
			a = teclado.nextInt();
			
			System.out.print("Introduzca el valor de la variable b: ");
			b = teclado.nextInt();
			
			//Calcular incognita x
			x = (double)(-b)/(double)(a);
			
			//Mostrar resultado de la ecuación
			System.out.println("");
			
			System.out.println("Ecuacion ---> " +a +"x" +" + " +b +" = " +0);
			System.out.println("Solucion ---> x = -" +b +"/" +a +" = " +x);
			
			System.out.println("");
			
		//Fin
		
	}
}

