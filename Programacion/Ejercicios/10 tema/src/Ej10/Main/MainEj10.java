package Ej10.Main;

import java.util.HashMap;
import java.util.Scanner;

public class MainEj10 {
    public static void main(String[] args){

        //Declaraciones de variables
        String palabra = "";

        //Inicializaciones
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner tecladoS = new Scanner(System.in);

        diccionario.put("Rojo","Red");
        diccionario.put("Verde","Green");
        diccionario.put("Amarillo","Yellow");
        diccionario.put("Azul","Blue");
        diccionario.put("Negro","Black");

        diccionario.put("Perro","Dog");
        diccionario.put("Gato","Cat");
        diccionario.put("Leon","Lion");
        diccionario.put("Pájaro","Bird");
        diccionario.put("Serpiente","Snake");

        diccionario.put("Uno","One");
        diccionario.put("Dos","Two");
        diccionario.put("Tres","Three");
        diccionario.put("Cuatro","Four");
        diccionario.put("Cinco","Five");

        diccionario.put("Cuchara","Spoon");
        diccionario.put("Tenedor","Fork");
        diccionario.put("Cuchillo","Knife");
        diccionario.put("Plato","Plate");
        diccionario.put("Vaso","Glass");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Diccionario =-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(diccionario.keySet());
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();

        do{
            System.out.print("Introduzca una palabra del diccionario: ");
            palabra = tecladoS.nextLine();
        }
        while(!diccionario.containsKey(palabra));

        System.out.println();

        System.out.println(palabra +" ---> " +diccionario.get(palabra));

    }
}
