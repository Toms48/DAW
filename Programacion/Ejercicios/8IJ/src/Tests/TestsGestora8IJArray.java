package Tests;

import Gestora.Gestora8IJ;
import Gestora.Gestora8IJArray;

public class TestsGestora8IJArray {
    public static void main(String [] args){

        //Tests Ejercicio 20 - Generar array n de numeros aleatorios en rango
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 20 =-=-=-=-=-=-=-=-=-=-=-=-=");

        int[] arrayAleatorio = Gestora8IJArray.generaArrayInt(10,5,10);

        for(int i=0; i<=arrayAleatorio.length-1; i++){
            System.out.print(arrayAleatorio[i] +" ");
        }


        System.out.println("\n");


        //Tests Ejercicio 21
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 21 =-=-=-=-=-=-=-=-=-=-=-=-=");

        int[] arrayMinimo = Gestora8IJArray.generaArrayInt(5,5,1000);

        /*
        for(int i=0; i<=arrayMinimo.length-1; i++){   Código para ver la lista de los números que han salido
            System.out.println(arrayMinimo[i]);
        }
        System.out.println();
        */

        System.out.println(Gestora8IJArray.minimoArrayInt(arrayMinimo));


        System.out.println();


        //Tests Ejercicio 22
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 22 =-=-=-=-=-=-=-=-=-=-=-=-=");

        int[] arrayMaximo = Gestora8IJArray.generaArrayInt(5,5,1000);

        /*
        for(int i=0; i<=arrayMaximo.length-1; i++){   //Código para ver la lista de los números que han salido
            System.out.println(arrayMaximo[i]);
        }
        System.out.println();
        */

        System.out.println(Gestora8IJArray.maximoArrayInt(arrayMaximo));


        System.out.println();


        //Tests Ejercicio 23
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 23 =-=-=-=-=-=-=-=-=-=-=-=-=");

        int[] arrayMedia = Gestora8IJArray.generaArrayInt(5,5,1000);

        /*
        for(int i=0; i<=arrayMedia.length-1; i++){   //Código para ver la lista de los números que han salido
            System.out.println(arrayMedia[i]);
        }
        System.out.println();
        */

        System.out.println(Gestora8IJArray.mediaArrayInt(arrayMedia));

    }
}
