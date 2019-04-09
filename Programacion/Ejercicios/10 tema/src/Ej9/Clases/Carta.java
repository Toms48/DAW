/* Nombre: Carta
 *
 * Básicas:
 * 		- valor => String => Consultable
 *		- palo  => String => Consultable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package Ej9.Clases;

import java.util.Objects;

public class Carta /*implements Comparable<Carta>*/ {

    //Atributos
    private String valor = new String();
    private String palo = new String();

    //Constructor por defecto
    public Carta(){
        valor = "";
        palo = "";
    }

    //Constructor con parámetros
    public Carta(String valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    //Gets
    public String getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = getValor() +" de " +getPalo();

        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(valor, carta.valor) &&
                Objects.equals(palo, carta.palo);
    }

    /*public int compareTo(Carta carta){

        int ret = 0;

        if(this != carta && this.getValor() > carta.getValor()){
            ret = 1;
        }
        else{
            if(this.getValor() < carta.getValor()){
                ret = -1;
            }
        }

        return ret;
    }*/

}
