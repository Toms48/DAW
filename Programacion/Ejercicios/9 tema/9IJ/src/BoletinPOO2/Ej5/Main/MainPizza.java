package BoletinPOO2.Ej5.Main;

import BoletinPOO2.Ej5.Clases.Pizza;
import BoletinPOO2.Ej5.Enums.*;

public class MainPizza {
    public static void main(String[] args) {
        Pizza p1 = new Pizza(tipoPizza.margarita, tamanioPizza.mediana);
        Pizza p2 = new Pizza(tipoPizza.funghi, tamanioPizza.familiar);

        p2.sirve();

        Pizza p3 = new Pizza(tipoPizza.cuatroQuesos, tamanioPizza.mediana);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p2.sirve();

        System.out.println("Pedidas: " + Pizza.getTotalPedidas());
        System.out.println("Servidas: " + Pizza.getTotalServidas());
    }
}
