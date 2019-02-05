package Boletin1;/*
 *   Nombre: Boletin1.t8Ej3
 *
 *   Comentario:	Completar el ejercicio anterior añadiendo otro filtro con la terminación del nombre.
 *   				Si se introduce el texto vacío ignorar el filtro.
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- String para el texto de filtro por delante
 *       	- String para el texto de filtro por detrás
 *
 *       Salidas: Por pantalla
 *
 * */

//PG
	//Inicio
		//Preguntar y leer texto de filtro de delante
		//Preguntar y leer texto de filtro de detrás
		//Si en el filtro de detras se introduce una cadena vacía
			//Mostrar nombres que empiecen por ese filtro
		//Sino
			//Mostrar nombres que empiecen y acaben por esos filtros
		//Fin_Si
	//Fin

import java.util.Scanner;

public class t8Ej3 {
	public static void main(String[] args){
		
		//Declaracion de variables
		String filtroDelante = new String();
		String filtroDetras = new String();
		String[] arrayNombres = {"tomas","paco","pedro","adrian","adriana"};
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer texto de filtro de delante
			System.out.print("Introduzca un texto como filtro de delante: ");
			filtroDelante = teclado.nextLine();
			
			System.out.println("");
			
			//Preguntar y leer texto de filtro de detrás
			System.out.print("Introduzca un texto como filtro de detras: ");
			filtroDetras = teclado.nextLine();
			
			filtroDelante = filtroDelante.toLowerCase();
			filtroDetras = filtroDetras.toLowerCase();
			
			//Si en el filtro de detras se introduce una cadena vacía
			if(filtroDetras == "") {
				//Mostrar nombres que empiecen por el filtro de delante
				System.out.println("");
				System.out.println("=-=-=-= Nombres que empiezan por " + filtroDelante + " =-=-=-=");
				
				for (String nombre : arrayNombres) {
					if (nombre.length() >= filtroDelante.length()) {
						if (filtroDelante.equals(nombre.substring(0, filtroDelante.length()))) {
							System.out.println(nombre);
						}
					}
				}
			}
			else {
				//Mostrar nombres que empiecen y acaben por esos filtros
				System.out.println("");
				System.out.println("=-=-=-= Nombres que empiezan por " + filtroDelante + " y acaban por " +filtroDetras +" =-=-=-=");
				
				for (String nombre : arrayNombres) {
					if (nombre.length() >= filtroDelante.length()) {
						if (filtroDelante.equals(nombre.substring(0, filtroDelante.length())) && filtroDetras.equals(nombre.substring(nombre.length()-filtroDetras.length()))) {
							System.out.println(nombre);
						}
					}
				}
			}//Fin_Si
		//Fin
		
	}
}
