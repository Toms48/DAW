package Main;

/**
 *
 * 
 * 
 * 
 */

import java.util.Scanner;

public class MainPruebasFunciones {
    public static void main (String [] args){
        
        //Declaraciones de variables
        int num = 0;
        
        //Inicializaciones
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduzca un numero para sumarle 3: ");
        num = teclado.nextInt();
        
        System.out.println("El resultado es: " +(Gestora.GestoraPruebasFunciones.suma3(num)));
        
        System.out.println("");

        System.out.print("Introduzca un numero para sumar sus pares menores: ");
        num = teclado.nextInt();
        
        System.out.println("El resultado de los valores pares menores es: " +(Gestora.GestoraPruebasFunciones.SumaParesMenores(num)));
        
        System.out.println("");
        
        System.out.print("Introduzca un numero para ver la combinacion de las dos funciones anteriores: ");
        num = teclado.nextInt();
        
        System.out.println("El resultado combinado es: " +(Gestora.GestoraPruebasFunciones.suma3(Gestora.GestoraPruebasFunciones.SumaParesMenores(num))));
        
    }
}
