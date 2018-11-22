/* Nombre: T6Ej2
 *
 * Comentario:  Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa.
 * 				Esta baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles.
 * 				Cada palo está formado por 13 cartas, de las cuales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A.
 * 				Para convertir un número en una cadena de caracteres podemos usar String.valueOf(n).
 *
 * Análisis:
 * 		Entra:  No tiene
 *
 * 		Salida: Pinta por pantalla
 *
 *
 */

//PG
//Inicio
//Generar palo de la carta aleatoriamente
//Generar numero de la carta aleatoriamente
//Segun el palo
//case 1
//case 2
//case 3
//case 4
//Fin_Segun
//Segun el numero
//case 1
//case 13
//Fin_Segun
//Mostrar carta
//Fin

import java.lang.Math;

public class T6Ej2 {

    public static void main (String[] args) {

        //Declaraciones de variables
        int palo = 0;
        char cPalo = ' ';

        int numero = 0;
        String sNumero = " ";

        //Inicializaciones

        //Inicio
        //Generar palo de la carta aleatoriamente
        palo = (int)(Math.random()*4)+1;

        //Generar numero de la carta aleatoriamente
        numero = (int)(Math.random()*13)+1;

        //Segun el palo
        switch(palo){
            case 1:
                cPalo = '\u2665';
                break;

            case 2:
                cPalo = '\u2660';
                break;

            case 3:
                cPalo = '\u2666';
                break;

            case 4:
                cPalo = '\u2663';
                break;
        }//Fin_Segun

        //Segun el numero
        switch(numero){
            case 1:
                sNumero = "As";
                break;

            case 2:
                sNumero = "2";
                break;

            case 3:
                sNumero = "3";
                break;

            case 4:
                sNumero = "4";
                break;

            case 5:
                sNumero = "5";
                break;

            case 6:
                sNumero = "6";
                break;

            case 7:
                sNumero = "7";
                break;

            case 8:
                sNumero = "8";
                break;

            case 9:
                sNumero = "9";
                break;

            case 10:
                sNumero = "10";
                break;

            case 11:
                sNumero = "J";
                break;

            case 12:
                sNumero = "Q";
                break;

            case 13:
                sNumero = "K";
                break;
        }//Fin_Segun

        //Mostrar carta
        System.out.println(" ");

        System.out.println("  +-------+");
        System.out.printf ("  |%-7s|\n", (sNumero));
        System.out.println("  |       |");
        System.out.println("  |   " +cPalo +"   |");
        System.out.println("  |       |");
        System.out.printf ("  |%7s|\n", (sNumero));
        System.out.println("  +-------+");

        //Fin

    }
}
