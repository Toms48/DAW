package Main;

import Clases.Piloto;
import Gestora.GestoraCarreras;

public class MainCarreras {
    public static void main(String[] args){

        //Declaraciones de variables

        //Inicializaciones
        Piloto p1 = new Piloto("McLaren", "Lewis", "Hamilton", "Ingles", 0,1,34, 13, 1);
        Piloto p2 = new Piloto("Renault", "Fernando", "Alonso", "Español", 0,1,37, 19, 2);
        Piloto p3 = new Piloto("Ferrari", "Sebastian", "Vettel", "Aleman", 0,1,34, 13, 5);

        GestoraCarreras gestoraCarreras = new GestoraCarreras();

        gestoraCarreras.circuito("Nurburgring");
        p1.averia();
        p2.adelanta("Hamilton");
        p2.gana();
        p2.nuevoTrofeo();
        p2.celebracionTriunfo();
        System.out.println("Y con este, " +p2.getApellido() +" lleva " +p2.getTrofeosGanados());
        p1.nuevaEscuderia("Mercedes");

        System.out.println();

        gestoraCarreras.circuito("Brasil");
        p3.adelanta("Fernando");
        p2.averia();
        p1.adelanta("Lewis");
        p1.gana();
        p1.nuevoTrofeo();
        p1.celebracionTriunfo();

        System.out.println();

        System.out.println(p1.getApellido() +" lleva " +p1.getTrofeosGanados() +" trofeos este año.");

        System.out.println();

        p2.nuevoTrofeo();
        System.out.println("Y con este, Alonso lleva " +p2.getTrofeosGanados() +" trofeos este año.");

        System.out.println();

        System.out.println(p2.getApellido() +" lleva " +p2.getTrofeosGanados() +" trofeos este año.");
        p2.setTrofeosGanados(14);
        System.out.println("Sorprendentemente: " +p2.getApellido() +" lleva " +p2.getTrofeosGanados() +" trofeos este año. Por ello, gana su cuarto campeonato.");


    }
}
