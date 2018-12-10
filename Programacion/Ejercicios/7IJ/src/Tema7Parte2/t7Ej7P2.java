package Tema7Parte2;

/*
 *   Nombre: t7Ej7P2
 *
 *   Comentario:	Mejora el juego "Busca el tesoro" de tal forma que si hay una mina a una casilla dedistancia,
 *                  el programa avise diciendo "¡Cuidado!¡Hay una mina cerca!"
 *
 *   Análisis:
 *
 *       Entradas: No tiene
 *
 *       Salidas: Por pantalla
 *
 * */

import java.util.Scanner;

public class t7Ej7P2 {

    // se definen constantes para representar el contenido de las celdas

    static final int VACIO = 0;
    static final int MINA = 1;
    static final int TESORO = 2;
    static final int INTENTO = 3;
    static final int AVISO = 4;

    public static void main(String[] args) {
        int x;
        int y;

        boolean minaEncontrada = false;

        int[][] cuadrante = new int[5][4];

        Scanner teclado = new Scanner(System.in);

        // inicializa el array
        for(x = 0; x < 4; x++) {
            for(y = 0; y < 3; y++) {
                cuadrante[x][y] = VACIO;
            }
        }

        // coloca la mina
        int minaX = (int)(Math.random()*4);
        int minaY = (int)(Math.random()*3);

        cuadrante[minaX][minaY] = MINA;

        // coloca el tesoro
        int tesoroX;
        int tesoroY;

        do {
            tesoroX = (int)(Math.random()*4);
            tesoroY = (int)(Math.random()*3);
        } while ((minaX == tesoroX) && (minaY == tesoroY));

        cuadrante[tesoroX][tesoroY] = TESORO;

        // juego
        System.out.println("¡BUSCA EL TESORO!");
        /*System.out.println("Coordenada x: " +minaX);
        System.out.println("Coordenada y: " +minaY);*/

        boolean salir = false;
        String c = "";

        do {
            // pinta el cuadrante
            for(y = 3; y >= 0; y--) {
                System.out.print(y + "|");

                for(x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO) {
                        System.out.print("X ");
                    }
                    else {
                        if(cuadrante[x][y] == AVISO){
                            System.out.print("! ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }
                System.out.println();
            }

            System.out.println(" ----------\n  0 1 2 3 4\n");

            // pide las coordenadas
            System.out.print("Coordenada x: ");
            x = teclado.nextInt();

            System.out.print("Coordenada y: ");
            y = teclado.nextInt();

            // mira lo que hay en las coordenadas indicadas por el usuario
            switch(cuadrante[x][y]) {
                case VACIO:
                    for(int i=(y+1); i>=(y-1); i--){
                        for(int j=(x-1); j<=(x+1); j++){

                            if(i>=0&&i<=3){
                                if(j>=0&&j<=4){
                                    if(cuadrante[j][i] == MINA){
                                        minaEncontrada = true;
                                    }
                                }
                            }

                        }
                    }

                    if(minaEncontrada==true){
                        cuadrante[x][y] = AVISO;
                        System.out.println("¡Cuidado!¡Hay una mina cerca!");
                    }
                    else {
                        cuadrante[x][y] = INTENTO;
                    }

                    minaEncontrada=false;

                break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                break;
                case TESORO:
                    System.out.println("Enhorabuena, has encontrado el tesoro.");
                    salir = true;
                break;
                default:
            }
        } while (!salir);

        // pinta el cuadrante
        for(y = 3; y >= 0; y--) {
            System.out.print(y + "|");
            for(x = 0; x < 5; x++) {
                switch(cuadrante[x][y]) {
                    case VACIO:
                        c = "  ";
                    break;
                    case MINA:
                        c = "* ";
                    break;
                    case TESORO:
                        c = "€ ";
                    break;
                    case INTENTO:
                        c = "x ";
                    break;
                    case AVISO:
                        c = "! ";
                    break;
                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println(" ----------\n  0 1 2 3 4\n");
    }
}
