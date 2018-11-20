/*
 * Nombre: t7Ej4
 * 
 * Comentario:  Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
 * 				Carga el array numero con valores aleatorios entre 0 y 100.
 * 				En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
 * 				En el array cubo se deben almacenar los cubos de los valores que hay en numero.
 * 				Acontinuación, muestra el contenido de los tres arrays dispuesto entres columnas.
 * 
 * Análisis:
 * 
 * 		Entradas: No hay
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: No tiene
 */

//PG
	//Inicio
		//Cargar array de numeros con aleatorios
		//Cargar array de cuadrados
		//Cargar array de cubos
		//Mostrar resultados en tres columnas
	//Fin

import java.lang.Math;

public class t7Ej4 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int aleatorio = 0;
		
		//Inicializaciones
		int[] aNumeros = new int[20];
		int[] aCuadrados = new int[20];
		int[] aCubos = new int[20];
		
		
		//Inicio
			//Cargar array de numeros con aleatorios, cargar array cuadrados y cubos
			for(int i=0; i<=19; i++){
				aleatorio = (int)(Math.random()*101);
				aNumeros[i] = aleatorio; //Cargo el array de numeros el aleatorio que ha salido
				
				aCuadrados[i] = aleatorio*aleatorio; //Cargo el array de cuadrados con multiplicando el aleatorio por el mismo
				aCubos[i] = aleatorio*aleatorio*aleatorio; //Cargo el array de cubos
			}
			
			//Mostrar resultados en tres columnas
			System.out.println("o----------o----------o----------o");
			System.out.println("|  Numero  | Cuadrado |   Cubo   |");
			System.out.println("o----------o----------o----------o");
			
			for(int i=0; i<=19; i++){
				System.out.printf("|%10d|%10d|%10d|\n", (aNumeros[i]),(aCuadrados[i]),(aCubos[i]));
			}
			
			System.out.println("o----------o----------o----------o");
			
		//Fin
		
	}
}

