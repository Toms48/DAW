/*
 *   Nombre: Boletin2.t8Ej5
 *
 *   Comentario:	Intercambiar un string dado, hasta volverlo a su forma original:
 *
 *   					Hola, ahol, laho, olah, hola (stop).
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
		//Leer un String
		//Hacer
			//Coger última letra
			//Pegar ultima letra al principio de la cadena (sin que esté esa misma letra al final)
		//Mientras la cadena original y la que está rotando sean diferentes
	//Fin
*/

package Boletin2;

import java.util.Scanner;

public class t8Ej5 {
	public static void main(String[] args){
		
		//Declaración de variables
		String texto = new String();
		String textoRotando = new String();
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer un String
			System.out.print("Escriba una frase: ");
			texto = teclado.nextLine();
		
			textoRotando = texto;
			
			//Hacer
			do {
				//Rotar ultima letra de la frase
				textoRotando = textoRotando.substring(texto.length()-1) + textoRotando.substring(0,textoRotando.length()-1);
				System.out.println(textoRotando);
				
			}
			while(texto.equals(textoRotando) == false); //Mientras la cadena original y la que está rotando sean diferentes
		//Fin
	
	}
}
