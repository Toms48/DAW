/* Nombre: ejercicio2
 *
 * Comentario:  Lo que pone en el examen.
 *
 * Análisis:
 * 		Entradas:  No tiene
 *
 * 		Salidas: Pinta por pantalla
 *
 * 		Requisitos:
 * 			- Numeros de la quiniela aleatorios entre 1 49 incluidos *49 +1
 * 			- Al sugerir una combinacion no puede sugerir numeros negativos ni el 0
 *
 */

//PG
/*
	//Inicio
		//Para contador = 0, mientras contador sea menor o igual a 5, aumentar contador
			//Generar aleatorio
			//Cargarlo en el arrayGanador
		//Fin_Para
		
		//Para contador = 0, mientras contador sea menor o igual que 5, aumentar contador
			//Para contador2: recorre el arrayGanador
				//Si el numero de la posicion contador de arrayGanador es igual al numero del arrayUsuario en la posicion contador2
					//Aumentar contador de aciertos
				//Fin_Si
			//Fin_Para
		//Fin_Para
		
		//Mostrar combinacion ganadora
		//Mostrar apuesta del usuario
		//Mostrar numero de aciertos
		
		//Si el numero de aciertos es menor que 3
			//Mostrar apuesta sugerida
		//Fin_Si
	//Fin
*/

import java.lang.Math;

public class ejercicio2 {
	public static void main(String[] args){
		
		//Declaracion de variables
		int aleatorio = 0;
		
		int aciertos = 0;
		
		int[] arrayGanador = {1,2,3,4,5,6};//new int[6];
		int[] arrayUsuario = {3,25,41,42,45,49};
		
		//Inicializaciones
		
		//Inicio
			//Para contador = 0, mientras contador sea menor o igual a 5, aumentar contador
			for(int i=0; i<=5; i++) {
				//Generar aleatorio
				aleatorio = (int)(Math.random()*49)+1;
				
				//Cargarlo en el arrayGanador
				arrayGanador[i] = aleatorio;
				
			}//Fin_Para
			
			//Para contador = 0, mientras contador sea menor o igual que 5, aumentar contador
			for(int i=0; i<=5; i++) {
				//Para contador2: recorre el arrayUsuario
				for(int j:arrayUsuario) {
					//Si el numero de la posicion contador de arrayGanador es igual al numero del arrayUsuario en la posicion contador2
					if(arrayGanador[i] == j) {
						//Aumentar contador de aciertos
						aciertos++;
						
					}//Fin_Si
				}//Fin_Para
			}//Fin_Para
			
			//Mostrar combinacion ganadora
			System.out.print("La combinacion ganadora del dia 13 de Diciembre ha sido: ");
			for(int i=0; i<=5; i++){
				
				System.out.print(arrayGanador[i] +" ");
			}
		
			
			
			System.out.println(" ");
			System.out.println(" ");
			
			//Mostrar apuesta del usuario
			System.out.println("Tu apuesta fue la siguiente: 3 25 41 42 45 49");
			
			System.out.println(" ");
			
			//Mostrar numero de aciertos
			System.out.println("Tu numero de aciertos es: " +aciertos);
	
			System.out.println(" ");
			
			if(aciertos==6){
				System.out.println("ENHORABUENA HAS GANADO!");
			}
			else{
				System.out.println("Suerte la proxima vez");
			}
			
			System.out.println(" ");
			
			//Si el numero de aciertos es menor que 3
			if(aciertos<3) {
				//Mostrar apuesta sugerida
				System.out.print("Quizas deberias jugar esta combinacion: ");
				
				for(int i:arrayGanador){
					if((i-1)==0){
						System.out.print((i) +" "); //Si el primer numero menos uno es 0, simplemente no le resto nada, dejo el uno
													//(Porque siempre va a pasar con el uno)
					}
					else{
						System.out.print((i-1) +" ");
					}
				}
			}//Fin_Si
		//Fin
		
	}
}
