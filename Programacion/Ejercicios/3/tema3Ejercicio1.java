/*
 * Nombre: tema3Ejercicio1
 * 
 * Comentario: Realiza un programa que pida dos números y que luego muestre el resultado
				de su multiplicación.
 * 
 * Análisis: 
 * 		- Entrada: dos enteros 
 * 		- Salida: un entero
 * 
 */
 
//PG
	//Inicio
		//Pedir primer entero
		//Leer primer entero
		//Pedir segundo entero
		//Leer segundo entero
		//Multiplicar enteros
		//Mostrar por pantalla el resultado
	//Fin

import java.util.Scanner;

public class tema3Ejercicio1 {
	
	public static void main (String[] args) {
	
	//Declaración de variables
	int num1 = 0;
	int num2 = 0;
	
	int resultado = 0;
	
	//Inicializaciones
	Scanner teclado = new Scanner (System.in);
	
	//Inicio
		//Pedir primer numero
		System.out.print("Introduzca el primer numero para multiplicar: ");
		
		//Leer primer numero
		num1 = teclado.nextInt();
		
		//Pedir segundo numero
		System.out.print("Introduzca el segundo numero para multiplicar: ");
		
		//Leer segundo numero
		num2 = teclado.nextInt();
		
		//Multiplicar los numeros
		resultado = num1*num2;
		
		//Mostrar por pantalla el resultado
		System.out.println(num1 +" X " +num2 +" = " +resultado);
	//Fin
		
	}
}

