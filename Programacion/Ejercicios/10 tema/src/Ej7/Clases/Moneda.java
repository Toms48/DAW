/* Nombre: Moneda
 *
 * Básicas:
 * 		- valor => String => Consultable
 *		- lado  => String => Consultable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package Ej7.Clases;

public class Moneda {

    //Atributos
    private String valor = new String();
    private String lado = new String();

    //Constructor por defecto
    public Moneda(){
        valor = "";
        lado = "";
    }

    //Constructor con parámetros
    public Moneda(String valor, String lado){
        this.valor = valor;
        this.lado = lado;
    }

    //Gets
    public String getValor() {
        return valor;
    }

    public String getLado() {
        return lado;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = getValor() +" - " +getLado();

        return s;
    }

}
