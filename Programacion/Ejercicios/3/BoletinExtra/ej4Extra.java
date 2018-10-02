/*
 * Nombre: ej4Extra
 * 
 * Comentario: Dise�ar un programa que pida un n�mero al usuario (por teclado) y a continuaci�n lo
				muestre dividido por 3.
 * 
 * An�lisis:
 * 		- Entradas: double para el numero pedido por el usuario
 * 		- Salidas: Por pantalla
 * 
 */
 
//PG
//Inicio
	//Preguntar y leer un numero del usuario
	//Dividir el numero del usuario por 3
	//Mostrar por pantalla el resultado
//Fin

import java.util.Scanner;

public class ej4Extra {
	
	public static void main (String[] args) {
		
		//Declaraci�n de variables
		double num = 0.0;
		double resultado = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar y leer un numero del usuario
			System.out.print("Introduzca un n�mero para dividirlo por 3: ");
			
			num = teclado.nextDouble();
			
			//Dividir el numero del usuario por 3
			resultado = num/3;
			
			//Mostrar por pantalla el resultado
			System.out.println("El resultado de la divisi�n es: " +resultado);
			
		//Fin
		
	}
}

