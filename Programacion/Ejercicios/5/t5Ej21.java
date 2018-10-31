/*
 * Nombre: t5Ej21
 * 
 * Comentario: Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos números se han introducido,
 * 				la media de los impares y el mayor de los pares.
 * 				El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.
 * 
 * Análisis
 * 
 * 		Entradas: Int para el numero introducido por el usuario
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: Cuando se introduce un numero negativo para la ejecución
 * 
 */

//PG
	//Inicio
		//Hacer
			//Leer numero
			//Si el numero es mayor o igual que 0
				//Aumentar contador de numeros
			//Fin_Si
			//Si el numero es impar
				//Aumentar contador impares
				//Sumatorio de impares
			//Sino
				//Si numero es mayor que maxPar
					//maxPar = numero
				//Fin_Si
			//Fin_Si
		//Mientras numero no sea negativo
		//Mostrar cantidad de numeros
		//Mostrar media de los numeros impares
		//Mostrar el par mayor
	//Fin

import java.util.Scanner;

public class t5Ej21 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int numero = 0;
		
		int maxPar = 0;
		int contadorNumeros = 0;
		int contadorImpares = 0;
		int sumImpares = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Hacer
			do{
				//Leer numero
				System.out.print("Introduzca un numero: ");
				numero = teclado.nextInt();
				
				
				if(numero>=0){	//Si el numero es mayor o igual que 0
					//Aumentar contador de numeros				   Illo, pon un Si para que no te cuente el numero negativo que necesitar para salir y mira también lo de la media, que no te haga la media con el numero negativo impar tambien, perro
					contadorNumeros++;
				}//Fin_Si
				
				
				if(numero%2!=0 && numero>=0){	//Si el numero es impar y >= que 0
					//Aumentar contador impares
					contadorImpares++;
					
					//Sumatorio de impares
					sumImpares = sumImpares + numero; //Va sumando los numeros impares que el usuario introduce
				}
				else{
					if(numero>maxPar){	//Si numero es mayor que maxPar
						//maxPar = numero
						maxPar = numero;
					}//Fin_Si
				}//Fin_Si
			}
			while(numero>=0); //Mientras numero no sea negativo
			
			//Mostrar cantidad de numeros
			System.out.println(" ");
			System.out.println("Cantidad de numeros: " +contadorNumeros);
			System.out.println(" ");
			
			//Mostrar media de los numeros impares
			System.out.println("Media de los numeros impares: " +(sumImpares/contadorImpares));
			System.out.println(" ");
			
			//Mostrar el par mayor
			System.out.println("El numero par mas grande ha sido: " +maxPar);
			System.out.println(" ");
		//Fin
		
	}
}

