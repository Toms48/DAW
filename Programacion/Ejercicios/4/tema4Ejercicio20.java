/*
 * Nombre: tema4Ejercicio20
 * 
 * Comentario: Realiza un programa que diga si un número entero positivo introducido por teclado es capicúa.
 * 				Se permiten números de hasta 5 cifras.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- String para el numero pedido al el usuario
 * 
 * 		Salidas: Por pantalla
 * 
 * Requisitos: El numero no puede tener más de 5 cifras
 * 
 */

//PG
	//Inicio
		//Preguntar y leer numero
		//Si numero tiene entre 1 y 5 cifras
			//Segun la longitud del numero
				//caso 1
					//Mostrar capicua
				//caso 2
				//caso 3
				//caso 4
				//caso 5
					//Comprobar capicua
					//Si numero y su ionvertido son iguales
						//Mostrar capicua
					//Sino
						//Mostrar no capicua
					//Fin_Si
			//Fin_Segun
		//Sino
			//Mostrar mensaje de error
		//Fin_Si
	//Fin

import java.util.Scanner;

public class tema4Ejercicio20 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		String sNumero = "";
		int iNumero = 0;
		int iNumero2 = 0;
		int iNumeroInvertido = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer numero
			System.out.print("Introduzca un numero de hasta 5 cifras: ");
			sNumero = teclado.next();
			
			//Si numero tiene entre 1 y 5 cifras
			if(sNumero.length()>=1 && sNumero.length()<=5){
				//Segun la longitud del numero
				switch(sNumero.length()){
					case 1:
						//Mostrar capicua
						System.out.println(" ");
						System.out.println("Su numero " +sNumero +" es capicua");
					break;
					
					case 2:
					case 3:
					case 4:
					case 5:
						//Comprobar capicua
						iNumero = Integer.parseInt(sNumero);
						iNumero2 = iNumero;
						
						while(iNumero != 0) {
							int digit = iNumero % 10;
							iNumeroInvertido = iNumeroInvertido * 10 + digit;
							iNumero /= 10;
						}
						
						//Si numero y su invertido son iguales
						if(iNumero2 == iNumeroInvertido){
							//Mostrar capicua
							System.out.println(" ");
							System.out.println("Su numero " +sNumero +" es capicua");
						}
						else{
							//Mostrar no capicua
							System.out.println(" ");
							System.out.println("Su numero " +sNumero +" no es capicua");
						}//Fin_Si
					break;
				}//Fin_Segun
			}
			else{
				//Mostrar mensaje de error
				System.out.print(" ");
				System.out.print("Illo, ¿pos no te he dicho que tenía que ser un número con maximo 5 cifras?");
				
			}//Fin_Si
		//Fin
	}
}

