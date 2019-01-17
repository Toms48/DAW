package Gestora;

import java.lang.Math;

public class Gestora8IJArray {

/**************************************************************************
Interfaz
Comentario: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
Cabecera: int[] generaArrayInt(int tamanio, int min, int max)
Precondiciones: No tiene
Entrada:
    - Un int para el tamaño del array
    - Un int para el menor valor de los aleatorios
    - Un int para el mayor valor de los aleatorios
Salida: Un array de int
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

    public static int[] generaArrayInt(int tamanio, int min, int max){

        //Declaracion de variables
        int[] array = new int[tamanio];
        int aleatorio = 0;

        for(int i=0; i<=tamanio-1; i++){
            array[i] = (int)(Math.random()*(max-min+1))+min; //El +1 es porque al restar max y min no tiene en cuenta todos los numeros del rango
        }

        return array;
    }

/**************************************************************************
Interfaz
Comentario:  Devuelve el mínimo del array que se pasa como parámetro.
Cabecera: int minimoArrayInt(int[] array)
Precondiciones: No tiene
Entrada:
    - Un array de int
Salida: Un int para el número más pequeño del array
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

    public static int minimoArrayInt(int[] array){

        //Declaraciones de variables
        int min = Integer.MAX_VALUE;

        for(int i=0; i<=(array.length)-1; i++){

            if(array[i]<min){
                min = array[i];
            }

        }

        return min;
    }

/**************************************************************************
Interfaz
Comentario:   Devuelve el máximo del array que se pasa como parámetro.
Cabecera: int maximoArrayInt(int[] array)
Precondiciones: No tiene
Entrada:
    - Un array de int
Salida: Un int para el número más grande del array
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

    public static int maximoArrayInt(int[] array){

        //Declaraciones de variables
        int max = Integer.MIN_VALUE;

        for(int i=0; i<=(array.length)-1; i++){

            if(array[i]>max){
                max = array[i];
            }

        }

        return max;
    }

/**************************************************************************
Interfaz
Comentario:   Devuelve la media del array que se pasa como parámetro.
Cabecera: double mediaArrayInt(int[] array)
Precondiciones: No tiene
Entrada:
    - Un array de int
Salida: Un double para la media del array
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

    public static double mediaArrayInt(int[] array){

        //Declaraciones de variables
        double media = 0;

        for(int i=0; i<=(array.length)-1; i++){
            media += array[i];
        }

        return (media/array.length);
    }

}
