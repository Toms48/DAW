package Boletin1;/*
 *   Nombre: Boletin1.t8Ej7
 *
 *   Comentario:	Formatear un String leido por teclado, poner todo en minúscula y el primer caracter en mayuscula.
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
        //Preguntar y leer texto
        //Pasar texto a minuscula
        //Pasar solo la primera letra a mayuscula
        //Imprimir el texto cambiado
	//Fin
*/

import java.util.Scanner;

public class t8Ej7 {
    public static void main(String[] args){

        //Declaracion de variables
        String textoUsuario = new String();

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Preguntar y leer texto
            System.out.println("Introduzca su texto por favor: ");
            textoUsuario = teclado.nextLine();

            System.out.println(" ");

            //Pasar texto a minuscula
            textoUsuario = textoUsuario.toLowerCase();

            //Pasar solo la primera letra a mayuscula
            textoUsuario = textoUsuario.substring(0,1).toUpperCase() + textoUsuario.substring(1,textoUsuario.length());

            //Imprimir el texto cambiado
            System.out.println(textoUsuario);

        //Fin
    }
}
