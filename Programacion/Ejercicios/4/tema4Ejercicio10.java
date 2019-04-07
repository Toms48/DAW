/*
 * Nombre: tema4Ejercicio10
 * 
 * Comentario: Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- int para el dia de nacimiento
 * 			- int para el mes de nacimiento
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer el dia de nacimiento
		//Preguntar y leer el mes de nacimiento
		//Según el mes de nacimiento
			//caso 1
				//Si dia está entre 1 y 19
					//Mostrar Capricornio
				//Sino
					//Mostrar Acuario
				//Fin_Si
				
			//caso 2
				//Si dia está entre 1 y 18
					//Mostrar Acuarios
				//Sino
					//Mostrar Piscis
				//Fin_Si
			
			//caso 3
				//Si dia está entre 1 y 20
					//Mostrar Piscis
				//Sino
					//Mostrar Aries
				//Fin_Si
			
			//caso 4
				//Si dia está entre 1 y 20
					//Mostrar Aries
				//Sino
					//Mostrar Tauros
				//Fin_Si
			
			//caso 5
				//Si dia está entre 1 y 20
					//Mostrar Tauros
				//Sino
					//Mostrar Geminis
				//Fin_Si
			
			//caso 6
				//Si dia está entre 1 y 20
					//Mostrar Geminis
				//Sino
					//Mostrar Cancer
				//Fin_Si
				
			//caso 7
				//Si dia está entre 1 y 20
					//Mostrar Cancer
				//Sino
					//Mostrar Leo
				//Fin_Si
			
			//caso 8
				//Si dia está entre 1 y 21
						//Mostrar Leo
					//Sino
						//Mostrar Virgo
					//Fin_Si
			
			//caso 9
				//Si dia está entre 1 y 22
						//Mostrar Virgo
					//Sino
						//Mostrar Libra
					//Fin_Si
			
			//caso 10
				//Si dia está entre 1 y 22
					//Mostrar Libra
				//Sino
					//Mostrar Escorpio
				//Fin_Si
			
			//caso 11
				//Si dia está entre 1 y 22
					//Mostrar Escorpio
				//Sino
					//Mostrar Sagitario
				//Fin_Si
			
			//caso 12
				//Si dia está entre 1 y 20
					//Mostrar Sagitario
				//Sino
					//Mostrar Capricornio
				//Fin_Si
		//Fin_Según
	//Fin

import java.util.Scanner;

public class tema4Ejercicio10 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int diaNac = 0;
		int mesNac = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer el dia de nacimiento
			System.out.print("Introduzca su dia de nacimiento: ");
			diaNac = teclado.nextInt();

			//Preguntar y leer el mes de nacimiento
			System.out.print("Introduzca su mes de nacimiento: ");
			mesNac = teclado.nextInt();
			
			//Según el mes de nacimiento
			switch(mesNac){
				case 1:
					//Si dia está entre 1 y 19
					if(diaNac>=1 && diaNac<=19){
						//Mostrar Capricornio
						System.out.print("Usted es Capricornio");
					}
					else{ //Sino
						//Mostrar Acuario
						System.out.print("Usted es Acuario");
					}
					//Fin_Si
				break;
					
				case 2:
					//Si dia está entre 1 y 18
					if(diaNac>=1 && diaNac<=18){
						//Mostrar Acuarios
						System.out.print("Usted es Acuario");
					}
					else{ //Sino
						//Mostrar Piscis
						System.out.print("Usted es Piscis");
					}
					//Fin_Si
				break;
					
				case 3:
					//Si dia está entre 1 y 20
					if(diaNac>=1 && diaNac<=20){
						//Mostrar Piscis
						System.out.print("Usted es Piscis");
					}
					else{ //Sino
						//Mostrar Aries
						System.out.print("Usted es Aries");
					}
					//Fin_Si
				break;
				
				case 4:
					//Si dia está entre 1 y 20
					if(diaNac>=1 && diaNac<=20){
						//Mostrar Aries
						System.out.print("Usted es Aries");
					}
					else{ //Sino
						//Mostrar Tauros
						System.out.print("Usted es Tauros");
					}
					//Fin_Si
				break;
				
				case 5:
					//Si dia está entre 1 y 20
					if(diaNac>=1 && diaNac<=20){
						//Mostrar Tauros
						System.out.print("Usted es Tauros");
					}
					else{ //Sino
						//Mostrar Geminis
						System.out.print("Usted es Geminis");
					}
					//Fin_Si
				break;
				
				case 6:
					//Si dia está entre 1 y 20
					if(diaNac>=1 && diaNac<=20){
						//Mostrar Geminis
						System.out.print("Usted es Geminis");
					}
					else{ //Sino
						//Mostrar Cancer
						System.out.print("Usted es Cancer");
					}
					//Fin_Si
				break;
				
				case 7:
					//Si dia está entre 1 y 20
					if(diaNac>=1 && diaNac<=20){
						//Mostrar Cancer
						System.out.print("Usted es Cancer");
					}
					else{ //Sino
						//Mostrar Leo
						System.out.print("Usted es Leo");
					}
					//Fin_Si
				break;
					
				case 8:
					//Si dia está entre 1 y 21
					if(diaNac>=1 && diaNac<=21){
						//Mostrar Leo
						System.out.print("Usted es Leo");
					}
					else{ //Sino
						//Mostrar Virgo
						System.out.print("Usted es Virgo");
					}
					//Fin_Si
				break;
				
				case 9:
					//Si dia está entre 1 y 22
					if(diaNac>=1 && diaNac<=22){
						//Mostrar Virgo
						System.out.print("Usted es Virgo");
					}
					else{ //Sino
						//Mostrar Libra
						System.out.print("Usted es Libra");
					}
					//Fin_Si
				break;
				
				case 10:
					//Si dia está entre 1 y 22
					if(diaNac>=1 && diaNac<=22){
						//Mostrar Libra
						System.out.print("Usted es Libra");
					}
					else{ //Sino
						//Mostrar Escorpio
						System.out.print("Usted es Escorpio");
					}
					//Fin_Si
				break;
				
				case 11:
					//Si dia está entre 1 y 22
					if(diaNac>=1 && diaNac<=22){
						//Mostrar Escorpio
						System.out.print("Usted es Escorpio");
					}
					else{ //Sino
						//Mostrar Sagitario
						System.out.print("Usted es Sagitario");
					}
					//Fin_Si
				break;
				
				case 12:
					//Si dia está entre 1 y 20
					if(diaNac>=1 && diaNac<=20){
						//Mostrar Sagitario
						System.out.print("Usted es Sagitario");
					}
					else{ //Sino
						//Mostrar Capricornio
						System.out.print("Usted es Capricornio");
					}
					//Fin_Si
				break;
				
			}
			//Fin_Según
		//Fin
		
	}
}

