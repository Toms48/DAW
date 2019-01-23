package Tests;

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


        System.out.println();


        //Tests Ejercicio 24
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 24 =-=-=-=-=-=-=-=-=-=-=-=-=");

        int[] arrayBuscarNumero = Gestora8IJArray.generaArrayInt(5,5,20);

        /*
        for(int i=0; i<=arrayBuscarNumero.length-1; i++){   //Código para ver la lista de los números que han salido
            System.out.println(arrayBuscarNumero[i]);
        }
        System.out.println();
        */

        if(Gestora8IJArray.estaEnArrayInt(arrayBuscarNumero,15)){      //== true
            System.out.println("¡BINGO! su numero esta en el array indicado");
        }
        else{
            System.out.println("Su numero no esta en el array indicado");
        }


        System.out.println();


        //Tests Ejercicio 25
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 25 =-=-=-=-=-=-=-=-=-=-=-=-=");

        int[] arrayPosicionNumero = Gestora8IJArray.generaArrayInt(5,10,20);

        /*
        for(int i=0; i<=arrayPosicionNumero.length-1; i++){   //Código para ver la lista de los números que han salido
            System.out.println(arrayPosicionNumero[i]);
        }
        System.out.println();
        */

        System.out.println(Gestora8IJArray.posicionEnArray(arrayPosicionNumero,15));


        System.out.println();


        //Tests Ejercicio 26
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 26 =-=-=-=-=-=-=-=-=-=-=-=-=");

        int[] arrayParaVoltear = Gestora8IJArray.generaArrayInt(5,10,20);
        int[] arrayVolteado = Gestora8IJArray.volteaArrayInt(arrayParaVoltear);

        for(int i=0; i<=arrayParaVoltear.length-1; i++){   //Código para ver la lista de los números que han salido
            System.out.print(arrayParaVoltear[i] +" ");
        }

        System.out.println();

        for(int i=0; i<=arrayVolteado.length-1; i++){   //Código para ver la lista de los números que han salido
            System.out.print(arrayVolteado[i] +" ");
        }
    
    
        System.out.println();
    
    
        //Tests Ejercicio 27
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 27 =-=-=-=-=-=-=-=-=-=-=-=-=");
        
        int[] arrayRotarDerecha = Gestora8IJArray.generaArrayInt(5,10,20);
    
        
        for(int i=0; i<=arrayRotarDerecha.length-1; i++){   //Código para ver la lista de los números que han salido
            System.out.print(arrayRotarDerecha[i] +" ");
        }
        System.out.println();
        
        
        for (int i:Gestora8IJArray.rotaDerechaArrayInt(arrayRotarDerecha,2)) {
            System.out.print(i +" ");
        }
    
    
        System.out.println();
    
    
        //Tests Ejercicio 28
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 28 =-=-=-=-=-=-=-=-=-=-=-=-=");
    
        int[] arrayRotarIzquierda = Gestora8IJArray.generaArrayInt(5,1,9);
    
    
        for(int i=0; i<=arrayRotarIzquierda.length-1; i++){   //Código para ver la lista de los números que han salido
            System.out.print(arrayRotarIzquierda[i] +" ");
        }
        System.out.println();
    
    
        for (int i:Gestora8IJArray.rotaIzquierdaArrayInt(arrayRotarIzquierda,2)) {
            System.out.print(i +" ");
        }
        
    }
}
