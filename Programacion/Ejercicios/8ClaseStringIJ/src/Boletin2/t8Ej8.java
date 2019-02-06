/*
 *   Nombre: Boletin2.t8Ej8
 *
 *   Comentario:	Leer un String por teclado e imprimir todos los números seguidos y sin espacios,
 *   				correspondientes al código ascii de cada uno de sus caracteres.
 *
 *   				Posteriormente calcular la frase original a partir de dichos números (usar un array).
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un String
 *
 *       Salidas: Por pantalla
 *
 * */

/*
//PG
	//Inicio
		//Leer String
		//Pasar String a un array de char
		//Imprimir el codigo ascii de cada char
		//Imprimir la letra de cada codigo ascii anterior
	//Fin
*/

package Boletin2;

import java.util.Scanner;

public class t8Ej8 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		String frase = new String();
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer String
			System.out.print("Introduzca una frase: ");
			frase = teclado.nextLine();
			
			//Pasar String a un array de char
			//arrayChar = frase.toCharArray();
		
			int[] codigosAscii = new int[frase.length()];
		
			//Imprimir el codigo ascii de cada char
			for(int i=0; i <= frase.length()-1; i++){
				
				codigosAscii[i] = frase.codePointAt(i);
				
				System.out.print(codigosAscii[i]);
			}
		
			System.out.println();
			System.out.println();

			//Imprimir la letra de cada codigo ascii anterior
			for(int i=0; i<=codigosAscii.length-1; i++){
				
				System.out.print(Character.toString((char)(codigosAscii[i])));
				
			}
			
		
		//Fin
	}
}
