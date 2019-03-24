/*
 *   Nombre:	MainProductos
 *
 *   Comentario:    Crea una clase ejecutable y crea un array de productos y
 *                  muestra el precio total de vender 5 productos de cada uno.
 *                  Crea tú mismo los elementos del array.
 *
 *   Análisis:
 *
 *       Entradas:
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: La opción del menu tiene que ser entre 0 y 18
 *
 * */

/*

//PG
	//Inicio
        //Cargar array de productos
        //Mostrar el total de vender 5 unidades de cada producto
	//Fin

*/

package BoletinExtra.Ej1.Main;

import BoletinExtra.Ej1.Clases.NoPerecedero;
import BoletinExtra.Ej1.Clases.Perecedero;
import BoletinExtra.Ej1.Clases.Producto;

import java.util.Scanner;

public class MainProductos {
    public static void main(String[] args){

        //Declaracion de variables
        String nombre = "";
        double precio = 0;
        int diasACaducar = 0;
        String tipo = "";

        double precioTotal = 0;

        int categoria = 0; //Esta variable se refiere a si es pereceder o no

        Producto[] arrayProductos = new Producto[2];

        //Inicializaciones
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);

        //Inicio
        //Cargar array de productos
        for(int i=0; i<=arrayProductos.length-1; i++){

            System.out.print("Introduzca el nombre del " +(i+1) +"º producto: ");
            nombre = tecladoS.nextLine();

            System.out.println();

            do{
                System.out.print("Introduzca el precio unitario del " +(i+1) +"º producto: ");
                precio = tecladoN.nextDouble();

                if(precio <= 0){
                    System.out.println("El precio no puede ser 0 o negativo.");
                    System.out.println("Introduzca un precio positivo.");
                }

            }
            while(precio <= 0);

            System.out.println();

            do{
                System.out.println("1. Perecedero");
                System.out.println("2. No perecedero");
                System.out.print  ("Indique la categoria del producto: ");
                categoria = tecladoN.nextInt();
            }
            while(categoria < 1 || categoria > 2);

            System.out.println();

            if(categoria == 1){

                do{
                    System.out.print("Introduzca los días que le faltan al producto para caducar: ");
                    diasACaducar = tecladoN.nextInt();

                    if(diasACaducar <= 0){
                        System.out.println("No puede ser 0 o negativo.");
                        System.out.println("Introduzca un numero positivo.");
                    }
                }
                while(diasACaducar <= 0);

                arrayProductos[i] = new Perecedero(nombre, precio, diasACaducar);

                System.out.println();
            }
            else{
                System.out.print("Introduzca el tipo del producto: ");
                tipo = tecladoS.nextLine();

                arrayProductos[i] = new NoPerecedero(nombre, precio, tipo);

                System.out.println();
            }

        }

        //Mostrar el total de vender 5 unidades de cada producto (5 perecederos y 5 no perecederos)
        for(Producto producto : arrayProductos){
            precioTotal += producto.calcular(5);
        }

        System.out.println("Precio total: " +precioTotal);

        //Fin

    }
}
