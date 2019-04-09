package Ej9.Main;

import Ej9.Clases.Carta;

import java.util.ArrayList;
import java.util.Collections;

public class MainEj9 {

    public static void main(String[] args){

        //Declaraciones de variables
        String paloCarta = "";
        String valorCarta = "";

        //Inicializaciones
        ArrayList<Carta> cartas = new ArrayList<>();
        Carta antiguaCarta = new Carta();
        Carta nuevaCarta = new Carta();

        for(int i=0; i<=9; i++){

            switch ((int)(Math.random()*4)+1){
                case 1:
                    paloCarta = "Bastos";
                    break;

                case 2:
                    paloCarta = "Copas";
                    break;

                case 3:
                    paloCarta = "Espadas";
                    break;

                case 4:
                    paloCarta = "Oros";
                    break;
            }

            switch ((int)(Math.random()*10)+1){
                case 1:
                    valorCarta = "As";
                    break;

                case 2:
                    valorCarta = "2";
                    break;

                case 3:
                    valorCarta = "3";
                    break;

                case 4:
                    valorCarta = "4";
                    break;

                case 5:
                    valorCarta = "5";
                    break;

                case 6:
                    valorCarta = "6";
                    break;

                case 7:
                    valorCarta = "7";
                    break;

                case 8:
                    valorCarta = "Sota";
                    break;

                case 9:
                    valorCarta = "Caballo";
                    break;

                case 10:
                    valorCarta = "Rey";
                    break;
            }

            nuevaCarta = new Carta(valorCarta, paloCarta);
            
            if(nuevaCarta.equals(antiguaCarta)){
                i--;
            }
            else{
                cartas.add(nuevaCarta);
                antiguaCarta = nuevaCarta;
            }
        }

        //Collections.sort(cartas);

        for(Carta carta : cartas){
            System.out.println(carta.toString());
        }

    }

}
