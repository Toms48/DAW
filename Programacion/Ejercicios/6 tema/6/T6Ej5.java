/* Nombre: T6Ej5
 * 
 * Comentario:  Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
 * 				Muestra también el máximo, el mínimo y la media deesosnúmeros.
 * 
 * Análisis:
 * 		Entra:  No tiene
 * 
 * 		Salida: Pinta por pantalla
 */

//PG
	//Inicio
		//Para contador=1, mientras contador sea <=20, aumentar contador
			//Crea y mostrar numero aleatorio
			
			//Si aleatorio es menor que min
				//aleatorio es el nuevo min
			//Fin_Si
			
			//Si aleatorio es mayor que max
				//aleatorio es el nuevo max
			//Fin_Si
			
			//Almacenar numero aleatorio
			
		//Fin_Para
		//Mostrar minimo
		//Mostrar maximo
		//Calcular y mostrar la media
	//Fin

import java.lang.Math;

public class T6Ej5 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int aleatorio = 0;
		
		int min = 500;
		int max = -500;
		
		int acumuladorAleatorios = 0;
		
		//Inicializaciones
		
		//Inicio
			//Para contador=1, mientras contador sea <=50, aumentar contador
			for(int i=1; i<=50; i++){
				//Crea y mostrar numero aleatorio
				aleatorio = (int)(Math.random()*100)+100;
				System.out.print(aleatorio +" ");
				
				//Si aleatorio es menor que min
				if(aleatorio<min){
					//aleatorio es el nuevo min
					min = aleatorio;
				}//Fin_Si
				
				//Si aleatorio es mayor que max
				if(aleatorio>max){
					//aleatorio es el nuevo max
					max = aleatorio;
				}//Fin_Si
				
				//Almacenar numero aleatorio
				acumuladorAleatorios += aleatorio;
				
			}//Fin_Para
			
			System.out.println(" ");
			System.out.println(" ");
			
			//Mostrar minimo
			System.out.println("El menor numero que ha salido es: " +min);
			
			//Mostrar maximo
			System.out.println("El mayor numero que ha salido es: " +max);
			
			//Calcular y mostrar la media
			System.out.println("La media de los numeros que han salido es: " +(acumuladorAleatorios/50));
			
		//Fin
		
	}
}

