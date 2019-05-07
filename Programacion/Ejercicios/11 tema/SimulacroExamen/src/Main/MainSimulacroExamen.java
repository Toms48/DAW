package Main;

import Clases.Producto;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainSimulacroExamen {

    public static void mostrarMenu(){
        System.out.println("1. Listado");
        System.out.println("2. Insertar producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Modificación");
        System.out.println("5. Salir");
        System.out.print  ("Introduzca una opcion: ");
    }
    
    public static void mostrarSubMenuListado(){
		System.out.println("1. Todo");
		System.out.println("2. Solo claves");
		System.out.println("3. Solo valores");
		System.out.println("4. Volver");
		System.out.print  ("Introduzca una opcion: ");
    }
	
	public static void mostrarSubMenuModificacion(){
		System.out.println("1. Añadir stock");
		System.out.println("2. Vender");
		System.out.println("3. Modificar nombre/precio");
		System.out.println("4. Volver");
		System.out.print  ("Introduzca una opcion: ");
	}

    public static void main(String[] args){

        //Declaraciones de variables
		int inversionTotal = 0;
		
        int opcionMenu = 0;
        int opcionSubMenuL = 0;
        int opcionSubMenuM = 0;

        String nombre = "";
        Integer ultimaClave = 0;
        double precio = 0;
        int stock = 0;
        
		Integer cod = 0;

        //Inicializaciones
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
	
		HashMap<Integer, Producto> tienda = new HashMap<>();

        //Inicio
            //Hacer
            do{
                //mostrarMenu, leer y validar opcion del menu
                do{
                    mostrarMenu();
                    opcionMenu = tecladoN.nextInt();
                }
                while(opcionMenu<1 || opcionMenu>5);

                System.out.println();

                //Segun la opcion del menu
                switch(opcionMenu){
                    case 1:
						do{
							mostrarSubMenuListado();
							opcionSubMenuL = tecladoN.nextInt();
						}
						while(opcionSubMenuL<1 || opcionSubMenuL>4);
                    	
                    	switch(opcionSubMenuL){
							case 1:
								if(tienda.isEmpty()){
									System.out.println();
									System.out.println("El diccionario se encuentra actualmente vacio.");
									System.out.println();
								}
								else{
									for (Map.Entry pareja: tienda.entrySet()) {
										System.out.println(pareja.getKey()+" ---> "+pareja.getValue());
									}
								}
								break;
								
							case 2:
								if(tienda.isEmpty()){
									System.out.println();
									System.out.println("El diccionario se encuentra actualmente vacio.");
									System.out.println();
								}
								else{
									System.out.println(tienda.keySet());
								}
								break;
								
							case 3:
								if(tienda.isEmpty()){
									System.out.println();
									System.out.println("El diccionario se encuentra actualmente vacio.");
									System.out.println();
								}
								else{
									for (Map.Entry pareja: tienda.entrySet()) {
										System.out.println(pareja.getValue().toString());
									}
								}
								break;
						}
                        break;

                    case 2:
                        System.out.print("Introduzca el nombre del producto: ");
                        nombre = tecladoS.nextLine();

                        do{
                            System.out.print("Introduzca el precio: ");
                            precio = tecladoN.nextDouble();
                        }
                        while(precio <= 0);

                        do{
                            System.out.print("Introduzca el stock: ");
                            stock = tecladoN.nextInt();
                        }
                        while(stock < 0);
	
						for (Map.Entry pareja: tienda.entrySet()) {
							ultimaClave = (Integer) (pareja.getKey());
						}
      
						tienda.put(ultimaClave,new Producto(nombre, precio, stock));
                        break;

                    case 3:
						int codigoBaja = 0;
	
						do{
							System.out.print("Introduzca el codigo del articulo que quiere dar de baja: ");
							for (Map.Entry pareja: tienda.entrySet()) {
								System.out.println(pareja.getKey()+" ---> "+pareja.getValue());
							}
							codigoBaja = tecladoN.nextInt();
						}
						while(!tienda.containsKey(codigoBaja));
						
						tienda.remove(codigoBaja);
						
                        break;

                    case 4:
						do{
							mostrarSubMenuModificacion();
							opcionSubMenuM = tecladoN.nextInt();
						}
						while(opcionSubMenuM<1 || opcionSubMenuM>4);
                    	
                    	switch(opcionSubMenuM){
							case 1:
								int masStock = 0;
								
								do{
									System.out.print("Introduzca el codigo del articulo que quiere añadir stock: ");
									for (Map.Entry pareja: tienda.entrySet()) {
										System.out.println(pareja.getKey()+" ---> "+pareja.getValue());
									}
									cod = tecladoN.nextInt();
								}
								while(!tienda.containsKey(cod));
								
								do{
									System.out.print("Introduzca cuanto vamos a añadir: ");
									masStock = tecladoN.nextInt();
								}
								while(masStock <= 0);
								
								for (Map.Entry pareja: tienda.entrySet()) {
									if(cod == pareja.getKey()){
										Producto producto = tienda.get(cod);
										producto.setStock(producto.getStock() + masStock);
									}
									System.out.println(pareja.getKey()+" ---> "+pareja.getValue());
								}
								
								break;
								
							case 2:
								int menosStock = 0;
								
								do{
									System.out.print("Introduzca el codigo del articulo que quiere añadir stock: ");
									for (Map.Entry pareja: tienda.entrySet()) {
										System.out.println(pareja.getKey()+" ---> "+pareja.getValue());
									}
									cod = tecladoN.nextInt();
								}
								while(!tienda.containsKey(cod));
								
								do{
									System.out.print("Introduzca cuanto va a vender: ");
									menosStock = tecladoN.nextInt();
								}
								while(menosStock <= 0);
								
								for (Map.Entry pareja: tienda.entrySet()) {
									if(cod == pareja.getKey()){
										Producto producto = tienda.get(cod);
										producto.setStock(producto.getStock() - menosStock);
									}
									System.out.println(pareja.getKey()+" ---> "+pareja.getValue());
								}
								break;
								
							case 3:
								break;
						}
                        break;
                }
                //Fin_Sengun
            }
            while(opcionMenu!=5);

        //Fin

    }
}
