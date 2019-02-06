/*
 *   Nombre: Boletin2.t8Ej7
 *
 *   Comentario:	Verificar si en una frase se encuentra una determinada palabra.
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
	//Fin
*/

package Boletin2;

public class t8Ej7 {
	public static void main(String[] args){
		
		//Declaración de variables
		String frase = "Jesus sal";
		String palabra = "sal";
		
		int posicionPrincipioPalabra = 0;
		int posicionFinalPalabra = 0;
		int codigoSiguienteFinal = 0;
		
		//Inicializaciones
		
		System.out.println("Frase: " +frase);
		
		System.out.println();
		
		System.out.println("Palabra: " +palabra);
		
		System.out.println();
		
		posicionPrincipioPalabra = frase.indexOf(palabra);
		//System.out.println(posicionPrincipioPalabra);
		
		posicionFinalPalabra = posicionPrincipioPalabra+palabra.length()-1;
		//System.out.println(posicionFinalPalabra);
		
		if(posicionFinalPalabra != frase.length()-1){
			codigoSiguienteFinal = frase.codePointAt(posicionFinalPalabra+1);
			
		}
		//System.out.println(codigoSiguienteFinal);
		
		if( (codigoSiguienteFinal<=97 || codigoSiguienteFinal>=122) && (codigoSiguienteFinal<=65 || codigoSiguienteFinal>=90)){
			
			System.out.println("Su palabra existe en la frase");
			
		}
		else{
			System.out.println("Su palabra NO existe en la frase");
		}
		
	}
}
