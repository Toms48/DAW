/*
 * Nombre: ejerIf1
 * 
 * Comentario: Realizar un programa que lea por teclado dos números, si el primero es mayor al segundo informar de su suma y diferencia,
 * 				en caso contrario informar del producto y la división del primero respecto al segundo
 * 
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer numero 1
		Preguntar y leer numero 2
		Si numero1 es mayor que numero 2
			Calcular y mostrar suma
			Calcular y mostrar diferencia
		Sino
			Calcular y mostrar multiplicación
			Calcular y mostrar división
		Fin_Si
	Fin
*/

import java.util.Scanner;

public class ejerIf1 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int num1 = 0;
		int num2 = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer numero 1
			System.out.print("Introduzca el primer numero: ");
			num1 = teclado.nextInt();
			
			//Preguntar y leer numero 2
			System.out.print("Introduzca el segundo numero: ");
			num2 = teclado.nextInt();
			
			System.out.println("");
			
			//Si numero1 es mayor que numero 2
			if(num1 > num2){
				//Calcular y mostrar suma
				System.out.println("La suma de los valores es: " +(num1+num2));
				
				//Calcular y mostrar diferencia
				System.out.println("La diferencia de los valores es: " +(num1-num2));
			}
			else{
				//Calcular y mostrar multiplicación
				System.out.println("La multiplicacion de los valores es: " +(num1*num2));
				
				//Calcular y mostrar división
				System.out.println("La división de los valores es: " +((double)(num1)/(double)(num2)));
				
			}
			//Fin_Si
		//Fin
		
	}
}

