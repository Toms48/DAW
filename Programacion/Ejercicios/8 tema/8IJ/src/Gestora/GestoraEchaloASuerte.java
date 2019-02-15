package Gestora;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class GestoraEchaloASuerte {

/**************************************************************************
Interfaz
Comentario: Muestra el menu de opcionespor pantalla por pantalla
Cabecera: void mostrarMenu()
Precondiciones: No tiene
 Entrada: No tiene
 Salida: Por pantalla
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

    public static void mostrarMenu(){
        System.out.println("[1] ---> Lista de ganadores con su premio aleatorio");
        System.out.println("[2] ---> Un ganador con un premio aleatorio");
        System.out.println("[0] ---> Salir");
        System.out.print("Su opcion es: ");
    }

/**************************************************************************
Interfaz
Comentario: Reparte premios aleatorios a una lista de ganadores
Cabecera: String[][] premios()
Precondiciones: No tiene
Entrada: No tiene
Salida: Un array bidimensional
E/S: No hay
Postcondiciones: No tendrá ningun nombre de concursante repetido
**************************************************************************/

    public static String[][] premios(){

        String nombre = "";
        char respuesta = ' ';
        double premio = 0; //1 para el Pc flama, 2 para el portátil, 3 para el tecladucho
        boolean repetido = false;

        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();

        for(int i=1; respuesta!='n'; i++){
            System.out.println(" ");
            System.out.print("Introduzca el " +i +"º nombre de la lista: ");

            nombre = teclado.next();

            if(i==1){
                nombres.add(nombre);

                System.out.println(" ");
                System.out.println("=-=-=-=-=-= Lista de participantes =-=-=-=-=-=");
                for(int k=0; k<=nombres.size()-1; k++){
                    System.out.println(nombres.get(k));
                }
                System.out.println(" ");

                /*do{
                    System.out.print("¿Quiere introducir otro participante mas? (S/N): ");
                    respuesta = Character.toLowerCase(teclado.next().charAt(0));
                }
                while(respuesta!='n' && respuesta!='s');
                System.out.println(" ");*/

            }
            else{
                for(int j=0; j<=nombres.size()-1 && repetido == false; j++){
                    if(nombres.get(j).equals(nombre)){
                        repetido = true;
                    }
                }

                if(repetido==false) {
                    nombres.add(nombre);

                    System.out.println(" ");
                    System.out.println("=-=-=-=-=-= Lista de participantes =-=-=-=-=-=");
                    for (int k = 0; k <= nombres.size() - 1; k++) {
                        System.out.println(nombres.get(k));
                    }
                    System.out.println(" ");

                    /*do{
                        System.out.print("¿Quiere introducir otro participante mas? (S/N): ");
                        respuesta = Character.toLowerCase(teclado.next().charAt(0));
                    }
                    while(respuesta!='n' && respuesta!='s');
                    System.out.println(" ");*/

                }
                else{
                    System.out.println(" ");
                    System.out.println("Este nombre ya ha sido introducido en la lista de participantes");
                    System.out.println(" ");

                    i--;
                    repetido = false;
                }
            }

            do{
                System.out.print("¿Quiere introducir otro participante mas? (S/N): ");
                respuesta = Character.toLowerCase(teclado.next().charAt(0));
            }
            while(respuesta!='n' && respuesta!='s');
            System.out.println(" ");

        }

        String[][] ganadores = new String[2][nombres.size()];

        for(int i=0; i<=1; i++){
            for(int j=0; j<=nombres.size()-1; j++){
                if(i==0){
                    ganadores[i][j] = nombres.get(j);
                }
                else{
                    premio = Math.random()*10;

                    if(premio>=0.0 && premio<=0.9){
                        ganadores[i][j] = "Pc gama alta";
                    }
                    else{
                        if(premio>=1.0 && premio<=3.8){
                            ganadores[i][j] = "Portatil ñeh";
                        }
                        else{
                            ganadores[i][j] = "Teclado chustilla";
                        }
                    }
                }
            }
        }

        return ganadores;
    }

/**************************************************************************
Interfaz
Comentario: Reparte UN premio aleatorio a UNA persona de la lista
Cabecera: String[][] premios()
Precondiciones: No tiene
Entrada: No tiene
Salida: Un array bidimensional
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

    public static String[][] premioUnGanador(){

        String nombre = "";
        char respuesta = ' ';
        double premio = 0; //1 para el Pc flama, 2 para el portátil, 3 para el tecladucho
        boolean repetido = false;

        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();

        for(int i=1; respuesta!='n'; i++){
            System.out.println(" ");
            System.out.print("Introduzca el " +i +"º nombre de la lista: ");

            nombre = teclado.next();

            if(i==1){
                nombres.add(nombre);

                System.out.println(" ");
                System.out.println("=-=-=-=-=-= Lista de participantes =-=-=-=-=-=");
                for(int k=0; k<=nombres.size()-1; k++){
                    System.out.println(nombres.get(k));
                }
                System.out.println(" ");

                    /*do{
                        System.out.print("¿Quiere introducir otro participante mas? (S/N): ");
                        respuesta = Character.toLowerCase(teclado.next().charAt(0));
                    }
                    while(respuesta!='n' && respuesta!='s');
                    System.out.println(" ");*/

            }
            else{
                for(int j=0; j<=nombres.size()-1 && repetido == false; j++){
                    if(nombres.get(j).equals(nombre)){
                        repetido = true;
                    }
                }

                if(repetido==false) {
                    nombres.add(nombre);

                    System.out.println(" ");
                    System.out.println("=-=-=-=-=-= Lista de participantes =-=-=-=-=-=");
                    for (int k = 0; k <= nombres.size() - 1; k++) {
                        System.out.println(nombres.get(k));
                    }
                    System.out.println(" ");

                        /*do{
                            System.out.print("¿Quiere introducir otro participante mas? (S/N): ");
                            respuesta = Character.toLowerCase(teclado.next().charAt(0));
                        }
                        while(respuesta!='n' && respuesta!='s');
                        System.out.println(" ");*/

                }
                else{
                    System.out.println(" ");
                    System.out.println("Este nombre ya ha sido introducido en la lista de participantes");
                    System.out.println(" ");

                    i--;
                    repetido = false;
                }
            }

            do{
                System.out.print("¿Quiere introducir otro participante mas? (S/N): ");
                respuesta = Character.toLowerCase(teclado.next().charAt(0));
            }
            while(respuesta!='n' && respuesta!='s');
            System.out.println(" ");

        }

        String[][] ganador = new String[2][1];

        for(int i=0; i<=1; i++){
            if(i==0){
                ganador[i][0] = nombres.get((int)(Math.random()*nombres.size()));
            }
            else{
                premio = Math.random()*10;

                if(premio>=0.0 && premio<=0.9){
                    ganador[i][0] = "Pc gama alta";
                }
                else{
                    if(premio>=1.0 && premio<=3.8){
                        ganador[i][0] = "Portatil ñeh";
                    }
                    else{
                        ganador[i][0] = "Teclado chustilla";
                    }
                }
            }
        }

        return ganador;
    }

}
