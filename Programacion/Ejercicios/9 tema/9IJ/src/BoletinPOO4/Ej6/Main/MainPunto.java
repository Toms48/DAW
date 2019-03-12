/*
 *   Nombre:	MainPunto
 *
 *   Comentario:    Calcular distancia entre dos puntos
 *
 *   Análisis:
 *
 *       Entradas: No tiene
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: No tiene
 *
 * */

package BoletinPOO4.Ej6.Main;

import BoletinPOO4.Ej6.Clases.Punto;

public class MainPunto {
	public static void main(String[] args){
	
		//Declaración de variables
		double distanciaDosPuntos = 0;
		
		//Inicializaciones
		Punto punto1 = new Punto(100, 200);
		Punto punto2 = new Punto(400, 800);
		
		distanciaDosPuntos = punto1.distanciaDosPuntos(punto2);
		
		System.out.println(distanciaDosPuntos);
	}
}
