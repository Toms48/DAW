package BoletinPOO4.Ej10.Main;

import BoletinPOO4.Ej10.Clases.Bombilla;

public class MainBombillas {
	public static void main(String[] args){
	
		//Declaraciones de variables
		
		//Inicializaciones
		Bombilla bombillaDormitorio = new Bombilla();
		Bombilla bombillaCocina = new Bombilla();
		Bombilla bombillaAseo = new Bombilla();
		Bombilla bombillaPortal = new Bombilla();
		Bombilla bombillaComedor = new Bombilla();
		
		bombillaComedor.encender();
		bombillaPortal.encender();
		
		System.out.println("La bombilla de la habitacion: -dormitorio- está " +bombillaDormitorio.toString());
		System.out.println("La bombilla de la habitacion: -cocina- está " +bombillaCocina.toString());
		System.out.println("La bombilla de la habitacion: -aseo- está " +bombillaAseo.toString());
		System.out.println("La bombilla de la habitacion: -portal- está " +bombillaPortal.toString());
		System.out.println("La bombilla de la habitacion: -comedor- está " +bombillaComedor.toString());
	
	}
}
