package Tema7Parte1;/*
 *   Nombre: Tema7Parte1.t7Ej10
 *
 *   Comentario:    Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en un array.
 *
 *                  El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del array (del 0 en adelante) y
 *                  todos los números impares a las celdas restantes.
 *
 *                  Utiliza arrays auxiliares si es necesario.
 *
 *   Análisis:
 *
 *       Entradas: No tiene
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: Los numeros solo se generarán entre o y 100
 *
 * */

//PG
    //Inicio
        //Generar y cargar numeros aleatorios
        //Para contador=0, mientras contador sea menor o igual que 19, aumentar contador
            //Si array de numeros en la posicion contador es par
                //Cargar array
                //Aumentar contador de pares
            //Fin_Si
        //Fin_Para
        //Para contador=contador de pares, mientras contador sea menor o igual que 19, aumentar contador de pares
            //Si array de numeros en la posicion contador de pares es impar
                //Cargar array auxiliar
            //Fin_Si
        //Fin_Para
        //Mostrar array auxiliar
    //Fin

import java.lang.Math;

public class t7Ej10 {
    public static void main(String[] args){
    
        //Declaraciones de variables
        int[] arrayNumeros = new int[20];
        int[] arrayAuxiliar = new int[20];
        
        int contadorPares = 0;
        int contadorImpares = 0;
        
        //Inicializacion
        
        //Inicio
            //Generar y cargar numeros aleatorios
            for(int i=0; i<=19; i++){
                arrayNumeros[i] = (int)(Math.random()*101);
            }
    
            System.out.println("Array Aleatorio");
            for(int i=0; i<=19; i++){
                System.out.print(arrayNumeros[i] +" ");
            }
            
            //Para contador=0, mientras contador sea menor o igual que 19, aumentar contador
            for(int i=0; i<=19; i++) {
                //Si array de numeros en la posicion contador es par
                if(arrayNumeros[i]%2 == 0) {
                    //Cargar array auxiliar
                    arrayAuxiliar[contadorPares] = arrayNumeros[i];
                    
                    //Aumentar contador de pares
                    contadorPares++;
                }//Fin_Si
            }//Fin_Para
    
            contadorImpares = contadorPares;
        
            //Para contador=0, mientras contador sea menor o igual que 19, aumentar contador
            for(int i=0; i<=19; i++) {
                //Si array de numeros en la posicion contador es impar
                if(arrayNumeros[i]%2 != 0) {
                    //Cargar array auxiliar
                    arrayAuxiliar[contadorImpares] = arrayNumeros[i];
    
                    //Aumentar contador de pares
                    contadorImpares++;
                }//Fin_Si
            }//Fin_Para
    
            System.out.println(" ");
            System.out.println(" ");
            
            System.out.println("Array Final");
            //Mostrar array auxiliar
            for(int i=0; i<=19; i++){
                System.out.print(arrayAuxiliar[i] +" ");
            }
        //Fin
        
    }
}
