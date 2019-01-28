package Tests;

import Clases.Asignatura;

public class TestAsignatura {
    public static void main(String[] args){

        Asignatura AsignaturaPorDefecto = new Asignatura();
        Asignatura As1 = new Asignatura("Programacion", "1 DAW", 10);
        Asignatura As2 = new Asignatura("Entorno","1 DAW");

        System.out.println("=-=-=-=-= Constructor por defecto =-=-=-=-=");
        System.out.println(AsignaturaPorDefecto.toString());

        System.out.println();

        System.out.println("=-=-=-=-= Constructor con parámetros =-=-=-=-=");
        System.out.println( As1.toString());

        System.out.println();

        System.out.println("=-=-=-=-= Constructor con parámetros (sin las notas) =-=-=-=-=");
        System.out.println( As2.toString());

        System.out.println();

        System.out.println("=-=-=-=-= Gets =-=-=-=-=");
        System.out.println(As1.getNombre());
        System.out.println(As1.getCurso());
        System.out.println(As1.getNota());
        System.out.println(As1.getNota());
        System.out.println(As1.getNota());

        System.out.println();

        System.out.println("=-=-=-=-= Sets =-=-=-=-=");
        System.out.println("Datos antes de los cambios con set");
        System.out.println(As2.toString());

        As2.setNombre("Base de datos");
        As2.setCurso("2 DAW");
        As2.setNota(5);
        As2.setNota(6);
        As2.setNota(7);

        System.out.println();

        System.out.println("Datos despues de los cambios con set");
        System.out.println(As2.toString());

    }
}
