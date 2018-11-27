/*
*   Nombre: t7Ej7
*
*   Comentario: Escribe un programa que genere 100 números aleatorios del 0 al 20 y
*               que los muestre por pantalla separados por espacios.
*               El programa pedirá entonces por teclado dos valores y
*               a continuación cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente.
*               Los números que se han cambiado deben aparecer entrecomillados.
*
*   Análisis:
*
*       Entradas:
*           Un int para el numero que quiero cambiar
*           Un int para el numero por el quiero cambiar
*
*       Salidas: Por pantalla
* */

//PG
    //Inicio
        //Generar y cargar 100 numeros aleatorios en un array
        //Mostrar array anterior
        //Pedir y validar valor a cambiar
        //Pedir nuevo numero
        //Mostrar array con los valores cambiados
    //Fin

import java.lang.Math;
import java.util.Scanner;

public class t7Ej7 {
    public static void main(String[] args){

        //Declaracion de variables
        int nCambiar = 0;
        int nNuevo = 0;

        boolean valido = false;

        int[] array = new int[10];

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Generar y cargar 100 numeros aleatorios en un array
            for(int i=0; i<=9; i++){
                array[i] = (int)(Math.random()*21);
            }

            //Mostrar array anterior
            for(int i: array){
                System.out.print(i +" ");
            }

             System.out.println(" ");

            //Pedir y validar valor a cambiar
            do{
                System.out.print("Introduzca un valor a cambiar: ");
                nCambiar = teclado.nextInt();

                for(int i: array){
                    if(i==nCambiar){
                        valido = true;
                    }
                }

                if(valido==false){
                    System.out.println("Introduzca por favor un numero que este en el array (0-20)");
                    System.out.println(" ");
                }

            }
            while(valido==false);

            //Pedir nuevo numero
            System.out.print("Introduzca porque numero quieres cambiarlo: ");
            nNuevo = teclado.nextInt();

            //Mostrar array con los valores cambiados
            for(int i: array){
                if(i == nCambiar){
                    i = nNuevo;
                    System.out.print("'" +i +"' ");
                }
                else{
                    System.out.print(i +" ");
                }
            }

        //Fin
    }
}
