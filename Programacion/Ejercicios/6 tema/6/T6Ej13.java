/*
 * Nombre: T6Ej13
 * 
 * Comentario:  Escribe un programa que simule la tirada de dos dados.
 * 				El programa deberá continuar hasta que en alguna tirada los dos dados tengan el mismo valor.
 * 
 * Análisis
 * 
 * 		Entradas: No tiene
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Hacer
			//Generar dado1
			//Generar dado2
			//Imprimir dados
		//Mientras que dado1 y dado2 sean distintos
	//Fin

import java.lang.Math;

public class T6Ej13 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int dado1 = 0;
		int dado2 = 0;
		
		//Inicializaciones
		
		//Inicio
			//Hacer
			do{
				//Generar dado1
				dado1 = (int)(Math.random()*6)+1;
				
				//Generar dado2
				dado2 = (int)(Math.random()*6)+1;
				
				//Imprimir dados
				System.out.println("Dado 1");
				switch(dado1){
					case 1:
						System.out.println("+-------+");
						System.out.println("|       |");
						System.out.println("|   o   |");
						System.out.println("|       |");
						System.out.println("+-------+");

					break;
					
					case 2:
						System.out.println("+-------+");
						System.out.println("| o     |");
						System.out.println("|       |");
						System.out.println("|     o |");
						System.out.println("+-------+");
					break;
					
					case 3:
						System.out.println("+-------+");
						System.out.println("| o     |");
						System.out.println("|   o   |");
						System.out.println("|     o |");
						System.out.println("+-------+");
					break;
					
					case 4:
						System.out.println("+-------+");
						System.out.println("| o   o |");
						System.out.println("|       |");
						System.out.println("| o   o |");
						System.out.println("+-------+");
					break;
					
					case 5:
						System.out.println("+-------+");
						System.out.println("| o   o |");
						System.out.println("|   o   |");
						System.out.println("| o   o |");
						System.out.println("+-------+");
					break;
					
					case 6:
						System.out.println("+-------+");
						System.out.println("| o   o |");
						System.out.println("| o   o |");
						System.out.println("| o   o |");
						System.out.println("+-------+");
					break;
				}
				
				System.out.println("Dado 2");
				switch(dado2){
					case 1:
						System.out.println("+-------+");
						System.out.println("|       |");
						System.out.println("|   o   |");
						System.out.println("|       |");
						System.out.println("+-------+");

					break;
					
					case 2:
						System.out.println("+-------+");
						System.out.println("| o     |");
						System.out.println("|       |");
						System.out.println("|     o |");
						System.out.println("+-------+");
					break;
					
					case 3:
						System.out.println("+-------+");
						System.out.println("| o     |");
						System.out.println("|   o   |");
						System.out.println("|     o |");
						System.out.println("+-------+");
					break;
					
					case 4:
						System.out.println("+-------+");
						System.out.println("| o   o |");
						System.out.println("|       |");
						System.out.println("| o   o |");
						System.out.println("+-------+");
					break;
					
					case 5:
						System.out.println("+-------+");
						System.out.println("| o   o |");
						System.out.println("|   o   |");
						System.out.println("| o   o |");
						System.out.println("+-------+");
					break;
					
					case 6:
						System.out.println("+-------+");
						System.out.println("| o   o |");
						System.out.println("| o   o |");
						System.out.println("| o   o |");
						System.out.println("+-------+");
					break;
				}
				
				System.out.println(" ");
				
			}
			while(dado1!=dado2); //Mientras que dado1 y dado2 sean distintos
		//Fin
		
	}
}

