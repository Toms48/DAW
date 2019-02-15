/*
 *   Nombre: Boletin2.t8Ej3
 *
 *   Comentario:	Contar cuantas palabras tiene una frase.
 *   				Recuerde que la gramática establece que una frase termina en un punto.
 *   Análisis:
 *
 *       Entradas: No tiene
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: Para de contar las letras de una frase cuando encuentra un punto
 *
 * */

/*
//PG
	//Inicio
		//
	//Fin
*/

package Boletin2;

public class t8Ej3 {
	public static void main(String[] args){
	
		//Declaracion de variables
		String frase = "Hola mundo.";
		int contadorLetras = 0;
		
		//Inicializaciones
		
		System.out.println(frase);
		
		for(int i=0; i<=frase.length()-1; i++){
			
			if( (frase.charAt(i)>=97 && frase.charAt(i)<=122) || (frase.charAt(i)>=65 && frase.charAt(i)<=90) ){
				contadorLetras++;
			}
			
		}
		
		System.out.println();
		System.out.println("La cantidad de letras en su frase es: " +contadorLetras);
	
	}
}
