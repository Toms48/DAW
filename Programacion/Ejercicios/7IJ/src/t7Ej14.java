/*
 *   Nombre: t7Ej14
 *
 *   Comentario:    Escribe un programa que pida 8 palabras y las almacene en un array.
 *
 *                  A continuación, las palabras correspondientes a colores se deben almacenar al comienzo y las que no son colores acontinuación.
 *
 *                  Puedes utilizar tantos arrays auxiliares como quieras.
 *
 *                  Los colores que conoce el programa deben estar en otro array y son los siguientes:
 *                      - verde
 *                      - rojo
 *                      - azul
 *                      - amarillo
 *                      - naranja
 *                      - rosa
 *                      - negro
 *                      - blanco
 *                      - morado
 *
 *   Análisis:
 *
 *       Entradas: 8 Strings
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos:
 *
 * */

//PG
    //Inicio
        //Leer y almacenar 8 palabras
        //Para contador=0, mientras contador sea menor o igual que 7, aumentar contador
            //Si array de palabras en la posicion contador es uno de los colores de la lista
                //Cargar array final
                //Eliminar color del array inicial (con eliminar quiero decir cambiar el color a cadena vacia)
                //Aumentar contador de colores
            //Fin_Si
        //Fin_Para

        //Para contador=contador de colores, mientras contador sea menor o igual que 7, aumentar contador
            //Si array de palabras en la posicion contador de colores no es cadena vacia
                //Cargar array final
            //Fin_Si
        //Fin_Para

        //Mostrar array final
    //Fin

import java.util.Scanner;

public class t7Ej14 {
    public static void main(String[] args){

        //Declaraciones de variables
        String[] arrayPalabras = new String[8];
        String[] arrayColores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"}; //tiene tamaño 9

        String[] arrayFinal = new String[8];

        int contadorColores = 0;
        int contadorNoColores = 0;

        boolean colorEncontrado = false;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
            //Leer y almacenar 8 palabras
            for(int i=0; i<=7; i++){
                System.out.print("Por favor introduzca su " +(i+1) +"ª palabra: ");
                arrayPalabras[i] = teclado.next();
            }

            System.out.println(" ");
            System.out.println("Array Inicial");
            for(int i=0; i<=7; i++){
                System.out.print(arrayPalabras[i] +" ");
            }

            //Para contador=0, mientras contador sea menor o igual que 7, aumentar contador
            for(int i=0; i<=7; i++) {

                for(int j=0; j<=8 && colorEncontrado==false; j++){
                    if( arrayPalabras[i].equals(arrayColores[j]) ){
                        colorEncontrado = true;
                    }
                }

                //Si array de palabras en la posicion contador es uno de los colores de la lista
                if(colorEncontrado==true) {
                    //Cargar array final
                    arrayFinal[contadorColores] = arrayPalabras[i];

                    //Marcar palabra del array inicial (lo marcaré con un asterisco)
                    arrayPalabras[i] = "*";

                    //Aumentar contador de colores
                    contadorColores++;

                    colorEncontrado = false;

                }//Fin_Si
            }//Fin_Para

            //contadorNoColores = 0;

            //Para contador=contador de colores, mientras contador sea menor o igual que 7, aumentar contador
            for(int i=contadorColores; i<=7; i++) {
                //Si array de palabras en la posicion contador de colores no es cadena vacia
                if(arrayPalabras[contadorNoColores].equals("*")==false) {

                    //Cargar array final
                    arrayFinal[i] = arrayPalabras[contadorNoColores];



                }
                else{
                    i--;
                }//Fin_Si
                contadorNoColores++;
            }//Fin_Para

            //Mostrar array final
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Array Final");
            for(int i=0; i<=7; i++){
                System.out.print(arrayFinal[i] +" ");
            }

        //Fin

    }
}
