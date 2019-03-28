/* Nombre: Lavadora
 *
 * Básicas:
 * 		- resolucion        => int      => Consultable
 * 		- sintonizadorTDT   => boolean  => Consultable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinExtra.Ej4.Clases;

public class Television extends Electrodomestico {

    //Atributos
    private int resolucion;
    private boolean sintonizadorTDT;

    //Constructor por defecto
    public Television(){
        resolucion = 20;
        sintonizadorTDT = false;
    }

    //Constructor con parámetros (solo precio y peso)
    public Television(double precioBase, int peso){
        super(precioBase, peso);
        resolucion = 20;
        sintonizadorTDT = false;
    }

    //Constructor con parámetros
    public Television(double precioBase, String color, char consumoElectrico, int peso, int resolucion, boolean sintonizadorTDT){
        super(precioBase, color, consumoElectrico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //Gets
    public int getResolucion() {
        return resolucion;
    }

    public boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //Sets

    //Métodos sobrescritos

    //Métos añadidos
    @Override
    public double precioFinal(){

        double precioF = super.precioFinal();

        if(this.getResolucion() > 40){
            precioF += precioF*0.3;
        }

        if(this.getSintonizadorTDT()){
            precioF += 50;
        }

        return precioF;
    }

}
