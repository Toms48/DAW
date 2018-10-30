/*
 * Nombre: t5Ej20
 * 
 * Comentario:  Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- Un int para la altura (h) del triángulo
 * 			- Un caracter para pintar la pirámide
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: La altura (h) tiene que ser mayor que 0
 * 
 */

//PG
	//Inicio
		//Leer y validar altura
		//Leer y validar caracter
		//Pintar pirámide
	//Fin

import java.util.Scanner;

public class t5Ej20 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int h = 0;
		char caracter = ' ';
		
		//int base = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar altura
			do{
				System.out.print("Introduzca una altura para la piramide (mayor que 0): ");
				h = teclado.nextInt();
			}
			while(h<=0);
			
			//Leer y validar caracter
			do{
				System.out.print("Introduzca un caracter para pintar la piramide: ");
				caracter = teclado.next().charAt(0);
			}
			while(h<=0);
			
			//Pintar pirámide
			
			//base = ((h-1)*2)+1;
			
			for(int i=1; i<=h; i++){
				for(int j=h-1; j>=i; j--){ //Bucle for para imprimir los espacios que están a la izquierda de la pirámide
					System.out.print(" ");
				}
				
				if(i==1){	//If para imprimir solo la punta de la pirámide
					System.out.print(caracter);
				}
				else{
					if(i==h){ //If para imprimir la base de la pirámide
						for(int l=1; l<=((h-1)*2)+1; l++){
							System.out.print(caracter);
						}
					}
					else{	//Si no tengo 
						System.out.print(caracter);
					
						for(int k=1; k<=((i-1)*2)-1; k++){
							System.out.print(" ");
						}
						
						System.out.print(caracter);
					}
				}			
				
				System.out.println("");
				
			}
			
		//Fin
		
	}
}

