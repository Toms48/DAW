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

    }
}
