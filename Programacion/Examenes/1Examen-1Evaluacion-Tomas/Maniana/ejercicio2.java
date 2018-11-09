/*
 * Nombre: ejercicio2
 * 
 * Comentario:  Crea una aplicación que dibuje dos escaleras de números, la segunda escalera está invertida respecto a la primera.
 * 				Además debes registrar cuántos números se han pintado.
 * 
 * 				Ejemplo: Altura = 5
 * 				
 * 					2
 * 					23
 * 					234
 * 					2345
 * 					23456
 * 					23456
 * 					2345
 * 					234
 * 					23
 * 					2
 * 
 * Análisis
 * 
 * 		Entradas:  Un int para la altura
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisito: La altura introducida no puede ser menor o igual que 0
 * 
 */

//PG
	//Inicio
		//Leer y validar la altura
		//Pintar escalera 1
		//Pintar escalera 2 (inversa de la 1)
		//Mostrar cantidad de numeros introducidos
	//Fin

import java.util.Scanner;

public class ejercicio2 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int altura = 0;
		
		int contadorNumeros = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar la altura
			do{
				System.out.print("Escribe una altura: ");
				altura = teclado.nextInt();
			}
			while(altura<=0);
			
			System.out.println(" ");
			
			//Pintar escalera 1
				for(int i=1; i<=altura; i++){
					
					for(int j=1; j<i; j++){
						System.out.print(j+1);
						contadorNumeros++;
					}
					contadorNumeros++;
					
					System.out.print(i+1);
					System.out.print("\n");
				}
				
			//Pintar escalera 2 (inversa de la 1)
			for(int i=altura; i>=1; i--){
					
				for(int j=1; j<i; j++){
					System.out.print(j+1);
					contadorNumeros++;
				}
				contadorNumeros++;
				
				System.out.print(i+1);
				System.out.print("\n");
			}
			
			//Mostrar cantidad de numeros introducidos
			System.out.println(" ");
			System.out.println("Se han introducido " +contadorNumeros +" numeros.");
			
		//Fin
		
	}
}

