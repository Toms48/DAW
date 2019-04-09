package Ej4.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainEj4 {
	public static void main(String[] args){
		
		//Declaraciones de vraibles
		
		//Inicializcaiones
		Scanner tecladoS = new Scanner(System.in);
		ArrayList<String> palabras = new ArrayList<>();
		
		for(int i=0; i<=9; i++){
			System.out.print("Introduzca un numero por favor: ");
			palabras.add(tecladoS.nextLine());
		}
		
		Collections.sort(palabras);	//Ordenar normal
		
		/*Collections.reverse(numeros);		//Ordenar al reves
		Collections.sort(numeros);*/
		
		System.out.println();
		
		for(String palabra : palabras){
			System.out.println(palabra);
		}
		
	}
}
