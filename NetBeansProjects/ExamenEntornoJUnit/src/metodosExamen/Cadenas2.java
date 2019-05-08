/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metodosExamen;
import java.util.Scanner;

public class Cadenas2 {
    
    public static String leerCadena(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena: ");
        String cadena = sc.nextLine();
        
        return cadena;
    }
    
    public static String concatenaCadenas(String cadena1, String cadena2){
        return (cadena1 + cadena2);
    }
}