package BoletinPOO2.Ej6.Tests;

import BoletinPOO2.Ej6.Clases.Tiempo;

public class TestTiempo {
    public static void main(String[] args){

        //Tests del constructor por defecto
        System.out.println("=-=-=-=-= Constructor por defecto =-=-=-=-=");
        Tiempo tiempoPorDefecto = new Tiempo();

        System.out.println();

        //Tests del constructor con parámetros
        System.out.println("=-=-=-=-= Constructor con parámetros =-=-=-=-=");
        Tiempo tiempo1 = new Tiempo(1,20,30);
        Tiempo tiempo2 = new Tiempo(0,30,40);
        Tiempo tiempo3 = new Tiempo(0,35,20);

        System.out.println();

        //Tests Gets
        System.out.println("=-=-=-=-= Gets =-=-=-=-=");
        System.out.println("Horas del primer tiempo: " +tiempo1.getHora());
        System.out.println("Minutos del primer tiempo: " +tiempo1.getMinuto());
        System.out.println("Segundos del primer tiempo: " +tiempo1.getSegundo());

        System.out.println();

        //Tests Sets
        System.out.println("=-=-=-=-= Sets =-=-=-=-=");
        System.out.println("Cambiamos las horas, los minutos y los segundos del primer tiempo.");

        tiempo1.setHora(100);
        tiempo1.setMinuto(59);
        tiempo1.setSegundo(59);

        System.out.println("Horas del primer tiempo: " +tiempo1.getHora());
        System.out.println("Minutos del primer tiempo: " +tiempo1.getMinuto());
        System.out.println("Segundos del primer tiempo: " +tiempo1.getSegundo());

        System.out.println();

        //Tests toString
        System.out.println("=-=-=-=-= toString =-=-=-=-=");
        System.out.println(tiempoPorDefecto.toString());

        System.out.println();

        System.out.println(tiempo1.toString());

        System.out.println();

        System.out.println(tiempo2.toString());

        System.out.println();

        System.out.println(tiempo3.toString());

        System.out.println();

        //Tests suma
        System.out.println("=-=-=-=-= suma =-=-=-=-=");
        System.out.println("Sumamos el tiempo2 y el tiempo3: " +tiempo2.suma(tiempo3));
        System.out.println("Sumamos el tiempo1 y el tiempo2: " +tiempo1.suma(tiempo2));

        //Tests resta
        System.out.println("=-=-=-=-= resta =-=-=-=-=");
        System.out.println("Restamos el tiempo2 al tiempo1: " +tiempo2.resta(tiempo1));
        System.out.println("restamos el tiempo3 al tiempo2: " +tiempo3.resta(tiempo2));

    }
}
