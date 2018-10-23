/*
 * Nombre: t5Ej9
 * 
 * Comentario: Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido por teclado.
 * 
 * An�lisis
 * 
 * 		Entradas: int para el numero
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: El numero tiene que ser positivo
 * 
 */

//PG
	//Inicio
		//Leer y validar el numero
		//Mostrar cantidad de digitos
	//Fin

import java.util.Scanner;

public class t5Ej9 {
	
	public static void main (String[] args) {
		
		//Declaraci�n de variables
		String numero = "";
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar el numero
			System.out.print("Introduzca un n�mero, le dir� cuantos digitos tiene: ");
			numero = teclado.next();
			
			//Mostrar cantidad de digitos
			System.out.println(" ");
			if(numero.length() == 1){
				System.out.println("Su numero tiene " +numero.length() +" d�gito");
			}
			else{
				System.out.println("Su numero tiene " +numero.length() +" d�gitos");
			}
			System.out.println(" ");
			
		//Fin
		
	}
}

