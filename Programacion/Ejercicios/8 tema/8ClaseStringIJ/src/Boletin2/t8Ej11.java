/*
 *   Nombre: Boletin2.t8Ej11
 *
 *   Comentario:	Lo de los numeros romanos CAMBIAR ESTE TEXTO POR FAVOR
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un String
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos: Los caracteres validos son ---> M D C L X V I
 *
 * */

/*
//PG
	//Inicio
		//Leer String
		//Pasar String a array de char
		//Si hay alguna letra no valida
		    //Mostrar mensaje de error
		//Sino
		    //Mostrar suma de los numeros
		//Fin_Si
	//Fin
*/

package Boletin2;

import java.util.Scanner;

public class t8Ej11 {
    public static void main(String[] args){

        //Declaracion de variables
        String numeroRomano = new String();

        char[] arrayChar;

        boolean entradaCorrecta = true;

        int sumaNumerosRomanos = 0;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Leer String
            System.out.print("Introduzca un numero romano: ");
            numeroRomano = teclado.nextLine().toUpperCase();
    
            //Pasar String a array de char
            arrayChar = numeroRomano.toCharArray();
    
            for(char letra:arrayChar){
                if(letra != 'M' && letra != 'D' && letra != 'C' && letra != 'L' && letra != 'X' && letra != 'V' && letra != 'I'){
                    entradaCorrecta = false;
                }
            }
    
            //Si hay alguna letra no valida
            if(entradaCorrecta == false) {
                //Mostrar mensaje de error
                System.out.println();
                System.out.println("Ha introducido una letra no valida.");
                System.out.println("Asegurese que ha ha introducido solo alguna de las siguientes letras: M D C L X V I");
            }
            else {
                //Mostrar suma de los numeros
                for(char letra:arrayChar){
                    switch (letra){
                        case 'M':
                            sumaNumerosRomanos += 1000;
                            break;
    
                        case 'D':
                            sumaNumerosRomanos += 500;
                            break;
    
                        case 'C':
                            sumaNumerosRomanos += 100;
                            break;
    
                        case 'L':
                            sumaNumerosRomanos += 50;
                            break;
    
                        case 'X':
                            sumaNumerosRomanos += 10;
                            break;
    
                        case 'V':
                            sumaNumerosRomanos += 10;
                            break;
    
                        case 'I':
                            sumaNumerosRomanos += 1;
                            break;
                    }
                }
    
                System.out.println();
                System.out.println("La suma de los numeros romanos es: " +sumaNumerosRomanos);
    
            }//Fin_Si

        //Fin

    }
}
