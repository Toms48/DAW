/*
 * Nombre: tema4Ejercicio17
 * 
 * Comentario: Escribe un programa que diga cu�l es la �ltima cifra de un n�mero entero introducido por teclado.
 * 
 * An�lisis
 * 
 * 		Entradas:
 * 			- int para el numero pedido al el usuario
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer numero
		//Sacar ultima cifra y Mostrar ultima cifra
	//Fin

import java.util.Scanner;

public class tema4Ejercicio17 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int numero = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar y leer numero
			System.out.print("Introduzca un numero y le diremos su ultima cifra: ");
			numero = teclado.nextInt();
			
			System.out.println(" ");
			
			//Sacar ultima cifra y Mostrar ultima cifra
			if(numero>=0 && numero<=9){
				System.out.print("Como su numero solo tiene un digito, el ultimo es �l mismo: " +numero);
			}
			else{
				System.out.print("La ultima cifra de " +numero +" es " +numero%10);
			}
			
		//Fin
		
	}
}

