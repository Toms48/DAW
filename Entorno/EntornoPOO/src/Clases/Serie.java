package Clases;

public class Serie {

    //Atributos
    String titulo = new String();
    int temporadas;
    boolean prestado;
    String genero = new String();
    String creador = new String();

    //Constructor
    public Serie(String titulo, String genero, String creador){
        this.titulo = titulo;
        temporadas = 3;
        prestado = false;
        this.genero = genero;
        this.creador = creador;
    }

    //Gets
    public String getTitulo() {
        return titulo;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    //Sets
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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
