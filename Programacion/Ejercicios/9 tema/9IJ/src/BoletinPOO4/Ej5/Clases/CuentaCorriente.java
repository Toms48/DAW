/* Nombre: CuentaCorriente
 *
 * Básicas:
 * 		- nombreVariable => tipoVariable => Consultable y Modificable
 *		- nombreVariable => tipoVariable => Consultable y Modificable
 *		- nombreVariable => tipoVariable => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO4.Ej5.Clases;

public class CuentaCorriente {

    //Atributos
    private double saldo;

    //Constructor por defecto
    public CuentaCorriente(){
        saldo = 0;
    }

    //Constructor con parámetros
    public CuentaCorriente(double saldo){
        this.saldo = saldo;
    }

    //Gets
    public double getSaldo() {
        return saldo;
    }

    //Sets
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = "Saldo: " +getSaldo();

        return s;
    }

    //Métos añadidos
    public void saldo(){
        System.out.println("Su saldo actual es de " +getSaldo() +"€");
    }

    public void imposicion(double cantidad){
        this.setSaldo(cantidad + this.getSaldo());

        System.out.println("Se ha ingresado una cantidad de " +cantidad +"€ en su cuenta corriente");

        System.out.println();

        System.out.println("Su saldo actual asciende a " +getSaldo() +"€");
    }

    public void reintegro(double cantidad){
        this.setSaldo(cantidad + this.getSaldo());

        System.out.println("Se ha ingresado una cantidad de " +cantidad +"€ en su cuenta corriente");

        System.out.println();

        System.out.println("Su saldo actual asciende a " +getSaldo() +"€");
    }

}
