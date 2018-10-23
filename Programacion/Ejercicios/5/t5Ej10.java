/*
 * Nombre: t5Ej10
 * 
 * Comentario: Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
 * 				A priori, el programa no sabe cuántos números se introducirán.
 * 				El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
 * 
 * Análisis
 * 
 * 		Entradas: int para el numero
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Hacer
			//Preguntar y leer numero
			//Si el numero es positivo
				//Actualizar contador
				//Acumular numeros
			//Fin_Si
		//Mientras numero es positivo
		//Calcular y mostrar media
	//Fin

import java.util.Scanner;

public class t5Ej10 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int numero = 0;
		
		int contador = 0;
		
		int numerosAcumulados = 0; //Es la suma de los numeros que se van introduciendo por teclado
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Hacer
			do{
				//Preguntar y leer numero
				System.out.print("Introduzca un número: ");
				numero = teclado.nextInt();
				
				//Si el numero es positivo
				if(numero>=0){
					//Actualizar contador
					contador = contador + 1;
					//Acumular numeros
					numerosAcumulados = numerosAcumulados+numero;
				}//Fin_Si
			}
			while(numero>=0); //Mientras numero es positivo
			
			//System.out.println(contador);
			//System.out.println(numerosAcumulados);
			
			//Calcular y mostrar media
			System.out.print("La media de los números introducidos es " +(numerosAcumulados/contador));
			
		//Fin
		
	}
}

