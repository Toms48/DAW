/*
 * Nombre: ejerClase2
 * 
 * Comentario:  Se debe desarrollar un programa que pida el precio de un art�culo y la cantidad que compra el cliente.
 * 				Mostrar lo que debe abonar el comprador.
 * 
 * An�lisis: 
 * 		Entradas:
 * 			- Un double para el precio de un art�culo
 * 			- Un int para la cantidad de art�culos
 * 		Salidas: Por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer precio del art�culo
		Preguntar y leer cantidad de art�culos
		Mostrar el precio final
	Fin
*/

import java.util.Scanner;

public class ejerClase2 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		double precioUnitario = 0.0;
		int cantidadArticulos = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar y leer precio del art�culo
			System.out.print("Introduzca el precio del articulo: ");
			precioUnitario = teclado.nextDouble();
			
			//Preguntar y leer cantidad de art�culos
			System.out.print("Cuantos productos se lleva? ---> ");
			cantidadArticulos = teclado.nextInt();
			
			//Mostrar el precio final
			System.out.println("");
			System.out.println("El precio final es de " +precioUnitario*cantidadArticulos);
			System.out.println("");
		//Fin
		
	}
}

