/* Gato.java (proyecto GatosConClase) */
package daw1;

public class Gato {

    private String nombre;
    private String imagen;

    public Gato(String nombre, String imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "<img id=\"imagen\" src='" + imagen + "' width='180'>"
                + "<div align=\"right\" id=\"bocadillo\">"
                    + "Hola, soy " + nombre 
                +"</div>"
             + "<br>";
    }

    public String maulla() {
        return "<img id=\"imagen\" src='" + imagen + "' width='180'><div align=\"right\" id=\"bocadillo\">Miauuuuuuuu</div><br>";
    }

    public String come(String comida) {
        return "<img id=\"imagen\" src='" + imagen + "' width='180'><div align=\"right\" id=\"bocadillo\">Estoy comiendo " + comida + "</div><br>";
    }
}
