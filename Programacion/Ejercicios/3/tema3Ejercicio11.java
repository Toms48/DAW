/*
 * Nombre: tema3Ejercicio11
 * 
 * Comentario: Realiza un conversor de Kb a Mb
 * 
 */

import java.util.Scanner;

public class tema3Ejercicio11 {
	
	public static void main (String[] args) {
		
		//Variable
		double cantidadKb = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca los Kb: ");
		cantidadKb = teclado.nextDouble();
		
		System.out.println(" ");

		System.out.println(cantidadKb +"Kb son " +(double)(cantidadKb/1024) +"Mb");
		
	}
}
