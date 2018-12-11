package Tema7Parte2;

/*
 *   Nombre: t7Ej8P2
 *
 *   Comentario:	Escribe un programa que, dada una posición en un tablero de ajedrez,
 *                  nos diga aqué casillas podría saltar un alfil que se encuentra en esa posición.
 *
 *                  Como se indica en la figura, el alfil se mueve siempre en diagonal.
 *
 *                  El tablero cuenta con 64 casillas.
 *
 *                  Las columnas se indican con las letras de la "a" a la "h" y las filas se indican del 1 al 8.
 *
 *   Análisis:
 *
 *       Entradas:
 *          - Un char
 *          - Un int
 *
 *       Salidas: Por pantalla
 *
 * */

//PG
/*
    //Inicio
        //Leer y validar letra
        //Leer y validar numero
        //Comprobar movimientos diagonales arriba-izquierda
        //Comprobar movimientos diagonales arriba-derecha
        //Comprobar movimientos diagonales abajo-izquierda
        //Comprobar movimientos diagonales abajo-derecha
    //Fin
*/

import java.util.Scanner;

public class t7Ej8P2 {
    public static void main(String[] args){

        //Declaración de variables
        int letra = 0;
        int numero = 0;
        
        int auxLetra = 0;
        int auxNumero = 0;

        //Inicializaciones
        Scanner tecladoLetra = new Scanner(System.in);
        Scanner tecladoNumero = new Scanner(System.in);
    
        //Inicio
        //Leer y validar letra
        do{
            System.out.print("Introduzca la posicion horizontal (a-h) del alfil: ");
            letra = (int)(Character.toLowerCase(tecladoLetra.next().charAt(0)))-96;
            //teclado.nextLine();
        }
        while(letra<1 || letra>8);
        
        //Leer y validar numero
        do{
            System.out.print("Introduzca la posicion vertical (1-8) del alfil: ");
            numero = tecladoNumero.nextInt();
        }
        while(numero<1 || numero>8);
    
        System.out.println(letra);
        auxLetra = letra;
        System.out.println(numero);
        auxNumero = numero;
        
        //Comprobar movimientos diagonales arriba-izquierda
        for(int i=letra-1; i>=1 && numero<=7; i--){ //La i controla la posicion de las filas, de las letras, en horizontal
            System.out.print((char)(i+96) +"" +(numero+1) +" ");
            numero++;
        }
        
        letra = auxLetra;
        numero = auxNumero;
        
        //Comprobar movimientos diagonales arriba-derecha
        for(int i=letra+1; i<=8 && numero<=7; i++){ //La i controla la posicion de las filas, de las letras, en horizontal
            System.out.print((char)(i+96) +"" +(numero+1) +" ");
            numero++;
        }
    
        letra = auxLetra;
        numero = auxNumero;
        
        //Comprobar movimientos diagonales abajo-izquierda
        for(int i=letra-1; i>=1 && numero>=1; i--){ //La i controla la posicion de las filas, de las letras, en horizontal
            System.out.print((char)(i+96) +"" +(numero-1) +" ");
            numero--;
        }
    
        letra = auxLetra;
        numero = auxNumero;
        
        //Comprobar movimientos diagonales abajo-derecha
        for(int i=letra+1; i<=8 && numero>=1; i++){ //La i controla la posicion de las filas, de las letras, en horizontal
            System.out.print((char)(i+96) +"" +(numero-1) +" ");
            numero--;
        }
    
        letra = auxLetra;
        numero = auxNumero;
        
        //Fin

    }
}
