package Tema7Parte1;

import java.util.Scanner;

public class t7Ej3 {
    public static void main(String[] args){

        int[] array = new int[10];
        Scanner teclado = new Scanner(System.in);

        for(int i=0; i<=9; i++){
            System.out.print("Introduzca el valor del numero " +(i+1) +": ");
            array[i] = teclado.nextInt();
        }

        for(int i=9; i>=0; i--){
            System.out.print(array[i] +" ");
        }

    }
}
