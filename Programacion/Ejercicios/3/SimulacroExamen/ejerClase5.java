/*
 * Nombre: ejerClase5
 * 
 * Comentario: Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacía
 * 
 * Análisis: 
 * 		Entradas: Un String
 * 		Salidas: por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer String del usuario
		Mientras la frase no sea una cadena vacia
			Preguntar y leer String del usuario
		Fin_Minetras
	Fin
*/

import java.util.Scanner;

public class ejerClase5 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		String frase = "";
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer String del usuario
			System.out.print("Introduzca su frase: ");
			frase = teclado.nextLine();
			
			//Mientras la frase no sea una cadena vacia
			while(!frase.equals("")){
				//Preguntar y leer String del usuario
				System.out.print("Introduzca su frase: ");
				frase = teclado.nextLine();
				
			} //Fin_Minetras
		//Fin
	}
}

