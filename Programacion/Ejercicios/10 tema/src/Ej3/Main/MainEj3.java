package Ej3.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainEj3 {
	public static void main(String[] args){
		
		//Declaraciones de vraibles
		
		//Inicializcaiones
		Scanner tecladoN = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>();
		
		for(int i=0; i<=9; i++){
			System.out.print("Introduzca un numero por favor: ");
			numeros.add(tecladoN.nextInt());
		}
		
		Collections.sort(numeros);	//Ordenar normal
		
		/*Collections.reverse(numeros);		//Ordenar al reves
		Collections.sort(numeros);*/
		
		System.out.println();
		
		for(int dato : numeros){
			System.out.println(dato);
		}
		
	}
}
