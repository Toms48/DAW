/*
 * Nombre: tema3Ejercicio9
 * 
 * Comentario: Escribe un programa que calcule el volumen de un cono según la fórmula del volumen de cono xD
 * 
 * Análisis:
 * 		- Entradas: 
 * 				- double para radio
 * 				- double para altura
 * 		- Salidas: por pantalla
 */
 
//PG
	//Inicio
		//Preguntar el radio del cono
		//Leer el radio del cono
		//Preguntar altura del cono
		//Leer altura del cono
		//Calcular volumen del cono
		//Mostrar por pantalla volumen del cono 
	//Fin

import java.util.Scanner;

public class tema3Ejercicio9 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		double radio = 0.0;
		double altura = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar el radio del cono
			System.out.print("Introduzca el radio del cono: ");
			
			//Leer el radio del cono
			radio = teclado.nextDouble();
			
			//Preguntar altura del cono
			System.out.print("Introduzca la altura del cono: ");
			
			//Leer altura del cono
			altura = teclado.nextDouble();
			
			//Calcular y mostrar por pantalla volumen del cono
			System.out.println("El volumen del cono es: " +(0.33*3.14*radio*radio*altura));
			
		//Fin
		
	}
}

