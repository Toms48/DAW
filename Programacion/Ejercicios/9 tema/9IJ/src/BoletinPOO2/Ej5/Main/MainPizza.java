package BoletinPOO2.Ej5.Main;

import BoletinPOO2.Ej5.Clases.Pizza;
import BoletinPOO2.Ej5.Enums.*;

public class MainPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(tipoPizza.margarita, tamanioPizza.mediana);
        Pizza p2 = new Pizza(tipoPizza.funghi, tamanioPizza.familiar);
        Pizza p3 = new Pizza(tipoPizza.cuatroQuesos, tamanioPizza.mediana);

        System.out.println(p1.toString());
        System.out.println();
        System.out.println("La pizza " +p1.getTamanio() +" cuesta " +p1.getPrecio() +"€. No tenemos cambio de 200€");
	
		System.out.println();
        
        System.out.println(p2.toString());
		System.out.println();
		System.out.println("La pizza " +p2.getTamanio() +" cuesta " +p2.getPrecio() +"€. No tenemos cambio de 200€");
	
		System.out.println();
		
		p2.sirve();
	
		System.out.println();
		
		System.out.println(p3.toString());
		System.out.println();
		System.out.println("La pizza " +p3.getTamanio() +" cuesta " +p3.getPrecio() +"€. No tenemos cambio de 200€");
	
		System.out.println();
		
		p1.isServida();
	
		System.out.println();
		
		p2.sirve();
		//p3.sirve();	//Esta línea es para comprobar que con sirviendo dos pizzas diferentes se actualiza el contador de pizzas servidas
	
		System.out.println();
		
        System.out.println("Pedidas: " + Pizza.getTotalPedidas());
		System.out.println();
        System.out.println("Servidas: " + Pizza.getTotalServidas());
    }
}
