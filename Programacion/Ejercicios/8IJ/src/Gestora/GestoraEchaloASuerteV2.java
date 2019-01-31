package Gestora;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class GestoraEchaloASuerteV2 {

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

        String listaNombres = "Marco Antonio Avilés Torres, Emilio Bernal Usagre, Fernando Espinosa Alonso, Eduardo Gago Rivas, Adrián González Ramirez, Manuel Gutierrez Campos, Jose Joaquin Jimenez Acosta, Sofía Martín de la Fuente, Jose Monge Fernandez, Carlos Muñoz Fernández, Tomás Mateo Nuñez Rios, María del Carmen Pardillo García, Francisco Jesús Pérez Barrera, Francisco Javier Pinto Serrato, Antonio Jesús Ponce Vela, Manuel Jesús Ruiz Espinar, Jesús Triguero Begines, Soraya Valera Florindo";
        //String listaNombres = "Marco Antonio Avilés Torres, Emilio Bernal Usagre, Fernando Espinosa Alonso";

        int posicionComa = 0;
        int contador = 0;

        double premio = 0; //1 para el Pc flama, 2 para el portátil, 3 para el tecladucho
        boolean repetido = false;

        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();

        while(listaNombres != ""){
            posicionComa = listaNombres.indexOf(",");
            if(posicionComa == -1){
                nombres.add(listaNombres);
                listaNombres = "";
            }
            else{
                nombres.add(listaNombres.substring(0,posicionComa));
                listaNombres = listaNombres.replaceFirst(nombres.get(contador),"");
                listaNombres = listaNombres.replaceFirst(", ","");
            }
            System.out.println(nombres.get(contador));
            contador++;
        }

        String[][] ganadores = new String[2][nombres.size()];

        System.out.println(" ");

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

        String listaNombres = "Marco Antonio Avilés Torres, Emilio Bernal Usagre, Fernando Espinosa Alonso, Eduardo Gago Rivas, Adrián González Ramirez, Manuel Gutierrez Campos, Jose Joaquin Jimenez Acosta, Sofía Martín de la Fuente, Jose Monge Fernandez, Carlos Muñoz Fernández, Tomás Mateo Nuñez Rios, María del Carmen Pardillo García, Francisco Jesús Pérez Barrera, Francisco Javier Pinto Serrato, Antonio Jesús Ponce Vela, Manuel Jesús Ruiz Espinar, Jesús Triguero Begines, Soraya Valera Florindo";
        //String listaNombres = "Marco Antonio Avilés Torres, Emilio Bernal Usagre, Fernando Espinosa Alonso";

        int posicionComa = 0;
        int contador = 0;

        double premio = 0; //1 para el Pc flama, 2 para el portátil, 3 para el tecladucho
        boolean repetido = false;

        Scanner teclado = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<String>();

        while(listaNombres != ""){
            posicionComa = listaNombres.indexOf(",");
            if(posicionComa == -1){
                nombres.add(listaNombres);
                listaNombres = "";
            }
            else{
                nombres.add(listaNombres.substring(0,posicionComa));
                listaNombres = listaNombres.replaceFirst(nombres.get(contador),"");
                listaNombres = listaNombres.replaceFirst(", ","");
            }
            System.out.println(nombres.get(contador));
            contador++;
        }

        String[][] ganador = new String[2][1];

        System.out.println(" ");

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
