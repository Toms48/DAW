package Ej8.Main;

import Ej8.Clases.Articulo;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class MainGestesimalV2 {

    public static void mostrarMenu(){
        System.out.println("1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Entrada de mercancía");
        System.out.println("6. Venta");
        System.out.println("7. Salir");
        System.out.print  ("Introduzca una opcion: ");
    }

    public static void main(String[] args){

        //Declaraciones de variables
        int opcionMenu = 0;

        String descripcion = "";
        int codigoArticulo = 0;
        double precioCompra = 0;
        double precioVenta = 0;
        int stock = 0;

        int posicionComa = 0;

        //Inicializaciones
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);

        ArrayList<Articulo> arrayArticulos = new ArrayList<>();

        //Inicio

            //Cargar el archivo de articulos en el array
            try{
                //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej7\\Main\\diccionario.dat"));
                //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Familia\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej7\\Main\\diccionario2.dat"));
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Familia\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej8\\Main\\articulo.dat"));

                String linea = br.readLine();

                while(linea != null){

                    posicionComa = linea.indexOf(',');
                    codigoArticulo = Integer.parseInt(linea.substring(0,posicionComa));
                    //System.out.println(codigoArticulo);
                    linea = linea.substring(posicionComa+1);

                    posicionComa = linea.indexOf(',');
                    descripcion = linea.substring(0,posicionComa);
                    //System.out.println(descripcion);
                    linea = linea.substring(posicionComa+1);


                    posicionComa = linea.indexOf(',');
                    precioCompra = Double.parseDouble(linea.substring(0,posicionComa));
                    //System.out.println(precioCompra);
                    linea = linea.substring(posicionComa+1);


                    posicionComa = linea.indexOf(',');
                    precioVenta = Double.parseDouble(linea.substring(0,posicionComa));
                    //System.out.println(precioVenta);
                    linea = linea.substring(posicionComa+1);


                    stock = Integer.parseInt(linea.substring(0));
                    //System.out.println(stock);

                    arrayArticulos = Articulo.volcarDatos(codigoArticulo,descripcion, precioCompra, precioVenta, stock, arrayArticulos);

                    linea = br.readLine();
                }

                br.close();

            }
            catch (FileNotFoundException e){
                //System.out.println("No se ha encontrado el archivo\n");
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }

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

            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Familia\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej8\\Main\\articulo.dat"));

                for (Articulo dato: arrayArticulos) {
                    bw.write(dato.getCodigoArticulo()+","+dato.getDescripcion()+","+dato.getPrecioCompra()+","+dato.getPrecioVenta()+","+dato.getStock());
                    bw.newLine();
                }

                bw.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }

        //Fin

    }
}
