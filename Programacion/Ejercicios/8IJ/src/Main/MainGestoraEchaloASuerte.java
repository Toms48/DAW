package Main;

/*
 * Nombre: EchaloASuerteCMD
 *
 * Comentario:  Simula la web de echaloasuerte.com
 *
 *              Podrá elegirse entre dos opciones
 *                  - Lista de ganadores con sus premios aleatorios.
 *                  - Un solo ganador de la lista con un premio aleatorio.
 *
 * Análisis
 *
 * 		Entradas:
 * 	        - Nombres de los participantes (cuantos se quiera)
 *
 * 		Salidas: Por pantalla
 *
 * 	    Requisitos:
 * 	        - La opcion del menu será entre 0 y 2
 * 	        - No se podrá tener dos participantes con el mismo nombre
 *
 */

/*
//PG
    //Inicio
        //Hacer
            //Mostrar menu, leer y validar opcion
            //Segun la opcion del menu
                //caso 1: Lista de ganadores con premios aleatorios
                //caso 2: UN ganador con UN premio aleatorio
            //Fin_Segun
        //Mientras el usuario no quiera salir de la aplicacion
    //Fin
*/

import java.lang.Math;
import Gestora.GestoraEchaloASuerte;
import Gestora.GestoraEchaloASuerteV2;

import java.util.Scanner;

public class MainGestoraEchaloASuerte {
    public static void main(String[] args){

        //Declaracion de variables
        int opcionMenu = 0;
        String[][] listaGanadores;
        String[][] unicoGanador;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Hacer
            do {
                //Mostrar menu, leer y validar opcion
                do{
                    GestoraEchaloASuerte.mostrarMenu();
                    opcionMenu = teclado.nextInt();
                }
                while(opcionMenu<0 || opcionMenu>2);

                //Segun la opcion del menu
                switch(opcionMenu) {
                    case 1: //caso 1: Lista de ganadores con premios aleatorios
                        listaGanadores = GestoraEchaloASuerteV2.premios();

                        /*for(int i=0; i<=listaGanadores.length-1; i++){
                            for(int j=0; j<=listaGanadores[i].length-1; j++){
                                System.out.print(listaGanadores[i][j] +" ");
                            }
                            System.out.println(" ");
                        }

                        System.out.println(" ");*/

                        for(int i=0; i<=listaGanadores[0].length-1; i++){
                            System.out.println(listaGanadores[0][i] +" ---> " +listaGanadores[1][i]);
                        }

                        System.out.println(" ");

                    break;

                    case 2: //caso 2: UN ganador con UN premio aleatorio
                        //System.out.println("WIP");

                        unicoGanador = GestoraEchaloASuerte.premioUnGanador();

                        /*for(int i=0; i<=unicoGanador.length-1; i++){
                            for(int j=0; j<=unicoGanador[i].length-1; j++){
                                System.out.print(unicoGanador[i][j] +" ");
                            }
                            System.out.println(" ");
                        }

                        System.out.println(" ");*/

                        for(int i=0; i<=unicoGanador[0].length-1; i++){
                            System.out.println(unicoGanador[0][i] +" ---> " +unicoGanador[1][i]);
                        }

                        System.out.println(" ");

                    break;
                }//Fin_Segun
            }
            while(opcionMenu!=0); //Mientras el usuario no quiera salir de la aplicacion
        //Fin


        /*for(int i=0; i<=20; i++){
            System.out.println(Math.random()*10);
        }*/

    }
}
