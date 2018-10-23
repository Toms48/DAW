/*
 * Nombre: t5Ej7
 * 
 * Comentario: Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un n�mero de 4 cifras.
 * 				El programa nos pedir� la combinaci�n para abrirla.
 * 
 * 				Si no acertamos, se nos mostrar� el mensaje "Lo siento, esa no es la combinaci�n"
				y si acertamos se nos dir� "La caja fuerte se ha abierto satisfactoriamente".

				Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * An�lisis
 * 
 * 		Entradas: int para la combinaci�n
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Hacer
			//Preguntar y leer la combinaci�n
			//Si combinacion incorrecta
				//Sumar un intento
				//Mostrar mensaje de error
			//Fin_Si
		//Mientras la combinacion sea incorrecta e intentos sean menores que 4
		//Si la combinacion es correcta
			//Mostrar mensaje de caja abierta
		//Sino
			//Mostrar de caja no abierta
		//Fin_Si
	//Fin

import java.util.Scanner;

public class t5Ej7 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int combinacion = 0;
		
		int intentos = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Hacer
			do{
				//Preguntar y leer la combinaci�n
				System.out.print("Introduzca la combinacion de 4 numeros para abrir la caja fuerte: ");
				combinacion = teclado.nextInt();
				
				//Si combinacion incorrecta
				if(combinacion != 1998){
					//Sumar un intento
					intentos++;
					
					//Mostrar mensaje de error
					System.out.println("Lo siento, esa no es la combinaci�n.");
					System.out.println(" ");
					
					if(intentos == 3){
						System.out.println("Le queda " +(4-intentos) +" intento.");
					}
					else{
						System.out.println("Le quedan " +(4-intentos) +" intentos.");
					}
					
					System.out.println(" ");
					
				}//Fin_Si
			}
			while(combinacion!=1998 && intentos<4); //Mientras la combinacion sea incorrecta e intentos sean menores que 4
			
			//Si la combinacion es correcta
			if(combinacion == 1998){
				//Mostrar mensaje de caja abierta
				System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
			}
			else{
				//Mostrar de caja no abierta
				System.out.println("Has agotado tus intentos, astha lue.");
			}//Fin_Si
		//Fin
		
	}
}

