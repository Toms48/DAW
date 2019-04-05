package Ej1.Clases;

import Ej1.Enums.Nota;

public class Piano extends Instrumento {
	
	//Atributos
	
	//Constructor por defecto
	public Piano(){
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
					System.out.println("Do");
					break;
				
				case RE:
					System.out.println("Re");
					break;
				
				case MI:
					System.out.println("Mi");
					break;
				
				case FA:
					System.out.println("Fa");
					break;
				
				case SOL:
					System.out.println("Sol");
					break;
				
				case LA:
					System.out.println("La");
					break;
				
				case SI:
					System.out.println("Si");
					break;
			}
		}
	}
	
}
