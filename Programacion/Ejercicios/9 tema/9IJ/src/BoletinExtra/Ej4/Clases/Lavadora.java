/* Nombre: Lavadora
 *
 * Básicas:
 * 		- carga => int => Consultable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinExtra.Ej4.Clases;

public class Lavadora extends Electrodomestico {

    //Atributos
    private int carga;

    //Constructor por defecto
    public Lavadora(){
        super();
        carga = 5;
    }

    //Constructor con parámetros (solo precio y peso)
    public Lavadora(double precioBase, int peso){
        super(precioBase, peso);
        carga = 5;
    }

    //Constructor con parámetros
    public Lavadora(double precioBase, String color, char consumoElectrico, int peso, int carga){
        super(precioBase, color, consumoElectrico, peso);
        this.carga = carga;
    }

    //Gets
    public int getCarga() {
        return carga;
    }

    //Sets

    //Métodos sobrescritos

    //Métos añadidos
    @Override
    public double precioFinal(){

        double precioF = super.precioFinal();

        if(this.getCarga() > 30){
            precioF += 50;
        }

        return precioF;
    }

}
