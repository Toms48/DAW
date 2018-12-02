/*
 *   Nombre: t7Ej12
 *
 *   Comentario:    Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos).
 *                  A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el máximo o el mínimo.
 *                  Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.
 *
 *   Análisis:
 *
 *       Entradas: un int (para saber si mostrar el maximo o el minimo)
 *
 *       Salidas: Por pantalla
 *
 * */

//PG
    //Inicio
        //Cargar array de 100 numeros aleatoriamente
        //Preguntar por destacar el mayor o el menor
        //Mostrar array otra vez pero con el minimo o el mayor entre ** **
    //Fin

import java.util.Scanner;
import java.lang.Math;

public class t7Ej13 {
    public static void main(String[] args){

        //Declaraciones de variables
        int[] array100 = new int[100];

        int respuesta = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        boolean minAsignado = false;
        boolean maxAsignado = false;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Cargar array de 100 numeros aleatoriamente
            for(int i=0; i<=99; i++){
                array100[i] = (int)(Math.random()*501);

                if(array100[i]<min){
                    min = array100[i];
                }

                if(array100[i]>max){
                    max = array100[i];
                }

                System.out.print(array100[i] +" ");
            }

            //Leer y validar respuesta para destacar el mayor o el menor
            do{
                System.out.println(" ");
                System.out.print("Que quiere resaltar? (1-->Minimo  2-->Maximo): ");
                respuesta = teclado.nextInt();

                if(respuesta!=1 && respuesta!=2){
                    System.out.println(" ");
                    System.out.print("Lo siento solo puedes introducir un 1 o un 2");
                }
            }
            while(respuesta!=1 && respuesta!=2);

            //Mostrar array otra vez pero con el minimo o el mayor entre ** **
            if(respuesta==1){
                for(int i=1; i<=99; i++){
                    if(array100[i]==min && minAsignado==false){
                        System.out.print("**" +array100[i] +"** ");
                        minAsignado=true;
                    }
                    else {
                        System.out.print(array100[i] + " ");
                    }
                }
            }

            if(respuesta==2){
                for(int i=1; i<=99; i++){
                    if(array100[i]==max && maxAsignado==false){
                        System.out.print("**" +array100[i] +"** ");
                        maxAsignado=true;
                    }
                    else {
                        System.out.print(array100[i] + " ");
                    }
                }
            }

        //Fin

    }
}
