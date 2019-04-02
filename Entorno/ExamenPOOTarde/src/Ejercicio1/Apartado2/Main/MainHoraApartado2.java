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

package Ejercicio1.Apartado2.Main;

import Ejercicio1.Apartado2.Clases.Hora;

import java.util.Scanner;

public class MainHoraApartado2 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		
		int horasDistintas = 0;
		int horaAProcesar = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		Hora[] array7Horas = new Hora[7];
		
		//Inicio
		Hora hora0 = new Hora();
		Hora hora1 = new Hora(23, 59, 59);
		Hora hora2 = new Hora(6, 23, 32);
		Hora hora3 = new Hora(6, 23, 32);
		
		array7Horas[0] = hora1;
		array7Horas[1] = hora2;
		array7Horas[2] = hora3;
		array7Horas[3] = hora0;
		array7Horas[4] = hora0;
		array7Horas[5] = hora0;
		array7Horas[6] = hora0;
		
		System.out.println();
		
		System.out.println("Horas originales creadas en un array: ");
		for(int i=0; i<=array7Horas.length-1; i++){
			if(array7Horas[i].getHora() != -1){
				System.out.println(array7Horas[i].toString());
			}
		}
		
		System.out.println();
		
		//Preguntar por la hora a procesar
		System.out.println("La hora que vamos a procesar es: " +array7Horas[0].toString());
		
		//Preguntar cuantas horas mostrar
		System.out.print("¿Cuántas horas distintas quiere mostrar?: ");
		horasDistintas = teclado.nextInt();
		
		//Mostrar las horas siguientes
		Hora horaSegundoMas = hora1;
		
		for(int i=1; i<=horasDistintas; i++){
			
			Hora.sumarSegundo(horaSegundoMas);
			
			System.out.println(horaSegundoMas);
		}
		
		System.out.println("Al comparar la hora resultante: " +horaSegundoMas.toString());
		System.out.println("Con la segunda que se creó: " +array7Horas[1].toString());
		
		System.out.println("Devuelve: " +horaSegundoMas.equals(array7Horas[1]));
		
		//Fin
	}
}
