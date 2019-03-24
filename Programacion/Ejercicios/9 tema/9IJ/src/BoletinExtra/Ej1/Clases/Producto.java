/* Nombre: NombreClase
 *
 * Básicas:
 * 		- nombre => String => Consultable y Modificable
 *		- precio => double => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinExtra.Ej1.Clases;

public abstract class Producto {

    //Atributos
    private String nombre = new String();
    private double precio;

    //Constructor por defecto
    public Producto(){
        nombre = "Nombre Por Defecto";
        precio = 0.0;
    }

    //Constructor con parámetros
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Gets
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //Sets
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = "Nombre: " +getNombre() +"\n" +
                   "Precio: " +getPrecio();

        return s;
    }

    //Métos añadidos
    public double calcular(int cantidadProductos){

        double resultado = (precio*cantidadProductos);

        return resultado;
    }

}
