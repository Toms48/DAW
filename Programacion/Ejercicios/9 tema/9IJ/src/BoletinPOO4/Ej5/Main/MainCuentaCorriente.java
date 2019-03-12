/*
 *   Nombre:	MainCuentaCorriente
 *
 *   Comentario:    Se desea llevar un control del estado de una cuenta corriente
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un int para la opcion del menu
 *       	- Un double para la cantidad (que ingresamos o extraemos)
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos:
 *
 * */

/*

//PG
	//Inicio
		//Hacer
			//Mostrar menu, leer y validar opcion
			//Segun opcion del menu
				//caso 1: Saldo
				//caso 2: imposicion
				//caso 3: reintegro
				//caso 4: traspaso
			//Fin_Segun
		//Mientras opcion del menu no sea salir
	//Fin
	
*/

package BoletinPOO4.Ej5.Main;

import BoletinPOO4.Ej5.Clases.CuentaCorriente;

import java.util.Scanner;

public class MainCuentaCorriente {
	
	public static void mostrarMenu(){
		System.out.println("1. Saldo cuenta corriente");
		System.out.println("2. Saldo cuenta ahorros");
		System.out.println("3. Imposicion");
		System.out.println("4. Reintegro");
		System.out.println("5. Traspaso");
		System.out.println("0. Salir");
		System.out.print  ("Su opcion del menu es: ");
	}
	
	public static void main(String[] args){
		
		//Declaración de variables
		int opcionMenu = 0;
		double cantidad = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		CuentaCorriente miCuenta = new CuentaCorriente();
		CuentaCorriente cuentaAhorros = new CuentaCorriente();
		
		//Inicio
			//Hacer
			do {
				//Mostrar menu, leer y validar opcion
				do{
					mostrarMenu();
					opcionMenu = teclado.nextInt();
					
					if(opcionMenu<0 || opcionMenu>5){
						System.out.println();
						System.out.println("Introduzca un valor entre 0 y 5. Gracias.");
						System.out.println();
					}
					
				}
				while(opcionMenu<0 || opcionMenu>5);
				
				//Segun opcion del menu
				switch(opcionMenu) {
					case 1:
						System.out.println();
						miCuenta.saldo();
						System.out.println();
					break;
					
					case 2:
						System.out.println();
						cuentaAhorros.saldo();
						System.out.println();
						break;
					
					case 3:
						do {
							System.out.println();
							System.out.println("Que cantidad quiere introducir?");
							System.out.print("Cantidad: ");
							
							cantidad = teclado.nextDouble();
							
							if(cantidad<=0){
								System.out.println();
								System.out.println("Introduzca un valor positivo.");
							}
							
						}
						while(cantidad<=0);
						
						miCuenta.imposicion(cantidad);
						System.out.println();
					break;
					
					case 4:
						do {
							System.out.println();
							System.out.println("Que cantidad quiere extraer?");
							System.out.print("Cantidad: ");
							
							cantidad = teclado.nextDouble();
							
							if((miCuenta.getSaldo()-cantidad) < -600){
								System.out.println();
								System.out.println("Lo sentimos, no podemos dejarle sacar tanto dinero.");
							}
							else{
								if(cantidad<=0){
									System.out.println();
									System.out.println("Introduzca un valor positivo.");
								}
							}
							
						}
						while((miCuenta.getSaldo()-cantidad) < -600 || cantidad<=0);
						
						miCuenta.reintegro(cantidad);
						System.out.println();
					break;
					
					case 5:
						do {
							System.out.println();
							System.out.println("Que cantidad quiere traspasar a la cuenta de ahorros?");
							System.out.print("Cantidad: ");
							
							cantidad = teclado.nextDouble();
							
							if(cantidad<=0){
								System.out.println();
								System.out.println("Introduzca un valor positivo.");
							}
							
						}
						while(cantidad<=0);
						
						System.out.println();
						miCuenta.traspaso(cantidad,cuentaAhorros);
						System.out.println();
					break;
					
				}//Fin_Segun
			}
			while(opcionMenu != 0);	//Mientras opcion del menu no sea salir
		
			System.out.println();
			System.out.println("Ashta luego!");
		
		//Fin
	}
}
