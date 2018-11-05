/*
 * Nombre: t5Ej29
 * 
 * Comentario:  Escribe un programa que calcule el factorial de un número entero leído por teclado.
 * 
 * Análisis
 * 
 * 		Entradas: Un int para el numero del usuario
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Leer y validar numero
		//Calcular el factorial
		//Mostrar factorial
	//Fin

import java.util.Scanner;

public class t5Ej29 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int numero = 0;
		
		int factorial = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar numero
			do{
				System.out.print("Por favor introduzca un numero mayor que cero: ");
				numero = teclado.nextInt();
				
				factorial = numero;
			}
			while(numero<0);
			
			//Calcular el factorial
			for(int i=1; i<=numero-1; i++){
				factorial = factorial*(numero-i);
			}
			
			//Mostrar factorial
			if(numero==0){
				System.out.println("0! = 1");
			}
			else{
				System.out.println(numero +"! = " +factorial);
			}
			
		//Fin
		
	}
}

