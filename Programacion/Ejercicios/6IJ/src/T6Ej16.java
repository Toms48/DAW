/*
 * Nombre: T6Ej15
 *
 * Comentario:  Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientesrequisitos:
 *                  a)El ordenador mostrará una tirada que consiste en mostrar 3 figuras.
 *                      Hay 5 figuras posibles: corazón, diamante, herradura, campana y limón.
 *                  b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
 *                  c)Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”.
 *                  d)Si las tres figuras son iguales se debe mostrar “Enhorabuena,haganado 10 monedas”.
 *
 *                  Ejemplo1: diamante diamante limón Bien, ha recuperado su moneda
 *
 *                  Ejemplo2: herradura campana diamante Lo siento, ha perdido
 *
 *                  Ejemplo3: corazón corazón corazón Enhorabuena, ha ganado 10 monedas
 *
 * Análisis
 *
 * 		Entradas: No tiene
 *
 * 		Salidas: Por pantalla
 *
 */

//PG
    //Incio
        //Generar tres figuras aleatorias
        //Si las tres figuras son iguales
            //Escribir mensaje bueno
        //Sino

            //Si la primero es igual a la segunda
                //Escribir mensaje medio
            //Sino

                //Si el segundo es igual que el tercero
                    //Escribir mensaje medio
                //Sino

                    //Si el primero es igual que el tercero
                        //Escribir mensaje medio
                    //Sino
                        //Escribir mensaje malo
                    //Fin_Si

                //Fin_Si

            //Fin_Si

        //Fin_Si
    //Fin

import java.lang.Math;

public class T6Ej16 {
    public static void main (String[] args) {

        //Declaraciones de variables
        int f1 = 0;
        int f2 = 0;
        int f3 = 0;

        String sF1 = " ";
        String sF2 = " ";
        String sF3 = " ";

        //Inicializaciones

        //Incio
            //Generar tres figuras aleatorias
            f1 = (int)(Math.random()*5)+1;
            f2 = (int)(Math.random()*5)+1;
            f3 = (int)(Math.random()*5)+1;

            switch(f1){
                case 1:
                    sF1="Corazon";
                break;

                case 2:
                    sF1="Diamante";
                break;

                case 3:
                    sF1="Herradura";
                break;

                case 4:
                    sF1="Campana";
                break;

                case 5:
                    sF1="Limon";
                break;
            }

        switch(f2){
            case 1:
                sF2="Corazon";
                break;

            case 2:
                sF2="Diamante";
                break;

            case 3:
                sF2="Herradura";
                break;

            case 4:
                sF2="Campana";
                break;

            case 5:
                sF2="Limon";
                break;
        }

        switch(f3){
            case 1:
                sF3="Corazon";
                break;

            case 2:
                sF3="Diamante";
                break;

            case 3:
                sF3="Herradura";
                break;

            case 4:
                sF3="Campana";
                break;

            case 5:
                sF3="Limon";
                break;
        }

            //Si las tres figuras son iguales
            if(f1==f2 && f1==f3 && f2==f3) {
                //Escribir mensaje bueno
                System.out.println(sF1 +" " +sF2 +" " +sF3 +" Enhorabuena,haganado 10 monedas");
            }
            else {
                //Si la primero es igual a la segunda
                if(f1==f2) {
                    //Escribir mensaje medio
                    System.out.println(sF1 +" " +sF2 +" " +sF3 +" Bien, ha recuperado su moneda");
                }
                else {
                    //Si el segundo es igual que el tercero
                    if(f2==f3) {
                        //Escribir mensaje medio
                        System.out.println(sF1 +" " +sF2 +" " +sF3 +" Bien, ha recuperado su moneda");
                    }
                    else {
                        //Si el primero es igual que el tercero
                        if(f1==f3) {
                            //Escribir mensaje medio
                            System.out.println(sF1 +" " +sF2 +" " +sF3 +" Bien, ha recuperado su moneda");
                        }
                        else{
                            //Escribir mensaje malo
                            System.out.println(sF1 +" " +sF2 +" " +sF3 +" Lo siento, ha perdido");
                        }//Fin_Si
                    }//Fin_Si
                }//Fin_Si
            }//Fin_Si
        //Fin

    }
}
