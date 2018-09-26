/*
 * Nombre: tema2Ejercicio1
 * 
 * Comentario: Escribe un programa en el que se declaren las variables enteras x e y. Asignales
				los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
				el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */

public class tema2Ejercicio1 {
	
	public static void main (String[] args) {
		
		//Declaraciones
		int x = 144;
		int y = 999;
		
		System.out.println("Variable x = " +x);
		System.out.println("Variable y = " +y);
		
		System.out.println(" ");
		
		System.out.println("Suma: x + y = " + (x+y));
		
		System.out.println(" ");
		
		System.out.println("Resta: x - y = " + (x-y));
		System.out.println("Resta: y - x = " + (y-x));
		
		System.out.println(" ");
		
		System.out.println("Division: x : y = " + ((double)x/(double)y));
		System.out.println("Division: y : x = " + ((double)y/(double)x));
		
		System.out.println(" ");
		
		System.out.println("Multiplicacion: x * y = " + (x*y));
		
		
		
	}
}

