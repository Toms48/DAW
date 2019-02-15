package Tema7Parte2;

/*
 *   Nombre: t7Ej2P2
 *
 *   Comentario:	Escribe un programa que pida 20 números enteros.
 *   				Estos números se deben introducir en un array de 4 filas por 5 columnas.
 *   				El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara.
 *   				La suma total debe aparecer en la esquina inferior derecha.
 *
 *   Análisis:
 *
 *       Entradas: 20 ints
 *
 *       Salidas: Por pantalla
 *
 * */

//PG
	//Inicio
		//Pedir 20 numeros y cargarlos en el array
		//Mostrar la tabla con los sumatorios
	//Fin

import java.util.Scanner;

public class t7Ej2P2 {
	public static void main(String[] args){
		
		//Declaracion de variables
		int num = 0;
		int sumatorioH = 0;
		int sumatorioV = 0;
		
		int sumatorioTotal = 0;
		
		int[][] arrayBi = new int[4][5];
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Pedir 20 numeros y cargarlos en el array
			for(int i=0; i<=3; i++){
				for(int j=0; j<=4; j++){
					System.out.print("Introduzca el numero para la posicion (" +i +"," +j +"): ");
					num = teclado.nextInt();
					arrayBi[i][j] = num;
				}
			}
		
			System.out.println(" ");
			
			//Mostrar la tabla con los sumatorios
			for(int i=0; i<=3; i++){
				for(int j=0; j<=4; j++){
					System.out.print(arrayBi[i][j] +" ");
					sumatorioH = sumatorioH+arrayBi[i][j];
				}
				System.out.print(sumatorioH);
				System.out.println(); //Salto de linea
				sumatorioTotal = sumatorioTotal+sumatorioH;
				sumatorioH = 0;
			}
		
			for(int i=0; i<=4; i++){
				for(int j=0; j<=3; j++){
					//System.out.print((arrayBi[j][i]+arrayBi[j][i]+arrayBi[j][i]+arrayBi[j][i]) +" ");
					sumatorioV = sumatorioV+arrayBi[j][i];
				}
				System.out.print(sumatorioV +" ");
				sumatorioTotal = sumatorioTotal+sumatorioV;
				sumatorioV = 0;
			}
		
			System.out.print(sumatorioTotal);
		
		//Fin
		
	}
}
