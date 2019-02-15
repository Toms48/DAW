/*
 *   Nombre: Boletin2.t8Ej2
 *
 *   Comentario:	Cambiar todas las vocales de la frase
 *   					“Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar”
 *   				por otra vocal pedida por teclado.
 *   Análisis:
 *
 *       Entradas:
 *       	- Un char
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: El char introducido solo puede ser una vocal
 *
 * */

/*
//PG
	//Inicio
        //Leer y validar nueva vocal
        //Cambiar todas las vocales por la nueva vocal
        //Mostrar texto cambiado
	//Fin
*/

package Boletin2;

import java.util.Scanner;

public class t8Ej2 {
	public static void main(String[] args){
		
		//Declaración de variables
		String texto = "Tengo una hormiguita en la patita, que me esta haciendo cosquillitas y no me puedo aguantar";
		String nuevaVocal = new String();
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			System.out.println(texto);
			System.out.println();
			
			//Leer y validar nueva vocal
			do{
				System.out.print("Introduzca una vocal nueva: ");
				nuevaVocal = teclado.next().toLowerCase();
			}
			while(	nuevaVocal.equals("a") == false
				&&	nuevaVocal.equals("e") == false
				&&	nuevaVocal.equals("i") == false
				&&	nuevaVocal.equals("o") == false
				&&	nuevaVocal.equals("u") == false);
		
			//Cambiar todas las vocales por la nueva vocal
			texto = texto.replaceAll("a" , nuevaVocal);
			texto = texto.replaceAll("e", nuevaVocal);
			texto = texto.replaceAll("i", nuevaVocal);
			texto = texto.replaceAll("o", nuevaVocal);
			texto = texto.replaceAll("u", nuevaVocal);
		
			//Mostrar texto cambiado
			System.out.println();
			System.out.println(texto);
		
		//Fin
	}
}
