/* Nombre: Caja
 *
 * Básicas:
 * 		- ancho		=> double 		 => Consultable
 *		- alto 		=> double 		 => Consultable
 *		- fondo 	=> double  	 	 => Consultable
 *		- u 		=> Unidades 	 => Consultable
 *		- etiqueta  => String	 	 => Consultable y Modificable
 *
 * Derivadas:
 * 		- volumen => double => Consultable
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package Ejercicio2.Apartado2.Clases;

import Ejercicio2.Apartado2.Enums.Unidades;

public class Caja {
	
	//Atributos
	private double ancho;
	private double alto;
	private double fondo;
	private Unidades u;
	private String etiqueta = new String();
	
	private double volumen;
	
	//Constructor con parámetros
	public Caja(double ancho, double alto, double fondo, Unidades u) {
		this.ancho = ancho;
		this.alto = alto;
		this.fondo = fondo;
		this.u = u;
	}
	
	//Gets
	public double getAncho() {
		return ancho;
	}
	
	public double getAlto() {
		return alto;
	}
	
	public double getFondo() {
		return fondo;
	}
	
	public Unidades getU() {
		return u;
	}
	
	public String getEtiqueta() {
		return etiqueta;
	}
	
	public double getVolumen() {
		volumen = getAlto()*getAncho()*getFondo();
		
		if(getU() == Unidades.cm){
			volumen = volumen/1000000;
		}
		
		return volumen;
	}
	
	//Sets
	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "ancho=" +getAncho() +getU() +", alto=" +getAlto() +getU() +", fondo=" +getFondo() +getU() +", etiqueta=" +getEtiqueta() +
				   "\nVolumen: " +getVolumen();
		
		return s;
	}
	
	//Métos añadidos
	
}
