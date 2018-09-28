/*
 * Nombre: tema3Ejercicio3
 * 
 * Comentario: Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
				convertir debe ser introducida por teclado.
 * 
 * Análisis:
 * 		- Entradas: un double para la cantidad de pesetas a convertir
 * 		- Salidas:  imprime por pantalla
 */
 
  //PG
	//Inicio
		//Preguntar cantidad de pesetas para convertir
		//Leer pesetas
		//Convertir pesetas a euros
		//Mostrar por pantalla la cantidad de euros
	//Fin

import java.util.Scanner;
import java.text.DecimalFormat;

public class tema3Ejercicio3 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		double euroConstante = 1.0;
		double pesetaConstante = 166.0;
		
		double euro = 0.0;
		double peseta = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		
		
		//Inicio
			//Preguntar cantidad de pesetas para convertir
			System.out.print("Introduzca la cantidad de pesetas a convertir: ");
			
			//Leer pesetas
			peseta = teclado.nextDouble();
			
			//Convertir pesetas a euros
			euro = ((peseta*euroConstante)/pesetaConstante);
			
			//Mostrar por pantalla la cantidad de euros
			System.out.println(peseta +" peseta/s es en euro/s: " + euro);
			
		//Fin
		
	}
}

