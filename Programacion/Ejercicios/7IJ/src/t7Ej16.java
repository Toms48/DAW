/*
 *   Nombre: t7Ej16
 *
 *   Comentario:    Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios comprendidos entre 0 y 400 (ambos incluidos).
 *                  A continuación el programa mostrará el array y preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7.
 *                  Seguidamente se volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchetes.
 *
 *   Análisis:
 *
 *       Entradas: Un int para los multiplos de 5 y otro para los de 7
 *
 *       Salidas: Por pantalla
 *
 * */

//PG
    //Inicio
        //Cargar array de 20 numeros aleatoriamente
        //Preguntar por destacar los multiplos de 5 o los de 7
        //Mostrar array otra vez pero con los multiplos entre [ ]
    //Fin

import java.util.Scanner;
import java.lang.Math;

public class t7Ej16 {
    public static void main(String[] args){

        //Declaraciones de variables
        int[] array20 = new int[20];

        int respuesta = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        boolean minAsignado = false;
        boolean maxAsignado = false;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Cargar array de 20 numeros aleatoriamente
            for(int i=0; i<=19; i++){
                array20[i] = (int)(Math.random()*401);

                /*if(array20[i]<min){
                    min = array20[i];
                }

                if(array20[i]>max){
                    max = array20[i];
                }*/

                System.out.print(array20[i] +" ");
            }

            //Leer y validar respuesta para destacar el mayor o el menor
            do{
                System.out.println(" ");
                System.out.println("Que quiere resaltar?");
                System.out.println("1 ---> Multiplos de 5");
                System.out.println("2 ---> Multiplos de 7");
                System.out.print("Su respuesta es: ");
                respuesta = teclado.nextInt();

                if(respuesta!=1 && respuesta!=2){
                    System.out.println(" ");
                    System.out.println("Lo siento solo puedes introducir un 1 o un 2");
                }
            }
            while(respuesta!=1 && respuesta!=2);

            //Mostrar array otra vez pero con los multiplos de 5 entre [ ]
            if(respuesta==1){
                for(int i=1; i<=19; i++){
                    if(array20[i]%5==0){
                        System.out.print("[" +array20[i] +"] ");
                        //minAsignado=true;
                    }
                    else {
                        System.out.print(array20[i] + " ");
                    }
                }
            }

            //Mostrar array otra vez pero con los multiplos de 7 entre [ ]
            if(respuesta==2){
                for(int i=1; i<=19; i++){
                    if(array20[i]%7==0){
                        System.out.print("[" +array20[i] +"] ");
                        //maxAsignado=true;
                    }
                    else {
                        System.out.print(array20[i] + " ");
                    }
                }
            }
        //Fin

    }
}
