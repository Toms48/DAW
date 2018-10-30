/*
 * Nombre: t5Ej18
 * 
 * Comentario: Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y
 * 				validados como distintos, el programa debe empezar por el menor de los enteros introducidos e
 * 				ir incrementando de 7 en 7.
 * 
 * Análisis
 * 
 * 		Entradas: Dos int para el numero menor y el numero superior
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: Los numeros deben de ser distintos
 * 
 */

//PG
	//Inicio
		//Leer y validar los numeros
		//Para contador=numero inferior mientras contador<numero superior aumentar contador en 7
			//Si contador<numero superior
				//Mostrar contador
			//Fin_Si
		//Fin_Para
	//Fin

import java.util.Scanner;

public class t5Ej18 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int num1 = 0;
		int num2 = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar los numeros
			do{
				System.out.println("Los numeros introducidos no pueden ser iguales");
				
				System.out.println(" ");
				
				System.out.print("Introduzca el numero inferior: ");
				num1 = teclado.nextInt();
				
				System.out.print("Introduzca el numero superior: ");
				num2 = teclado.nextInt();
			}
			while(num1 == num2);
			
			//Para contador=numero inferior mientras contador<numero superior aumentar contador en 7
			for(int i=num1; i<=num2; i=i+7){
					System.out.print(i);
					
					if(i+7<=num2){
						System.out.print(", ");
					}
					else{
						System.out.print(".");
					}
			}//Fin_Para
		//Fin
		
	}
}

