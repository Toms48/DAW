/*
 *   Nombre: Boletin2.t8Ej1
 *
 *   Comentario:	Imprimir carácter por carácter un string dado, cada uno en una línea distinta.
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un String
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: NO tiene
 *
 * */

/*
//PG
	//Inicio
        //Preguntar y leer texto
        //Pasar el String a array de char
        //Recorrer array mostrando letra por letra en cada linea
	//Fin
*/

package Boletin2;

import java.util.Scanner;

public class t8Ej1 {
	public static void main(String[] args){
	
		//Declaraciones de variables
		String texto = new String();
		char[] arrayChar;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer texto
			System.out.print("Introduzca un texto: ");
			texto = teclado.nextLine();
		
			System.out.println();
			
			//Pasar el String a array de char
			arrayChar = texto.toCharArray();
		
			//Recorrer array mostrando letra por letra en cada linea
			for(char letra : arrayChar){
				System.out.println(letra);
			}
		
		//Fin
	
	}
}
