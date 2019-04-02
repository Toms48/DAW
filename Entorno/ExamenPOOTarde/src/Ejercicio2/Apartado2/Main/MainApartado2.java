package Ejercicio2.Apartado2.Main;

import Ejercicio2.Apartado2.Clases.Caja;
import Ejercicio2.Apartado2.Clases.CajaCarton;
import Ejercicio2.Apartado2.Enums.Unidades;

public class MainApartado2 {
    public static void main(String[] args){

        CajaCarton cC1 = new CajaCarton(100,200,200);
        Caja c1 = new Caja(52.7,40.7,100, Unidades.cm);
        CajaCarton cC2 = new CajaCarton(50,60,100);
        Caja c2 = new Caja(70,40,100,Unidades.cm);

        c1.setEtiqueta("Calle Tomares Nº23");
        c2.setEtiqueta("Calle Lucena Nº43");

        System.out.println(cC1.toString());
        System.out.println();
        System.out.println(c1.toString());
        System.out.println();
        System.out.println(cC2.toString());
        System.out.println();
        System.out.println(c2.toString());

    }
}
