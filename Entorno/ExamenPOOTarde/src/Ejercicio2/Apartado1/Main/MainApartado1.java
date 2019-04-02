

package Ejercicio2.Apartado1.Main;

import Ejercicio2.Apartado1.Clases.Caja;
import Ejercicio2.Apartado1.Enums.Unidades;

public class MainApartado1 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		
		//Inicializaciones
		
		Caja caja1 = new Caja(100, 200, 200, Unidades.cm);
		Caja caja2 = new Caja(1.2,0.8,1.23, Unidades.m);
		
		caja1.setEtiqueta("Francisco Galván. Paseo de Consolacion, 1. No entregar antes de las 11:00");
		caja2.setEtiqueta("Juan Luna. Calle Falsa, 123.");
		
		System.out.println(caja1);
		System.out.println();
		System.out.println(caja2);
		
		
	}
}
