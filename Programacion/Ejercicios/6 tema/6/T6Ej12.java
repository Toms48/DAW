/*
 * Nombre: T6Ej12
 * 
 * Comentario:  Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii entre el 32 y el 126.
 * 				Puedes hacer casting con (char) para convertir un entero en un carácter.
 * 
 * Análisis
 * 
 * 		Entradas: No tiene
 * 
 * 		Salidas: Por pantalla
 * 
 */

import java.lang.Math;

public class T6Ej12 {
	
	public static void main (String[] args) {
		
		char c = ' ';
		
		for(int i=1; i<=(Math.pow(999,999)); i++){
			c = (char)((Math.random()*94)+32);
			System.out.print(c);
		}
		
	}
}

