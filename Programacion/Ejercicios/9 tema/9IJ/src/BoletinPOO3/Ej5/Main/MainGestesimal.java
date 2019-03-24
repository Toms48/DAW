package BoletinPOO3.Ej5.Main;

import BoletinPOO3.Ej5.Clases.Articulo;

import java.util.Scanner;
import java.util.ArrayList;

public class MainGestesimal {

    public static void mostrarMenu(){
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Salida de mercancía");
        System.out.println("7. Salir");
        System.out.print  ("Introduzca una opcion: ");
    }

    public static void main(String[] args){

        //Declaraciones de variables
        int opcionMenu = 0;

        String descripcion = "";
        double precioCompra = 0;
        double precioVenta = 0;
        int stock = 0;

        //Inicializaciones
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);

        ArrayList<Articulo> arrayArticulos = new ArrayList<>();

        //Inicio
            //Hacer
            do{
                //mostrarMenu, leer y validar opcion del menu
                do{
                    mostrarMenu();
                    opcionMenu = tecladoN.nextInt();
                }
                while(opcionMenu<1 || opcionMenu>7);

                System.out.println();

                //Segun la opcion del menu
                switch(opcionMenu){
                    case 1:
                        Articulo.mostrarListado(arrayArticulos);
                        break;

                    case 2:
                        System.out.print("Introduzca la descripcion del articulo: ");
                        descripcion = tecladoS.nextLine();

                        do{
                            System.out.print("Introduzca el precio de compra: ");
                            precioCompra = tecladoN.nextDouble();
                        }
                        while(precioCompra <= 0);

                        do{
                            System.out.print("Introduzca el precio de venta: ");
                            precioVenta = tecladoN.nextDouble();
                        }
                        while(precioVenta<=0 || precioVenta<precioCompra);

                        do{

                            System.out.print("Introduzca el stock: ");
                            stock = tecladoN.nextInt();
                        }
                        while(stock < 0);

                        arrayArticulos = Articulo.alta(descripcion, precioCompra, precioVenta, stock, arrayArticulos);
                        break;

                    case 3:
                        arrayArticulos = Articulo.baja(arrayArticulos);
                        break;

                    case 4:
                        arrayArticulos = Articulo.modificacion(arrayArticulos);
                        break;

                    case 5:
                        Articulo.aniadirMercancia(arrayArticulos);
                        break;

                    case 6:
                        Articulo.eliminarMercancia(arrayArticulos);
                        break;
                }
                //Fin_Sengun
            }
            while(opcionMenu!=7);   //Mientras la opcion no sea salir(7)
        //Fin

    }
}
