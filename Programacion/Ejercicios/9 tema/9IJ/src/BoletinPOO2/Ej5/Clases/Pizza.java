/* Nombre: Pizza
 *
 * Básicas:
 * 		- tamanio   => String => Consultable
 * 		- tipo      => String => Consultable
 * 		- estado    => String => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones:
 *      - El tamanio solo puede ser: mediana o familiar
 *      - El tipo solo puede ser: margarita, cuatro quesos o funghi
 *      - El estado solo puede ser: pedida o servida
 */

package BoletinPOO2.Ej5.Clases;

import BoletinPOO2.Ej5.Enums.*;

public class Pizza {

    //Atributos
    private static int totalPedidas;
    private static int totalServidas;
    private tamanioPizza tamanio;
    private tipoPizza tipo;
    private estadoPizza estado;

    //Constructor con parámetros
    public Pizza(tipoPizza tipo, tamanioPizza tamanio){
        this.tamanio = tamanio;
        this.tipo = tipo;
        estado = estadoPizza.pedida;
        this.totalPedidas += 1;
    }

    //Gets
    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public tamanioPizza getTamanio() {
        return tamanio;
    }

    public String getTipo() {

        String devuelto = "";

        if(tipo == tipoPizza.cuatroQuesos){
            devuelto = "cuatro quesos";
        }
        else{
            devuelto = tipo.toString();
        }

        return devuelto;
    }

    public estadoPizza getEstado() {
        return estado;
    }

    //Sets
    /*public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas += totalPedidas;
    }*/

    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas = totalServidas;
    }

    public void setEstado(estadoPizza estado) {
        this.estado = estado;
    }

    //Métodos sobrescritos
    @Override
    public String toString(){

        String s = "Pizza " +getTipo() +" " +getTamanio() +", " +getEstado();

        return s;
    }

    //Métodos añadidos
    public void sirve(){
        if(getEstado() == estadoPizza.servida){
            System.out.println("Esa pizza ya se ha servido");
        }
        else{
            setEstado(estadoPizza.servida);
            setTotalServidas(1);
        }
    }

}
