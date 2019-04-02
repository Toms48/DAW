/*
 *   Nombre:	MainHora
 *
 *   Comentario:    *Lo que pone en la hoja del examen*
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un int para las horas
 *       	- Un int para los minutos
 *       	- Un int para los segundos
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: Las horas tienen que estar entre 0 y 23 (incluidos)
 *
 * */

//PG
//Inicio
	//Leer y validar hora
	//Leer minutos
	//Leer segundos
	//Preguntar cuantas horas mostrar
	//Mostrar las horas siguientes
//Fin

package Ejercicio1.Apartado1.Main;

import Ejercicio1.Apartado1.Clases.Hora;

import java.util.Scanner;

public class MainHora {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		
		int horasDistintas = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
		//System.out.println(60/59);
		//System.out.println(60%59);
		//Leer hora
		System.out.print("Escriba la hora: ");
		hora = teclado.nextInt();
		
		//Leer minutos
		System.out.print("Escriba los minutos: ");
		minuto = teclado.nextInt();
		
		//Leer segundos
		System.out.print("Escriba los segundos: ");
		segundo = teclado.nextInt();
		
		Hora hora1 = new Hora(hora, minuto, segundo);
		
		System.out.println();
		
		//Preguntar cuantas horas mostrar
		System.out.print("¿Cuántas horas distintas quiere mostrar?: ");
		horasDistintas = teclado.nextInt();
		
		//Mostrar las horas siguientes
		Hora horaSegundoMas = hora1;
		
		for(int i=1; i<=horasDistintas; i++){
			
			Hora.sumarSegundo(horaSegundoMas);
			
			System.out.println(horaSegundoMas);
		}
		
		//Fin
	}
}
