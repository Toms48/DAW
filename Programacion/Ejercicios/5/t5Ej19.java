/*
 * Nombre: t5Ej19
 * 
 * Comentario:  Realiza un programa que pinte una pir�mide por pantalla.
 * 				La altura se debe pedir por teclado.
 * 				El car�cter con el que se pinta la pir�mide tambi�n se debe pedir por teclado.
 * 
 * An�lisis
 * 
 * 		Entradas:
 * 			- Un int para la altura (h) del tri�ngulo
 * 			- Un caracter para pintar la pir�mide
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: La altura (h) tiene que ser mayor que 0
 * 
 */

//PG
	//Inicio
		//Leer y validar altura
		//Leer y validar caracter
		//Pintar pir�mide
	//Fin

import java.util.Scanner;

public class t5Ej19 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int h = 0;
		char caracter = ' ';
		
		int base = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar altura
			do{
				System.out.print("Introduzca una altura para la piramide (mayor que 0): ");
				h = teclado.nextInt();
			}
			while(h<=0);
			
			//Leer y validar caracter
			do{
				System.out.print("Introduzca un caracter para pintar la piramide: ");
				caracter = teclado.next().charAt(0);
			}
			while(h<=0);
			
			//Pintar pir�mide
			
			//base = ((h-1)*2)+1;
			
			for(int i=1; i<=h; i++){
				for(int j=h-1; j>=i; j--){
					System.out.print(" ");
				}
				
				for(int k=1; k<=(((i-1)*2)+1); k++){
					System.out.print(caracter);
				}
				
				System.out.println("");
				
			}
			
		//Fin
		
	}
}

