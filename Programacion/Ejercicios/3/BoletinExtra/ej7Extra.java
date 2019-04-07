/*
 * Nombre: ej7Extra
 * 
 * Comentario: Modificar el ejercicio 6 para que muestre la parte entera de la media de tres notas decimales.
 * 
 */



public class ej7Extra {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		double nota1 = 2;
		double nota2 = 5;
		double nota3 = 7;
		
		int notaMedia = 0;
		
		notaMedia = (int)(nota1+nota2+nota3)/3;
		
		System.out.println("Su nota media es: " +notaMedia);
		
	}
}

