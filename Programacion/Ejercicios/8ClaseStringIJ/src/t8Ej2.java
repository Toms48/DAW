/*
 *   Nombre: t8Ej1
 *
 *   Comentario:	Crear un array con muchos nombres, pedir un texto como filtro y mostrar todos los
 *   				nombres que empiecen por ese texto.
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- String para el texto de filtro
 *
 *       Salidas: Por pantalla
 *
 * */

/*
//PG
	//Inicio
		//Preguntar y leer texto de filtro
		//Mostrar nombres que empiecen por ese filtro
	//Fin
 */

import java.util.Scanner;

public class t8Ej2 {
	public static void main(String[] args){
		
		//Declaracion de variables
		String filtro = new String();
		String[] arrayNombres = {"Tomas","Pepe","Paco","Adrian","Adriana"};
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer texto de filtro
			System.out.print("Introduzca un texto como filtro: ");
			filtro = teclado.nextLine();
			
			//Mostrar nombres que empiecen por ese filtro
			for(String nombre:arrayNombres){
				if(filtro.equals( nombre.substring(0,filtro.length())) ){
				
				}
			}
		
		//Fin
	
	}
}
