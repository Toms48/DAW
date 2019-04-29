//package Ej6;

import java.io.*;
import java.util.ArrayList;

public class Ej6 {
    public static void main(String args[]){

        //Declaraciones de variables
        String palabra = args[1];
        //String palabra = "fichero";

        int posicionPrincipioPalabra = 0;
        int posicionFinalPalabra = 0;
        int codigoSiguienteFinal = 0;

        int contador = 0;

        //int contador = -1;

        //Inicializaciones
        ArrayList<String> lineas = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Familia\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin1\\src\\Ej6\\fichero1.txt"));

            String linea = br.readLine();

            while(linea != null){
                //contador++;
                lineas.add(linea);
                //System.out.println(lineas.get(contador));	//Código para ver que muestra bien cada una de las líneas
                linea = br.readLine();
            }

            for(int i=0; i<=lineas.size()-1; i++){
                posicionPrincipioPalabra = lineas.get(i).indexOf(palabra);
                //System.out.println(posicionPrincipioPalabra);

                posicionFinalPalabra = posicionPrincipioPalabra+palabra.length()-1;
                //System.out.println(posicionFinalPalabra);

                if(posicionFinalPalabra != lineas.get(i).length()-1){
                    codigoSiguienteFinal = lineas.get(i).codePointAt(posicionFinalPalabra+1);

                }
                //System.out.println(codigoSiguienteFinal);

                if( (codigoSiguienteFinal<=97 || codigoSiguienteFinal>=122) && (codigoSiguienteFinal<=65 || codigoSiguienteFinal>=90)){
                    contador++;
                }

            }

            br.close();

            System.out.println("El numero de ocurrencias de " +args[1] +" es: " +contador);

        }
        catch(FileNotFoundException e){
            System.out.println("No se ha encontrado el archivo");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
