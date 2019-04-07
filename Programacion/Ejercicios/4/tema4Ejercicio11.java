/*
 * Nombre: tema4Ejercicio11
 * 
 * Comentario:  Escribe un programa que dada una hora determinada (horas y minutos),
 * 				calcule los segundos que faltan para llegar a la medianoche.
 * 
 * Análisis
 * 		Entradas:
 * 			- int para la hora
 * 			- int para los minutos
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer las horas y los minutos
		//Calcular la diferencia de tiempo entre la hora introducida y las 00:00
		//Pasar las horas y los minutos de la dir¡ferencia a segundos
		//Mostrar los segundos 
	//Fin
	
import java.util.Scanner;

public class tema4Ejercicio11 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int hora = 0;
		int minuto = 0;
		
		int horaRest = 0;
		int minutoRest = 0;
		
		//Inicializaciones
		Scanner teclado  = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer las horas y los minutos
			System.out.print("Introduzca una hora: ");
			hora = teclado.nextInt();
			
			System.out.print("Introduzca un minuto: ");
			minuto = teclado.nextInt();
			
			//Calcular la diferencia de tiempo entre la hora introducida y las 00:00
			if(hora == 0 && minuto == 0){
				System.out.println(" ");
				System.out.print("Ya son las 00:00");
			}
			else{
				horaRest = (23-hora);
				minutoRest = (60-minuto);
			}
			
			//Pasar las horas y los minutos de la diferencia a segundos y Mostrar los segundos
			System.out.println(" ");
			System.out.print("Quedan " +((minutoRest*60) + (horaRest*3600)) +" segundos");
			
		//Fin
		
	}
}

