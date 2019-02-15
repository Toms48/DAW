package Boletin1;/*
 *   Nombre: Boletin1.t8Ej5V2
 *
 *   Comentario:	Mostrar un parrafo de varias lineas y pedir una palabra, mostrar el parrafo de nuevo sin esa la palabra.
 *   				Posteriormente completar el ejercicio haciendo que pida palabras que se irán eliminando
 *   				hasta que se introduzca la palabra salirsalir.
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- String para la palabra
 *
 *       Salidas: Por pantalla
 *
 * */

/*
//PG
	//Inicio
	    //Mostrar parrafo
	    //Preguntar y validar palabra
		//Mientras la palabra se distinta de salir
			//Mostrar parrafo sin la palabra
			//Preguntar y validar palabra (actualizacion de la variable de control del bucle)
		//Fin_Mientras
	//Fin
*/

import java.util.Scanner;

public class t8Ej5V2 {
    public static void main(String[] args){

        //Declaraciones de variables
        String parteParrafo = new String();
        String palabra = new String();
        /*String parrafo = "Rafa Nadal es un tenista. Es el mejor tenista español.";*/
        String parrafo = "Cuanto peor mejor para todos y cuanto peor para todos mejor, mejor para mí el suyo, beneficio político.\n"
                +"\n"
                +"Es el vecino el que elige al alcalde y es el alcalde el que quiere que sean los vecinos el alcalde.";

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Mostrar parrafo
            System.out.println(parrafo);

            //Preguntar y validar palabra
            System.out.println(" ");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println(" ");
            System.out.print("Introduzca una palabra: ");
            palabra = teclado.nextLine();

            //Mientras la palabra sea distinta de salir
            while(palabra.equals("salirsalir")==false){
                parrafo = parrafo.replaceAll(palabra, "");
                parrafo = parrafo.replaceAll("  ", " ");

                //Mostrar parrafo sin la palabra
                System.out.println(parrafo.trim());

                //Preguntar y validar palabra (actualizacion de la variable de control del bucle)
                System.out.println(" ");
                System.out.print("Introduzca una palabra: ");
                palabra = teclado.nextLine();
            } //Fin_Mientras
        //Fin
    }
}
