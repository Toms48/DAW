/* Nombre: T6Ej1
 * 
 * Comentario:  Escribe un programa que muestre la tirada de tres dados.
 * 				Se debe mostrar también la suma total (los puntos que suman entre los tres dados).
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
		//Para contador=1, mientras contador sea menor o igual que 3, aumenta contador
			//Generar aleatorio
			//Mostrar valor del dado
			//Sumar aleatorio al sumatorio
		//Fin_Para
		//Mostrar puntos
	//Fin

import java.lang.Math;

public class T6Ej1 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int dado = 0;
		int puntos = 0;
		
		//Inicializaciones
		
		//Inicio
			//Para contador=1, mientras contador sea menor o igual que 3, aumenta contador
			for(int i=1; i<=3; i++){
				//Generar aleatorio
				dado = (int)(Math.random()*6)+1;	//El 6 es el máximo valor que quiero que salga y el 1 es el mínimo
				
				//Mostrar valor del aleatorio
				//System.out.println(i +"º tirada: " +dado);
				
				System.out.println("\t" +i +"º tirada");
				switch(dado){
					case 1:
						System.out.println("\t+-------+");
						System.out.println("\t|       |");
						System.out.println("\t|   o   |");
						System.out.println("\t|       |");
						System.out.println("\t+-------+");
					break;
					
					case 2:
						System.out.println("\t+-------+");
						System.out.println("\t| o     |");
						System.out.println("\t|       |");
						System.out.println("\t|     o |");
						System.out.println("\t+-------+");
					break;
					
					case 3:
						System.out.println("\t+-------+");
						System.out.println("\t| o     |");
						System.out.println("\t|   o   |");
						System.out.println("\t|     o |");
						System.out.println("\t+-------+");
					break;
					
					case 4:
						System.out.println("\t+-------+");
						System.out.println("\t| o   o |");
						System.out.println("\t|       |");
						System.out.println("\t| o   o |");
						System.out.println("\t+-------+");
					break;
					
					case 5:
						System.out.println("\t+-------+");
						System.out.println("\t| o   o |");
						System.out.println("\t|   o   |");
						System.out.println("\t| o   o |");
						System.out.println("\t+-------+");
					break;
					
					case 6:
						System.out.println("\t+-------+");
						System.out.println("\t| o   o |");
						System.out.println("\t| o   o |");
						System.out.println("\t| o   o |");
						System.out.println("\t+-------+");
					break;
				}
				System.out.println(" ");
				
				//Sumar aleatorio al sumatorio
				puntos = puntos+dado;
			}//Fin_Para
			//Mostrar puntos
			System.out.println(" ");
			System.out.println("La suma de los puntos es: " +puntos);
		//Fin
		
	}
}

