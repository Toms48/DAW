/*
 * Nombre: ejerIf3
 * 
 * Comentario: Se introduce por teclado un número positivo de uno o dos dígitos (1-99)
 * 				mostrar un mensaje indicando si el número tiene uno o dos dígitos
 * 
 * Análisis: 
 * 		Entradas: Un int
 * 		Salidas: Por pantalla
 */

//PG
/*
	Inicio
		Preguntar y leer un numero positivo
		Si el numero tiene un digito
			Decir que solo tiene un digito
		Sino
			Decir que tiene dos digitos
		Fin_Si
	Fin
*/

import java.util.Scanner;

public class ejerIf3 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int numero = 0;
		
		//Inicialización
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer un numero positivo
			System.out.println("Introduzca un numero entre 1 y 99, le dire si tiene uno o dos digitos");
			System.out.print("Su numero: ");
			numero = teclado.nextInt();
			
			
			if(numero>=1 && numero<=9){ //Si el numero tiene un digito
				
				//Decir que solo tiene un digito
				System.out.print(numero +" solo tiene un digito");
				
			}
			else{
				if(numero>=10 && numero<=99){
					//Decir que tiene dos digitos
					System.out.print(numero +" tiene dos digito");
				}
				else{
					System.out.print("Ha introducido un valor fuera del rango, por favor, introduzca un valor entre 1 y 99");
				}
			}
			//Fin_Si
		//Fin
		
	}
}

