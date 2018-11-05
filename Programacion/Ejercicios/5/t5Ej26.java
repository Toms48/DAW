/*
 * Nombre: t5Ej26
 * 
 * Comentario:  Realiza un programa que pida primero un número y a continuación un dígito.
				El programa nos debe dar la posición (o posiciones) contando de izquierda a derecha
 *				que ocupa ese dígito en el número introducido.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- Un int para le numero
 * 			- Un int para el digito
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Leer numero y digito
		//Calcular la/s posicion/es
		//Mostrar resultados
	//Fin

import java.util.Scanner;

public class t5Ej26 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int numero = 0;
		int digito = 0;
		
		int numeroInvertido = 0;
		
		int contadorDigito = 0;
		int posicion = 0;
		
		//int posicion
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer numero y digito
			System.out.print("Introduzca un numero: ");
			numero = teclado.nextInt();
			
			System.out.print("Introduzca un digito: ");
			digito = teclado.nextInt();
			
			//Calcular la/s posicion/es
			
			/*System.out.println(numero/10); //quita el ultimo numero
			System.out.println(numero%10); //Te dice el ultimo numero*/
			
			while(numero != 0){
				numeroInvertido = (numeroInvertido*10) + (numero%10);
				numero = numero/10;
			}
			
			System.out.println(" ");
			
			System.out.println("Su numero esta en la/s posicion/es: ");
			
			while(numeroInvertido>0){
				
				posicion++;
				
				if(numeroInvertido%10 == digito){
					contadorDigito++;
					
					System.out.println(posicion);
					
				}
				numeroInvertido = numeroInvertido/10;
			}
			
			//Mostrar resultados
			if(contadorDigito == 1){
				System.out.println("El " +digito +" sale " +contadorDigito +" vez");
			}
			else{
				System.out.println("El " +digito +" sale " +contadorDigito +" veces");
			}
			
		//Fin
		
	}
}

