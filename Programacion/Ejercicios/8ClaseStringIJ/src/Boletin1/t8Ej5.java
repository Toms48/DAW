package Boletin1;

/*
 *   Nombre: Boletin1.t8Ej5
 *
 *   Comentario:	Mostrar un parrafo de varias lineas y pedir una palabra, mostrar el parrafo de nuevo sin esa la palabra.
 *   				Posteriormente completar el ejercicio haciendo que pida palabras que se irán eliminando
 *   				hasta que se introduzca la palabra salir.
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
		//Hacer
			//Mostrar parrafo
			//Preguntar y validar palabra
			//Mostrar parrafo sin la palabra
		//Mientras la palabra se distinta de salir
	//Fin
*/

import java.util.Scanner;

public class t8Ej5 {
	public static void main(String[] args){

		//Declaraciones de variables
		int posicionPrincipioPalabra = 0;
		int posicionFinalPalabra = 0;
		int codigoSiguienteFinal = 0;
		int posicionSiguienteFinal = 0;

		int posicion = 0;

		String parteParrafo = new String();
		String palabra = new String();
		String parrafo = "Jesus sal sal.";
		//String parrafo = "Cuanto peor mejor para todos y cuanto peor para todos mejor, mejor para mí el suyo, beneficio político.\n"
						//+"\n"
				        //+"Es el vecino el que elige al alcalde y es el alcalde el que quiere que sean los vecinos el alcalde.";

		//Inicializaciones
		Scanner teclado = new Scanner(System.in);

		//Inicio
			//Hacer
				//Mostrar parrafo
				System.out.println(parrafo);

				//Preguntar y validar palabra
				System.out.println(" ");
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println(" ");
				System.out.print("Introduzca una palabra: ");
				palabra = teclado.nextLine();

				//palabra = palabra.toLowerCase();

				//Mostrar parrafo sin la palabra
				do{
					while(parrafo.indexOf(palabra) != -1){

						/*if(parrafo.substring(posicionPrincipioPalabra,posicionFinalPalabra).equalsIgnoreCase(palabra)){
							parrafo = parrafo.substring(0,posicionPrincipioPalabra-1) + parrafo.substring(posicionPrincipioPalabra,posicionFinalPalabra).toLowerCase() +parrafo.substring(posicionSiguienteFinal);
							System out.println(parrafo);
						}*/

						posicionPrincipioPalabra = parrafo.indexOf(palabra);
						//System.out.println(posicionPrincipioPalabra);

						posicionFinalPalabra = posicionPrincipioPalabra+palabra.length()-1;
						//System.out.println(posicionFinalPalabra);

						codigoSiguienteFinal = parrafo.codePointAt(posicionFinalPalabra+1);
						//System.out.println(codigoSiguienteFinal);

						if( (codigoSiguienteFinal<=97 || codigoSiguienteFinal>=122) && (codigoSiguienteFinal<=65 || codigoSiguienteFinal>=90)){

							posicion = parrafo.indexOf(palabra);

							if(posicion==0){
								parteParrafo = parteParrafo + parrafo.substring(0,posicion);
								//System.out.println(parteParrafo);
							}
							else{
								parteParrafo = parteParrafo + parrafo.substring(0,posicion-1);
								//System.out.println(parteParrafo);
							}

							parrafo = parrafo.substring(posicion+palabra.length(),parrafo.length());
							//System.out.println(parrafo);
						}
						else{
							posicion = parrafo.indexOf(palabra);

							parteParrafo = parteParrafo + parrafo.substring(0,posicion+palabra.length());
							//System.out.println(parteParrafo);

							parrafo = parrafo.substring(posicion+palabra.length(),parrafo.length());
							//System.out.println(parrafo);
						}
					}

					parrafo = parteParrafo + parrafo;
					parteParrafo = "";

					System.out.println(parrafo.trim());

					System.out.println(" ");
					System.out.print("Introduzca una palabra: ");
					palabra = teclado.nextLine();

					//palabra = palabra.toLowerCase();
				}
				while(palabra.equals("salirsalir")==false); //Mientras la palabra sea distinta de salirsalir (por si sale un salir en la frase)
		//Fin

	}
}
