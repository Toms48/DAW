/*
 *   Nombre: t7Ej9
 *
 *   Comentario:    Realiza un programa que pida 8 números enteros y
 *                  que luego muestre esos números junto con la palabra “par” o “impar” según proceda.
 *
 *   Análisis:
 *
 *       Entradas: 8 ints
 *
 *       Salidas: Por pantalla
 *
 * */

//PG
    //Inicio
        //Para contador=1, contador menor o igual que 8, aumentar contador
            //Leer numero
            //Cargar numero en array
        //Fin_Para

        //Para contador=0, contador menor o igual que 7, aumentar contador
            //Si el numeo de la posicion contador es par
                //Mostrar numero con la palabra par
            //Sino
                //Mostrar numero con la palabra impar
            //Fin_Si
        //Fin_Para
    //Fin

import java.util.Scanner;

public class t7Ej9 {
    public static void main(String[] args){

        //Declaración de variables
        int num = 0;
        int[] array = new int[8];

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Para contador=0, contador menor o igual que 7, aumentar contador
            for(int i=0; i<=7; i++) {
                //Leer numero
                System.out.print("Introduzca un numero para la posicion " +(i+1) +" del array: ");
                num = teclado.nextInt();

                //Cargar numero en array
                array[i] = num;
            }//Fin_Para

            System.out.println(" ");

            //Para contador=0, contador menor o igual que 7, aumentar contador
            for(int i=0; i<=7; i++) {
                //Si el numeo de la posicion contador es par
                if(array[i]%2 == 0) {
                    //Mostrar numero con la palabra par
                    System.out.println(array[i] +" es par.");
                }
                else {
                    //Mostrar numero con la palabra impar
                    System.out.println(array[i] +" es impar.");
                }//Fin_Si
            }//Fin_Para
        //Fin

    }
}
