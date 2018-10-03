/*
 * Nombre: ej10Extra
 * 
 * Comentario: Pedir el d�a, el mes y a�o de una fecha e indicar si la fecha es correcta.
 * 				Recordamos que existen meses con 28, 30 y 31 d�as. No considerar los a�os bisiestos.
 * 
 * An�lisis: 
 * 		-Entradas: 
 * 				-Un int para el dia
 * 				-Un int para el mes
 * 				-Un int para el a�o 
 * 		-Salidas: Por pantalla
 * 
 */

import java.util.Scanner;

public class ej10Extra {
	
	public static void main (String[] args) {
		
		//Declaraci�n de variables
		int anio = 0;
		int mes = 0;
		int dia = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		/*//Inicio
			//Preguntar y leer a�o
			System.out.print("Introduzca el a�o: ");
			anio = teclado.nextInt();
			
			//Preguntar y leer mes
			System.out.print("Introduzca el mes: ");
			mes = teclado.nextInt();
			
			//Preguntar y leer dia
			System.out.print("Introduzca el d�a: ");
			dia = teclado.nextInt();
			
			if(mes==2 && dia<=28){ //Si mes es 2 y dia igual o menor que 28
				
				//Mostrar mensaje correcto
				System.out.println("Su fecha es correcta");
			
			}
			else{
				if(mes==2 && dia>28){
					System.out.println("Su fecha es incorrecta");
				}
				else{
					if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){ //Si mes es 1 o 3 o 5 o 7 o 8 o 10 o 12
						if(dia<=31){ //Si dia es igual o menor que 31
							//Mostrar mensaje correcto
							System.out.println("Su fecha es correcta");
						}
						else{
							//Mostrar error
							System.out.println("Su fecha es incorrecta");
						}
					}
					else{
						if(dia<=30){ //Si dia es igual o menor que 30
							//Mostrar mensaje correcto
							System.out.println("Su fecha es correcta");
						}
						else{
							//Mostrar error
							System.out.println("Su fecha es incorrecta");
						}
						
					}
				}

			}
		//Fin*/
		
		//Inicio
			//Preguntar y leer a�o
			System.out.print("Introduzca el a�o: ");
			anio = teclado.nextInt();
			
			//Preguntar y leer mes
			System.out.print("Introduzca el mes: ");
			mes = teclado.nextInt();
			
			//Preguntar y leer dia
			System.out.print("Introduzca el d�a: ");
			dia = teclado.nextInt();
			
			switch(mes){ //Seg�n el mes
				case 2:
					if(dia>=1 && dia<=28){ //Si dia est� entre 1 y 28 (ambos incluidos)
						//Mostrar fecha correcta
						System.out.println("Su fecha " +dia +"-" +mes +"-" +anio +" es correcta");
					}
					else{ //Sino
						//Mostrar fecha incorrecta
						System.out.println("Su fecha " +dia +"-" +mes +"-" +anio +" es incorrecta");
					}
				break;
				
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia>=1 && dia<=31){ //Si dia est� entre 1 y 31 (ambos incluidos)
						//Mostrar fecha correcta
						System.out.println("Su fecha " +dia +"-" +mes +"-" +anio +" es correcta");
					}
					else{ //Sino
						//Mostrar fecha incorrecta
						System.out.println("Su fecha " +dia +"-" +mes +"-" +anio +" es incorrecta");
					}
				break;
				
				case 4:
				case 6:
				case 9:
				case 11:
					if(dia>=1 && dia<=30){ //Si el dia est� entre 1 y 30 (ambos incluidos)
						//Mostrar fecha correcta
						System.out.println("Su fecha " +dia +"-" +mes +"-" +anio +" es correcta");
					}
					else{
						//Mostrar fecha incorrecta
						System.out.println("Su fecha " +dia +"-" +mes +"-" +anio +" es incorrecta");
					}
				break;
				
			}
		//Fin
		
	}
}

