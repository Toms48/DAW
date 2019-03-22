/*
 * Nombre: MainEjPropio
 *
 * Comentario: Escribe un programa que muestre en tres columnas, el cuadrado y el cubo
 * 				de los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * Análisis
 *
 * 		Entradas: int para el numero
 *
 * 		Salidas: Por pantalla
 *
 */

package Main;

import Gestoras.GestoraEjercicioPropio;
import Clases.Pelicula;

import java.util.Scanner;
import java.util.ArrayList;

public class MainEjPropio {

    public static void mostrarMenu(){
        System.out.println("1. Mostrar lista de películas");
        System.out.println("2. Añadir película");
        System.out.println("3. Eliminar películas");
        System.out.println("4. Lista de más a menos veces vista");
        System.out.println("5. Lista de más a menos nota por género");
        System.out.println("6. Editar info");
        System.out.println("7. Salir de la aplicación");
        System.out.print("Su opción es: ");
    }

    public static void main(String[] args){

        //Declaracion de variables
        int opcionMenu = 0;

        //Inicializaciones
        ArrayList<Pelicula> arrayPeliculas = new ArrayList<Pelicula>();
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);

        //Hacer
        do{
            //Leer y validar opcion del menu
            do{
                //mostrarMenu
                mostrarMenu();
                opcionMenu = tecladoN.nextInt();
            }
            while(opcionMenu<1 || opcionMenu>7);

            System.out.println();

            //Segun opcion del menu
            switch(opcionMenu){
                case 1:
                    GestoraEjercicioPropio.mostrarListaPeliculas(arrayPeliculas);
                    break;

                case 2:
                    GestoraEjercicioPropio.aniadirPelicula(arrayPeliculas);
                    Pelicula.actualizarHorasTotales(arrayPeliculas);
                    break;

                case 3:
                    GestoraEjercicioPropio.eliminarPelicula(arrayPeliculas);
                    break;

                case 4:
                    GestoraEjercicioPropio.listaMasVecesVista(arrayPeliculas);
                    break;

                case 5:
                    GestoraEjercicioPropio.listaMasNotaGenero(arrayPeliculas);
                    break;

                case 6:
                    GestoraEjercicioPropio.editarInfo(arrayPeliculas);
                    break;
            }

            System.out.println();

        }
        while(opcionMenu!=7); //Mientras se quiera seguir utilizando la app

    }
}
