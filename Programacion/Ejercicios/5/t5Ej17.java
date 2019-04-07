/*
 * Nombre: t5Ej17
 * 
 * Comentario: Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado.
 * 				Se debe comprobar que el dato introducido es correcto (que es un número positivo).
 * 
 * Análisis
 * 
 * 		Entradas: int para el numero introducido
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: El numero introducido por teclado tiene que ser positivo
 * 
 */

//PG
	//Inicio
		//Leer y validar numero
		//Calcular la suma de los 100 numero siguientes al introducido
		//Mostrar resultado de la suma
	//Fin

import java.util.Scanner;

public class t5Ej17 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int numero = 0;
		int suma100 = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar numero
			do{
				System.out.print("Introduzca un numero positivo por favor (entendemos el 0 como valor positivo): ");
				numero = teclado.nextInt();
				
				System.out.println(" ");
			}
			while(numero<0);
			
			//Calcular la suma de los 100 numero siguientes al introducido
			for(int i=1; i<=100; i++){
				suma100 = (numero+i) + suma100;
			}
			
			//Mostrar resultado de la suma
			System.out.println("La suma de los 100 siguientes numeros a " +numero +" es: " +suma100);
		//Fin
		
	}
}

