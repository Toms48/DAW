package Clases;

/*	Nombre: Alumno
 *
 * 	Básicas:
 * 		- nombre    => String => Consultable y Modificable
 * 		- apellidos => String => Consultable y Modificable
 * 	    - direccion => String => Consultable y Modificable
 * 	    - curso     => String => Consultable y Modificable
 * 	    - telefono  => String => Consultable y Modificable
 *
 * 	    - asignatura1 => Asignatura => Consultable y Modificable
 * 	    - asignatura2 => Asignatura => Consultable y Modificable
 * 	    - asignatura3 => Asignatura => Consultable y Modificable
 * 	    - asignatura4 => Asignatura => Consultable y Modificable
 * 	    - asignatura5 => Asignatura => Consultable y Modificable
 *
 * 	Derivadas:
 * 		- notaMedia
 *
 * 	Compartidas:
 * 		No hay
 *
 * 	Restricciones:
 * 		No tiene
 *
 * 	Métodos añadidos:
 * 		No tiene
 */

public class Alumno {

    //Atributos
    private String nombre = new String();
    private String apellidos = new String();
    private String direccion = new String();
    private String curso = new String();
    private String telefono = new String();

    private Asignatura asignatura1 = new Asignatura("Programacion","1 DAW");
    private Asignatura asignatura2 = new Asignatura("Entorno","1 DAW");
    private Asignatura asignatura3 = new Asignatura("Base de datos","1 DAW");
    private Asignatura asignatura4 = new Asignatura("Sistemas","1 DAW");
    private Asignatura asignatura5 = new Asignatura("Lenguaje de marcas", "1 DAW");

    private double notaMedia;
    
    //Constructor por defecto
    public Alumno(){
        nombre = "AlumnoPorDefecto";
        apellidos = "Apellidos PorDefecto";
        direccion = "Calle PorDefecto 00";
        curso = "0 CursoPorDefecto";
        telefono = "000000000";
    }

    //Constructor con parámetros
    public Alumno(String nombre, String apellidos, String direccion, String curso, String telefono, int notaAs1, int notaAs2, int notaAs3, int notaAs4, int notaAs5){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.curso = curso;
        this.telefono = telefono;

        this.asignatura1.setNota(notaAs1);
        this.asignatura2.setNota(notaAs2);
        this.asignatura3.setNota(notaAs3);
        this.asignatura4.setNota(notaAs4);
        this.asignatura5.setNota(notaAs5);
    }

    //Constructor con parámetros (sin las notas)
    public Alumno(String nombre, String apellidos, String direccion, String curso, String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.curso = curso;
        this.telefono = telefono;
    }

    //Gets
    public String getNombre(){
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public String getDireccion(){
        return direccion;
    }

    public String getCurso(){
        return curso;
    }

    public String getTelefono(){
        return telefono;
    }

    public int getNotaAs1(){
        return asignatura1.getNota();
    }

    public int getNotaAs2(){
        return asignatura2.getNota();
    }

    public int getNotaAs3(){
        return asignatura3.getNota();
    }

    public int getNotaAs4(){
        return asignatura4.getNota();
    }

    public int getNotaAs5(){
        return asignatura5.getNota();
    }

    //Sets
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setNotaAs1(int notaAs1){
        asignatura1.setNota(notaAs1);
    }

    public void setNotaAs2(int notaAs2){
        asignatura2.setNota(notaAs2);
    }

    public void setNotaAs3(int notaAs3){
        asignatura3.setNota(notaAs3);
    }

    public void setNotaAs4(int notaAs4){
        asignatura4.setNota(notaAs4);
    }

    public void setNotaAs5(int notaAs5){
        asignatura5.setNota(notaAs5);
    }

    //Métodos sobrescritos
    @Override
    public String toString(){
        String s = "Nombre y apellidos: " +getNombre() +" " +getApellidos() +"\n"
                  +"Direccion: " +getDireccion() +"\n"
                  +"Curso: " +getCurso() +"\n"
                  +"Telefono: " +getTelefono() +"\n"
                  +"Nota de " +asignatura1.getNombre() +": " +asignatura1.getNota() +"\n"
                  +"Nota de " +asignatura2.getNombre() +": " +asignatura2.getNota() +"\n"
                  +"Nota de " +asignatura3.getNombre() +": " +asignatura3.getNota() +"\n"
                  +"Nota de " +asignatura4.getNombre() +": " +asignatura4.getNota() +"\n"
                  +"Nota de " +asignatura5.getNombre() +": " +asignatura5.getNota() +"\n";
        return s;
    }
    
    //Métodos añadidos
    public double getNotaMedia(){
        notaMedia = (asignatura1.getNota()+asignatura2.getNota()+asignatura3.getNota()+asignatura4.getNota()+asignatura5.getNota())/5;
        
        return notaMedia;
    }

}
