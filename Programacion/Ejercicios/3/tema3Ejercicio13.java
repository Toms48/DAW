/*
 * Nombre: tema3Ejercicio13
 * 
 * Comentario: Realiza un programa que calcule la nota que hace falta sacar en el segundo
				examen de la asignatura Programación para obtener la media deseada. Hay
				que tener en cuenta que la nota del primer examen cuenta el 40% y la del
				segundo examen un 60%
 * 
 * Análisis: 
 * 		- Entradas: 
 * 				- double para la primera nota
 * 				- double para la media que quiero tener
 * 		- Salidas: por pantalla
 */
 
//PG
//Inicio
	//Preguntar y leer la nota del primer examen
	//Preguntar y leer la media que se desea tener
	//Calcular la nota del segundo examen para obtener esa media
	//Mostrar la segunda nota necesaria
//Fin

import java.util.Scanner;

public class tema3Ejercicio13 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		double notaExamen1 = 0.0;
		double notaMedia = 0.0;
		
		double notaExamen2 = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar y leer la nota del primer examen
			System.out.print("Introduzca la nota de su primer examen: ");
			notaExamen1 = teclado.nextDouble();
			
			//Preguntar y leer la media que se desea tener
			System.out.print("Qué nota desea tener de media? Nota media: ");
			notaMedia = teclado.nextDouble();
			
			//Calcular la nota del segundo examen para obtener esa media
			notaExamen2 = (notaMedia) - (double)((notaExamen1*40)/100);
			
			//Mostrar la segunda nota necesaria
			System.out.println("Necesita un " +notaExamen2 +" para tener de nota media un " +notaMedia);
		//Fin
		
	}
}

