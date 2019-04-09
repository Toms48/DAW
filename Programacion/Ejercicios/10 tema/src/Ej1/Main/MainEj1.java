package Ej1.Main;

import java.util.ArrayList;

public class MainEj1 {
	public static void main(String[] args){
		
		//Declaracion de variables
		
		//Inicializaciones
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Joaquín");
		nombres.add("Jesús");
		nombres.add("Carlos");
		nombres.add("Soraya");
		nombres.add("Sofía");
		nombres.add("Emilio");
		
		for(String dato : nombres){
			System.out.println(dato);
		}
		
	}
}
