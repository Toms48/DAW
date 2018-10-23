/*
 * Nombre: tema4Ejercicio22
 * 
 * Comentario: Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * 				Se considerará que el fin de semana comienza el viernes a las 15:00h.
 * 				Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- String para el día de la semana
 * 			- int para la hora
 * 			- int para los minutos
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer el dia, las horas y los minutos
		//Según el día
			//caso Lunes
				//Calcular tiempo hasta el final del día
				//Calcular tiempo hasta el viernes
			//caso Martes
				//Calcular tiempo hasta el final del día
				//Calcular tiempo hasta el viernes
			//caso Miercoles
				//Calcular tiempo hasta el final del día
				//Calcular tiempo hasta el viernes
			//caso Jueves
				//Calcular tiempo hasta el final del día
			//caso Viernes
				//Calcular tiempo hasta el viernes
		//Fin_Según
		//Si dia es viernes
			//Mostrar los minutos que quedan
		//Sino
			//Mostrar los minutos que quedan
		//Fin_Si
	//Fin

import java.util.Scanner;

public class tema4Ejercicio22 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int hora = 0;
		int minuto = 0;
		
		int horaRest = 0;
		int minutoRest = 0;
		int minutosPorMedio = 0; //Los minutos que hay en los dias de por medio hasta el viernes
		
		boolean error = false;
		
		String dia = "";
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer el dia, las horas y los minutos
			System.out.print("Introduzca un dia de la semana: ");
			dia = teclado.next();
			
			System.out.print("Introduzca una hora: ");
			hora = teclado.nextInt();
			
			System.out.print("Introduzca un minuto: ");
			minuto = teclado.nextInt();
			
			//Según el día
			switch(dia){
				case "lunes":
					//Calcular tiempo hasta el final del día
					horaRest = (23-hora);
					minutoRest = (60-minuto);
					//Calcular tiempo hasta el viernes
					minutosPorMedio = 4320;
				break;
				
				case "martes":
					//Calcular tiempo hasta el final del día
					horaRest = (23-hora);
					minutoRest = (60-minuto);
					//Calcular tiempo hasta el viernes
					minutosPorMedio = 2880;
				break;
				
				case "miercoles":
					//Calcular tiempo hasta el final del día
					horaRest = (23-hora);
					minutoRest = (60-minuto);
					//Calcular tiempo hasta el viernes
					minutosPorMedio = 1440;
				break;
				
				case "jueves":
					//Calcular tiempo hasta el final del día
					horaRest = (23-hora);
					minutoRest = (60-minuto);
				break;
				
				case "viernes":
					//Calcular tiempo hasta el viernes
					horaRest = (14-hora);
					minutoRest = (60-minuto);
				break;
				
			}//Fin_Según
			
			//Si dia es viernes
			if(dia.equals("viernes")){
				//Mostrar los minutos que quedan
				System.out.println(" ");
				System.out.println("Queda/n " +((minutoRest) + (horaRest*60)) +" minuto/s");
				System.out.println(" ");
			}
			else{
				//Mostrar los minutos que quedan
				System.out.println(" ");
				System.out.println("Queda/n " +( ((minutoRest) + (horaRest*60))+900+minutosPorMedio ) +" minuto/s");
				System.out.println(" ");
			}//Fin_Si
			
		//Fin
		
	}
}

