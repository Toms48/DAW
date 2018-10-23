/*
 * Nombre: t5Ej8
 * 
 * Comentario: Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * Análisis
 * 
 * 		Entradas: int para el numero
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer numero para hacer la tabla de multiplicar
		//Para i=0 mientras i<10 incrementa 1
			//Mostrar multiplicación
		//Fin_Para
	//Fin

import java.util.Scanner;

public class t5Ej8 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int numero = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer numero para hacer la tabla de multiplicar
			System.out.print("Introduzca un numero para saber su tabla de multiplicar: ");
			numero = teclado.nextInt();
				
			//Para i=0 mientras i<10 incrementa 1
			for(int i=0; i<=10; i++){
				//Mostrar multiplicación
				System.out.println(numero +" x " +i +" = " +(numero*i));
			}//Fin_Para
		//Fin
	}
}

