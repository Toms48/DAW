/* Nombre: T6Ej4
 * 
 * Comentario:  Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 * 
 * Análisis:
 * 		Entra:  No tiene
 * 
 * 		Salida: Pinta por pantalla
 * 
 * 
 */
 
//PG
	//Inicio
		//Para contador=1, mientras contador sea <=20, aumentar contador
			//Crea y mostrar numero aleatorio
		//Fin_Para
	//Fin

import java.lang.Math;

public class T6Ej4 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		
		//Inicializaciones
		
		//Inicio
			System.out.println("20 numeros aleatorios entre 0 y 10: ");
		
			//Para contador=1, mientras contador sea <=20, aumentar contador
			for(int i=1; i<=20; i++){
				//Crea y mostrar numero aleatorio
				System.out.print((int)(Math.random()*11) +" ");
			}//Fin_Para
			System.out.println(" ");
		//Fin
		
	}
}

