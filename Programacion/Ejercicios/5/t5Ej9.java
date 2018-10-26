/*
 * Nombre: t5Ej9
 * 
 * Comentario: Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido por teclado.
 * 
 * An�lisis
 * 
 * 		Entradas: int para el numero
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: El numero tiene que ser positivo
 * 
 */

//PG
	//Inicio
		//Leer y validar el numero
		//Mostrar cantidad de digitos
	//Fin
	
	//Inicio
		//Leer y validar el numero
		//Si el numero es negativo
			//Pasar numero a positivo
		//Fin_Si
		//Si el numero est� entre 0 y 9
			//Mostrar cantidad de digitos
		//Sino
			//Contar los digitos del numero
			//Mostrar cantidad de digitos
		//Fin_Si
		
	//Fin

import java.util.Scanner;

public class t5Ej9 {
	
	public static void main (String[] args) {
		
		//Declaraci�n de variables
		//String numero = "";
		int numero = 0;
		int nDigitos = 0;
		int aux = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		/*//Inicio
			//Leer y validar el numero
			System.out.print("Introduzca un n�mero, le dir� cuantos digitos tiene: ");
			numero = teclado.next();
			
			//Mostrar cantidad de digitos
			System.out.println(" ");
			if(numero.length() == 1){
				System.out.println("Su numero tiene " +numero.length() +" d�gito");
			}
			else{
				System.out.println("Su numero tiene " +numero.length() +" d�gitos");
			}
			System.out.println(" ");
			
		//Fin*/
		
		//Inicio
			//Leer y validar el numero
			System.out.print("Introduzca un n�mero, le dir� cuantos digitos tiene: ");
			numero = teclado.nextInt();
			aux = numero;
			
			//Si el numero es negativo
			if(numero<0){
				//Pasar numero a positivo
				numero = numero*-1;
			}//Fin_Si
			
			//Si el numero est� entre 0 y 9
			if(numero>=0 && numero<=9){
				//Mostrar cantidad de digitos
				System.out.println("El numero " +numero +" tiene 1 d�gito");
			}
			else{
				//Contar los digitos del numero
				while(numero>0){
					/***** C�digo de prueba *****
					*System.out.println(numero%10); %10 quita la primera cifra del n�mero
					*System.out.println(numero/10); /10 quita la cifra de las unidades de nuestro n�mero
					****************************/
					
					numero = numero/10;
					
					nDigitos++;
				}
				//Mostrar cantidad de digitos
				System.out.println("El n�mero " +aux  +" tiene " +nDigitos +" d�gitos");
				
			}//Fin_Si
		//Fin
		
	}
}

