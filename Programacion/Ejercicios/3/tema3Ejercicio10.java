/*
 * Nombre: tema3Ejercicio10
 * 
 * Comentario: Realiza un conversor de Mb a Kb
 * 
 */

import java.util.Scanner;

public class tema3Ejercicio10 {
	
	public static void main (String[] args) {
		
		//Variable
		double cantidadMb = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca los Mb: ");
		cantidadMb = teclado.nextDouble();
		
		System.out.println(" ");

		System.out.println(cantidadMb +"Mb son " +cantidadMb*1024 +"Kb");
		
	}
}
