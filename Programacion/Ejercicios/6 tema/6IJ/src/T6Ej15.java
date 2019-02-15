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

        /*int compases = (int)(Math.random()*7);

        int nota1 = (int)(Math.random()*7);
        int nota2 = (int)(Math.random()*7);
        int nota3 = (int)(Math.random()*7);
        int nota4 = (int)(Math.random()*7);

        String[][] arraycompases = new String[11][compases];

        String[] arrayDo  ={"---", "   ", "---", "   ", "---", "   ", "---", "   ", "---", "   ", "-O-"};
        String[] arrayRe  ={"---", "   ", "---", "   ", "---", "   ", "---", "   ", "---", " O ", "   "};
        String[] arrayMi  ={"---", "   ", "---", "   ", "---", "   ", "---", "   ", "-O-", "   ", "   "};
        String[] arrayFa  ={"---", "   ", "---", "   ", "---", "   ", "---", " O ", "---", "   ", "   "};
        String[] arraySol ={"---", "   ", "---", "   ", "---", "   ", "-O-", "   ", "---", "   ", "   "};
        String[] arrayLa  ={"---", "   ", "---", "   ", "---", " O ", "---", "   ", "---", "   ", "   "};
        String[] arraySi  ={"---", "   ", "---", "   ", "-O-", "   ", "---", "   ", "---", "   ", "   "};

        for(int k=0; k<=10; k++){
            switch (nota1) {
                case 0:
                    System.out.print(arrayDo[k]);
                    break;
                case 1:
                    System.out.print(arrayRe[i]);
                    break;
                case 2:
                    System.out.print(arrayMi[i]);
                    break;
                case 3:
                    System.out.print(arrayFa[i]);
                    break;
                case 4:
                    System.out.print(arraySol[i]);
                    break;
                case 5:
                    System.out.print(arrayLa[i]);
                    break;
                case 6:
                    System.out.print(arraySi[i]);
                    break;
            }
            switch (nota2) {
                case 0:
                    System.out.print(arrayDo[i]);
                    break;
                case 1:
                    System.out.print(arrayRe[i]);
                    break;
                case 2:
                    System.out.print(arrayMi[i]);
                    break;
                case 3:
                    System.out.print(arrayFa[i]);
                    break;
                case 4:
                    System.out.print(arraySol[i]);
                    break;
                case 5:
                    System.out.print(arrayLa[i]);
                    break;
                case 6:
                    System.out.print(arraySi[i]);
                    break;
            }
            switch (nota3) {
                case 0:
                    System.out.print(arrayDo[i]);
                    break;
                case 1:
                    System.out.print(arrayRe[i]);
                    break;
                case 2:
                    System.out.print(arrayMi[i]);
                    break;
                case 3:
                    System.out.print(arrayFa[i]);
                    break;
                case 4:
                    System.out.print(arraySol[i]);
                    break;
                case 5:
                    System.out.print(arrayLa[i]);
                    break;
                case 6:
                    System.out.print(arraySi[i]);
                    break;
            }
            switch (nota4) {
                case 0:
                    System.out.print(arrayDo[i]);
                    break;
                case 1:
                    System.out.print(arrayRe[i]);
                    break;
                case 2:
                    System.out.print(arrayMi[i]);
                    break;
                case 3:
                    System.out.print(arrayFa[i]);
                    break;
                case 4:
                    System.out.print(arraySol[i]);
                    break;
                case 5:
                    System.out.print(arrayLa[i]);
                    break;
                case 6:
                    System.out.print(arraySi[i]);
                    break;
            }
        }*/

        /*for(int j=0; j<=compases; j++) {
            for (int i = 0; i <= 10; i++) {
                switch (nota1) {
                    case 0:
                        System.out.print(arrayDo[i]);
                        break;
                    case 1:
                        System.out.print(arrayRe[i]);
                        break;
                    case 2:
                        System.out.print(arrayMi[i]);
                        break;
                    case 3:
                        System.out.print(arrayFa[i]);
                        break;
                    case 4:
                        System.out.print(arraySol[i]);
                        break;
                    case 5:
                        System.out.print(arrayLa[i]);
                        break;
                    case 6:
                        System.out.print(arraySi[i]);
                        break;
                }
                switch (nota2) {
                    case 0:
                        System.out.print(arrayDo[i]);
                        break;
                    case 1:
                        System.out.print(arrayRe[i]);
                        break;
                    case 2:
                        System.out.print(arrayMi[i]);
                        break;
                    case 3:
                        System.out.print(arrayFa[i]);
                        break;
                    case 4:
                        System.out.print(arraySol[i]);
                        break;
                    case 5:
                        System.out.print(arrayLa[i]);
                        break;
                    case 6:
                        System.out.print(arraySi[i]);
                        break;
                }
                switch (nota3) {
                    case 0:
                        System.out.print(arrayDo[i]);
                        break;
                    case 1:
                        System.out.print(arrayRe[i]);
                        break;
                    case 2:
                        System.out.print(arrayMi[i]);
                        break;
                    case 3:
                        System.out.print(arrayFa[i]);
                        break;
                    case 4:
                        System.out.print(arraySol[i]);
                        break;
                    case 5:
                        System.out.print(arrayLa[i]);
                        break;
                    case 6:
                        System.out.print(arraySi[i]);
                        break;
                }
                switch (nota4) {
                    case 0:
                        System.out.print(arrayDo[i]);
                        break;
                    case 1:
                        System.out.print(arrayRe[i]);
                        break;
                    case 2:
                        System.out.print(arrayMi[i]);
                        break;
                    case 3:
                        System.out.print(arrayFa[i]);
                        break;
                    case 4:
                        System.out.print(arraySol[i]);
                        break;
                    case 5:
                        System.out.print(arrayLa[i]);
                        break;
                    case 6:
                        System.out.print(arraySi[i]);
                        break;
                }
                System.out.println();
            }
        }*/

    }
}
