/*
 * Nombre: t5Ej15
 * 
 * Comentario: Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
 * 				saque por pantalla todas las potencias con base el numero dado y exponentes entre 1 y el exponente introducido.
 * 
 * 				No se deben utilizar funciones de exponenciación.
 * 
 * 				Por ejemplo, si introducimos el 2 y el 5, se deberán mostrar 2^1, 2^2, 2^3, 2^4 y 2^5.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- Un int para la base de la potencia
 * 			- Un int para el exponente de la potencia
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: El exponente no puede ser menor o igual que 0
 * 
 */

//PG
	//Inicio
		//Leer la base
		//Leer y validar el exponente
		//Calcular y mostrar potencias
	//Fin

import java.util.Scanner;
import java.lang.Math;

public class t5Ej15 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int base = 0;
		int exponente = 0;
		double rPotencia = 1.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer la base
			System.out.print("Introduzca la base de la potencia: ");
			base = teclado.nextInt();
			
			//Leer y validar el exponente
			do{
				System.out.print("Introduzca el exponente (positivo) de la potencia: ");
				exponente = teclado.nextInt();
			}
			while(exponente<=0);
			
			//Calcular y mostrar potencias
			for(int i=1; i<=exponente; i++){
					rPotencia = rPotencia*base;
					System.out.println(base +"^" +i +" = " +rPotencia);
			}
		//Fin
		
	}
}

