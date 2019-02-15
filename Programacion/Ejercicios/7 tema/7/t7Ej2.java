/*
 * Nombre: t7Ej2
 * 
 * Comentario:  Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos según la tabla que se muestra.
 * 				Muestra el contenido de todos los elementos del array.
 * 				¿Qué sucede con los valores de los elementos que no han sido inicializados?
 * 
 * 				Los valores se inicializan a un espacio (caracter en blanco) por defecto
 * 
 * Análisis
 * 
 * 		Entradas: No tiene
 * 
 * 		Salidas: Por pantalla
 */


public class t7Ej2 {
	
	public static void main (String[] args) {
		
		char[] array = new char[10];
		
		array[0] = 'a';
		array[1] = 'x';
		array[4] = '@';
		array[6] = ' ';
		array[7] = '+';
		array[8] = 'Q';
		
		for(int i=0; i<=9; i++){
			System.out.print(array[i] +" ");
		}
		
	}
}

