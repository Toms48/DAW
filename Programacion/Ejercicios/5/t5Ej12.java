/*
 * Nombre: t5Ej12
 * 
 * Comentario: Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
 * 				El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * 				el resto se calcula sumando los dos anteriores,
 * 				por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
 * 				El número n se debe introducir por teclado.
 * 
 * Análisis
 * 
 * 		Entradas: int para n
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer n
		//Para i=0 mientras i<=n aumentamos i
			//Calcular Fibonacci
			//Mostrar Fibonacci
		//Fin_Para
	//Fin

import java.util.Scanner;

public class t5Ej12 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int n = 0;
		int numero1 = 0;
		int numero2 = 1;
		int aux = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer n
			System.out.print("Introduzca cuantos números en la serie de Fibonacci quiere ver: ");
			n = teclado.nextInt();
			
			System.out.println("");
			//System.out.println(numero1);
			
			//Para i=0 mientras i<=n aumentamos i
			for(int i=0; i<n; i++){
				//Mostrar Fibonacci
				System.out.println(numero1);
				
				//Calcular Fibonacci
				aux = numero2;
				numero2 = numero1+numero2;
				
				numero1 = aux;
			}//Fin_Para
		//Fin
		
	}
}

