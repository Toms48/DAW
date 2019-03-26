package BoletinExtra.Ej2.Tests;

import BoletinExtra.Ej2.Clases.Comercial;

public class TestComercial {
    public static void main(String[] args){

        //Tests constructor por defecto
        Comercial repartidorPorDefecto = new Comercial();

        //Tests constructor con parámetros
        Comercial c1 = new Comercial("Jorge", 21, 700, 80);
        Comercial c2 = new Comercial("Rafa", 35, 700, 200);
        Comercial c3 = new Comercial("Sefran", 27, 700, 150);
        Comercial c4 = new Comercial("Nzhdeh", 31, 700, 201);

        //Tests plus
        c1.plus();
        System.out.println();
        c2.plus();
        System.out.println();
        c3.plus();
        System.out.println();
        c4.plus();

    }
}
