/*
 * Nombre: t6Ej14
 * 
 * Comentario:  Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * 				El programa intentará adivinar el número que estás pensando (un número entre 0 y 100) teniendo para ello 5 oportunidades. 
 * 				En cada intento fallido, el programa debe preguntar si el número que estás pensando es mayor o menor que el que te acaba de decir
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
		//Leer y validar numero secreto
		//Hacer
			//Crear numero aleatorio entre minimo y maximo
			//Si numero del pc es distinto al secreto
				//Mostrar fallo y cantidad de intentos restantes
				//Preguntar si es mayor o menor
				//Leer y validar respuesta del usuario
				
				//Si es mayor
					//Minimo es el último numero que ha dicho el pc
				//Sino
					//Maximo es el último número qeu ha dicho el pc
				//Fin_Si
				
				//Aumentar contador de intentos
				
			//Sino
				//El número es correcto
			//Fin_Si
			
		//Mientras intentos sean menor o igual que 5 y correcto sea false
	//Fin

import java.util.Scanner;
import java.lang.Math;

public class t6Ej14 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int numeroSecreto = 0;
		int numeroPc = 0;
		int contadorIntentos = 1;
		
		int min = 0;
		int max = 101;
		
		boolean correcto = false;
		
		String respuesta = " ";
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar numero secreto
			do{
				System.out.print("Escriba un numero entre 0 y 100 para que la maquina lo adivine: ");
				numeroSecreto = teclado.nextInt();
			}
			while(numeroSecreto<0 || numeroSecreto>100);
			
			//Hacer
			do{
				//Crear numero aleatorio entre minimo y maximo
				numeroPc = (int)(Math.random()*(max-min))+min;
				System.out.println(numeroPc);
				
				//Si numero del pc es distinto al secreto
				if(numeroPc!=numeroSecreto){
					
					//Mostrar fallo y cantidad de intentos restantes
					System.out.println("No es correcto. Le queda " +(5-contadorIntentos) +" intentos.");
					
					//Preguntar si es mayor o menor
					System.out.println("Humano, indiqueme si su numero es mayor o menor al mio.");
					System.out.print("Respuesta (mayor/menor): ");
					
					//Leer y validar respuesta del usuario
					do{
						respuesta = teclado.next();
						
					}
					while(respuesta.equals("mayor")==false && respuesta.equals("menor")==false);
					
					System.out.println("Contador de intentos antes: " +contadorIntentos);
					
					if(contadorIntentos!=5){
						//Si es mayor
						if(respuesta.equals("mayor")==true){
							//Minimo es el último numero que ha dicho el pc
							min = numeroPc+1;
							System.out.println("Nuevo minimo " +min);
						}
						else{
							//Maximo es el último número qeu ha dicho el pc
							max = numeroPc;
							System.out.println("Nuevo maximo " +max);
						}//Fin_Si
					}
					//Aumentar contador de intentos
					contadorIntentos++;
					
					
				}else{
					//El número es correcto
					correcto = true;
				}//Fin_Si
				
				//teclado.nextLine();
				System.out.println("Contador de intentos despues: " +contadorIntentos);
			}
			while(contadorIntentos<5 && correcto!=true);//Mientras intentos sean menor o igual que 5 y correcto sea false
			
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

