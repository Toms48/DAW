package Ej7.Main;

import Ej7.Clases.Moneda;

import java.util.ArrayList;

public class MainEj7 {
    public static void main(String[] args){

        //Declaraciones de variables
        String ladoMoneda = "";
        String valorMoneda = "";

        //Inicializaciones
        ArrayList<Moneda> monedas = new ArrayList<>();
        Moneda antiguaMoneda = new Moneda();
        Moneda nuevaMoneda = new Moneda();

        for(int i=0; i<=5; i++){

            if((int)(Math.random()*2) == 0){
                ladoMoneda = "cara";
            }
            else{
                ladoMoneda = "cruz";
            }

            switch ((int)(Math.random()*8)+1){
                case 1:
                    valorMoneda = "1 céntimo";
                    break;

                case 2:
                    valorMoneda = "2 céntimos";
                    break;

                case 3:
                    valorMoneda = "5 céntimos";
                    break;

                case 4:
                    valorMoneda = "10 céntimos";
                    break;

                case 5:
                    valorMoneda = "20 céntimos";
                    break;

                case 6:
                    valorMoneda = "50 céntimos";
                    break;

                case 7:
                    valorMoneda = "1 euro";
                    break;

                case 8:
                    valorMoneda = "2 euros";
                    break;
            }

            nuevaMoneda = new Moneda(valorMoneda, ladoMoneda);

            if(monedas.isEmpty()){
                monedas.add(nuevaMoneda);
                antiguaMoneda = nuevaMoneda;
            }
            else{
                if(        (!antiguaMoneda.getLado().equals(nuevaMoneda.getLado()) && !antiguaMoneda.getValor().equals(nuevaMoneda.getValor()))
                        || ((antiguaMoneda.getLado().equals(nuevaMoneda.getLado()) && antiguaMoneda.getValor().equals(nuevaMoneda.getValor()))) ){
                    i--;
                }
                else{
                    monedas.add(nuevaMoneda);
                    antiguaMoneda = nuevaMoneda;
                }
            }
        }

        for(Moneda moneda : monedas){
            System.out.println(moneda.toString());
        }

    }
}
