/*
 * Nombre: tema3Ejercicio8
 * 
 * Comentario: Escribe un programa que calcule el salario semanal de un empleado en base
				a las horas trabajadas, a razón de 12 euros la hora.
 * 
 * Análisis: 
 * 		- Entradas: un int para las horas trabajadas
 * 		- Salidas: por pantalla
 */

//PG
//Inicio
	//Preguntar las horas trabajadas a la semana
	//Leer las horas trabajadas
	//Calcular salario semanal
	//Mostrar por pantalla el salario semanal
//Fin

import java.util.Scanner;

public class tema3Ejercicio8 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int horasSemanales = 0;
		
		int salarioSemanal = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar las horas trabajadas a la semana
			System.out.print("Introduzca las horas de trabajo semanales: ");
			
			//Leer las horas trabajadas
			horasSemanales = teclado.nextInt();
			
			//Calcular salario semanal
			salarioSemanal = horasSemanales*12;
			
			//Mostrar por pantalla el salario semanal
			System.out.println("Su salario semanal por " +horasSemanales +"h a la semana y 12 euros la hora es de: " +salarioSemanal);
			
		//Fin
		
	}
}

