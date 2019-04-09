package BoletinExtra.Ej4.Main;

import BoletinExtra.Ej4.Clases.Electrodomestico;
import BoletinExtra.Ej4.Clases.Lavadora;
import BoletinExtra.Ej4.Clases.Television;

public class MainElectrodomesticos {
    public static void main(String[] args){

        //Declaraciones de variables
        double precioFinalElec = 0;
        double precioFinalTele = 0;
        double precioFinalLavad = 0;

        //Inicializaciones
        Electrodomestico[] arrayElec = new Electrodomestico[10];

        arrayElec[0] = new Electrodomestico();  //120
        arrayElec[1] = new Electrodomestico(500,30);    //560
        arrayElec[2] = new Electrodomestico(1000, "blanco", 'A', 51);   //1180

        arrayElec[3] = new Television();    //120
        arrayElec[4] = new Television(200,19);  //220
        arrayElec[5] = new Television(360.99, "negro", 'E', 80, 52, true);  //688.287

        arrayElec[6] = new Lavadora();  //120
        arrayElec[7] = new Lavadora(1500, 300); //1610
        arrayElec[8] = new Lavadora(2000, "azul", 'B', 300, 31);    //2230
        arrayElec[9] = new Lavadora(1300, "rojo", 'C', 280, 30);    //1460

        for(Electrodomestico dato : arrayElec){
            if(dato instanceof Television){
                precioFinalTele += dato.precioFinal();
                precioFinalElec += dato.precioFinal();
            }
            else{
                if(dato instanceof Lavadora){
                    precioFinalLavad += dato.precioFinal();
                    precioFinalElec += dato.precioFinal();
                }
                else{
                    precioFinalElec += dato.precioFinal();
                }
            }
        }

        System.out.println("Precio total de los electrodomésticos");
        System.out.println("=====================================");
        System.out.println(precioFinalElec);

        System.out.println();

        System.out.println("   Precio total de las televisiones  ");
        System.out.println("=====================================");
        System.out.println(precioFinalTele);

        System.out.println();

        System.out.println("    Precio total de las lavadoras    ");
        System.out.println("=====================================");
        System.out.println(precioFinalLavad);

    }
}
