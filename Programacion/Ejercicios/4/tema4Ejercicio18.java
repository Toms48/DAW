/*
 * Nombre: tema4Ejercicio18
 * 
 * Comentario: Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado.
 * 				Se permiten números de hasta 5 cifras.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- int para el numero pedido al el usuario
 * 
 * 		Salidas: Por pantalla
 * 
 * Requisitos: El numero no puede tener más de 5 cifras
 * 
 */

//PG
	//Inicio
		//Preguntar y leer numero
		
		//Si el numero está entre 0 y 99999
		
			//Sacar la primera cifra del numero
			//Mostrar la primera cifra
			
		//Sino
			//Mostrar mensaje de error
		//Fin_Si
		
	//Fin

import java.util.Scanner;
import java.lang.Math;

public class tema4Ejercicio18 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		String sNumero = "";
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer numero
			System.out.print("Introduzca un numero de hasta 5 cifras y le diremos la primera: ");
			sNumero = teclado.next();
			
			//Si el numero está entre 0 y 99999
			if(sNumero.length()>=1 && sNumero.length()<=5){
				//Sacar la primera cifra del numero
				int iTamanioNumero = sNumero.length();
				
				int iNumero = Integer.parseInt(sNumero);
				
				int iDesplazamiento = Double.valueOf(Math.pow(10, iTamanioNumero-1)).intValue();
		
				//Mostrar la primera cifra
				System.out.println(" ");
				System.out.println("El primer dígito del número " + iNumero + " es el " + iNumero/iDesplazamiento);
				
			}
			else{
				//Mostrar mensaje de error
				System.out.print(" ");
				System.out.print("Illo, ¿pos no te he dicho que tenía que ser un número con maximo 5 cifras?");
			}//Fin_Si
			
		//Fin
		
	}
}

