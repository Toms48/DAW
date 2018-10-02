/*
 * Nombre: ej10Extra
 * 
 * Comentario: Pedir el día, el mes y año de una fecha e indicar si la fecha es correcta.
 * 				Recordamos que existen meses con 28, 30 y 31 días. No considerar los años bisiestos.
 * 
 * Análisis: 
 * 		-Entradas: 
 * 				-Un int para el dia
 * 				-Un int para el mes
 * 				-Un int para el año 
 * 		-Salidas: Por pantalla
 * 
 */

//PG
/*
Inicio
	Preguntar y leer año
	Preguntar y leer mes
	Preguntar y leer dia
	
	Si mes es 2 y dia igual o menor que 28
		Mostrar mensaje correcto
	Sino
		Si mes es 1 o 3 o 5 o 7 o 8 o 10 o 12
			Si dia es igual o menor que 31
				Mostrar mensaje correcto
			Sino
				Mostrar error
			Fin_Si
		Sino
			Si dia es igual o menor que 30
				Mostrar mensaje correcto
			Sino
				Mostrar error
			Fin si
		Fin_Si
	Fin_Si	
Fin
*/

import java.util.Scanner;

public class ej10Extra {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int anio = 0;
		int mes = 0;
		int dia = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer año
			System.out.print("Introduzca el año: ");
			anio = teclado.nextInt();
			
			//Preguntar y leer mes
			System.out.print("Introduzca el mes: ");
			mes = teclado.nextInt();
			
			//Preguntar y leer dia
			System.out.print("Introduzca el día: ");
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
		//Fin
		
	}
}

