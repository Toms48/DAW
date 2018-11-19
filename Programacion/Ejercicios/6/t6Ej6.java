/*
 * Nombre: t6Ej6
 * 
 * Comentario:  Escribe un programa que piense un número al azar entre 0 y 100.
 * 				El usuario debe adivinarlo y tiene para ello 5 oportunidades.
 * 				Después de cada intento fallido, el programa dirá cuántas oportunidades quedan
 * 				y si el número introducido es menor o mayor que el número secreto.
 * 
 * Análisis
 * 
 * 		Entradas: Un int
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Creo numero secreto
		//Hacer
			//Leer y validar numero del usuario
			
			//Si numero del usuario es distinto al secreto
				//Mostrar fallo y cantidad de intentos restantes
				
				//Si el numero del usuario es mayor que el secreto
					//Mostrar mensaje de que el secreto es menor
				//Sino
					//Mostrar mensaje de que el secreto es mayor
				//Fin_Si
				
				//Aumentar contador de intentos
				
			//Sino
				//El numero es correcto
			//Fin_Si
			
		//Mientras intentos sean menor o igual que 5 y correcto sea false
	//Fin

import java.util.Scanner;
import java.lang.Math;

public class t6Ej6 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int numero = 0;
		int contadorIntentos = 1;
		int numeroSecreto = 0;
		
		boolean correcto = false;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Creo numero secreto
			numeroSecreto = (int)(Math.random()*101);
			System.out.println(numeroSecreto);
			//Hacer
			do{
				//Leer y validar numero del usuario
				do{
					System.out.print("Intento numero " +(contadorIntentos) +": ");
					numero = teclado.nextInt();
				}
				while(numero<0 || numero>100);
				
				//Si numero del usuario es distinto al secreto
				if(numero!=numeroSecreto){
					//Mostrar fallo y cantidad de intentos restantes
					System.out.println("No es correcto. Le queda " +(5-contadorIntentos) +" intentos.");
					
					if(contadorIntentos!=5){
						//Si el numero del usuario es mayor que el secreto
						if(numero>numeroSecreto){
							//Mostrar mensaje de que el secreto es menor
							System.out.println("El numero secreto es menor");
							System.out.println(" ");
						}else{
							//Mostrar mensaje de que el secreto es mayor
							System.out.println("El numero secreto es mayor");
							System.out.println(" ");
						}//Fin_Si
					}
					
					//Aumentar contador de intentos
					contadorIntentos++;
					
				}else{
					//El numero es correcto
					correcto=true;
				}
				
			}
			while(contadorIntentos<=5 && correcto!=true); //Mientras intentos sean menor o igual que 5 y correcto sea false
			
			if(contadorIntentos>5){
				System.out.println(" ");
				System.out.println("Has agotado tus intentos y no has acertado... ");
				System.out.println("El numero secreto era el " +numeroSecreto);
			}
			else{
				System.out.println(" ");
				System.out.println("ENHORABUENA! Has acertado!");
			}
			
		//Fin
		
	}
}

