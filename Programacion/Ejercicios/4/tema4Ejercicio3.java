/*
 * Nombre: tema4Ejercicio3
 * 
 * Comentario: Con un n�mero del 1 al 7 te dice el dia de la semana que corresponda a ese n�mero
 * 
 * An�lisis:
 * 		Entradas: un int para el dia de la semana
 * 		Salidas: Por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer el numero para un dia de la semana
		Seg�n el n�mero
			
		Fin_Seg�n
	Fin
*/

import java.util.Scanner;

public class tema4Ejercicio3 {
	
	public static void main (String[] args) {
		
		//Declaraci�n de variables
		int numero = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer el numero para un dia de la semana
			System.out.print("Introduzca un numero del 1 al 7: ");
			numero = teclado.nextInt();
			
			//Seg�n el n�mero
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
			} //Fin_Seg�n
		//Fin
		
	}
}

