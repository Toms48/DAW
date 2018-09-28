/*
 * Nombre: tema3Ejercicios5_6
 * 
 * Comentario: Escribe un programa que calcule el área de un rectángulo y de un triangulo
 * 			   Area del cuadrado  = l*l
 * 			   Area del triangulo = (b*a)/2
 * 
 * Analisis: 
 * 		- Entradas:
 * 			-Un double para el lado del cuadrado
 * 			-Un double para la base del triangulo
 * 			-Un double para la altura del triangulo
 * 
 * 		- Salidas: Por pantalla
 */

//PG
//Inicio
	//Preguntar lado del cuadrado
	//Leer lado del cuadrado
	//Calcular area del cuadrado
	//Mostrar area del cuadrado
	
	//Preguntar base del triangulo
	//Leer base del triangulo
	//Preguntar altura del triangulo
	//Leer altura del triangulo
	//Calcular area del triangulo
	//Mostrar area del triangulo
//Fin

import java.util.Scanner;

public class tema3Ejercicios5_6 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		double ladoCuadrado = 0.0;
		
		double baseTriangulo = 0.0;
		double alturaTriangulo = 0.0;
		
		double areaCuadrado = 0.0;
		double areaTriangulo = 0.0;
		
		//Inicializacion
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar lado del cuadrado
			System.out.print("Introduzca cuanto mide un lado del cuadrado: ");
			
			//Leer lado del cuadrado
			ladoCuadrado = teclado.nextDouble();
			
			//Calcular area del cuadrado
			areaCuadrado = ladoCuadrado*ladoCuadrado;
			
			//Mostrar area del cuadrado
			System.out.println("");
			System.out.println("El area del cuadrado es: " +areaCuadrado);
			System.out.println("");
			
			//Preguntar base del triangulo
			System.out.print("Introduzca cuanto mide la base del triangulo: ");
			
			//Leer base del triangulo
			baseTriangulo = teclado.nextDouble();
			
			//Preguntar altura del triangulo
			System.out.print("Introduzca cuanto mide la altura del triangulo: ");
			
			//Leer altura del triangulo
			alturaTriangulo = teclado.nextDouble();
			
			//Calcular area del triangulo
			areaTriangulo = (baseTriangulo*alturaTriangulo)/2;
			
			//Mostrar area del triangulo
			System.out.println("");
			System.out.println("El area del triangulo es: " +areaTriangulo);
			System.out.println("");
			
		//Fin
	}
}

