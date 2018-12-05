package Tema7Parte2;

/*
 *   Nombre: t7Ej5P2
 *
 *   Comentario:	Realiza un programa que rellene un array de 6 filas por 10 columnas
 *   				con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 *
 *   				A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.
 *
 *   Análisis:
 *
 *       Entradas: No tiene
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: numeros aleatorios entre 0 y 1000 incluidos
 *
 * */

//PG
	//Inicio
		//Para contador=0, mientras contador sea menor o igual que 5, aumentar contador
			//Para contador2=0, mientras contador2 sea menor o igual que 9, aumentar contador2
				//Generar numero aleatorio
				//Cargar casilla contador contador2 con el numero aleatorio
				
				//Si numero aleatorio es menor que minimo
					//Cambiar coordenadas del minimo
				//Sino
					//Si numero aleatorio es mayor que maximo
						//Cambiar coordenadas del maximo
					//Fin_Si
				//Fin_Si

			//Fin_Para
		//Fin_Para
		
		//Para contador=0, mientras contador sea menor o igual que 5, aumentar contador
			//Para contador2=0, mientras contador2 sea menor o igual que 9, aumentar contador2
			
				//Si contador y contador2 son iguales que coordenadas de minimo
					//Mostrar minimo marcado
				//Sino
					//Si contador y contador2 son iguales que coordenadas de maximo
						//Mostrar maximo marcado
					//Sino
						//Mostrar numeros del array
					//Fin_Si
				//Fin_Si
				
			//Fin_Para
		//Fin_Para
	//Fin

import java.lang.Math;

public class t7Ej5P2 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int[][] arrayBi = new int[6][10];
		
		int aleatorio = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		int coor1MIN = 0;
		int coor2MIN = 0;
		
		int coor1MAX = 0;
		int coor2MAX = 0;
		
		//Inicializaciones
		
		//Inicio
			//Para contador=0, mientras contador sea menor o igual que 5, aumentar contador
			for(int i=0; i<=5; i++) {
				//Para contador2=0, mientras contador2 sea menor o igual que 9, aumentar contador2
				for(int j=0; j<=9; j++) {
					//Generar numero aleatorio
					aleatorio = (int)(Math.random()*1001);
					
					//Cargar casilla contador contador2 con el numero aleatorio
					arrayBi[i][j] = aleatorio;
					
					//Si numero aleatorio es menor que minimo
					if(aleatorio<min) {
						min = aleatorio;
						//Cambiar coordenadas del minimo
						coor1MIN = i;
						coor2MIN = j;
					}
					else{
						//Si numero aleatorio es mayor que maximo
						if(aleatorio>max) {
							max = aleatorio;
							//Cambiar coordenadas del maximo
							coor1MAX = i;
							coor2MAX = j;
						}//Fin_Si
					}//Fin_Si
					
				}//Fin_Para
			}//Fin_Para
			
			System.out.println("o--------o--------o--------o--------o--------o--------o--------o--------o--------o--------o");
		
			//Para contador=0, mientras contador sea menor o igual que 5, aumentar contador
			for(int i=0; i<=5; i++) {
				
				System.out.print("|");
				
				//Para contador2=0, mientras contador2 sea menor o igual que 9, aumentar contador2
				for(int j=0; j<=9; j++) {
					
					//Si contador y contador2 son iguales que coordenadas de minimo
					if(i==coor1MIN && j==coor2MIN) {
						//Mostrar minimo marcado
						System.out.printf(" -%4d- |", (arrayBi[i][j]) );
					}
					else {
						//Si contador y contador2 son iguales que coordenadas de maximo
						if(i==coor1MAX && j==coor2MAX) {
							//Mostrar maximo marcado
							System.out.printf(" +%4d+ |", (arrayBi[i][j]) );
						}
						else {
							//Mostrar numeros del array
							System.out.printf("  %4d  |", (arrayBi[i][j]) );
						}//Fin_Si
					}//Fin_Si
					
				}//Fin_Para
				
				System.out.println("");
				System.out.println("o--------o--------o--------o--------o--------o--------o--------o--------o--------o--------o");
				
			}//Fin_Para
		//Fin
		
	}
}
