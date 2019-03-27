/*
 *   Nombre:	MainAgenda
 *
 *   Comentario:    Crea un menú con opciones por consola para probar todas las funcionalidades.
 *
 *   Análisis:
 *
 *       Entradas: Un int para la opcion del menu
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: La opción del menu tiene que ser entre 0 y
 *
 * */

/*

//PG
	//Inicio
		//Hacer
			//mostrarMenu, leer y validar opcion
			//Segun opcion del menu
			
			//Fin_Segun
		//Mientras la opcion del menu no sea salir (0)
	//Fin

*/

package BoletinExtra.Ej3.Main;

import BoletinExtra.Ej3.Clases.Agenda;
import BoletinExtra.Ej3.Clases.Contacto;

import java.util.Scanner;

public class MainAgenda {
	
	public static void mostrarMenu(){
		System.out.println("1. Añadir contacto");
		System.out.println("2. Eliminar contacto");
		System.out.println("3. Mostar lista de contactos");
		System.out.println("4. Existe un contacto?");
		System.out.println("5. Buscar contacto");
		System.out.println("6. Agenda llena?");
		System.out.println("7. Huecos libres en la agenda");
		System.out.println("0. Salir");
		System.out.print  ("Introduzca una opcion (0-7): ");
	}
	
	public static void main(String[] args){
		
		//Declaraciones de variables
		int opcionMenu = 0;
		
		String nombre = "";
		int telefono = 0;
		
		//Inicializaciones
		Scanner tecladoS = new Scanner(System.in);
		Scanner tecladoN = new Scanner(System.in);
		
		Contacto[] arrayContactos = new Contacto[5];
		
		Agenda agenda = new Agenda(arrayContactos);
		
		for(int i=0; i<=agenda.getArrayContacto().length-1; i++){
			agenda[i] = new Contacto();
		}
		
		//Inicio
		//Hacer
		do {
			//mostrarMenu, leer y validar opcion
			do{
				mostrarMenu();
				opcionMenu = tecladoN.nextInt();
			}
			while(opcionMenu<0 || opcionMenu>7);
			
			System.out.println();
			
			//Segun opcion del menu
			switch(opcionMenu){
				case 1:
					System.out.print("Introduzca el nombre del contacto: ");
					nombre = tecladoS.nextLine();
					
					System.out.print("Introduzca el numero del contacto: ");
					telefono = tecladoN.nextInt();
					
					agenda.aniadirContacto(new Contacto(nombre, telefono));
					break;
					
				case 2:
					break;
					
				case 3:
					agenda.listarContactos();
					break;
				
				case 4:
					break;
				
				case 5:
					break;
				
				case 6:
					break;
				
				case 7:
					break;
			}
			//Fin_Segun
		}
		while(opcionMenu != 0);	//Mientras la opcion del menu no sea salir (0)
		//Fin
	
	}
}
