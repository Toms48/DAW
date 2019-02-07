/*
 *   Nombre: Boletin2.t8Ej10
 *
 *   Comentario:	Escribir un programa que lea por teclado un nombre (con sus apellidos ) y escriba en pantalla las iniciales de dicho nombre.
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
		//Imprimir solo las iniciales del nombre
	//Fin
*/

package Boletin2;

import java.util.Scanner;

public class t8Ej10 {
    public static void main(String[] args){

        //Declaración de variables
        int contadorDePalabras = 0;

        String nombre = new String();

        String[] arrayNombre;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Leer String
            System.out.print("Introduzca un nombre: ");
            nombre = teclado.nextLine();

            //Imprimir solo las iniciales del nombre
            do{
                System.out.println(nombre.charAt(0));

               if(nombre.indexOf(" ") != -1){
                    nombre = nombre.replace(nombre.substring(0,nombre.indexOf(" ")+1),"");
               }
            }
            while(nombre.indexOf(" ") != -1);

            System.out.println(nombre.charAt(0));

            /*nombre = " " +nombre;

            while(nombre.indexOf(" ") != -1){
                System.out.println(nombre.charAt(1));

                nombre = nombre.trim();

                if(nombre.indexOf(" ") != -1){
                    nombre = nombre.replace(nombre.substring(0,nombre.indexOf(" ")),"");
                }
            }*/
        //Fin

    }
}
