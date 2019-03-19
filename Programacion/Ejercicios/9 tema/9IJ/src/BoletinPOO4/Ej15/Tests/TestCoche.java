package BoletinPOO4.Ej15.Tests;

import BoletinPOO4.Ej15.Clases.Coche;

public class TestCoche {
    public static void main(String[] args){
        Coche cochePorDefecto = new Coche();
        Coche coche1 = new Coche("9487 KSR", "Peugeot 308", "110CV", 17050, "Gris oscuro");

        Coche[] concesionario1 = Coche.concesionario(coche1);

        Coche.mostrarConcesionario(concesionario1);

        concesionario1 = Coche.addCocheConcesionario(concesionario1, cochePorDefecto);

        Coche.mostrarConcesionario(concesionario1);

        concesionario1 = Coche.addCocheConcesionario(concesionario1);

        Coche.mostrarConcesionario(concesionario1);

        Coche.mostrarCoche(concesionario1, 3);

    }
}
