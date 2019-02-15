/*
 *   Nombre: Boletin2.t8Ej6
 *
 *   Comentario:	Dado un párrafo con dos frases (separadas por un punto), contar cuántas palabras tiene cada frase.
 *
 *   Análisis:
 *
 *       Entradas: No tiene
 *
 *       Salidas: Por pantalla
 *
 * */

/*
//PG
	//Inicio
		//Convertir el parrafo en un array de char
		//Contar palabras hasta un punto
	//Fin
*/

package Boletin2;

public class t8Ej6 {
	public static void main(String[] args){
		
		//Declaración de variables
		String parrafo = "Ni a Hitler ni a Stalin les han nombrado personas non gratas en Pontevedra. Somos sentimientos y tenemos seres humanos.";
		//String parrafo = "Hola. Hola.";
		
		int contadorPalabras = 0;
		int contadorFrases = 0;
		
		char[] arrayChar = new char[parrafo.length()];
		
		//Inicilizaciones
		
		//Inicio
			//Mostrar parrafo
			System.out.println(parrafo);
			System.out.println();
			
			//Convertir el parrafo en un array de char
			arrayChar = parrafo.toCharArray();
		
			//Contar palabras hasta un punto
			for(int i=0; i<=parrafo.length()-1; i++){
				
				if(arrayChar[i] == '.'){
					contadorFrases++;
					
					System.out.println("La " +contadorFrases +"ª frase tiene " +contadorPalabras +" palabras.");
					
					contadorPalabras = 0;
				}
				else{
					if(arrayChar[i] != ' '){
						contadorPalabras++;
					}
				}
			}
		
		//Fin
	}
}
