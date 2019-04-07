/*
 * Nombre: ej6Extra
 * 
 * Comentario: Crear una aplicación que calcule la media aritmética de dos notas enteras.
 * 				Hay que tener en cuenta que la media puede contener decimales.
 * 
 */


public class ej6Extra {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int nota1 = 2;
		int nota2 = 5;
		
		double notaMedia = 0;
		
		notaMedia = (double)(nota1+nota2)/2;
		
		System.out.println("Su nota media es: " +notaMedia);
		
	}
}

