/*
 *   Nombre: t7Ej8
 *
 *   Comentario:    Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado año y
 *                  que muestre a continuación un diagrama de barras horizontales con esos datos.
 *                  Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
 *
 *   Análisis:
 *
 *       Entradas: 12 ints
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: minima temperatura -170, maxima temperatura 140;
 *
 * */

//PG
    //Inicio
        //Leer y validar temperaturas
        //Mostrar diagrama
    //Fin

import java.util.Scanner;

public class t7Ej8 {
    public static void main(String[] args){

        //Declaraciones de variables
        int[] arrayTemperaturas = new int[12];

        int tem = 0;
        int max = Integer.MIN_VALUE;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Leer y validar temperaturas
            for(int i=0; i<=11; i++){
                do{
                    System.out.print("Introduzca la temperatura media del mes " +(i+1) +": ");
                    tem = teclado.nextInt();
                    arrayTemperaturas[i] = tem;
                    if(arrayTemperaturas[i]>max){
                        max = arrayTemperaturas[i];
                    }
                }
                while(tem<-170 || tem>140);
            }

            System.out.println(" ");

            //Mostrar diagrama
            for(int i=0; i<=11; i++){
                System.out.printf("%2d│",(i+1));
                //System.out.printf("%2d|",(i+1));

                for(int j=0; j<arrayTemperaturas[i]; j++){
                    System.out.print("■");
                    //System.out.print("#");
                }
                System.out.println(" ");
            }

            System.out.print("  └");
            //System.out.print("  o");

            for(int i=1; i<=max; i++){
                System.out.print("─");
                //System.out.print("-");
            }

            System.out.println(" ");

        //Fin

    }
}
