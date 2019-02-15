package Boletin1;/*
 *   Nombre: Boletin1.t8Ej1
 *
 *   Comentario:	Leer dos cadenas de texto e imprimir la mayor de ellas y su longitud.
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- String para la primera cadena
 *       	- String para la segunda cadena
 *
 *       Salidas: Por pantalla
 *
 * */

/*
//PG
	//Inicio
		//Leer primera cadena
		//Leer segunda cadena
		//Si la longitud de la primera cadena es mayor
			//Imprimir primera cadena y su longitud
		//Sino
			//Si la longitud de la primera cadena es menor
				//Imprimir segunda cadena y su longitud
			//Sino
				//Imprimir mensaje de misma longitud
			//Fin_Si
		//Fin_Si
	//Fin
*/

import java.util.Scanner;

public class t8Ej1 {
	public static void main(String[] args){
		
		//Declaracion de variables
		String cadena1 = new String();
		String cadena2 = new String();
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer primera cadena
			System.out.print("Introduzca la primera cadena: " );
			cadena1 = teclado.nextLine();
		
			//Leer segunda cadena
			System.out.print("Introduzca la segunda cadena: " );
			cadena2 = teclado.nextLine();
			
			//Si la longitud de la primera cadena es mayor
			if(cadena1.length() > cadena2.length()) {
				//Imprimir primera cadena y su longitud
				System.out.println();
				System.out.println(cadena1);
				System.out.println(cadena1.length());
			}
			else {
				//Si la longitud de la primera cadena es menor
				if(cadena1.length() < cadena2.length()){
					//Imprimir segunda cadena y su longitud
					System.out.println();
					System.out.println(cadena2);
					System.out.println(cadena2.length());
				}
				else{
					//Imprimir mensaje de misma longitud
					System.out.println();
					System.out.println("La longitud de las cadenas es la misma.");
				}//Fin_Si
				
			}//Fin_Si
		//Fin
	
	}
}
