package Ej12.Main;

import Ej12.Clases.Carta;

import java.util.ArrayList;
import java.util.HashMap;

public class MainEj12 {
    public static void main(String[] args){

        //Declaraciones de varaibles
        String paloCarta = "";
        String valorCarta = "";

        int puntosTotales = 0;

        //Inicializaciones
        HashMap<String, Integer> mano = new HashMap<>();
        ArrayList<Carta> cartas = new ArrayList<>();
        Carta antiguaCarta = new Carta();
        Carta nuevaCarta = new Carta();

        mano.put("As",11);
        mano.put("Tres",10);
        mano.put("Sota",2);
        mano.put("Caballo",3);
        mano.put("Rey",4);

        for(int i=0; i<=4; i++){

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
                    valorCarta = "Dos";
                    break;

                case 3:
                    valorCarta = "Tres";
                    break;

                case 4:
                    valorCarta = "Cuatro";
                    break;

                case 5:
                    valorCarta = "Cinco";
                    break;

                case 6:
                    valorCarta = "Seis";
                    break;

                case 7:
                    valorCarta = "Siete";
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

        for(Carta carta : cartas){
            System.out.println(carta.toString());
            puntosTotales += mano.getOrDefault(carta.getValor(),0);
        }

        System.out.println("Tiene " +puntosTotales +" punto/s");

    }
}
