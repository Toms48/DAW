/*
 * Nombre: t5Ej14
 * 
 * Comentario: Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
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
		//Calcular y mostrar potencia
	//Fin

import java.util.Scanner;
import java.lang.Math;

public class t5Ej14 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int base = 0;
		int exponente = 0;
		
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
			
			//Calcular y mostrar potencia
			System.out.println(base +"^" +exponente +"=" +Math.pow(base,exponente));
		//Fin
		
	}
}

