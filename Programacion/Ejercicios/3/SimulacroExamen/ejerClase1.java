/*
 * Nombre: ejerClase1
 * 
 * Comentario: Realizar un programa que lea cuatro valores numéricos e informar su suma y promedio
 * 
 * Análisis: 
 * 		Entradas: cuatro int para los numeros pedidos al usuario
 * 		Salidas: por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer num1
		Preguntar y leer num2
		Preguntar y leer num3
		Preguntar y leer num4
		Mostrar suma
		Mostrar promedio (o la media)
	Fin
*/

import java.util.Scanner;

public class ejerClase1 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar y leer num1
			System.out.print("Introduzca su primer numero: ");
			num1 = teclado.nextInt();
			
			//Preguntar y leer num2
			System.out.print("Introduzca su segundo numero: ");
			num2 = teclado.nextInt();
			
			//Preguntar y leer num3
			System.out.print("Introduzca su tercer numero: ");
			num3 = teclado.nextInt();
			
			//Preguntar y leer num4
			System.out.print("Introduzca su cuarto y ultimo numero: ");
			num4 = teclado.nextInt();
			
			//Mostrar suma
			System.out.println("");
			System.out.println("La suma de los numeros es: " +(num1+num2+num3+num4));
			System.out.println("");
			
			//Mostrar promedio (o la media)
			System.out.println("");
			System.out.println("El promedio de los numeros es: " +((num1+num2+num3+num4)/4));
			System.out.println("");
		//Fin
		
	}
}

