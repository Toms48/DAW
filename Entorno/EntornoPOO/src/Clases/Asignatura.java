package Clases;

/*	Nombre: Asignatura
 *
 * 	Básicas:
 * 		- nombre => String => Consultable y Modificable
 * 		- curso  => String => Consultable y Modificable
 * 	    - nota   => int    => Consultable y Modificable
 *
 * 	Derivadas:
 * 		No hay
 *
 * 	Compartidas:
 * 		No hay
 *
 * 	Restricciones:
 * 		No tiene
 *
 * 	Métodos añadidos:
 * 		- notaMedia
 */

public class Asignatura {

    //Atributos
    private String nombre = new String();
    private String curso = new String();

    private int nota;

    //Constructor por defecto
    public Asignatura(){
        nombre = "NombreAsignatura";
        curso = "CursoAsignatura";

        nota = 0;
    }

    //Constructor con prámetros
    public Asignatura(String nombre, String curso, int nota){
        this.nombre = nombre;
        this.curso = curso;

        this.nota = nota;
    }

    //Constructor sin notas de evaluaciones
    public Asignatura(String nombre, String curso){
        this.nombre = nombre;
        this.curso = curso;

        nota = 0;
    }

    //Gets
    public String getNombre(){
        return nombre;
    }

    public String getCurso(){
        return curso;
    }

    public int getNota(){
        return nota;
    }


    //Sets
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setNota(int nota){
        this.nota = nota;
    }

    //Métodos sobrescritos
    @Override
    public String toString(){
        String s = "Nombre: " +getNombre() +"\n"
                  +"Curso: " +getCurso() +"\n"
                  +"Nota: " +getNota();

        return s;
    }

}
