/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodosExamen;
import java.util.Scanner;

public class Cadenas1 {
    
    public static String leerCadena(){
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        
        return cadena;
    }
    
    public static String pasaMin(String cadena){
        return  cadena.toLowerCase();
    }
    
    public static String pasaMay(String cadena){
        return  cadena.toUpperCase();
    }
    
    
  }