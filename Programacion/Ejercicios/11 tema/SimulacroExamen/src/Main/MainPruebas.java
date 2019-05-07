package Main;

import Clases.Producto;

import java.util.HashMap;
import java.util.Map;

public class MainPruebas {
    public static void main(String[] args){

        HashMap<Integer, Producto> productoHashMap = new HashMap<>();

        productoHashMap.put(1,new Producto("Patata",50,50));
        productoHashMap.put(2,new Producto("Huevo",50,50));
        productoHashMap.put(3,new Producto("Aceite",50,50));

        System.out.println("Mostrar todas las claves (SOLO LAS CLAVES)");
        System.out.println("==========================================");
        System.out.println(productoHashMap.keySet());

        System.out.println();

        System.out.println("Mostrar todas las claves con su valor correspondiente (utilizamos Map.Entry)");
        System.out.println("=========================================================================");
        for (Map.Entry pareja: productoHashMap.entrySet()) {
            System.out.println(pareja.getKey() +" ---> " +pareja.getValue());
        }

        System.out.println();

        System.out.println("Mostrar solo los valores");
        System.out.println("========================");
        for (Map.Entry pareja: productoHashMap.entrySet()) {
            System.out.println(pareja.getValue().toString());
        }

        System.out.println();

        System.out.println("Acceder a los atributos del objeto en la parte de valores");
        System.out.println("=========================================================");
        //Producto producto = productoHashMap.get(2);
        System.out.println(productoHashMap.get(2).getNombre()); //Significa que de la KEY 2 vamos ha mirar (con getNombre) el nombre

        productoHashMap.get(2).setNombre("Huevo Flama");

        System.out.println("Nuevo nombre: " +productoHashMap.get(2).getNombre()+"\n");

        System.out.println(productoHashMap.get(2).getStock());

        productoHashMap.get(2).setStock(productoHashMap.get(2).getStock() + 400);   //Añadimos 400 al stock de huevos

        System.out.println("Nuevo stock (+400): " +productoHashMap.get(2).getStock());

    }
}
