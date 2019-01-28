package Clases;

/*	Nombre: Asignatura
 *
 * 	Básicas:
 * 		- nombre   => String => Consultable y Modificable
 * 		- curso    => String => Consultable y Modificable
 * 	    - nota1Eva => int    => Consultable y Modificable
 * 	    - nota2Eva => int    => Consultable y Modificable
 * 	    - nota3Eva => int    => Consultable y Modificable
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

    private int nota1Eva;
    private int nota2Eva;
    private int nota3Eva;

    //Constructor por defecto
    public Asignatura(){
        nombre = "NombreAsignatura";
        curso = "CursoAsignatura";

        nota1Eva = 0;
        nota2Eva = 0;
        nota3Eva = 0;
    }

    //Constructor con prámetros
    public Asignatura(String nombre, String curso, int nota1Eva, int nota2Eva, int nota3Eva){
        this.nombre = nombre;
        this.curso = curso;

        this.nota1Eva = nota1Eva;
        this.nota2Eva = nota2Eva;
        this.nota3Eva = nota3Eva;
    }

    //Constructor sin notas de evaluaciones
    public Asignatura(String nombre, String curso){
        this.nombre = nombre;
        this.curso = curso;

        nota1Eva = 0;
        nota2Eva = 0;
        nota3Eva = 0;
    }

    //Gets
    public String getNombre(){
        return nombre;
    }

    public String getCurso(){
        return curso;
    }

    public int getNota1Eva(){
        return nota1Eva;
    }

    public int getNota2Eva(){
        return nota2Eva;
    }

    public int getNota3Eva(){
        return nota3Eva;
    }


    //Sets
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setNota1Eva(int nota1Eva){
        this.nota1Eva = nota1Eva;
    }

    public void setNota2Eva(int nota2Eva){
        this.nota2Eva = nota2Eva;
    }

    public void setNota3Eva(int nota3Eva){
        this.nota3Eva = nota3Eva;
    }

    //Métodos sobrescritos
    @Override
    public String toString(){
        String s = "Nombre: " +getNombre() +"\n"
                  +"Curso: " +getCurso() +"\n"
                  +"Nota evaluacion 1: " +getNota1Eva() +"\n"
                  +"Nota evaluacion 2: " +getNota2Eva() +"\n"
                  +"Nota evaluacion 3: " +getNota3Eva();

        return s;
    }

    //Métodos añadidos
    public double notaMedia(){
        double media = (getNota1Eva()+getNota2Eva()+getNota3Eva())/3;

        return media;
    }

}
