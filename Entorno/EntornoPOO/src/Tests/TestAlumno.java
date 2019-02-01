package Tests;

import Clases.Alumno;

public class TestAlumno {
    public static void main(String[] args){

        Alumno PorDefecto = new Alumno();
        Alumno Alumno1 = new Alumno("Tomas","Nuñez","Calle Almeria 35", "1 DAW", "628119707", 10,10,10,10,10);
        Alumno Alumno2 = new Alumno("Jorge","Obando","Calle Almeria 54", "2 DAM", "000000000");

        System.out.println("=-=-=-=-= Constructor por defecto =-=-=-=-=");
        System.out.println(PorDefecto.toString());

        System.out.println();

        System.out.println("=-=-=-=-= Constructor con parámetros =-=-=-=-=");
        System.out.println(Alumno1.toString());

        System.out.println();

        System.out.println("=-=-=-=-= Constructor con parámetros (sin notas) =-=-=-=-=");
        System.out.println(Alumno2.toString());
    
        System.out.println();
    
        System.out.println("=-=-=-=-= Gets (Notas antes de los sets de Alumno2) =-=-=-=-=");
        System.out.println(Alumno2.getNotaAs1());
        System.out.println(Alumno2.getNotaAs2());
        System.out.println(Alumno2.getNotaAs3());
        System.out.println(Alumno2.getNotaAs4());
        System.out.println(Alumno2.getNotaAs5());
    
        System.out.println("=-=-=-=-= Sets (Notas depues de los sets de Alumno2) =-=-=-=-=");
        Alumno2.setNotaAs1(8);
        Alumno2.setNotaAs2(6);
        Alumno2.setNotaAs3(7);
        Alumno2.setNotaAs4(10);
        Alumno2.setNotaAs5(9);
    
        System.out.println(Alumno2.getNotaAs1());
        System.out.println(Alumno2.getNotaAs2());
        System.out.println(Alumno2.getNotaAs3());
        System.out.println(Alumno2.getNotaAs4());
        System.out.println(Alumno2.getNotaAs5());
        
        System.out.println();
    
        System.out.println("=-=-=-=-= .notaMedia =-=-=-=-=");
        System.out.println("Nota media de " +PorDefecto.getNombre() +" es " +PorDefecto.getNotaMedia());
        System.out.println("Nota media de " +Alumno1.getNombre() +" es " +Alumno1.getNotaMedia());
        System.out.println("Nota media de " +Alumno2.getNombre() +" es " +Alumno2.getNotaMedia());

    }
}
