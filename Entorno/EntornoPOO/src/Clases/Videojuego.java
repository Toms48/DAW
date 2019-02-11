package Clases;

public class Videojuego {

    //Atributos
    String titulo = new String();
    int horasEstimadas;
    boolean prestado;
    String genero = new String();
    String compania = new String();

    //Constructor
    public Videojuego(String titulo, String genero, String compania){
        this.titulo = titulo;
        horasEstimadas = 10;
        prestado = false;
        this.genero = genero;
        this.compania = compania;
    }

    //Gets
    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    //Sets
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    //Métodos añadidos
    public void alquilar(){
        prestado = true;
    }

    public void devolver(){
        prestado = false;
    }

    public boolean isPrestado(){
        return prestado;
    }

}