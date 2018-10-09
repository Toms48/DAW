/*
 * Nombre: tema4Ejercicio2
 * 
 * Comentario: Realiza un programa que pida una hora por teclado y que muestre luego
 * 				buenos días, buenas tardes o buenas noches según la hora.
 * 				Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente.
 * 				Sólo se tienen en cuenta las horas, los minutos no se deben introducir por teclado
 * 
 * Análisis: 
 * 		Entradas: un int entre 0 y 23 para la hora
 * 		Salidas: Por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer la hora
		Si la hora está entre las 6 y las 12
			Mostrar buenos dias
		Sino
			Si la hora está entre las 13 y las 20
				Mostrar buenas tardes
			Sino
				Mostrar buenas noches
			Fin_Si
		Fin_Si	
	Fin
*/

import java.util.Scanner;

public class tema4Ejercicio2 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int hora = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer la hora
			System.out.print("Introduzca una hora: ");
			hora = teclado.nextInt();
			
			//Si la hora está entre las 6 y las 12
			if(hora>=6 && hora<=12){
				//Mostrar buenos dias
				System.out.println("¡Buenos días!");
			}
			else{
				//Si la hora está entre las 13 y las 20
				if(hora>=13 && hora<= 20){
					//Mostrar buenas tardes
					System.out.println("¡Buenas tardes!");
				}
				else{
					if((hora>=21 && hora<= 23) || (hora>=1 && hora<=5)){
						//Mostrar buenas noches
						System.out.println("¡Buenas noches!");
					}
					else{
						System.out.println("Introduzca un valor entre 0 y 23 por favor");
					}
					
				}	
				//Fin_Si
			}
			//Fin_Si	
		//Fin
		
	}
}

