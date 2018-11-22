/*
 * Nombre: T6Ej15
 *
 * Comentario:  Realiza un generador de melodía con las siguientes condiciones:
 * 					a) Las notas deben estar generadas al azar.
 * 						Las 7 notas son do, re, mi, fa, sol, la y si.
 * 					b) Una melodía está formada por un número aleatorio de notas mayor o igual a 4, menor o igual a 28
 * 						y siempre múltiplo de 4 (4, 8, 12…).
 * 					c) Cada grupo de 4 notas será un compás y estará separado del siguiente compás mediante la barra vertical "|" (Alt + 1).
 * 						El final de la melodía se marca con dos barras.
 * 					d) La última nota de la melodía debe coincidir con la primera.
 *
 * 				Ejemplo 1:
 * 					do mi fa mi | si do sol fa | fa re si do | sol mi re do ||
 *
 * 				Ejemplo 2:
 * 					la re mi sol | fa mi mi si | do la sol fa | fa re si sol | do sol mi re | fa la do la ||
 *
 * Análisis
 *
 * 		Entradas: No tiene
 *
 * 		Salidas: Por pantalla
 *
 */

//PG
    //Inicio
        //Generar numero de compases (entre 1 y 7 incluidos)
        //Para contador=1, mientras contador sea menor o igual que numero de compases, aumentar contador
            //Para contador=1, mientras contador sea menor o igual que 4, aumentar contador
                //Generar numero de la nota
                //Según numero de nota
                    //Imprimir nota
                //Fin_Segun
            //Fin_Para
        //Fin_Para
    //Fin

import java.lang.Math;

public class T6Ej15 {

    public static void main (String[] args) {

        //Declaracion de variables
        int nCompases = 0;
        int nNota = 0;

        int ultimaNota = 0;

        //Inicializaciones

        //Inicio
        //Generar numero de compases (entre 1 y 7 incluidos)
        nCompases = (int)(Math.random()*7)+1;

        System.out.print("|");
        System.out.print("|");
        System.out.print("|");
        System.out.print("|");
        System.out.print("|");
        System.out.print("|");
        System.out.print("|");
        System.out.print("|");
        System.out.print("|");

        //Para contador=1, mientras contador sea menor o igual que numero de compases, aumentar contador
        for(int i=1; i<=nCompases; i++){
            //Para contador=1, mientras contador sea menor o igual que 4, aumentar contador
            for(int j=1; j<=4; j++){
                //Generar numero de la nota
                nNota = (int)(Math.random()*7)+1;

                if(i==1 && j==1){
                    ultimaNota = nNota;
                }
                else{
                    if(i==nCompases && j==4){
                        nNota = ultimaNota;
                    }
                }

                System.out.print(" ");

                //Según numero de nota
                switch(nNota){
                    case 1:
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("─\u25CF─");
                    break;

                    case 2:
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("\u25CF");
                    break;

                    case 3:
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("─\u25CF─");
                    break;

                    case 4:
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println(" \u25CF ");
                        System.out.println("───");
                    break;

                    case 5:
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("─\u25CF─");
                        System.out.println("   ");
                        System.out.println("───");
                    break;

                    case 6:
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println(" \u25CF ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                    break;

                    case 7:
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("─\u25CF─");
                        System.out.println("   ");
                        System.out.println("───");
                        System.out.println("   ");
                        System.out.println("───");
                    break;
                }//Fin_Segun
            }//Fin_Para

            System.out.print(" |");

        }//Fin_Para

        System.out.print("|");

        //Fin
    }
}
