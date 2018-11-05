/*
 * Nombre: t5Ej32
 * 
 * Comentario:  Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los dígitos pares.
 * 				Los dígitos pares se deben mostrar en orden, de izquierda a derecha.
 * 				Usa long en lugar de int donde sea necesario para admitir númeroslargos. 
 * 
 * Análisis
 * 
 * 		Entradas: Un int para el numero del usuario
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: El numero introducido tiene que ser positivo
 * 
 */

//PG
	//Inicio
		//Leer y validar numero
		//Invertimos el numero introducido
		//Mostrar que numeros son pares y su suma
	//Fin

import java.util.Scanner;

public class t5Ej32 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		long numero = 0;
		
		long numeroInvertido = 0;
		
		long sumatorioPares = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar numero
			do{
				System.out.print("Por favor, introduzca un numero entero positivo: ");
				numero = teclado.nextLong();
			}
			while(numero<=0);
			
			//Invertimos el numero introducido
			while(numero != 0){
				numeroInvertido = (numeroInvertido*10) + (numero%10);
				numero = numero/10;
			}
			
			//Mostrar que numeros son pares y su suma
			System.out.print("Digitos pares: ");
			
			for(long i=numeroInvertido; i>0; i=i/10){
				if((i%10) %2 == 0){ //Miramos si el digito es par
					System.out.print(i%10 +" "); //Se imprime por pantalla el numero par
					
					sumatorioPares = sumatorioPares+(i%10);
				}
			}
			
			System.out.println(" ");
			System.out.println("Suma de los digitos pares: " +sumatorioPares);
			System.out.println(" ");
			
		//Fin
		
	}
}

