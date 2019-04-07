/*
 * Nombre: ejerClase4
 * 
 * Comentario: Programa Java que declare cuatro variables enteras A, B, C, D y asígnale un valor a cada una.
 * 				A continuación realiza las instrucciones necesarias para que:
							B tome el valor de C
							C tome el valor de A
							A tome el valor de D
							D tome el valor de B
 * 
 * Análisis:
 * 		Entrada: cuatro int
 * 		Salidas: por pantalla
 */

//PG
/*
	Inicio
		Preguntar y leer A
		Preguntar y leer B
		Preguntar y leer C
		Preguntar y leer D
		Realizar cambios
		Mostrar los cambios
	Fin
*/

import java.util.Scanner;

public class ejerClase4 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		int auxA = 0;
		int auxB = 0;
		int auxC = 0;
		int auxD = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer A
			System.out.print("Introduzca el valor de A: ");
			a = teclado.nextInt();
			
			//Preguntar y leer B
			System.out.print("Introduzca el valor de B: ");
			b = teclado.nextInt();
			
			//Preguntar y leer C
			System.out.print("Introduzca el valor de C: ");
			c = teclado.nextInt();
			
			//Preguntar y leer D
			System.out.print("Introduzca el valor de D: ");
			d = teclado.nextInt();
			
			//Realizar cambios
			auxB = c;
			auxC = a;
			auxA = d;
			auxD = b;
			
			a = auxA;
			b = auxB;
			c = auxC;
			d = auxD;
						
			//Mostrar los cambios
			System.out.println("");
			System.out.println("Nuevo valor de A: " +a);
			System.out.println("Nuevo valor de B: " +b);
			System.out.println("Nuevo valor de C: " +c);
			System.out.println("Nuevo valor de D: " +d);
			System.out.println("");
			
		//Fin
		
	}
}

