/*
 * Nombre: ejercicio4Tarde
 * 
 * Comentario:  ***
 * 
 * Análisis
 * 
 * 		Entradas: Un int
 * 
 * 		Salidas: Por pantalla
 * 
 */

import java.util.Scanner;

public class ejercicio4Tarde {
	
	public static void main (String[] args) {
		
		int altura = 0;
		int contador = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe una altura: ");
		altura = teclado.nextInt();
		
		for(int i=1; i<=altura; i++){
			//System.out.println(altura);
			for(int j=altura; j>=i; j--){
				if(contador<=9){
					System.out.print(contador +" ");
				}
				else{
					if(contador>15){
						System.out.print(contador +"(mayor de 15)");
					}
					else{
						System.out.print(contador);
					}
				}
				contador++;
			}
			System.out.println("");
		}
		
	}
}

