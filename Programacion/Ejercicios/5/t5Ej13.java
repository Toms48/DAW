/*
 * Nombre: t5Ej13
 * 
 * Comentario: Escribe un programa que lea una lista de diez números
 * 				y determine cuántos son positivos, y cuántos son negativos.
 * 
 * Análisis
 * 
 * 		Entradas: 10 int
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Para contador=0 mientras contador<11 aumenta contador 1
			//Preguntar y leer número
			//Si el numero es 0
				//Mostrar mensaje de error
				//Contador menos 1
			//Sino
				//Si el numero es positivo 
					//Sumar +1 al contador de los positivos
				//Sino
					//Sumar +1 al contador de los negativos
				//Fin_Si
			//Fin_Si
		//Fin_Para
		//Mostrar contador de positivos y negativos
	//Fin

import java.util.Scanner;

public class t5Ej13 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int numero = 0;
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Para contador=1 mientras contador<11 aumenta contador 1
			for(int i=1; i<11; i++){
				//Preguntar y leer número
				System.out.print("Introduzca su " +(i) +"º numero: ");
				numero = teclado.nextInt();
				
				//Si el numero es 0
				if(numero==0){
					//Mostrar mensaje de error
					System.out.println("Mira, que el 0 no tiene signo, pon otro que no sea 0 anda.");
					System.out.println(" ");
					//Contador menos 1
					i--;
				}
				else{
					//Si el numero es positivo
					if(numero>0){
						//Sumar +1 al contador de los positivos
						contadorPositivos++;
					}
					else{
						//Sumar +1 al contador de los negativos
						contadorNegativos++;
					}//Fin_Si
				}//Fin_Si
			}//Fin_Para
			
			//Mostrar contador de positivos y negativos
			System.out.println(" ");
			System.out.println("Positivos: " +contadorPositivos);
			System.out.println("Negativos: " +contadorNegativos);
		//Fin
		
	}
}

