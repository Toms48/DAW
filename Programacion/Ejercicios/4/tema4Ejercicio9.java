/*
 * Nombre: tema4Ejercicio9
 * 
 * Comentario:  Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0)
 * 
 * Análisis: 
 * 		Entradas: tres int para las variables a, b y c
 * 		Salidas: por pantalla
 * 
 */
 
//PG
/*
	Inicio
		Preguntar y leer variables
		Calcular incognita x
		Mostrar resultado de la ecuación
	Fin
*/

import java.util.Scanner;
import java.lang.Math;

public class tema4Ejercicio9 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int a = 0;
		int b = 0;
		int c = 0;
		
		double x1 = 0.0;
		double x2 = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer variables
			System.out.print("Introduzca el valor de la variable a: ");
			a = teclado.nextInt();
			
			System.out.print("Introduzca el valor de la variable b: ");
			b = teclado.nextInt();
			
			System.out.print("Introduzca el valor de la variable c: ");
			c = teclado.nextInt();
			
			//Calcular incognita x
			if(((Math.pow(b,2))-(4*a*c)) < 0){
				System.out.print("No se puede calcular la raiz cuadrada de un numero negativo");
			}
			else{
				x1 = ((-b) + (Math.sqrt( (Math.pow(b,2))-(4*a*c) )))/(2*a);
				
				x2 = ((-b) - (Math.sqrt( (Math.pow(b,2))-(4*a*c) )))/(2*a);
			}
			
			//Mostrar resultado de la ecuación
			System.out.println(" ");
			System.out.println("Solucion 1 ---> " +x1);
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Solucion 2 ---> " +x2);
			System.out.println(" ");
		//Fin
		
	}
}

