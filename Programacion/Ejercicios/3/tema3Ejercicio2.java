/*
 * Nombre: tema3Ejercicio2
 * 
 * Comentario: Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
				convertir debe ser introducida por teclado.
 * 
 * Análisis:
 * 		- Entradas: un double para la cantidad de euros a convertir
 * 		- Salidas:  imprime por pantalla
 */
 
 //PG
	//Inicio
		//Preguntar cantidad de euros para convertir
		//Leer euros
		//Convertir euros en pesetas
		//Mostrar por pantalla la cantidad de pesetas
	//Fin

import java.util.Scanner;

public class tema3Ejercicio2 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		double euroConstante = 1.0;
		double pesetaConstante = 166.0;
		
		double euro = 0.0;
		double peseta = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar cantidad de euros para convertir
			System.out.print("Introduzca la cantidad de euros a convertir: ");
			
			//Leer euros
			euro = teclado.nextDouble();
			
			//Convertir euros en pesetas
			peseta = ((euro*pesetaConstante)/euroConstante);
			
			//Mostrar por pantalla la cantidad de pesetas
			System.out.println(euro +" euro/s es en peseta/s: " +peseta );
		//Fin
	}
}

