/* Nombre: ejercicio3
 *
 * Comentario:  Lo que pone en el examen.
 *
 * Análisis:
 * 		Entradas:  9 ints
 *
 * 		Salidas: Pinta por pantalla
 *
 * 		Requisitos:
 * 			- Solo admite valores enteros positivos hasta el 333 (Este requisito lo he puesto yo como añadido, para que sea mas complejo el codigo)
 *
 */

//PG
/*
	//Inicio
		//Cargar matriz de 3x3
		//Calcular suma de la horizontal 1
		//Calcular suma de la horizontal 2
		//Calcular suma de la horizontal 3
		
		//Calcular suma de la vertical 1
		//Calcular suma de la vertical 2
		//Calcular suma de la vertical 3
		
		//Calcular suma de la diagonal 1
		//Calcular suma de la diagonal 2
		
		//Si todas las sumas dan el mismo numero
			//La matriz es magica
		//Sino
			//La matriz no es magica
		//Fin_Si
		
		//Mostrar matriz con sus sumas
	//Fin
*/

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args){
		
		//Declaracion de variables
		int[][] matriz = new int[3][3];
		
		int horizontal1 = 0;
		int horizontal2 = 0;
		int horizontal3 = 0;
		
		int vertical1 = 0;
		int vertical2 = 0;
		int vertical3 = 0;
		
		int diagonal1 = 0;
		int diagonal2 = 0;
		
		boolean matrizMagica = true;
		
		//Inicializacion
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
		//Cargar matriz de 3x3
		for(int i=0; i<=2; i++){
			for(int j=0; j<=2; j++){
				do {
					System.out.print("Elemento [" + i + "][" + j + "]: ");
					matriz[i][j] = teclado.nextInt();
				}
				while(matriz[i][j]<0 || matriz[i][j]>333);
			}
			System.out.println(" ");
		}
		
		//Calcular sumas de las horizontales
		horizontal1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
		horizontal2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
		
		if(horizontal1!=horizontal2 && matrizMagica==true){
			matrizMagica = false;
		}
		
		horizontal3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
		
		if(horizontal2!=horizontal3 && matrizMagica==true){
			matrizMagica = false;
		}
		
		//Calcular sumas de las verticales
		vertical1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
		if(horizontal3!=vertical1 && matrizMagica==true){
			matrizMagica = false;
		}
		
		vertical2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
		if(vertical1!=vertical2 && matrizMagica==true){
			matrizMagica = false;
		}
		
		vertical3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
		if(vertical2!=vertical3 && matrizMagica==true){
			matrizMagica = false;
		}
		
		//Calcular sumas de las diagonales
		diagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
		if(vertical3!=diagonal1 && matrizMagica==true){
			matrizMagica = false;
		}
		
		diagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
		if(diagonal1!=diagonal2 && matrizMagica==true){
			matrizMagica = false;
		}
		
		//Si todas las sumas dan el mismo numero
		if(matrizMagica == true) {
			//La matriz es magica
			System.out.println("La matriz es magica");
		}
		else {
			//La matriz no es magica
			System.out.println("La matriz no es magica");
		}//Fin_Si
		
		//Mostrar matriz con sus sumas
		System.out.printf ("                     %3d \n", (diagonal2));
		System.out.println("                     /");
		System.out.println("                    /");
		System.out.println("o-----o-----o-----o");
		System.out.println("|     |     |     |");
		System.out.printf ("| %3d | %3d | %3d | ---> " +horizontal1 +"\n", (matriz[0][0]),(matriz[0][1]),(matriz[0][2]));
		System.out.println("|     |     |     |");
		System.out.println("o-----o-----o-----o");
		System.out.println("|     |     |     |");
		System.out.printf ("| %3d | %3d | %3d | ---> " +horizontal2 +"\n", (matriz[1][0]),(matriz[1][1]),(matriz[1][2]));
		System.out.println("|     |     |     |");
		System.out.println("o-----o-----o-----o");
		System.out.println("|     |     |     |");
		System.out.printf ("| %3d | %3d | %3d | ---> " +horizontal3 +"\n", (matriz[2][0]),(matriz[2][1]),(matriz[2][2]));
		System.out.println("|     |     |     |");
		System.out.println("o-----o-----o-----o");
		System.out.println("   |     |     |    \\");
		System.out.println("   V     V     V     \\");
		System.out.printf ("  %3d   %3d   %3d    %3d \n", (vertical1),(vertical2),(vertical3),(diagonal1));
		
		//Fin
		
	}
}
