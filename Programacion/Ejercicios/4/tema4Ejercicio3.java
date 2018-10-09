/*
 * Nombre: tema4Ejercicio3
 * 
 * Comentario: Con un número del 1 al 7 te dice el dia de la semana que corresponda a ese número
 * 
 * Análisis:
 * 		Entradas: un int para el dia de la semana
 * 		Salidas: Por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer el numero para un dia de la semana
		Según el número
			
		Fin_Según
	Fin
*/

import java.util.Scanner;

public class tema4Ejercicio3 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int numero = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer el numero para un dia de la semana
			System.out.print("Introduzca un numero del 1 al 7: ");
			numero = teclado.nextInt();
			
			//Según el número
			switch(numero){
				case 1:
					System.out.println("Lunes");
				break;
				
				case 2:
					System.out.println("Martes");
				break;
				
				case 3:
					System.out.println("Miercoles");
				break;
				
				case 4:
					System.out.println("Jueves");
				break;
				
				case 5:
					System.out.println("Viernes");
				break;
				
				case 6:
					System.out.println("Sabado");
				break;
				
				case 7:
					System.out.println("Domingo");
				break;
			} //Fin_Según
		//Fin
		
	}
}

