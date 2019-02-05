package Boletin1;/*
 *   Nombre: Boletin1.t8Ej8
 *
 *   Comentario:	Leer dos cadenas de textos y decir si son equivalentes (si son iguales ignorando las mayusculas y los espacios del principio y del final).
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Dos Strings
 *
 *       Salidas: Por pantalla
 *
 * */

/*
//PG
	//Inicio
        //Preguntar y leer primera cadena
        //Preguntar y leer segunda cadena
        //Si son iguales
            //Mostrar mensajes de iguales
        //Sino
            //Mostrar mensaje de no iguales
        //Fin_Si
	//Fin
*/

import java.util.Scanner;

public class t8Ej8 {
    public static void main(String[] args){

        //Declaraciones de variables
        String cadena1 = new String();
        String cadena2 = new String();

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Preguntar y leer primera cadena
            System.out.print("Introduzca su primera cadena por favor: ");
            cadena1 = teclado.nextLine();

            //Preguntar y leer segunda cadena
            System.out.print("Introduzca su segunda cadena por favor: ");
            cadena2 = teclado.nextLine();

            //Si son iguales
            if(cadena1.trim().equalsIgnoreCase(cadena2.trim())) {
                //Mostrar mensajes de iguales
                System.out.println(" ");
                System.out.println("Las dos cadenas son iguales");
            }
            else {
                //Mostrar mensaje de no iguales
                System.out.println(" ");
                System.out.println("Las cadenas son diferentes");
            }//Fin_Si
        //Fin

    }
}
