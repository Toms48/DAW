/*
 *   Nombre: t8Ej6
 *
 *   Comentario:	Mostrar un parrafo de varias lineas y pedir una palabra del mismo y otra por la que se quiera sustituir.
 *                  Imprimir el parrafo con la palabra cambiada.
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- String para la palabra del parrafo
 *          - String para la palabra que queremos poner en su lugar
 *
 *       Salidas: Por pantalla
 *
 * */

/*
//PG
	//Inicio
        //Mostrar parrafo
        //Preguntar y leer palabra del parrafo
        //Preguntar y leer palabra para sustituir
        //Imprimir parrafo con las palabras cambiadas
	//Fin
*/

import java.util.Scanner;

public class t8Ej6 {
    public static void main(String[] args){

        //Declaración de variables
        int posicion = 0;
        int posicionPrincipioPalabra = 0;
        int posicionFinalPalabra = 0;
        int codigoSiguienteFinal = 0;
        int posicionSiguienteFinal = 0;

        String palabraParrafo = new String();
        String palabraNueva = new String();

        String parrafo = "Rafa Nadal es un tenista. Es el mejor tenista español";
        /*String parrafo = "Cuanto peor mejor para todos y cuanto peor para todos mejor, mejor para mí el suyo, beneficio político.\n"
                        +"\n"
                        +"Es el vecino el que elige al alcalde y es el alcalde el que quiere que sean los vecinos el alcalde.";*/

        boolean existe = false;
        boolean finParrafo = false;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Mostrar parrafo
            String parteParrafo = new String();
            System.out.println(parrafo);

            System.out.println(" ");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println(" ");

            //Preguntar y leer palabra del parrafo
            System.out.print("Introduzca una palabra del parrafo: ");
            palabraParrafo = teclado.nextLine();

            //Preguntar y leer palabra para sustituir
            System.out.print("Introduzca una palabra nueva: ");
            palabraNueva = teclado.nextLine();

            //Imprimir parrafo con las palabras cambiadas
            System.out.println(parrafo.replaceAll(palabraParrafo,palabraNueva));

        //Fin
    }
}
