package BoletinPOO4.Ej11.Main;

import BoletinPOO4.Ej11.Clases.Bombilla;

public class MainBombillaEj11 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		
		//Inicializaciones
		Bombilla bombilla1 = new Bombilla(12, true);
		Bombilla bombilla2 = new Bombilla(15, false);
		Bombilla bombilla3 = new Bombilla(10, true);
		Bombilla bombilla4 = new Bombilla( 9, false);
		Bombilla bombilla5 = new Bombilla(11, true);
		
		
		System.out.println(bombilla1.toString());
		System.out.println();
		System.out.println(bombilla2.toString());
		System.out.println();
		System.out.println(bombilla3.toString());
		System.out.println();
		System.out.println(bombilla4.toString());
		System.out.println();
		System.out.println(bombilla5.toString());
		
		System.out.println();
		
		Bombilla.mostrarVatiosTotales();
		
		System.out.println();
		
		System.out.println("Voy a encender la luz " +bombilla4.getIdBombilla() +" que tiene un consumo de : " +bombilla4.getVatiosConsumidos() +"W");
		bombilla4.encender();
		Bombilla.mostrarVatiosTotales();
		
		System.out.println();
		
		System.out.println("Voy a encender la luz " +bombilla2.getIdBombilla() +" que tiene un consumo de : " +bombilla2.getVatiosConsumidos() +"W");
		bombilla2.encender();
		Bombilla.mostrarVatiosTotales();
		
		System.out.println();
		
		System.out.println("Voy a apagar la luz " +bombilla3.getIdBombilla() +" que tiene un consumo de : " +bombilla3.getVatiosConsumidos() +"W");
		bombilla3.apagar();
		Bombilla.mostrarVatiosTotales();
	
	}
}
