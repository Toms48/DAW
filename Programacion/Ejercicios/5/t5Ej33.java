/*
 * Nombre: t5Ej33
 * 
 * Comentario:  Realiza un programa que pinte la letra U por pantalla hecha con asteriscos.
 * 				El programa pedirá la altura.
 * 				Fíjate que el programa inserta un espacio y pinta dos asteriscos menos en la base para simular la curvatura de las esquinas inferiores. 
 * 
 * Análisis
 * 
 * 		Entradas: Un int para la altura de la L
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: La altura tiene que ser mayor que tres para que se vea la forma de U
 * 
 */

import java.util.Scanner;

public class t5Ej33 {
	
	public static void main (String[] args) {
		
		int altura = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.print("Introduzca la altura de la U: ");
			altura = teclado.nextInt();
		}
		while(altura<4);
		
		//Pintamos los lados de la U
		for(int i=1; i<=altura-1; i++){
			
			System.out.print("* ");
			
			for(int espacio=1; espacio<=altura-2; espacio++){
				System.out.print(" ");
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			System.out.println(" ");
			
		}
		
		//Pintamos la base de la U
		System.out.print(" ");
		
		for(int j=1; j<=altura-2; j++){
			System.out.print(" ");
			System.out.print("*");
		}
		
		System.out.print(" ");
		
		System.out.println(" ");
		
	}
}

