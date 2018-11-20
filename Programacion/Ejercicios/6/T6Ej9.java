/* Nombre: T6Ej9
 * 
 * Comentario:  Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
 * 				y que no termine de generar números hasta que no saque el 24.
 * 				El programa deberá decir al final cuántos números se han generado.
 * 
 * Análisis:
 * 		Entra:  No tiene
 * 
 * 		Salida: Pinta por pantalla
 */

//PG
	//Inicio
		//Hacer
			//Generar numero aleatorio
			//Si aleatorio es par
				//Aumentar contador de numeros
			//Fin_Si
		//Mientras aleatorio sea distinto de 24
		//Mostrar cantidad de numeros generados
	//Fin

import java.lang.Math;

public class T6Ej9 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int aleatorio = 0;
		
		int contador = 0;
		
		//Inicializaciones
		
		//Inicio
			//Hacer
			do{
				//Generar numero aleatorio
				aleatorio = (int)(Math.random()*101);
				
				//Si aleatorio es par
				if(aleatorio%2==0){
					//System.out.print(aleatorio +" ");   //Linea para ver los pares que van saliendo
					//Aumentar contador de numeros
					contador++;
				}//Fin_Si
			}
			while(aleatorio!=24);//Mientras aleatorio sea distinto de 24
			
			//Mostrar cantidad de numeros generados
			System.out.println("He generado " +(contador-1) +" numeros pares, antes del 24");
			
		//Fin
		
	}
}

