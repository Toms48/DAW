/*
 * Nombre: T6Ej7
 * 
 * Comentario:  Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos
 * 				y el pleno al quince (15 filas).
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
		//Para contador=1, mientras contador sea <= 4, aumentar contador
			//Generar apuesta
			//Mostrar equipos
		//Fin_Para
		
		//Para contador=1, mientras contador sea <= 4, aumentar contador
			//Generar apuesta
			//Mostrar equipos
		//Fin_Para
		
		//Para contador=1, mientras contador sea <= 3, aumentar contador
			//Generar apuesta
			//Mostrar equipos
		//Fin_Para
		
		//Para contador=1, mientras contador sea <= 3, aumentar contador
			//Generar apuesta
			//Mostrar equipos
		//Fin_Para
		
		//Pleno al 15
		//Generar apuesta
		
	//Fin

import java.lang.Math;

public class T6Ej7 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		char v1 = '1';
		char vX = 'X';
		char v2 = '2';
		
		int apuesta = 0;
		
		//Inicializaciones
		
		//Inicio
			System.out.println("                 o-------------o");
			System.out.println("                 | PRONOSTICOS |");
			System.out.println(" ----------------o-------------o");

			//Para contador=1, mientras contador sea <= 4, aumentar contador
			for(int i=1; i<=4; i++){
				//Generar apuesta
				apuesta = (int)(Math.random()*3);
				switch(apuesta){
					case 0:
						v1 = '#';
					break;
					
					case 1:
						vX = '#';
					break;
					
					case 2:
						v2 = '#';
					break;
				}
					
				//Mostrar equipos
				System.out.printf (" Pareja ..... %2d | ["+v1 +"] ["+vX +"] ["+v2 +"] |", (i));
				
				System.out.println(" ");
				
				//Reinicio la apuesta (Porque si ha salido la X, la columna de la X estará marcada todo el rato)
				v1 = '1';
				vX = 'X';
				v2 = '2';
								
			}//Fin_Para
			
			System.out.println(" ----------------o-------------o");
			
			//Para contador=1, mientras contador sea <= 4, aumentar contador
			for(int i=1; i<=4; i++){
				//Generar apuesta
				apuesta = (int)(Math.random()*3);
				switch(apuesta){
					case 0:
						v1 = '#';
					break;
					
					case 1:
						vX = '#';
					break;
					
					case 2:
						v2 = '#';
					break;
				}
				
				//Mostrar equipos
				System.out.printf (" Pareja ..... %2d | ["+v1 +"] ["+vX +"] ["+v2 +"] |", (i+4));
				
				System.out.println(" ");
				
				//Reinicio la apuesta
				v1 = '1';
				vX = 'X';
				v2 = '2';
				
			}//Fin_Para
			
			System.out.println(" ----------------o-------------o");
			
			//Para contador=1, mientras contador sea <= 3, aumentar contador
			for(int i=1; i<=3; i++){
				//Generar apuesta
				apuesta = (int)(Math.random()*3);
				switch(apuesta){
					case 0:
						v1 = '#';
					break;
					
					case 1:
						vX = '#';
					break;
					
					case 2:
						v2 = '#';
					break;
				}
				
				//Mostrar equipos
				System.out.printf (" Pareja ..... %2d | ["+v1 +"] ["+vX +"] ["+v2 +"] |", (i+8));
				
				System.out.println(" ");
				
				//Reinicio la apuesta
				v1 = '1';
				vX = 'X';
				v2 = '2';
				
			}//Fin_Para
			
			System.out.println(" ----------------o-------------o");
			
			//Para contador=1, mientras contador sea <= 3, aumentar contador
			for(int i=1; i<=3; i++){
				//Generar apuesta
				apuesta = (int)(Math.random()*3);
				switch(apuesta){
					case 0:
						v1 = '#';
					break;
					
					case 1:
						vX = '#';
					break;
					
					case 2:
						v2 = '#';
					break;
				}
				
				//Mostrar equipos
				System.out.printf (" Pareja ..... %2d | ["+v1 +"] ["+vX +"] ["+v2 +"] |", (i+11));
				
				System.out.println(" ");
				
				//Reinicio la apuesta
				v1 = '1';
				vX = 'X';
				v2 = '2';
				
			}//Fin_Para
			
			//Pleno al 15
			//Generar apuesta
			apuesta = (int)(Math.random()*3);
			switch(apuesta){
				case 0:
					v1 = '#';
				break;
				
				case 1:
					vX = '#';
				break;
				
				case 2:
					v2 = '#';
				break;
			}
			
			System.out.println(" ----------------o-------------o");
			System.out.println("     Pleno al 15 | ["+v1 +"] ["+vX +"] ["+v2 +"] |");
			System.out.println(" ----------------o-------------o");
			
			//Reinicio la apuesta
			v1 = '1';
			vX = 'X';
			v2 = '2';
			
		//Fin
		
	}
}

