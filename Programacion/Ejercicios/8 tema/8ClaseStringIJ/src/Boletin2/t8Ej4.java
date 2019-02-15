/*
 *   Nombre: Boletin2.t8Ej4
 *
 *   Comentario:	Verificar si un string leído por teclado finaliza con la misma palabra que empieza.
 *
 *   Análisis:
 *
 *       Entradas: Un String
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: No tiene
 *
 * */

/*
//PG
	//Inicio
		//Leer y validar frase del usuario
		//Si no termina con punto
			//Poner punto al final
		//Fin_Si
		//Sacar palabra del principio
		//Sacar palabra del final
		
		//Si la letra anterior a la palabra final es una letra
			//Mostrar mensage de diferente
		//Sino
			//Si son iguales
				//Mostrar mensaje de iguales
			//Sino
				//Mostrar mensage de diferente
			//Fin_Si
		//Fin_Si
	//Fin
*/

package Boletin2;

import java.util.Scanner;

public class t8Ej4 {
	public static void main(String[] args){
		
		//Declaracion de variables
		String frase = new String();
		
		String primeraPalabra = new String();
		String ultimaPalabra = new String();
		
		int posicionPrincipioPalabra = 0;
		int posicionFinalPalabra = 0;
		int codigoSiguienteFinal = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar frase del usuario
			do{
				System.out.print("Introduzca su frase por favor (minimo dos palabras): ");
				frase = teclado.nextLine();
			}
			while(frase.indexOf(' ') == -1); //Mientras la frase no tenga espacios
		
			//Si no termina con punto
			if(frase.endsWith(".") == false) {
				//Poner punto al final
				frase = frase +".";
				
				System.out.println();
				
				System.out.println("No le has puesto el punto al final de la frase, ayy... ya se lo pongo yo anda, tira tira.");
				
				System.out.println();
				
				System.out.println(frase);
				
				System.out.println();
			}//Fin_Si
			
			//System.out.println(frase); //Para ver si coloca bien el punto en caso de que no se escriba
		
			posicionFinalPalabra = frase.indexOf(" ");
			//System.out.println(posicionFinalPalabra);
			
			//codigoSiguienteFinal = frase.codePointAt(posicionFinalPalabra+1);
			//System.out.println(codigoSiguienteFinal);
		
			//Sacar palabra del principio
			primeraPalabra = frase.substring(posicionPrincipioPalabra,posicionFinalPalabra);
			//System.out.println(primeraPalabra);
			
			//Sacar palabra del final
			posicionFinalPalabra = frase.indexOf('.');
			//System.out.println(posicionFinalPalabra);
			
			posicionPrincipioPalabra = posicionFinalPalabra - primeraPalabra.length();
			//System.out.println(posicionPrincipioPalabra);
		
			codigoSiguienteFinal = frase.codePointAt(posicionPrincipioPalabra-1);
			
			ultimaPalabra = frase.substring(posicionPrincipioPalabra,posicionFinalPalabra);
			//System.out.println(ultimaPalabra);
			
			//System.out.println(primeraPalabra.equalsIgnoreCase(ultimaPalabra)); //Para ver que sale al comparar las dos palabras
			
			//Si la letra anterior a la palabra final es una letra
			if( (codigoSiguienteFinal>=97 && codigoSiguienteFinal<=122) || (codigoSiguienteFinal>=65 && codigoSiguienteFinal<=90) ){
				//Mostrar mensaje de diferente
				System.out.println("Las palabras son distintas.");
			}
			else{
				//Si son iguales
				if(primeraPalabra.equalsIgnoreCase(ultimaPalabra) == true) {
					//Mostrar mensaje de iguales
					System.out.println("Las palabras son iguales.");
				}
				else {
					//Mostrar mensaje de diferente
					System.out.println("Las palabras son distintas.");
				}//Fin_Si
			}
			//Fin_Si
			
		//Fin
	}
}
