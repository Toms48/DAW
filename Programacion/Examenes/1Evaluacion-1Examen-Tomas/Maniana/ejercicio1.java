/*
 * Nombre: ejercicio1
 * 
 * Comentario:  Crea una aplicación que solicite al usuario una fecha (día, mes y año) y muestre
 * 				la fecha correspondiente al día siguiente.
 * 
 * Análisis
 * 
 * 		Entradas: 
 * 			- Un int para el dia
 * 			- Un int para el mes
 * 			- Un int para el año
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisitos:
 * 			- El año no puede ser 0
 * 			- El mes tiene que estar entre 1 y 12
 * 			- Si el mes es 2 el dia tiene que estar entre 1 y 28
 * 			- Si el mes es 1, 3, 5, 7, 8, 10 o 12 el dia tiene que estar entre 1 y 31
 * 			- Si el mes es 4, 6, 9 u 11 el dia tiene que estar entre 1 y 30
 * 
 */

//PG
	//Inicio
		//Leer y validar anio
		//Leer y validar mes
		//Leer y validar dia
		//Mostrar fecha introducida
		//Segun mes
			//caso 1
			//caso 3
			//caso 5
			//caso 7
			//caso 8
			//caso 10
				//Si dia+1>31
					//Amenta mes
					//Dia es 1
				//Sino
					//Aumenta dia
				//Fin_Si
				
			//caso 2
				//Si dia+1>28
					//Amenta mes
					//Dia es 1
				//Sino
					//Aumenta dia
				//Fin_Si
				
			//caso 4
			//caso 6
			//caso 9
			//caso 11
				//Si dia+1>30
					//Amenta mes
					//Dia es 1
				//Sino
					//Aumenta dia
				//Fin_Si
			
			//caso 12
				//Si dia+1>31
					//Amenta anio
					//Mes es 1
					//Dia es 1
				//Sino
					//Aumenta dia
				//Fin_Si
		//Fin_Segun	
		//Mostrar fecha actualizada
	//Fin


import java.util.Scanner;

public class ejercicio1 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int anio = 0;
		int mes = 0;
		int dia = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y validar anio
			do{
				System.out.print("Introduzca un anio que no sea 0: ");
				anio = teclado.nextInt();
			}
			while(anio==0);
			
			//Leer y validar mes
			do{
				System.out.print("Introduzca un mes entre 1 y 12: ");
				mes = teclado.nextInt();
			}
			while(mes<1 || mes>12);
			
			switch(mes){//Segun mes
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					//Leer y validar dia
					do{
						System.out.print("Introduzca un dia entre 1 y 31: ");
						dia = teclado.nextInt();
					}
					while(dia<1 || dia>31);
					
					//Mostrar fecha introducida
					System.out.println(" ");
					System.out.printf("%02d/%02d/" +anio +" ---> ", (dia), (mes));
					
					//Si dia+1>31
					if((dia+1)>31){
						//Amenta mes
						mes++;
						
						//Dia es 1
						dia = 1;
					}
					else{
						//Aumenta dia
						dia++;
					}//Fin_Si
				break;
					
				case 2:
					//Leer y validar dia
					do{
						System.out.print("Introduzca un dia entre 1 y 28: ");
						dia = teclado.nextInt();
					}
					while(dia<1 || dia>28);
					
					//Mostrar fecha introducida
					System.out.println(" ");
					System.out.printf("%02d/%02d/" +anio +" ---> ", (dia), (mes));
					
					//Si dia+1>28
					if((dia+1)>28){
						//Amenta mes
						mes++;
						
						//Dia es 1
						dia = 1;
					}
					else{
						//Aumenta dia
						dia++;
					}//Fin_Si
				break;
					
				case 4:
				case 6:
				case 9:
				case 11:
					//Leer y validar dia
					do{
						System.out.print("Introduzca un dia entre 1 y 30: ");
						dia = teclado.nextInt();
					}
					while(dia<1 || dia>30);
					
					//Mostrar fecha introducida
					System.out.println(" ");
					System.out.printf("%02d/%02d/" +anio +" ---> ", (dia), (mes));
					
					//Si dia+1>30
					if((dia+1)>30){
						//Amenta mes
						mes++;
						//Dia es 1
						dia = 1;
					}
					else{
						//Aumenta dia
						dia++;
					}//Fin_Si
				break;
				
				case 12:
					//Leer y validar dia
					do{
						System.out.print("Introduzca un dia entre 1 y 31: ");
						dia = teclado.nextInt();
					}
					while(dia<1 || dia>31);
					
					//Mostrar fecha introducida
					System.out.println(" ");
					System.out.printf("%02d/%02d/" +anio +" ---> ", (dia), (mes));
					
					//Si dia+1>31
					if((dia+1)>31){
						//Amenta anio
						if((anio+1)==0){ //Si le hemos introducido el año -1 (por lo que anio+1 es 0)
							anio = anio+2;	//tenemos que sumarle a anio 2, para que no muestre nunca el año 0
						}
						else{
							anio++;
						}
						
						//Mes es 1
						mes = 1;
						
						//Dia es 1
						dia = 1;
					}
					else{
						//Aumenta dia
						dia++;
					}//Fin_Si
				break;
				
			}//Fin_Segun	
			
			//Mostrar fecha actualizada
			System.out.printf("%02d/%02d/" +anio, (dia), (mes));
			
		//Fin
		
	}
}

