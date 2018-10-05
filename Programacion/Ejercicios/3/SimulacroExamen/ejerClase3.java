/*
 * Nombre: ejerClase3
 * 
 * Comentario: Programa que lea por teclado el valor del radio de una circunferencia y calcula y muestra
				por pantalla la longitud y el área de la circunferencia = 2*PI*Radio, área de la
				circunferencia = PI*Radio²
 * 
 * Análisis: 
 * 		Entradas: double para el radio de la circunferencia
 * 		Salidas: por pantalla
 * 
 */
 
//PG
/*
	Inicio
		Preguntar y leer radio de la circunferencia
		Mostrar longitud de la circunferencia
		Mostrar area de la circunferencia
	Fin
*/

import java.util.Scanner;

public class ejerClase3 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		double radio = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer radio de la circunferencia
			System.out.print("Introduzca el radio de la circunferencia: ");
			radio = teclado.nextDouble();
			
			//Mostrar longitud de la circunferencia
			System.out.println("");
			System.out.println("La longitud de la circunferencia es: " +2*Math.PI*radio);
			System.out.println("");
			
			//Mostrar area de la circunferencia
			System.out.println("");
			System.out.println("El area de la circunferencia es: " +Math.PI*radio*radio);
			System.out.println("");
			
		//Fin
		
	}
}

