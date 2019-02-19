/*
 *   Nombre:	MainAnuncios
 *
 *   Comentario:    Lleva el registro de las marcas que quieren anuncios en el mundial de MotoGP.
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un int para la cantidad de marcas
 *       	- Varios String para las marcas (las que se han indicado antes)
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos:
 *
 * */

/*

//PG
	//Inicio
		//gestionarMarcas
		//Imprimir marcas por pantalla
		//Hacer
			//mostrarMenu y leer y validar opcion del menu
			//Segun opcion del menu
				//Caso 1: registroDeAnuncios
				//Caso 2: importeGastado
				//Caso 3: porcentajeDescuento
				//Caso 4: totalPagar
			//Fin_Segun
		//Mientras opcion del menu no sea 5
		
	//Fin

*/

package Main;

import Gestora.GestoraAnuncios;
import java.util.Scanner;

public class MainAnuncios {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int opcionMenu = 0;
		int contadorAnuncios = 0;
		int contadorSegundos = 0;
		int totalGastado = 0;
		int totalGastadoConDescuento = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Bienvenido al gestor de anuncios de MotoGP\n\n");
		
		//gestionarMarcas
		String[] arrayAnunciantes = GestoraAnuncios.gestionarMarcas();
		
		//Imprimir marcas por pantalla
		System.out.println("El listado de marcas es:");
		System.out.println();
		
		for(String marca : arrayAnunciantes){
			
			System.out.print("	");
			
			if(marca.length()<5){
				
				System.out.print(marca.toUpperCase());
				
				for(int i=1; i<=5-marca.length(); i++){
					System.out.print("-");
				}
				
			}
			else{
				System.out.print(marca.toUpperCase());
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Bienvenido al gestor de anuncios de MotoGP\n");
		
		//Hacer
		do{
			//mostrarMenu y leer y validar opcion
			do{
				GestoraAnuncios.mostrarMenu();
				opcionMenu = teclado.nextInt();
				
				if(opcionMenu>5 || opcionMenu<1){
					System.out.println();
					System.out.println("Por favor, introduzca un numero del menu, gracias.");
				}
				
			}
			while(opcionMenu<1 || opcionMenu>5);
			
			//Segun opcion del menu
			switch(opcionMenu) {
				case 1:	//registroDeAnuncios
					/*System.out.println("WIP");
					System.out.println("Estamos trabajando muy duro, gracias por su paciencia.");*/
					
					contadorAnuncios += GestoraAnuncios.registroDeMarcasCantidadAnuncios(arrayAnunciantes);
					
					contadorSegundos += GestoraAnuncios.registroDeMarcasCantidadSegundos();
					
					break;
				case 2:	//importeGastado
					/*System.out.println("WIP");
					System.out.println("Estamos trabajando muy duro, gracias por su paciencia.");*/
					
					totalGastado = GestoraAnuncios.importeGastado(contadorAnuncios, contadorSegundos);
					
					break;
				case 3:	//porcentajeDescuento
					/*System.out.println("WIP");
					System.out.println("Estamos trabajando muy duro, gracias por su paciencia.");*/
					
					System.out.println();
					System.out.print("Usted tiene un descuento del ");
					
					if(contadorAnuncios*contadorAnuncios == 1 || contadorAnuncios*contadorAnuncios > 90){
						System.out.print(" 1%");
					}
					else{
						System.out.print(contadorAnuncios*contadorAnuncios +"%");
					}
					
					System.out.println();
					
					totalGastadoConDescuento = GestoraAnuncios.porcentajeDescuento(contadorAnuncios,totalGastado);
					
					break;
				case 4:	//totalPagar
					/*System.out.println("WIP");
					System.out.println("Estamos trabajando muy duro, gracias por su paciencia.");*/
					
					System.out.println();
					System.out.println("Usted lleva gastado " +totalGastadoConDescuento);
					System.out.println();
					
					break;
			}//Fin_Segun
		}
		while(opcionMenu!=5); //Mientras opcion del menu no sea 5
		
		GestoraAnuncios.mostrarSaludo(totalGastadoConDescuento);
		
		System.out.println();
		
		System.out.println("Numero de anunicos: " +contadorAnuncios);
		System.out.println("Importe total: " +totalGastadoConDescuento);
		
		System.out.println("Aqui van las marcas en orden, pero no me ha dado tiempo de mostrarlas");
		
		if(contadorAnuncios*contadorAnuncios == 1 || contadorAnuncios*contadorAnuncios > 90){
			System.out.print("Porcentaje: 1%");
		}
		else{
			System.out.print("Porcentaje: " +contadorAnuncios*contadorAnuncios +"%");
		}
		
	}
}
