package BoletinPOO1.Ej3.Main;

import BoletinPOO1.Ej3.Clases.Casa;
import BoletinPOO1.Ej3.Clases.Piso;
import BoletinPOO1.Ej3.Clases.Vivienda;

public class MainEj3 {
	public static  void main(String[] args){
	
		//Declaraciones de variables
		
		//Inicializaciones
		Casa v1 = new Casa(120000, 3, "Barriada del Carmen", "Calle falsa 123", false, 2, true);
		Casa v2 = new Casa(150000, 3, "Barriada del Carmen", "Calle false 178", false, 3, false);
		Piso v3 = new Piso(0, 4, "El Paseo de Consolación", "Calle Av. de Italia 1290", true, 1, 5, 'A');
		
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		
		System.out.println("*************************");
		
		System.out.println();
		
		System.out.print("¿Tiene balcón el piso situado en " +v3.getNombreBarriada() +", con " +v3.getNumeroHabitaciones() +" habitaciones?: ");
		if(v3.getTieneBalcon()){
			System.out.println("Tiene balcón");
		}
		else{
			System.out.println("No tiene balcón");
		}
	
		
		
	}
}
