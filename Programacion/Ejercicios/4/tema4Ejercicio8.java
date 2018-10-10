/*
 * Nombre: tema4Ejercicio8
 * 
 * Comentario: Decir si la media es insuficiente, suficiente, bien, notable o sobresaliente
 * 
 * Análisis:
 * 		Entradas: Tres double para las notas
 * 		Salidas: Por pantalla
 * 
 */

//PG
/*
	Inicio
		Preguntar y leer tres notas
		Calcular media
		Si la media está entre 0 y 4
			Mostrar insuficiente
		Sino
			Si media es 5
				Mostrar suficiente
			Sino
				Si media está entre 6 y 7
					Mostrar bien
				Sino
					Si media es 8
						Mostrar notable
					Sino
						Mostrar sobresaliente
					Fin_Si
				Fin_Si
			Fin_Si
		Fin_Si
	Fin
*/

import java.util.Scanner;

public class tema4Ejercicio8 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		
		double media = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer tres notas
			System.out.print("Introduzca la primera nota: ");
			nota1 = teclado.nextDouble();
			
			System.out.print("Introduzca la segunda nota: ");
			nota2 = teclado.nextDouble();
			
			System.out.print("Introduzca la tercera nota: ");
			nota3 = teclado.nextDouble();
			
			//Calcular media
			media = (nota1+nota2+nota3)/3;
			
			
			if(media>=0 && media<=4.99){
				//Mostrar insuficiente
				System.out.println("");
				System.out.println(media +" ---> Insuficiente");
				System.out.println("");
			}	
			else{
				if(media>=5 && media<=5.99){
					//Mostrar suficiente
					System.out.println("");
					System.out.println(media +" ---> Suficiente");
					System.out.println("");
				}
				else{
					if(media>=6 && media<=7.99){
						//Mostrar bien
						System.out.println(" ");
						System.out.println(media +" ---> Bien");
						System.out.println(" ");
					}	
					else{
						//Si media es 8
						if(media>=8 && media<=8.99){
							//Mostrar notable
							System.out.println(" ");
							System.out.println(media +" ---> Notable");
							System.out.println(" ");
						}
						else{
							//Mostrar sobresaliente
							System.out.println(" ");
							System.out.println(media +" ---> Sobresaliente");
							System.out.println(" ");
						} //Fin_Si
					} //Fin_Si
				} //Fin_Si
			} //Fin_Si
		//Fin
	
	}
}

