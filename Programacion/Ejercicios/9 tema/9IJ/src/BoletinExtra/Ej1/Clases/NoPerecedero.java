/* Nombre: NombreClase
 *
 * Básicas:
 * 		- tipo => String => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinExtra.Ej1.Clases;

public class NoPerecedero extends Producto{

    //Atributos
    private String tipo = new String();

    //Constructor por defecto
    public NoPerecedero(){
        super();
        tipo = "Tipo Por Defecto";
    }

    //Constructor con parámetros
    public NoPerecedero(String nombre, double precio, String tipo){
        super(nombre, precio);
        this.tipo = tipo;
    }

    //Gets
    public String getTipo() {
        return tipo;
    }

    //Sets
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = super.toString() +"\n" +
                   "Tipo: " +getTipo();

        return s;
    }

    //Métos añadidos

}
