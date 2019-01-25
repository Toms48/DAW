/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author t-m-1
 */
public class Alumno {
    
    //Atributos
    private String nombre;
    private String apellidos = new String();
    private String direccion = new String();
    private String curso = new String();
    private String telefono = new String();
    
    private Asignatura As1 = new Asignatura("Programacion", "1DAW");
    private Asignatura As2 = new Asignatura("Base de datos", "1DAW");
    private Asignatura As3 = new Asignatura("FOL", "1DAW");
    private Asignatura As4 = new Asignatura("Entorno de desarrollo", "1DAW");
    private Asignatura As5 = new Asignatura("Sistemas", "1DAW");
    
    //Constructor por defecto
    public Alumno(){
        nombre = "Nombre";
        apellidos = "Apellidos";
        direccion = "Calle NombreCalle";
        curso = "Curso";
        telefono = "000000000";
        
        As1 = new Asignatura();
        As2 = new Asignatura();
        As3 = new Asignatura();
        As4 = new Asignatura();
        As5 = new Asignatura();
    }
    
    //Constructor con todos los parámetros
    public Alumno(String nombre, String apellidos, String direccion, String curso, String telefono, Asignatura As1, Asignatura As2, Asignatura As3, Asignatura As4, Asignatura As5){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.curso = curso;
        this.telefono = telefono;
        this.As1 = As1;
        this.As2 = As2;
        this.As3 = As3;
        this.As4 = As4;
        this.As5 = As5;
    }
    
    //Constructor sin asignaturas
    public Alumno(String nombre, String apellidos, String direccion, String curso, String telefono){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.curso = curso;
        this.telefono = telefono;
        
        this.As1 = As1;
        this.As2 = As2;
        this.As3 = As3;
        this.As4 = As4;
        this.As5 = As5;
    }
    
    //GETS
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

    public Asignatura getAs1() {
        return As1;
    }

    public Asignatura getAs2() {
        return As2;
    }

    public Asignatura getAs3() {
        return As3;
    }

    public Asignatura getAs4() {
        return As4;
    }

    public Asignatura getAs5() {
        return As5;
    }
    
    /*public double getNota1eva(){
        return nota1eva;
    }
    
    public double getNota2eva(){
        return nota2eva;
    }
    
    public double getNota3eva(){
        return nota3eva;
    }*/
    
    //SETS
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
    
    public void setAs1(Asignatura As1) {
        this.As1 = As1;
    }

    public void setAs2(Asignatura As2) {
        this.As2 = As2;
    }

    public void setAs3(Asignatura As3) {
        this.As3 = As3;
    }

    public void setAs4(Asignatura As4) {
        this.As4 = As4;
    }

    public void setAs5(Asignatura As5) {
        this.As5 = As5;
    }
    
    /*public void setNota1eva(double nota1eva){
        this.nota1eva = nota1eva;
    }
    
    public void setNota2eva(double nota2eva){
        this.nota2eva = nota2eva;
    }
    
    public void setNota3eva(double nota3eva){
        this.nota3eva = nota3eva;
    }*/
    
    //Métodos añadidos
    /*public double notaMedia(){
        
        double notaMedia = (getNota1eva()+getNota2eva()+getNota3eva())/3;
        
        return notaMedia;
    }
    
    public void muestraNotaMedia(){
        double notaMedia = (getNota1eva()+getNota2eva()+getNota3eva())/3;
        
        System.out.println("La nota media es: " +notaMedia);
    }*/
    
}
