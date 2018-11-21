/*
 * Nombre: T6Ej11
 * 
 * Comentario:  Escribe un programa que muestre 20 notas generadas al azar.
 * 				Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente.
 * 				Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc.
 * 
 * 				Suspenso --------> 1, 2, 3 y 4
 * 				Suficiente ------> 5
 * 				Bien ------------> 6
 * 				Notable ---------> 7 y 8
 * 				Sobresaliente ---> 9 y 10
 * 
 * Análisis
 * 
 * 		Entradas: No tiene
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Para contador=1, mientras sea menor o igual que 20, aumentar contador
			//Segun nota aleatoria
				//caso 1
				//caso 2
				//caso 3
				//caso 4
					//Aumentar contador suspensos
					//Mostrar suspenso
				//caso 5
					//Aumentar contador suficientes
					//Mostrar suficiente
				//caso 6
					//Aumentar contador bienes
					//Mostrar bien
				//caso 7
				//caso 8
					//Aumentar contador notables
					//Mostrar notable
				//caso 9
				//caso 10
					//Aumentar contador sobresalientes
					//Mostrar sobresaliente
			//Fin_Segun
		//Fin_Para
		//Mostrar contadores
	//Fin

import java.lang.Math;

public class T6Ej11 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int cSuspensos = 0;
		int cSuficientes = 0;
		int cBienes = 0;
		int cNotables = 0;
		int cSobresalientes = 0;
		
		//Inicializaciones
		
		//Inicio
			//Para contador=1, mientras sea menor o igual que 20, aumentar contador
			for(int i=1; i<=20; i++){
				//Segun nota aleatoria
				switch( (int)(Math.random()*10)+1 ){
					case 1:
					case 2:
					case 3:
					case 4:
						//Aumentar contador suspensos
						cSuspensos++;
						
						//Mostrar suspenso
						System.out.println("Suspenso");
					break;
					
					case 5:
						//Aumentar contador suficientes
						cSuficientes++;
						
						//Mostrar suficiente
						System.out.println("Suficiente");
					break;
					
					case 6:
						//Aumentar contador bienes
						cBienes++;
						
						//Mostrar bien
						System.out.println("Bien");
					break;
					
					case 7:
					case 8:
						//Aumentar contador notables
						cNotables++;
						
						//Mostrar notable
						System.out.println("Notable");
					break;
					
					case 9:
					case 10:
						//Aumentar contador sobresalientes
						cSobresalientes++;
						
						//Mostrar sobresaliente
						System.out.println("Sobresaliente");
					break;
					
				}//Fin_Segun
			}//Fin_Para
			
			//Mostrar contadores
			System.out.println(" ");
			System.out.println("Cantidad de suspensos --------> " +cSuspensos);
			System.out.println("Cantidad de suficientes ------> " +cSuficientes);
			System.out.println("Cantidad de bienes -----------> " +cBienes);
			System.out.println("Cantidad de notables ---------> " +cNotables);
			System.out.println("Cantidad de sobresalientes ---> " +cSobresalientes);
		//Fin
		
	}
}

