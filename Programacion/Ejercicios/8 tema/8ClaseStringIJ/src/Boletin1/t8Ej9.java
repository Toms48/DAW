package Boletin1;
/*
 *   Nombre: Boletin1.t8Ej9
 *
 *   Comentario:	Leer una cadena de texto por teclado y pedir un numero entre 1 y 25 para encriptarla.
 *                  La encriptación consiste en cambiar cada caracter de la cadena por el correspondiente a su codigo ascii más el numero leido.
 *                  Mostrar la frase encriptada.
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un String
 *          - Un int
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: El numero para incriptar tiene que ser entre 1 y 25 (incluidos)
 *
 * */

/*
//PG
	//Inicio
        //Preguntar y leer texto
        //Preguntar, leer y validar numero para incriptar
        //Pasar el String a array de char
        //Recorrer array cambiando el caracter por su incriptacion y mostrar texto encriptado
	//Fin
*/

import java.util.Scanner;

public class t8Ej9 {
    public static void main(String[] args){

        //Declaraciones de variables
        String texto = new String();
        int incriptacion = 0;

        //Inicializaciones
        Scanner tecladoString = new Scanner(System.in);
        Scanner tecladoInt = new Scanner(System.in);

        //Inicio
            //Preguntar y leer texto
            System.out.print("Introduzca su texto a incriptar por favor: ");
            texto = tecladoString.nextLine();

            //Preguntar, leer validar numero para incriptar
            do{
                System.out.print("Introduzca el numero para incriptar (1-25 incluidos): ");
                incriptacion = tecladoInt.nextInt();
            }
            while(incriptacion<1 || incriptacion>25);

            //Pasar el String a array de char
            char[] arrayTexto = texto.toCharArray();

            //Recorrer array cambiando el caracter por su incriptacion y mostrar texto encriptado
            for(int i=0; i<=arrayTexto.length-1; i++){
                System.out.println(Character.codePointAt(arrayTexto,i)+incriptacion);
            }

        //Fin
    }
}
