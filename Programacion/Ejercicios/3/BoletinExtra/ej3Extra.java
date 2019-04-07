/*
 * Nombre: ej3Extra
 * 
 * Comentario: Intercambia los valores de dos variable.
 * 
 */


public class ej3Extra {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int a = 123;
		int b = 86;
		
		int aux = 0;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		System.out.println(" ");
		System.out.println("---Hacemos el intercambio de los valores---");
		System.out.println(" ");
		
		aux = a;
		a = b;
		b = aux;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
						
	}
}

