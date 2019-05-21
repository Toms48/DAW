/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * COMENTARIO RAMA MASTER
 */
package tratamientostring;
import java.util.Scanner;
/**
 *
 * @author informatica
 */
public class metodos1 {
    
    
    
    
    
    
    public static String leerCadena(){
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine(); //leemos la cadena
        
        return cadena;
    }
    
    public static int cuentaVocales(String cad){
        /*Scanner sc = new Scanner(System.in);
        String cad = sc.nextLine(); //leemos la cadena*/
        int cantidadVocales = 0;
        //iteramos mientras el indice sea menor al tamanio total de la cadena
        for (int i = 0; i < cad.length(); i++) {
            char car = cad.charAt(i); //obtenemos el caracter en la posicion i
            //si el caracter es igual a "a", "e", "i", "o", ó "u" entonces es vocal
            if (car == 'a' || car == 'e' || car ==  'i' || car == 'o' || car == 'u') {
                cantidadVocales++; //contamos cantidad vocales +1
            }
        }
        //devolvemos la cantidad de vocales
        return cantidadVocales;
    }
   
    public static String invierteCadena(String cadena){
        /*Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine(); //leemos la cadena*/
        String cadenaInvertida = "";
        //iteramos de forma invertida, partimos de la ultima posicion valida
        //hasta la primera posicion valida que el cero
        //vamos disminuyendo el valor de i en una unidad -1
        for (int i = cadena.length() - 1 ; i >= 0; i--) {
            char car = cadena.charAt(i); //obtenemos el caracter en la posicion i
            cadenaInvertida = cadenaInvertida + car;
        }
        //devolvemos la cadena invertida
        return cadenaInvertida;
    }
    
    
  }