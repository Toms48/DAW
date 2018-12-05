package Tema7Parte2;

/*
 *   Nombre: t7Ej1P2
 *
 *   Comentario:	Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los valores según la siguiente tabla.
 *   				Muestra el contenido de todos los elementos del array dispuestos en forma de tabla
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
		//Mostrar array bidimensional
	//Fin

public class t7Ej1P2 {
	public static void main(String[] args){
		
		//Declaracion de varialbes
		int[][] arrayBidimensional = new int[3][6];
		
		arrayBidimensional[0][0] = 0;
		arrayBidimensional[0][1] = 30;
		arrayBidimensional[0][2] = 2;
		arrayBidimensional[0][5] = 5;
		arrayBidimensional[1][0] = 75;
		arrayBidimensional[1][4] = 0;
		arrayBidimensional[2][2] = -2;
		arrayBidimensional[2][3] = 9;
		arrayBidimensional[2][5] = 11;
		
		//Inicializaciones
		
		//Inicio
			//Mostrar array bidimensional
		
			System.out.println("o----o----o----o----o----o----o");
		
			for(int i=0; i<=2; i++){
				
				System.out.print("|");
				
				for(int j=0; j<=5; j++){
					System.out.printf(" %2d |", arrayBidimensional[i][j]);
				}
				System.out.println("");
				System.out.println("o----o----o----o----o----o----o");
			}
		//Fin
		
	}
}
