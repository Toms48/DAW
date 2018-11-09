/*
 * Nombre: ejercicio2Tarde
 * 
 * Comentario:  ***
 * 
 * Análisis
 * 
 * 		Entradas: String para la respuesta del menu
 * 
 * 		Salidas: Por pantalla
 * 
 */

import java.util.Scanner;

public class ejercicio2Tarde {
	
	public static void main (String[] args) {
		
		String opcionMenu = " ";
		int contador = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		do{			
			System.out.println("Elija una de las siguientes opciones:");
			System.out.println("1. Numeros divisibles entre 3.");
			System.out.println("2. Numeros multiplos de 5.");
			System.out.println("Escriba -cerrar programa- para finalizar el programa.");
			opcionMenu = teclado.nextLine();
			System.out.println(" ");
			
			switch(opcionMenu){
				case "1":
					for(int i=1; i<=100; i++){
						if(i%3==0){
							if(i==99){
								System.out.print(i);
							}
							else{
								System.out.print(i +",");
							}
						}
					}
					System.out.println(" ");
				break;
				
				case "2":
					for(int i=1; i<=100; i++){
						if(i%5==0){
							if(i==100){
								System.out.print(i);
							}
							else{
								System.out.print(i +",");
							}
						}
					}
				break;
			}
			
			System.out.println(" ");
			
			contador++;
			
		}
		while(opcionMenu.equals("cerrar programa")==false);
		
		System.out.println("Se han elegido " +(contador-1) +" opciones");
		
	}
}

