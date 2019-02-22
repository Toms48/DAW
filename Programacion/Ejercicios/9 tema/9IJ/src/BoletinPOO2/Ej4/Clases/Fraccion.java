/* Nombre: Fraccion
 *
 * Básicas:
 * 		- numerador		=> double => Consultable y Modificable
 * 		- denominador	=> double => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO2.Ej4.Clases;

public class Fraccion {

	//Atributos
	private double numerador;
	private double denominador;
	
	//Constructor con parámetros
	public Fraccion(double numerador, double denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	//Gets
	public double getNumerador() {
		return numerador;
	}
	
	public double getDenominador() {
		return denominador;
	}
	
	//Sets
	public void setNumerador(double numerador) {
		this.numerador = numerador;
	}
	
	public void setDenominador(double denominador) {
		this.denominador = denominador;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString(){
		
		String s = "Numerador: " +getNumerador() +
				 "\nDenominador: " +getDenominador();
		
		return s;
	}
	
	//Métodos añadidos
	public void sumar(Fraccion fraccion2){}
	
	public void restar(Fraccion fraccion2){}
	
	public void multiplicar(Fraccion fraccion2){}
	
	public void divir(Fraccion fraccion2){}
	
	public void simplificar(){}
	
	public void invertir(){}
	
}
