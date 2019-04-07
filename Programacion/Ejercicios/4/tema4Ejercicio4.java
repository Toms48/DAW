/*
 * Nombre: tema4Ejercicio4
 * 
 * Comentario: Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas extras.
 * 				Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta
 * 				que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
 * 				A partir de la hora 41, se pagan a 16 euros la hora.
 * 
 * Análisis:
 * 		Entradas: Un int para la cantidad de horas 
 * 		Salidas: Por pantalla
 */

//PG
/*
	Inicio
		Preguntar y leer numero de horas
		Si son menos o iguales que 40
			Calcular salario
			Mostrar salario
		Sino
			Si las horas son mayores o iguales que 41
				Calcular salario
				Mostrar salario
			Sino
				Mostrar mensaje de error
			Fin_Si
		Fin_Si
	Fin
*/

import java.util.Scanner;

public class tema4Ejercicio4 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int horasSemanales = 0;
		int salario = 0;
		
		//Inicializaciones
		Scanner teclado  = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer numero de horas
			System.out.print("Introduzca el numero de horas trabajadas a la semana: ");
			horasSemanales = teclado.nextInt();
			
			//Si las horas entan entre 1 y 40
			if(horasSemanales>=1 && horasSemanales<=40){
				//Calcular salario
				salario = horasSemanales*12;
				//Mostrar salario
				System.out.println("Su salario es: " +salario);
			}	
			//Sino
			else{
				//Si las horas son mayores o iguales que 41
				if(horasSemanales>=41){
					//Calcular salario
					salario = 480+((horasSemanales-40)*16);
					//Mostrar salario
					System.out.println("Su salario es: " +salario);
				}
				//Sino
				else{
					//Mostrar mensaje de error
					System.out.print("Introduzca un valor mayor que 0");
				}

				//Fin_Si
				
			} //Fin_Si
		//Fin
		
	}
}

