/*
 * Nombre: ejercicio3Tarde
 * 
 * Comentario:  ***
 * 
 * Análisis
 * 
 * 		Entradas: Un int
 * 				  Un String
 * 
 * 		Salidas: Por pantalla
 * 
 */

import java.util.Scanner;

public class ejercicio3Tarde {
	
	public static void main (String[] args) {
		
		String respuesta = " ";
		
		int numero = 0;
		int contador = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do{
			contador=0;
			
			System.out.print("Escriba un numero: ");
			numero = teclado.nextInt();
			
			for(int i=numero; i%7!=0; i++){
				contador++;
				//System.out.println("i: " +i);
				//System.out.println("contador: " +contador);
			}
			
			System.out.println("Hay que sumarle " +contador +" para que sea multiplo de 7");
			
			teclado.nextLine();
			
			System.out.println(" ");
			System.out.print("Quiere salir del programa? (escriba FIN PROGRAMA en tal caso): ");
			respuesta = teclado.nextLine();
			
		}
		while(respuesta.toUpperCase().equals("FIN PROGRAMA")==false);
		
	}
}

