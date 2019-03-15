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
		
		System.out.println();
		
		System.out.println("Voy a la cocina a por agua.");
		bombillaCocina.encender();
		
		System.out.println();
		
		System.out.println("Salgo de la cocina.");
		bombillaCocina.apagar();
		
		System.out.println();
		
		System.out.println("Esta noche hay Luna llena, no hace falta tener encendida la luz del portal.");
		bombillaPortal.apagar();
		
		System.out.println();
		
		bombillaDormitorio.mostrarEstado("dormitorio");
		
		System.out.println();
		
		bombillaComedor.mostrarEstado("comedor");
		
		System.out.println();
		
		bombillaCocina.mostrarEstado("cocina");
		
		System.out.println();
		
		System.out.println("Voy a poner el lavaplatos y la lavadora. Dejaré encendida la luz de la cocina");
		bombillaCocina.encender();
		
		System.out.println("\n");
		
		System.out.print("A los 20 minutos...");
		Bombilla.apagon();
		
		System.out.println();
		
		System.out.println("Iré a reparar los fusibles");
		System.out.println("Ya está. Se hizo la luz");
		
		System.out.println();
		
		System.out.println("Antes del apagon la bombilla de la habitacion: -dormitorio- está " +bombillaDormitorio.toString());
		System.out.println("Antes del apagon la bombilla de la habitacion: -cocina- está " +bombillaCocina.toString());
		System.out.println("Antes del apagon la bombilla de la habitacion: -aseo- está " +bombillaAseo.toString());
		System.out.println("Antes del apagon la bombilla de la habitacion: -portal- está " +bombillaPortal.toString());
		System.out.println("Antes del apagon la bombilla de la habitacion: -comedor- está " +bombillaComedor.toString());
		
		System.out.println();
		
		System.out.println("¿Como están ahora las bombillas?");
		System.out.println("La bombilla de la habitacion: -dormitorio- está " +bombillaDormitorio.toString());
		System.out.println("La bombilla de la habitacion: -cocina- está " +bombillaCocina.toString());
		System.out.println("La bombilla de la habitacion: -aseo- está " +bombillaAseo.toString());
		System.out.println("La bombilla de la habitacion: -portal- está " +bombillaPortal.toString());
		System.out.println("La bombilla de la habitacion: -comedor- está " +bombillaComedor.toString());
		
	}
}
