/* Nombre: T6Ej3
 * 
 * Comentario:  Igual que el ejercicio anterior pero con la baraja española.
 * 				Se utilizará la baraja de 40 cartas: 2,3,4,5,6,7,sota,caballo,rey y as.
 * 
 * Análisis:
 * 		Entra:  No tiene
 * 
 * 		Salida: Pinta por pantalla
 * 
 * 
 */

//PG
	//Inicio
		//Generar palo de la carta aleatoriamente
		//Generar numero de la carta aleatoriamente
		//Segun el palo
			//case 1
			//case 2
			//case 3
			//case 4
		//Fin_Segun
		//Segun el numero
			//case 1
			//case 13
		//Fin_Segun
		//Mostrar carta
	//Fin

import java.lang.Math;

public class T6Ej3 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int palo = 0;
		char cPalo = ' ';
		
		int numero = 0;
		String sNumero = " ";
		
		//Inicializaciones
		
		//Inicio
			//Generar palo de la carta aleatoriamente
			palo = (int)(Math.random()*4)+1;
			
			//Generar numero de la carta aleatoriamente
			numero = (int)(Math.random()*10)+1;
			
			//Segun el palo
			switch(palo){
				case 1:
					cPalo = 'C';
				break;
				
				case 2:
					cPalo = 'O';
				break;
				
				case 3:
					cPalo = 'B';
				break;
				
				case 4:
					cPalo = 'E';
				break;
			}//Fin_Segun
			
			//Segun el numero
			switch(numero){
				case 1:
					sNumero = "As";
				break;
				
				case 2:
					sNumero = "2";
				break;
				
				case 3:
					sNumero = "3";
				break;
				
				case 4:
					sNumero = "4";
				break;
				
				case 5:
					sNumero = "5";
				break;
				
				case 6:
					sNumero = "6";
				break;
				
				case 7:
					sNumero = "7";
				break;
				
				case 8:
					sNumero = "S";
				break;
				
				case 9:
					sNumero = "C";
				break;
				
				case 10:
					sNumero = "R";
				break;
			}//Fin_Segun

			//Mostrar carta
			System.out.println("  +-------+");
			System.out.printf ("  |%-7s|\n", (sNumero));
			System.out.println("  |       |");
			System.out.println("  |   " +cPalo +"   |");
			System.out.println("  |       |");
			System.out.printf ("  |%7s|\n", (sNumero));
			System.out.println("  +-------+");
			
		//Fin
		
	}
}

