/*
 * Nombre: ej5Extra
 * 
 * Comentario: Modificar el ejercicio 4 para que muestre el número al cuadrado.
 * 				Ayuda: Usa el método Math.pow(a, b) donde a es la base y b el exponente
 * Análisis:
 * 		- Entradas: double para el numero pedido por el usuario
 * 		- Salidas: Por pantalla
 * 
 */
 
//PG
	//Inicio
		//Preguntar y leer un numero del usuario
		//Dividir el numero del usuario por 3
		//Mostrar por pantalla el resultado
		//Calcular el cuadrado del resultado anterior
		//Mostrar por pantalla el cuadrado calculado
	//Fin

import java.util.Scanner;
import java.lang.Math;

public class ej5Extra {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		double num = 0.0;
		double resultado = 0.0;
		
		double cuad = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar y leer un numero del usuario
			System.out.print("Introduzca un número para dividirlo por 3: ");
			
			num = teclado.nextDouble();
			
			//Dividir el numero del usuario por 3
			resultado = num/3;
			
			//Mostrar por pantalla el resultado
			System.out.println("El resultado de la división es: " +resultado);
			
			//Calcular el cuadrado del resultado anterior
			cuad = Math.pow(resultado,2);
			
			//Mostrar por pantalla el cuadrado calculado
			System.out.println("El resultado del cuadrado es: " +cuad);
			
		//Fin
		
	}
}

