/*
 * Nombre: t5Ej25
 * 
 * Comentario:  Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
 * 
 * Análisis
 * 
 * 		Entradas: Un int para le numero del usuario
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: el numero tiene que ser mayor que 0
 * 
 */

//PG
	//Inicio
		//Leer numero
		//Mostrar numero al revés
	//Fin

import java.util.Scanner;

public class t5Ej25 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int numero = 0;
		int numeroInvertido = 0;
		
		boolean positivo = true;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer numero
			System.out.print("Introduzca un numero mayor que 0 para darle la vuelta: ");
			numero = teclado.nextInt();
			
			//Mostrar numero al revés
			while(numero != 0){  //(este while no es mio, es de internet)
				int aux = numero % 10;
				numeroInvertido = numeroInvertido * 10 + aux;
				numero = numero/10;
			}
			
			System.out.println(numeroInvertido);
			
		//Fin
		
	}
}

