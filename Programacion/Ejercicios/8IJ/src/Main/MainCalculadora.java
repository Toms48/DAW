package Main;

/*
 *   Nombre:	MainCalculadora
 *
 *   Comentario:    Muestra un menú con las distintas opciones de los ejercicios del boletín, desde el 1 al 14
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un int para la opcion del menu
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: La opción del menu tiene que ser entre 0 y 14
 *
 * */

/*

//PG
	//Inicio
		//Mostrar, leer y validar opcion del menu
		//Leer y validar opcion del menu
		//Segun opcion del menu
			//caso 0: salir
			//caso 1:  ejercicio 1
			
			//caso 14: ejercicio 14
		//Fin_Segun
	//Fin

*/

import Gestora.Gestora8IJ;
import Gestora.CambiosBase8IJ;

import java.util.Scanner;

public class MainCalculadora {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int opcionMenu = 0;
		int potenciaPilas = 5;
		
		int numero = 0; //Tambien lo utilizo como base en la potencia
		int exponente = 0;
		int posicion = 0; //Es la posicion del numero que me dice el usuario (ejercicio 7)
		int digito = 0; //Es el numero que el usuario quiere buscar en un numero que introduce
		int cantidadQuitar = 0;
		int aniadido = 0;
		int inicial = 0;
		int finall = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Hacer
			do{
				//Mostrar, leer y validar opcion del menu
				do{
					Gestora8IJ.mostrarMenuCalculadora();
					opcionMenu = teclado.nextInt();
					
					if(opcionMenu>18 || opcionMenu<0){
						System.out.println("Por favor, introduzca un numero del menu, gracias.");
					}
					
				}
				while(opcionMenu<0 || opcionMenu>18);
				
				//Segun opcion del menu
				switch(opcionMenu){
					case 0:
						System.out.println("Ashta lue");
						break;
					
					case 1:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							if(Gestora8IJ.esCapicua(numero)==true){
								System.out.println("Su numero es capicua");
							}
							else{
								System.out.println("Su numero no es capicua");
							}
							
							potenciaPilas--;
						}
						break;
					
					case 2:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							if(Gestora8IJ.esPrimo(numero)==true){
								System.out.println("Su numero es primo");
							}
							else{
								System.out.println("Su numero no es primo");
							}
							potenciaPilas--;
						}
						break;
					
					case 3:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							System.out.println("El siguiente numero primo de " +numero +" es " +Gestora8IJ.siguientePrimo(numero));
							potenciaPilas--;
						}
						break;
					
					case 4:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca una base: ");
							numero = teclado.nextInt();
							
							System.out.print("Introduzca un exponente: ");
							exponente = teclado.nextInt();
							
							if(numero == 0 && exponente == 0){
								System.out.println("Cero elevado a cero es una indeterminacion to chunga que yo no puedo hacer, sorry not sorry");
							}
							else {
								System.out.println("El resultado de la potencia es " + Gestora8IJ.potencia(numero, exponente));
								potenciaPilas--;
							}
						}
						break;
					
					case 5:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							System.out.println("La cantidad de digitos de " +numero +" es " +Gestora8IJ.digitos(numero));
							potenciaPilas--;
						}
						break;
					
					case 6:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							System.out.println("Su numero volteado es " +Gestora8IJ.voltea(numero));
							potenciaPilas--;
						}
						break;
					
					case 7:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							do{
								System.out.print("Introduzca una posicion: ");
								posicion = teclado.nextInt();
								
								if(posicion<0 || posicion>Gestora8IJ.digitos(numero)-1){
									System.out.println("Introduzca una posicion valida (de 0 a " +(Gestora8IJ.digitos(numero)-1) +")");
								}
								
							}
							while(posicion<0 || posicion>Gestora8IJ.digitos(numero)-1);
							
							System.out.println("El digito de la posicion " +posicion +" es: " +Gestora8IJ.digitoN(numero,posicion));
							potenciaPilas--;
						}
						break;
					
					case 8:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							System.out.print("Introduzca un digito: ");
							digito = teclado.nextInt();
							
							if(Gestora8IJ.posicionDeDigito(numero,digito)==-1){
								System.out.println("El numero no contiene el digito especificado");
							}
							else {
								System.out.println("La posicion del digito en el numero es: " + Gestora8IJ.posicionDeDigito(numero, digito));
							}
							potenciaPilas--;
						}
						break;
					
					case 9:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							System.out.print("Introduzca una cantidad de numeros a quitar por detras: ");
							cantidadQuitar = teclado.nextInt();
							
							System.out.println(Gestora8IJ.quitaPorDetras(numero,cantidadQuitar));
							
							potenciaPilas--;
						}
						break;
					
					case 10:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							System.out.print("Introduzca una cantidad de numeros a quitar por delante: ");
							cantidadQuitar = teclado.nextInt();
							
							System.out.println(Gestora8IJ.quitaPorDelante(numero,cantidadQuitar));
							potenciaPilas--;
						}
						break;
					
					case 11:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							System.out.print("Introduzca un numero para aniadir por detras: ");
							aniadido = teclado.nextInt();
							
							System.out.println(Gestora8IJ.pegaPorDetras(numero,aniadido));
							potenciaPilas--;
						}
						break;
					
					case 12:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							System.out.print("Introduzca un numero para aniadir por delante: ");
							aniadido = teclado.nextInt();
							
							System.out.println(Gestora8IJ.pegaPorDelante(numero,aniadido));
							potenciaPilas--;
						}
						break;
					
					case 13:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.print("Introduzca un numero: ");
							numero = teclado.nextInt();
							
							do{
								do{
									System.out.print("Introduzca una posicion inicial: ");
									inicial = teclado.nextInt();
								}
								while(inicial<1);
								
								do{
									System.out.print("Introduzca una posicion final: ");
									finall = teclado.nextInt();
								}
								while(finall>Gestora8IJ.digitos(numero));
							}
							while(finall<inicial);
							
							System.out.println(Gestora8IJ.trozoDeNumero(numero,inicial,finall));
							potenciaPilas--;
						}
						break;
					
					case 14:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.println("WIP");
							potenciaPilas--;
						}
						break;
					
					case 15:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.println("WIP");
							potenciaPilas--;
						}
						break;
					
					case 16:
						if(potenciaPilas==0){
							System.out.println("No te quedan pilas, tienes que cambiarlas");
						}
						else{
							System.out.println("WIP");
							potenciaPilas--;
						}
						break;
					
					case 17:
						if(potenciaPilas>=2){
							System.out.println("Pilas ya cambiadas");
						}
						else{
							potenciaPilas = 5;
							System.out.println("Se han cambiado las pilas correctamente");
						}
						break;
					
					case 18:
						System.out.println("La potencia de las pilas es de " +potenciaPilas);
						break;
				}
				//Fin_Segun
			}
			while(opcionMenu!=0);
		
		//Fin
		
	}
}
