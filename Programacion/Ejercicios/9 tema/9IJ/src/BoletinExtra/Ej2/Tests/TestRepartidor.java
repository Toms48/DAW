package BoletinExtra.Ej2.Tests;

import BoletinExtra.Ej2.Clases.Repartidor;

public class TestRepartidor {
    public static void main(String[] args){

        //Tests constructor por defecto
        Repartidor repartidorPorDefecto = new Repartidor();

        //Tests constructor con parámetros
        Repartidor r1 = new Repartidor("Tomás", 21, 500, 1);
        Repartidor r2 = new Repartidor("Andrea", 25, 500, 3);
        Repartidor r3 = new Repartidor("Carlos", 21, 500, 3);
        Repartidor r4 = new Repartidor("Mojo", 26, 500, 9);

        //Tests plus
        r1.plus();
        System.out.println();
        r2.plus();
        System.out.println();
        r3.plus();
        System.out.println();
        r4.plus();

    }
}
