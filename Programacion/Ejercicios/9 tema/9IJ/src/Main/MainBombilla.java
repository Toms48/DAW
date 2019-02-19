package Main;

import Clases.Bombilla;

public class MainBombilla {
	public static void main(String[] args){
		
		//Declaración de variables
		
		//Inicializaciones
		Bombilla bombilla1 = new Bombilla();
		
		System.out.println("=-=-= La bombilla en estado por defecto =-=-=");
		System.out.println(bombilla1.toString());
		
		System.out.println();
		
		System.out.println("=-=-= Intentamos apagar la bombilla =-=-=");
		bombilla1.apagar();
		
		System.out.println();
		
		System.out.println("=-=-= Intentamos encender la bombilla =-=-=");
		bombilla1.encender();
		System.out.println(bombilla1.toString());
		
		System.out.println();
		
		System.out.println("=-=-= Intentamos encender la bombilla cuando ya está encendida =-=-=");
		bombilla1.encender();
		
	}
}
