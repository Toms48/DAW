/*
 *   Nombre: Boletin2.t8Ej12
 *
 *   Comentario:	Escribir un programa que dado un texto de un telegrama que termina en punto:
 *   					a. contar la cantidad de palabras que posean más de 10 letras
 *   					b. reportar la cantidad de veces que aparece cada vocal
 *   					c. reportar el porcentaje de espacios en blanco.
 *
 *		   				Nota: Las palabras están separadas por un espacio en blanco.
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
		//Leer texto
		//contarPalabras
		//contarVocales
		//portentajeEspacios
	//Fin
*/

package Boletin2;

import java.util.Scanner;
import Gestoras.GestoraBoletin2;

public class t8Ej12 {
	public static void main(String[] args){
		
		//Declaracion de variables
		String texto = new String();
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
		//Leer texto
		System.out.print("Introduzca un texto: ");
		texto = teclado.nextLine().toLowerCase();
		
		if(texto.substring(texto.length()-1).equals(".") == false){
			texto = texto +".";
		}
		
		System.out.println(texto);
		
		//contarPalabras
		System.out.println("Cantidad de palabras con más de 10 letras: " +GestoraBoletin2.contadorPalabras(texto,10));
		
		System.out.println();
		
		//contarVocales
		GestoraBoletin2.contarVocales(texto);
		
		System.out.println();
		
		//portentajeEspacios
		System.out.println("Porcentaje de espacios: " +GestoraBoletin2.porcentajeEspacios(texto) +"%");
		
		//Fin
	
	}
}
