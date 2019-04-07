/*
 * Nombre: ejerIf2
 * 
 * Comentario: Se introducen tres notas de un alumno, si el promedio es mayor o igual a siete mostrar un mensaje "Promocionado" y su media
 * 
 * Análisis:
 * 		Entradas:
 * 			Tres double para las notas
 * 		Salidas: Por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer notas
		Si la media es mayor o igual a 7
			Mostrar "Promocionado" y la media
		Fin_Si
	Fin
*/

import java.util.Scanner;

public class ejerIf2 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer notas
			System.out.print("Introduzca la primera nota: ");
			nota1 = teclado.nextInt();
			
			System.out.print("Introduzca la segunda nota: ");
			nota2 = teclado.nextInt();
			
			System.out.print("Introduzca la tercera nota: ");
			nota3 = teclado.nextInt();
			
			//Si la media es mayor o igual a 7
			if(((nota1+nota2+nota3)/3) >= 7){
				//Mostrar "Promocionado" y la media
				System.out.println("");
				System.out.println("Promocionado!");
				System.out.println((nota1+nota2+nota3)/3);
			}
			else{
				System.out.println("Asta lue'");
			}
			//Fin_Si
		//Fin
		
	}
}

