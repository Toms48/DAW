/*
 * Nombre: t5Ej26
 * 
 * Comentario:  Realiza un programa que pida primero un n�mero y a continuaci�n un d�gito.
				El programa nos debe dar la posici�n (o posiciones) contando de izquierda a derecha
 *				que ocupa ese d�gito en el n�mero introducido.
 * 
 * An�lisis
 * 
 * 		Entradas:
 * 			- Un int para le numero
 * 			- Un int para el digito
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Leer numero y digito
		//Calcular la/s posicion/es
		//Mostrar resultados
	//Fin

import java.util.Scanner;

public class t5Ej26 {
	
	public static void main (String[] args) {
		
		//Declaraci�n de variables
		int numero = 0;
		int digito = 0;
		
		int numeroInvertido = 0;
		
		//int posicion
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer numero y digito
			System.out.print("Introduzca un numero: ");
			numero = teclado.nextInt();
			
			System.out.print("Introduzca un digito: ");
			digito = teclado.nextInt();
			
			//Calcular la/s posicion/es
			
			/*System.out.println(numero/10);
			System.out.println(numero%10);*/
			
			while(numero != 0){
				numeroInvertido = (numeroInvertido*10) + (numero%10);
				numero = numero/10;
			}
			
			while(numeroInvertido>0){
				/*if(){
					
				}*/
			}
			
			//Mostrar resultados
		//Fin
		
	}
}

