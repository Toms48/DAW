/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

/**
 *
 * @author t-m-1
 */
public class Geometria {
/**
* Calcula el volumen de un cilindro.
* Tanto el radio como la altura se deben proporcionar en las
* mismas unidades para que el resultado sea congruente.
*
* @param r radio del cilindro
* @param h altura del cilindro
* @return volumen del cilindro
*/
public static double volumenCilindro(double r, double h) {
return Math.PI * r * r * h;
}
/**
* Calcula la longitud de una circunferencia a partir del radio.
*
* @param r radio de la circunferencia
* @return longitud de la circunferencia
*/
public static double longitudCircunferencia(double r) {
return 2 * Math.PI * r;
}
}