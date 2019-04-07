/*
 * Nombre: ejercicioExtra1
 * 
 * Comentario: Muestra por pantalla el horario
 * 
 * Análisis:
 * 		-Entrada: No tiene
 * 		-Salida: Imprime por pantalla muchos Strings 
 */


public class ejercicioExtra1 {
	
	/*public static void main (String[] args) {
		short num = 32800;
	}*/
	
	public static void main (String[] args) {
		
		short numMax = 32767;
		short numMin = -32767;
		
		System.out.println("El valor maximo de short es: " +numMax);
		System.out.println("El valor minimo de short es: " +numMin);
		
		numMin++;
		
		System.out.println("El valor minimo de short es: " +numMin);
		
	}
}

