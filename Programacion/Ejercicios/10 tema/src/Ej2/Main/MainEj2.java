package Ej2.Main;

import java.util.ArrayList;

public class MainEj2 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int cantidad = 0;
		int aleatorio = 0;
		
		int suma = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		//Inicializaciones
		ArrayList<Integer> numeros = new ArrayList<>();
		
		cantidad = (int)(Math.random()*11)+10;
		
		for(int i=0; i<=cantidad-1; i++){
			aleatorio = (int)(Math.random()*101)+0;
			numeros.add(aleatorio);
			
			System.out.print(aleatorio +" ");
			
			suma += aleatorio;
			
			if(aleatorio>max){
				max = aleatorio;
			}
			else{
				if(aleatorio<min){
					min = aleatorio;
				}
			}
		}
		
		System.out.println("\n\nSuma: " +suma);
		System.out.println("Media: " +(suma/cantidad));
		System.out.println("Mínimo: " +min);
		System.out.println("Máximo: " +max);
		
	}
}
