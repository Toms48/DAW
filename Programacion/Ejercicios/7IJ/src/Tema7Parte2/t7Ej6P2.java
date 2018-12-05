package Tema7Parte2;

/*
 *   Nombre: t7Ej6P2
 *
 *   Comentario:	Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 *
 *   Análisis:
 *
 *       Entradas: No tiene
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos:
 *       	- Numeros aleatorios entre 0 y 1000 incluidos
 *       	- No se pueden repetir numeros
 *
 * */

import java.lang.Math;

public class t7Ej6P2 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int[][] arrayBi = new int[6][10];
		
		int[] numerosSinRepetir = new int[60];
		
		boolean repetido = false;
		
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
				int hola = 0;
				//Para contador2=0, mientras contador2 sea menor o igual que 9, aumentar contador2
				for(int j=0; j<=9; j++) {
					
					//Generar numero aleatorio
					for(int k=0; k<=59; k++){		//BREAKPOINT AQUÍ
						aleatorio = (int)(Math.random()*66);
						for(int l=0; l<=59 && repetido==false; l++){
							if(aleatorio==numerosSinRepetir[l]){
								repetido = true;
							}
						}
						if(repetido==false){
							numerosSinRepetir[k] = aleatorio;
						}
						else{
							k--;
						}
						repetido=false;
					}

					System.out.println(numerosSinRepetir[hola]);
					
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
					hola++;
				}//Fin_Para
				hola++;
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
