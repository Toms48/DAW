/*
 * Nombre: t5Ej30
 * 
 * Comentario:  Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
 * 				No se tendrán en cuenta los minutos ni los segundos.
 * 				El día de la semana se puede pedir como un número (del 1 al 7) o como una cadena (de "lunes" a "domingo").
 * 				Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.
 * 
 * Análisis
 * 
 * 		Entradas: Un String para el dia de la semana
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos: El segundo dia tiene que ser posterior al primero
 * 
 */

//PG
	//Inicio
		//Leer y validar primer y segundo dia
		//Calcular horas transcurridas
		//Mostrar horas
	//Fin

import java.util.Scanner;

public class t5Ej30 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		String sDia1 = "";
		String sDia2 = "";
		
		int iDia1 = 0;
		int iDia2 = 0;
		
		int hora1 = 0;
		int hora2 = 0;
		
		int horasPorMedio = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar primer y segundo dia
			do{
				System.out.println("Por favor, introduzca la primera hora.");
				do{
					System.out.print("Dia: ");
					sDia1 = teclado.next();
					
					switch(sDia1){
						case "lunes":
							iDia1 = 1;
						break;
						
						case "martes":
							iDia1 = 2;
						break;
						
						case "miercoles":
							iDia1 = 3;
						break;
						
						case "jueves":
							iDia1 = 4;
						break;
						
						case "viernes":
							iDia1 = 5;
						break;
						
						case "sabado":
							iDia1 = 6;
						break;
						
						case "domingo":
							iDia1 = 7;
						break;
						
						default:
							iDia1 = 0;
						break;
					}
				}
				while(iDia1 == 0);
				
				do{
					System.out.print("Hora: ");
					hora1 = teclado.nextInt();
				}
				while(hora1<0 || hora1>23);
				
				System.out.println("Por favor, introduzca la segunda hora.");
				do{
					System.out.print("Dia: ");
					sDia2 = teclado.next();
					
					switch(sDia2){
						case "lunes":
							iDia2 = 1;
						break;
						
						case "martes":
							iDia2 = 2;
						break;
						
						case "miercoles":
							iDia2 = 3;
						break;
						
						case "jueves":
							iDia2 = 4;
						break;
						
						case "viernes":
							iDia2 = 5;
						break;
						
						case "sabado":
							iDia2 = 6;
						break;
						
						case "domingo":
							iDia2 = 7;
						break;
						
						default:
							iDia2 = 0;
						break;
					}
				}
				while(iDia2 == 0);
				
				do{
					System.out.print("Hora: ");
					hora2 = teclado.nextInt();
				}
				while(hora2<0 || hora2>23);
				
			}
			while(iDia2<iDia1 || (iDia1==iDia2 && hora2<hora1));
			
			//Calcular horas transcurridas
			switch((iDia2-iDia1)-1){
				case 0:
					horasPorMedio = (23-hora1)+(hora2);
				break;
				
				case 1:
					horasPorMedio = 24+(23-hora1)+(hora2);
				break;
				
				case 2:
					horasPorMedio = 48+(23-hora1)+(hora2);
				break;
				
				case 3:
					horasPorMedio = 72+(23-hora1)+(hora2);
				break;
				
				case 4:
					horasPorMedio = 96+(23-hora1)+(hora2);
				break;
				
				case 5:
					horasPorMedio = 120+(23-hora1)+(hora2);
				break;
				
			}
			
			//Mostrar horas
			//Muestro el String final con las horas pero utilizando printf en las horas introducidas para se vea bonito
			System.out.printf ("Entre las %02d", (hora1));
			System.out.print(":00h del " +sDia1 +" y las ");
			System.out.printf ("%02d",(hora2));
			System.out.println(":00h del " +sDia2 +" hay " +horasPorMedio +" horas/s");
			
			//System.out.println("Entre las " +hora1 +":00h del " +sDia1 +" y las " +hora2 +":00h del " +sDia2 +" hay " +horasPorMedio +" horas/s");
			
		//Fin
		
	}
}

