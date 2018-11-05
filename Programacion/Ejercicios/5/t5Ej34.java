/*
 * Nombre: t5Ej34
 * 
 * Comentario:  Escribe un programa que pida dos números por teclado y que luego mezcle en dos números diferentes los dígitos pares y los impares.
 * 				Se van comprobando los dígitos de la siguiente manera:
 * 					primer dígito del primer número, primer dígito del segundo número, segundo dígito del primer número, segundo dígito del segundo número...
 * 				Para facilitar el ejercicio, podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre habrá al menos un dígito par y uno impar.
 * 				Usa long en lugar de int donde sea necesario para admitir números largos. 
 * 
 * Análisis
 * 
 * 		Entradas: Dos int para los numeros del usuario
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Leer y validar numeros
		//Comprobar digitos
	//Fin

import java.util.Scanner;

public class t5Ej34 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		long num1 = 0;
		long num2 = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar numeros
			do{
				System.out.print("Por favor, introduzca un numero: ");
				num1 = teclado.nextLong();
			}
			while(num1<=0);
			
			do{
				System.out.print("Introduzca otro numero: ");
				num2 = teclado.nextLong();
			}
			while(num2<=0);
			
			//Comprobar digitos
			while(num1 != 0){
				num1Invertido = (num1Invertido*10) + (num1%10);
				num1 = num1/10;
			}
			
			while(num2 != 0){
				num2Invertido = (num2Invertido*10) + (num2%10);
				num2 = num2/10;
			}
			
			while(num2Invertido>0){
				par = (par*10) + (num1Invertido%10);
				num1Invertido = num1Invertido/10;
			}
			
		//Fin
		
	}
}

