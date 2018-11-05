/*
 * Nombre: t5Ej31
 * 
 * Comentario:  Realiza un programa que pinte la letra L por pantalla hecha con asteriscos.
 * 				El programa pedirá la altura.
 * 				El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura más uno. 
 * 
 * Análisis
 * 
 * 		Entradas: Un int para la altura de la L
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: La altura tiene que ser mayor que dos para que se vea forma de L.
 * 
 */

import java.util.Scanner;

public class t5Ej31 {
	
	public static void main (String[] args) {
		
		int altura = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			System.out.print("Introduzca la altura de la L: ");
			altura = teclado.nextInt();
		}
		while(altura<3);
		
		System.out.println(" ");
		
		for(int i=1; i<=altura-1; i++){
			System.out.println("*");
		}
		
		for(int j=1; j<=(altura/2)+1; j++){
			System.out.print("* ");
		}
		
		System.out.println(" ");
		
	}
}

