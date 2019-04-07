/*
 * Nombre: tema2Ejercicio4
 * 
 * Comentario: Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
				convertir deberá estar almacenada en una variable.
 * 
 */


public class tema2Ejercicio4 {
	
	public static void main (String[] args) {
		
		//Variable
		double euroConstante = 1.0;
		double pesetaConstante = 166.0;
		
		double euro = 5.0;
		double peseta = 0.0;
		
		System.out.println(euro +" euro/s es en pesetas: " + ((euro*pesetaConstante)/euroConstante) );
		
	}
}

