/*
 * Nombre: t5Ej27
 * 
 * Comentario:  Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un número leído por teclado.
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
		//Leer y validar numero del usuario
		//Mostrar multiplos de 3
		//Mostrar cantidad de multiplos
		//Sumar multiplos de 3
	//Fin

import java.util.Scanner;

public class t5Ej27 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int num = 0;
		int contadorMultiplos = 0;
		
		int sumatorioMultiplos = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar numero del usuario
			do{
				System.out.print("Introduzca un numero mayor que 1 por favor: ");
				num = teclado.nextInt();
			}
			while(num<=1);
			
			System.out.println("La lista de los multiplos es: ");
			
			//Mostrar multiplos de 3
			for(int i=1; i<=num; i++){
				if(i%3==0){
					contadorMultiplos++;
					sumatorioMultiplos += i;
					System.out.println(i);
				}
			}
			
			if(contadorMultiplos == 0){
				System.out.println(" ");
				System.out.println("No hay multiplos de 3 entre 1 y " +num);
			}
			
			//Mostrar cantidad de multiplos
			System.out.println(" ");
			System.out.println("La cantidad de multiplos es: " +contadorMultiplos);
			System.out.println(" ");
			
			//Sumar multiplos de 3
			System.out.println("La suma de los multiplos es: " +sumatorioMultiplos);
			System.out.println(" ");
			
		//Fin
		
	}
}

