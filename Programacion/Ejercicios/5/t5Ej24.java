/*
 * Nombre: t5Ej24
 * 
 * Comentario:  Escribe un programa que lea un n�mero n e imprima una pir�mide de n�meros con n filas como en la siguiente figura:
 * 
					   1
					  121
					 12321
					1234321
 * 
 * An�lisis
 * 
 * 		Entradas: Int para el numero introducido por el usuario
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Incio
		//Leer numero del usuario
		//Mostar pir�mide
	//Fin

import java.util.Scanner;

public class t5Ej24 {
	
	public static void main (String[] args) {
		
		//Declaraci�n de variables
		int numero = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Incio
			//Leer numero del usuario
			System.out.println("Recuerda que si pones mas de 9 la piramide se va a descuadrar y se va a ver fea.");
			System.out.print("Introduzca un numero por favor: ");
			numero = teclado.nextInt();
			
			//Mostar pir�mide
			for(int i=1; i<=numero; i++){
				for(int espacios=(numero-i); espacios>=1; espacios--){
					System.out.print(" ");
				}
				
				for(int j=1; j<i; j++){
					System.out.print(j);
				}
				
				System.out.print(i);
				
				for(int k=i-1; k>=1; k--){
					System.out.print(k);
				}
				
				System.out.print("\n");
			}
			
		//Fin
		
	}
}

