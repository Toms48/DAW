/* Nombre: NombreClase
 *
 * Básicas:
 * 		- diasACaducar => int => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinExtra.Ej1.Clases;

public class Perecedero extends Producto{

    //Atributos
    private int diasACaducar;

    //Constructor por defecto
    public Perecedero(){
        super();
        diasACaducar = 0;
    }

    //Constructor con parámetros
    public Perecedero(String nombre, double precio, int diasACaducar){
        super(nombre, precio);
        this.diasACaducar = diasACaducar;
    }

    //Gets
    public int getDiasACaducar() {
        return diasACaducar;
    }

    //Sets
    public void setDiasACaducar(int diasACaducar) {
        this.diasACaducar = diasACaducar;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = super.toString() +"\n" +
                   "Dias a caducar: " +getDiasACaducar();

        return s;
    }

    //Métos añadidos
    @Override
    public double calcular(int cantidadProductos){

        double resultado = (super.getPrecio() * cantidadProductos);

        if(diasACaducar <= 3){
            switch(diasACaducar){
                case 1:
                    resultado = resultado/4;
                    break;
                case 2:
                    resultado = resultado/3;
                    break;
                case 3:
                    resultado = resultado/2;
                    break;
            }
        }

        return resultado;
    }

}
