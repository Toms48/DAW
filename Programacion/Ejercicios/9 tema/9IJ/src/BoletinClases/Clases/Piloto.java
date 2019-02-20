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

	@Override
    public String getNombre() {
        return nombre;
    }
	
	@Override
    public String getApellido() {
        return apellido;
    }
	
	@Override
    public String getNacionalidad() {
        return nacionalidad;
    }
	
	@Override
    public int getTrofeosGanados() {
        return trofeosGanados;
    }
	
	@Override
    public int getNumeroEnParrilla() {
        return numeroEnParrilla;
    }
	
	@Override
    public int getEdad() {
        return edad;
    }
	
	@Override
    public int getTiempoEnF1() {
        return tiempoEnF1;
    }
	
	@Override
    public int getTiempoEnEscuderia() {
        return tiempoEscuderia;
    }

    //Sets
	@Override
    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }
	
	@Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
	
	@Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
	
	@Override
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
	
	@Override
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
