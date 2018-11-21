/*
 * Nombre: T6Ej10
 * 
 * Comentario:  Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 * 				El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @.
 * 				Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
 * 
 * Análisis
 * 
 * 		Entradas: No tiene
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: Los unicos caracteres que se pueden imprimir son *, -, =, ., | y @.
 * 
 */

//PG
	//Inicio
		//Para contador=1, mientras contador sea menor o igual que 10, aumentar contador
			//Generar aleatorio para el numero de caracteres
			//Para contador=1, mientras sea menor o igual que aleatorio, aumentar contador
				//Generar aleatorio para el caracter
				//Segun el caracter aleatorio
					//Caso 1
						//Imprimir *
					//Caso 2
						//Imprimir -
					//Caso 3
						//Imprimir =
					//Caso 4
						//Imprimir .
					//Caso 5
						//Imprimir |
					//Caso 6
						//Imprimir @
				//Fin_Segun
			//Fin_Para
		//Fin_Para
	//Fin

import java.lang.Math;

public class T6Ej10 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		int nCaracteres = 0;
		int vCaracter = 0;
		
		//Inicializaciones
		
		//Inicio
			//Para contador=1, mientras contador sea menor o igual que 10, aumentar contador
			for(int i=1; i<=10; i++){
				//Generar aleatorio para el numero de caracteres
				nCaracteres = (int)(Math.random()*40)+1;
				
				//Para contador=1, mientras sea menor o igual que aleatorio, aumentar contador
				for(int j=1; j<=nCaracteres; j++){
					//Generar aleatorio para el caracter
					vCaracter = (int)(Math.random()*6)+1;
					
					//Segun el caracter aleatorio
					switch(vCaracter){
						case 1:
							//Imprimir *
							System.out.print("*");
						break;
							
						case 2:
							//Imprimir -
							System.out.print("-");
						break;
						
						case 3:
							//Imprimir =
							System.out.print("=");
						break;
							
						case 4:
							//Imprimir .
							System.out.print(".");
						break;
						
						case 5:
							//Imprimir |
							System.out.print("|");
						break;
						
						case 6:
							//Imprimir @
							System.out.print("@");
						break;
						
					}//Fin_Segun
				}//Fin_Para
				
				System.out.println("");
				
			}//Fin_Para
		//Fin
		
	}
}

