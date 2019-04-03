/* Nombre: CajaCarton
 *
 * Básicas:
 *		- etiqueta  => int 	 => Consultable
 *
 * Derivadas:
 * 		- volumen => double => Consultable
 * 	    - area    => double => Consultable
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package Ejercicio2.Apartado2.Clases;

import Ejercicio2.Apartado2.Enums.Unidades;

public class CajaCarton extends Caja {

    //Atributos
    private static int etiqueta;
    private static double areaTotal;

    private double area;

    private double volumen;

    //Constructor con parámetros
    public CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, Unidades.cm);

        super.setEtiqueta(Integer.toString(++this.etiqueta));
    }

    //Gets
    public double getAreaTotal() {
        areaTotal += getArea();
        return areaTotal;
    }

    public double getArea() {
        area = 2*( (getAncho()*getAlto())+(getAncho()*getFondo())+(getAlto()*getFondo()) );

        return area;
    }

    @Override
    public double getVolumen() {
        volumen = getAlto()*getAncho()*getFondo();

        if(getU() == Unidades.cm){
            volumen = volumen/1000000;
        }

        return volumen*0.8;
    }

    //Sets

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = "Material total " +getAreaTotal() +" cm2" +
                   "\nÁrea: " +getArea() +" cm2\n" +
                   super.toString();

        return s;
    }

    //Métos añadidos

}
