/*
 *   Nombre: t7Ej12
 *
 *   Comentario:    Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 *
 *   				A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
 *
 *   				Seguidamente el programa pedirá dos posiciones a las que llamaremos "inicial" y "final".
 *
 *   				Se debe comprobar que inicial es menor que final y que ambos números están entre 0 y 9.
 *
 *   				El programa deberá colocar el número de la posición inicial en la posición final,
 *   				rotando el resto de números para que no se pierda ninguno.
 *
 *   				Al final se debe mostrar el array resultante.
 *
 *   Análisis:
 *
 *       Entradas: 10 ints
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos:
 *       	- El valor de la posicion "final" no puede ser mayor que "inicial"
 *       	- Los valores de "inicial" y "final" tienen que estar entre 0 y 9
 *
 *
 * */

//PG
	//Inicio
		//Leer y cargar numeros en el array inicial
		//Mostrar array inicial
		//Leer y validar posicion inicial y final
		//Cargar la posicion final del array final con el numero de la posicion inicial del array incial
		
		//Si inicial es 9
			//inicial = 0
		//Sino
			//aumentar inicial
		//Fin_Si
		
		//Para contador=inicial, mientras contador sea menor o igual que 8, aumentar contador
			//array final con posicion contador = array inicial posicion contador
		//Fin_Para
		
		//Mostrar array final
	//Fin

import java.util.Scanner;

public class t7Ej12 {
	public static void main(String[] args){
		
		//Declaración de variables
		int[] arrayInicial = new int[10];
		int[] arrayFinal = new int[10];
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y cargar numeros en el array inicial
			for(int i=0; i<=9; i++){
				System.out.print("Escriba el numero para la posicion " +(i+1) +" del array: ");
				arrayInicial[i] = teclado.nextInt();
			}
			
			//Mostrar array inicial
			System.out.println(" ");
			
			System.out.println("o---------------o");
			System.out.println("| Array Inicial |");
			System.out.println("o---------------o");
			for(int i=0; i<=9; i++){
				System.out.printf("Posicion %2d ---> "+arrayInicial[i] +"\n", (i+1));
			}
		
			//Leer y validar posicion inicial y final
			//Cargar la posicion final del array final con el numero de la posicion inicial del array incial
			
			//Si inicial es 9
			/*if() {
				//inicial = 0
			}
			else {
				//aumentar inicial
			}//Fin_Si*/
			
			//Para contador=inicial, mientras contador sea menor o igual que 8, aumentar contador
			/*for() {
				//array final con posicion contador = array inicial posicion contador
			}//Fin_Para*/
			
			//Mostrar array final
		//Fin
		
	}
}
