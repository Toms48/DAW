package Boletin1;/*
 *   Nombre: Boletin1.t8Ej4
 *
 *   Comentario:	Mostrar un parrafo de varias lineas y pedir una palabra, mostrar todas
 *   				las posiciones en las que aparece dicha palabra.

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
		//Preguntar y leer palabra
		//Imprimir la posicion de la palabra cada vez que sale en el texto
	//Fin
*/

import java.util.Scanner;

public class t8Ej4 {
	public static void main(String[] args){
	
		//Declaración de variables
		String palabra = new String();
		int posicion = 0;
		//String parrafo2 = "Hola es hola es";
		String parrafo = 	"Nintendogs es un videojuego para Nintendo DS desarrollado por Shigeru Miyamoto, cuyo objetivo es cuidar a un perro a lo largo de su vida.\n" +
							"\n" +
							"Un juego que deja en el pasado las mascotas virtuales como el Tamagotchi,\n" +
							"evolucionando en términos de interacción entre el jugador y el personaje virtual, llegando a convertirse en un simulador.\n" +
							"\n" +
							"Entre sus diversas opciones, está la de interactuar con los cachorros virtuales por medio de\n" +
							"la pantalla táctil y el micrófono con los que cuenta el sistema de Nintendo.\n" +
							"\n" +
							"Inicialmente estaba previsto que el nombre del videojuego fuese Puppy Times en Estados Unidos,\n" +
							"pero finalmente los creadores se decidieron por dejar el nombre japonés Nintendogs, también para occidente.\n" +
							"\n" +
							"Existen cinco versiones del juego, cada una de las cuales cuenta con seis razas diferentes (cinco en la versión japonesa).\n" +
							"\n" +
							"En abril de 2004 llegaron las primeras tres a Japón, mientras que fue el 22 de agosto de 2005, a América.\n" +
							"En Europa su salida tuvo lugar el 7 de octubre de 2005.";
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			System.out.println(parrafo);
			//Preguntar y leer palabra
			System.out.println(" ");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println(" ");
			System.out.print("Introduzca una palabra: ");
			palabra = teclado.nextLine();
			
			palabra = palabra.toLowerCase();
			parrafo = parrafo.toLowerCase();
			
			//Imprimir la posicion de la palabra cada vez que sale en el texto
			for(posicion=0; posicion<=parrafo.length(); posicion=posicion+palabra.length()){
				if(parrafo.indexOf(palabra,posicion) != -1){
					posicion = parrafo.indexOf(palabra,posicion);
					System.out.println(posicion);
				}
			}
		
		//Fin
		
	}
}
