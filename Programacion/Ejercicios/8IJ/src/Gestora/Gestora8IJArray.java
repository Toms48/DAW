package Gestora;

import java.lang.Math;

public class Gestora8IJArray {

/**************************************************************************
Interfaz
Comentario: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
Cabecera: int[] generaArrayInt(int tamanio, int min, int max)
Precondiciones: El tamanio tiene que ser mayor que 0
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

/**************************************************************************
Interfaz
Comentario:   Dice si un número está o no dentro de un array.
Cabecera: boolean estaEnArrayInt(int[] array, int numeroBuscado)
Precondiciones: No tiene
Entrada:
    - Un array de int
    - Un int para el número que se busca en el array
Salida: Un boolean
E/S: No hay
Postcondiciones:
    - Si el número indicado por el usuario está en el array devuelve un true
    - Si el número indicado por el usuario NO está en el array devuelve un false
**************************************************************************/

    public static boolean estaEnArrayInt(int[] array, int numeroBuscado){

        //Declaraciones de variables
        boolean encontrado = false;

        for (int i = 0; i <= (array.length)-1; i++) {
            if (array[i] == numeroBuscado) {
                encontrado = true;
            }
        }

        return encontrado;
    }

/**************************************************************************
Interfaz
Comentario: Busca un número en un array y devuelve la posición (el índice) en la que se encuentra.
Cabecera: int posicionEnArray(int[] array, int numeroBuscado)
Precondiciones: No tiene
Entrada:
    - Un array de int
    - Un int para el número que se busca en el array
Salida: Un int
E/S: No hay
Postcondiciones:
    - Si el numero no se escuentra devuelve -1
**************************************************************************/

    public static int posicionEnArray(int[] array, int numeroBuscado){

        //Declaracion de variables
        int posicionNumeroBuscado = -1;

        for (int i = 0; i <= (array.length)-1; i++) {
            if (array[i] == numeroBuscado) {
                posicionNumeroBuscado = i;
            }
        }

        return posicionNumeroBuscado;
    }

/**************************************************************************
Interfaz
Comentario: Le da la vuelta a un array.
Cabecera: int[] volteaArrayInt(int[] array)
Precondiciones: No tiene
Entrada: Un array de int
Salida: Un int
E/S: No hay
Postcondiciones: El array estará volteado
**************************************************************************/

    public static int[] volteaArrayInt(int[] array){

        //Declaracion de variables
        int[] arrayVolteado = new int[array.length];
        int j = 0;

        for(int i=(array.length)-1; i>=0; i--){
            arrayVolteado[i] = array[j];
            j++;
        }

        return arrayVolteado;
    }
    
/**************************************************************************
Interfaz
Comentario: Rota n posiciones a la derecha los números de un array.
Cabecera: int[] rotaDerechaArrayInt(int[] array, int rotarN)
Precondiciones: rotarN tiene que ser mayor que 0
Entrada:
    - Un array de int
    - UN int
Salida: Un array
E/S: No hay
Postcondiciones: El array estará rotado a la derecha n posiciones
**************************************************************************/

    public static int[] rotaDerechaArrayInt(int[] array, int rotarN){
    
        int[] arrayRotado = new int[array.length];
        
        for(int j=1; j<=rotarN; j++){
            for(int i=0; i<=(array.length)-1; i++) {
                //Cargar array rotado
                if(i!=(array.length)-1) {
                    arrayRotado[i+1] = array[i];
                }
                else{
                    arrayRotado[0] = array[i];
                }
            }
    
            if(j<rotarN){
                for (int i=0; i<=(array.length)-1; i++) {
                    array[i] = arrayRotado[i];
                }
            }
        }
        
        return arrayRotado;
    }
    
/**************************************************************************
Interfaz
Comentario: Rota n posiciones a la izquierda los números de un array.
Cabecera: int[] rotaIzquierdaArrayInt(int[] array, int rotarN)
Precondiciones: rotarN tiene que ser mayor que 0
Entrada:
- Un array de int
- UN int
Salida: Un array
E/S: No hay
Postcondiciones: El array estará rotado a la derecha n posiciones
**************************************************************************/
    
    public static int[] rotaIzquierdaArrayInt(int[] array, int rotarN){
    
        int[] arrayRotado = new int[array.length];
    
        array = volteaArrayInt(array);
        
        for(int j=1; j<=rotarN; j++){
            for(int i=0; i<=(array.length)-1; i++) {
                //Cargar array rotado
                if(i!=(array.length)-1) {
                    arrayRotado[i+1] = array[i];
                }
                else{
                    arrayRotado[0] = array[i];
                }
            }
        
            if(j<rotarN){
                for (int i=0; i<=(array.length)-1; i++) {
                    array[i] = arrayRotado[i];
                }
            }
        }
    
        return volteaArrayInt(arrayRotado);
    }
    
}
