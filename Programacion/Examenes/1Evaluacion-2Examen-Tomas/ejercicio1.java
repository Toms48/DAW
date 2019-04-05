/* Nombre: ejercicio1
 *
 * Comentario:  Lo que pone en el examen.
 *
 * Análisis:
 * 		Entradas:  N numeros de personas (entre 5 y 10)
 *
 * 		Salidas: Pinta por pantalla
 *
 * 		Requisitos:
 * 			- La N (numero de personas) tiene que ser entre 5 y 10
 * 			- La altura no puede menor o igual que 0 ni tampoco superior a 3 metros (300cm)
 *
 */

//PG
/*
	//Inicio
		//Para contador = 1, mientras contador sea menor o igual que N, aumentar contador
			//Leer y validar altura de la persona en la posicion contador
			//Incluir altura en el sumatorio
		//Fin_Para
		//Calcular Media de las alturas
		//Para contador = 0, mientras contador sea menor o igual que N, aumentar contador
			//Si la altura de la persona en la posicion contador es superior a la media
				//Aumentar contador de superior a la media
			//Sino
				//Aumentar contador de inferior a la media
			//Fin_Si
		//Fin_Para
		//Mostrar media
		//Mostrar superiores e inferiores a esa media
	//Fin
*/

import java.util.Scanner;
import java.lang.Math;

public class ejercicio1 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int N = (int)(Math.random()*6)+5;;
		
		int contadorSuperiores = 0;
		int contadorInferiores = 0;
		
		int altura = 0;
		double sumatorioAlturas = 0;
		double mediaAlturas = 0;
		
		double[] arrayAlturas = new double[N];
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			System.out.println("Numero de personas: " +N);
			System.out.println(" ");
			System.out.println("Lectura de la altura de las personas:");
			
			//Para contador = 1, mientras contador sea menor o igual que N, aumentar contador
			for(int i=1; i<=N; i++) {
				//Leer y validar altura de la persona en la posicion contador
				do{
					System.out.print("Persona " +i +" = ");
					arrayAlturas[i-1] = teclado.nextDouble();
				}
				while(arrayAlturas[i-1]<=0 || arrayAlturas[i-1]>=300);
				
				//Incluir altura en el sumatorio
				sumatorioAlturas = sumatorioAlturas+arrayAlturas[i-1];
				
			}//Fin_Para
			
			//Calcular Media de las alturas
			mediaAlturas = sumatorioAlturas/N;
			
			//Para contador = 1, mientras contador sea menor o igual que N, aumentar contador
			for(int i=1; i<=N; i++) {
				//Si la altura de la persona en la posicion contador es superior a la media
				if(arrayAlturas[i-1]>mediaAlturas) {
					//Aumentar contador de superior a la media
					contadorSuperiores++;
				}
				else {
					if(arrayAlturas[i-1]<mediaAlturas){
						//Aumentar contador de inferior a la media
						contadorInferiores++;
					}
				}//Fin_Si
			}//Fin_Para
			
			//Mostrar media
			System.out.println(" ");
			System.out.println("Estatura media: " +mediaAlturas +" cm");
			
			//Mostrar superiores e inferiores a esa media
			System.out.println("Personas con estatura superior a la media: " +contadorSuperiores);
			System.out.println("Personas con estatura inferior a la media: " +contadorInferiores);
			
		//Fin
		
	}
}
