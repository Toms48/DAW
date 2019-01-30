/*
 *   Nombre: t8Ej5
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
		int posicionAnterior = 0;
		int posicion = 0;
		String palabra = new String();
		String parrafo = "Hola es un saludo en español";
		/*String parrafo = "Cuanto peor mejor para todos y cuanto peor para todos mejor, mejor para mí el suyo, beneficio político.\n"
						+"\n"
				        +"Es el vecino el que elige al alcalde y es el alcalde el que quiere que sean los vecinos el alcalde.";*/
		
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
		
				palabra = palabra.toLowerCase();
				
				//Mostrar parrafo sin la palabra
				for(posicion=0; posicion<=parrafo.length(); posicion=posicion+palabra.length()){
					if(parrafo.indexOf(palabra,posicion) != -1){
						
						System.out.println(parrafo.substring(posicion,palabra.length()).toLowerCase());

						if(palabra.equals(parrafo.substring(posicion,palabra.length()).toLowerCase())){
							posicionAnterior = posicion;
							posicion = parrafo.indexOf(palabra,posicion);
							parrafo = parrafo.substring(posicionAnterior,posicion-1) + parrafo.substring(posicion+palabra.length(),parrafo.length());
						}
					}
				}
				
				System.out.println(parrafo);
		
			//Mientras la palabra se distinta de salir
		//Fin
		
	}
}
