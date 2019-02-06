/*
 *   Nombre: Boletin2.t8Ej9
 *
 *   Comentario:	Realizar un clase que lea una cadena de caracteres, la imprima invertida.
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
		//Pasar la frase a char array
		//Inprimir cadena al reves
	//Fin
*/

package Boletin2;

import java.util.Scanner;

public class t8Ej9 {
    public static void main(String[] args){

        //Declaracion de variables
        String frase = new String();

        char[] arrayChar;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Leer String
            System.out.print("Introduzca una frase: ");
            frase = teclado.nextLine();

            //Pasar la frase a char array
            arrayChar = frase.toCharArray();

            //Inprimir cadena al reves
            for(int i=arrayChar.length-1; i>=0; i--){
                System.out.print(arrayChar[i]);
            }

        //Fin
    }
}
