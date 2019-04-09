package Ej11.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEj11 {
    public static void main(String[] args){

        //Declaraciones de variables
        String palabra = "";
        String traduccion = "";

        int contadorFallos = 0;
        int contadorAciertos = 0;

        int cantidadPalabras = 0;

        //Inicializaciones
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner tecladoS = new Scanner(System.in);
        ArrayList<String> arrayPalabras = new ArrayList<>();

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

        /*System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Diccionario =-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(diccionario.keySet());
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();*/

        for (Map.Entry pareja: diccionario.entrySet()) {
            if((int)(Math.random()*2) == 0 && cantidadPalabras<5){

                System.out.println(pareja.getValue());
                System.out.print("Traducción: ");
                traduccion = tecladoS.nextLine();

                if(pareja.getKey().equals(traduccion)){
                    System.out.println("CORRECTO!\n");
                    contadorAciertos++;
                }
                else{
                    System.out.println("Incorrecto...\n");
                    contadorFallos++;
                }

                cantidadPalabras++;
            }


        }

        System.out.println("Número de aciertos: " +contadorAciertos);
        System.out.println("Número de fallos:   " +contadorFallos);

    }
}
