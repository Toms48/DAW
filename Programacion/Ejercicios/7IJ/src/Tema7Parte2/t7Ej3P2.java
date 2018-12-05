package Tema7Parte2;

/*
 *   Nombre: t7Ej3P2
 *
 *   Comentario:	Modifica el programa anterior de tal forma que los números que se introducen
 *   				en el array se generen de forma aleatoria (valores entre 100 y 999).
 *
 *   Análisis:
 *
 *       Entradas: No tiene
 *
 *       Salidas: Por pantalla
 *
 * */

//PG
	//Inicio
		//Generar 20 numeros aleatorios y cargarlos en el array
		//Mostrar la tabla con los sumatorios
	//Fin

import java.lang.Math;

public class t7Ej3P2 {
	public static void main(String[] args){
		
		//Declaracion de variables
		int sumatorioH = 0;
		int sumatorioV = 0;
		
		int sumatorioTotal = 0;
		
		int[][] arrayBi = new int[4][5];
		
		//Inicializaciones
		
		//Inicio
			//Generar 20 numeros aleatorios y cargarlos en el array
			for(int i=0; i<=3; i++){
				for(int j=0; j<=4; j++){
					arrayBi[i][j] = (int)(Math.random()*900)+100;
				}
			}
			
			System.out.println(" ");
			
			//Mostrar la tabla con los sumatorios
		
			System.out.println("o------o------o------o------o------o-------o");
		
			for(int i=0; i<=3; i++){
				
				System.out.print("|");
				
				for(int j=0; j<=4; j++){
					System.out.print("  " +arrayBi[i][j] +" |");
					sumatorioH = sumatorioH+arrayBi[i][j];
				}
				System.out.printf("  %4d |", sumatorioH);
				System.out.println(); //Salto de linea
				sumatorioTotal = sumatorioTotal+sumatorioH;
				sumatorioH = 0;
				
				System.out.println("o------o------o------o------o------o-------o");
				
			}
			
			
			
			for(int i=0; i<=4; i++){
				
				System.out.print("|");
				
				
				for(int j=0; j<=3; j++){
					//System.out.print((arrayBi[j][i]+arrayBi[j][i]+arrayBi[j][i]+arrayBi[j][i]) +" ");
					sumatorioV = sumatorioV+arrayBi[j][i];
				}
				System.out.printf(" %4d ", sumatorioV);
				sumatorioTotal = sumatorioTotal+sumatorioV;
				sumatorioV = 0;
				
			}
			
			System.out.printf("| %5d |\n", sumatorioTotal);
		
			System.out.println("o------o------o------o------o------o-------o");
		//Fin
		
	}
}
