package BoletinClases.Clases;

import BoletinClases.Interfaces.MetodosDePilotoFormula1;

public class Piloto implements MetodosDePilotoFormula1 {

    //Atributos
    String escuderia = new String();
    String nombre = new String();
    String apellido = new String();
    String nacionalidad = new String();
    int trofeosGanados;
    int numeroEnParrilla;
    int edad;
    int tiempoEnF1;
    int tiempoEscuderia;

    //Constructor
    public Piloto(String escuderia, String nombre, String apellido, String nacionalidad, int trofeosGanados, int numeroEnParrilla, int edad, int tiempoEnF1, int tiempoEscuderia){
        this.escuderia = escuderia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.trofeosGanados = trofeosGanados;
        this.numeroEnParrilla = numeroEnParrilla;
        this.edad = edad;
        this.tiempoEnF1 = tiempoEnF1;
        this.tiempoEscuderia = tiempoEscuderia;
    }

    //Gets
    public String getEscuderia() {
        return escuderia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getTrofeosGanados() {
        return trofeosGanados;
    }

    public int getNumeroEnParrilla() {
        return numeroEnParrilla;
    }

    public int getEdad() {
        return edad;
    }

    public int getTiempoEnF1() {
        return tiempoEnF1;
    }

    public int getTiempoEnEscuderia() {
        return tiempoEscuderia;
    }

    //Sets
    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setTrofeosGanados(int trofeosGanados) {
        this.trofeosGanados += trofeosGanados;
    }
    
    public void setNumeroEnParrilla(int numeroEnParrilla) {
        this.numeroEnParrilla = numeroEnParrilla;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setTiempoEnF1(int tiempoEnF1) {
        this.tiempoEnF1 = tiempoEnF1;
    }
    
    public void setTiempoEnEscuderia(int tiempoEscuderia) {
        this.tiempoEscuderia = tiempoEscuderia;
    }

    //Métodos añadidos
    public static void circuito(String nombCircuito) {
        System.out.println("Bienvenidos al circuito de " +nombCircuito +"... y comienza la carrera.");
    }

    public void celebracionTriunfo(){
        System.out.println("Ahora unas palabras del piloto " +getNacionalidad() +". Muchas gracias al equipo " +getEscuderia() +" por este triunfo.");
    }

    public void adelanta(String piloto){
        System.out.println(this.getNombre() +" adelanta a " +piloto +" y se pone primero");
    }
	
	
    public void gana(){
        System.out.println("¡¡¡" +getApellido() +" cruza la línea de parrilla y gana!!!!");
    }
	
	
    public void averia(){
        System.out.println("Atención: " +getApellido() +" lleva el coche a boxes por un pinchazo.");
    }
	
	
    public int nuevoTrofeo(){
        setTrofeosGanados(1);
        return 1;
    }
	
	
    public void nuevaEscuderia(String nuevaEscuderia){
        System.out.println(getApellido() +" ha cambiado a la escudería " +nuevaEscuderia);
        setEscuderia(nuevaEscuderia);
    }

}
