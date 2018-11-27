/*
*   Nombre: t7Ej5
*
*   Comentario: Escribe un programa que lea 15 números por teclado y que los almacene en un array.
*               Rota los elementos de ese array, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la 2, etc.
*               El número que se encuentra en la última posición debe pasar a la posición 0.
*               Finalmente, muestra el contenido del array.
*
*   Análisis:
*
*       Entradas: 15 ints
*
*       Salidas: Por pantalla
*
* */

//PG
    //Inicio

        //Para contador=1, mientras sea menor o igual que 15. aumentar contador
            //Leer y cargar numero en el array
        //Fin_Para

        //Para contador=1, mientras sea menor o igual que 15, aumentar contador
            //Cargar array rotado
        //Fin_Para

        //Para contador=1, mientras sea menor o igual que 15, aumentar contador
            //Mostrar la posicion contador del array
        //Fin_Para

    //Fin

import java.util.Scanner;

public class t7Ej6 {
    public static void main (String[] args) {

        //Declaracion de variables
        int[] array = new int[15];
        int[] arrayRotado = new int[15];

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Para contador=0, mientras sea menor o igual que 14. aumentar contador
            for(int i=0; i<=14; i++) {
                //Leer y cargar numero en el array
                System.out.print("Intruduzca el valor de la posicion " +(i+1) +": ");
                array[i] = teclado.nextInt();
            }//Fin_Para

            //Para contador=0, mientras sea menor o igual que 14, aumentar contador
            for(int i=0; i<=14; i++) {
                //Cargar array rotado
                if(i!=14) {
                    arrayRotado[i+1] = array[i];
                }
                else{
                    arrayRotado[0] = array[i];
                }
            }//Fin_Para

            System.out.println(" ");

            //Para contador=0, mientras sea menor o igual que 14, aumentar contador
            for(int i=0; i<=14; i++) {
                //Mostrar la posicion contador del array
                System.out.print(arrayRotado[i] +" ");
            }//Fin_Para

            System.out.println(" ");

        //Fin
    }
}
