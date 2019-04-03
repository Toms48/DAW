package Ej1.Clases;

import Ej1.Enums.Nota;

public class Campana extends Instrumento {
	
	//Atributos
	
	//Constructor por defecto
	public Campana(){
		super();
	}
	
	//Constructor con parámetros
	
	//Gets
	
	//Sets
	
	//Métodos sobrescritos
	
	//Métos añadidos
	public void interpretar(){
		for(Nota nota : super.getArrayNotas()){
			switch(nota){
				case DO:
					System.out.println("Doloooooonnn");
					break;
				
				case RE:
					System.out.println("Reeeeeennnnn");
					break;
				
				case MI:
					System.out.println("Miiiiiiiii");
					break;
				
				case FA:
					System.out.println("Faaaaaaa");
					break;
				
				case SOL:
					System.out.println("Sooooollllllnnn");
					break;
				
				case LA:
					System.out.println("Laaaaannn");
					break;
				
				case SI:
					System.out.println("Siiiiiiii");
					break;
			}
		}
	}
	
}
