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
	private int numerador;
	private int denominador;
	
	//Constructor con parámetros
	public Fraccion(int numerador, int denominador){
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	//Gets
	public int getNumerador() {
		return numerador;
	}
	
	public int getDenominador() {
		return denominador;
	}
	
	//Sets
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString(){
		
		String s = "Numerador:    " +getNumerador() +
				 "\nDenominador:  " +getDenominador();
		
		return s;
	}
	
	//Métodos añadidos
	public void sumar(Fraccion fraccion2){
		
		int numerador3 = 0;
		int denominador3 = 0;
		int mcm = 0;
		
		if(this.denominador == fraccion2.denominador){
			numerador3 = this.numerador + fraccion2.numerador;
			denominador3 = this.denominador;
		}
		else{

			mcm = mcm(this.denominador, fraccion2.denominador);

			numerador3 = ((mcm/this.denominador) * this.numerador) + ((mcm/fraccion2.denominador) * fraccion2.numerador);
			denominador3 = mcm;
		}

		Fraccion fraccion3 = new Fraccion(numerador3,denominador3);

		System.out.println(fraccion3.toString());
	}
	
	public void restar(Fraccion fraccion2){
		int numerador3 = 0;
		int denominador3 = 0;
		int mcm = 0;

		if(this.denominador == fraccion2.denominador){
			numerador3 = this.numerador + fraccion2.numerador;
			denominador3 = this.denominador;
		}
		else{

			mcm = mcm(this.denominador, fraccion2.denominador);

			numerador3 = ((mcm/this.denominador) * this.numerador) - ((mcm/fraccion2.denominador) * fraccion2.numerador);
			denominador3 = mcm;
		}

		Fraccion fraccion3 = new Fraccion(numerador3,denominador3);

		System.out.println(fraccion3.toString());
	}
	
	public void multiplicar(Fraccion fraccion2){
		int numerador3 = 0;
		int denominador3 = 0;

		numerador3 = this.numerador*fraccion2.numerador;
		denominador3 = this.denominador*fraccion2.denominador;

		Fraccion fraccion3 = new Fraccion(numerador3,denominador3);
		
		System.out.println(fraccion3.toString());
	}
	
	public void dividir(Fraccion fraccion2){
		int numerador3 = 0;
		int denominador3 = 0;

		numerador3 = this.numerador*fraccion2.denominador;
		denominador3 = this.denominador*fraccion2.numerador;

		Fraccion fraccion3 = new Fraccion(numerador3,denominador3);
		
		System.out.println(fraccion3.toString());
	}
	
	public Fraccion simplificar(){
		
		int dividir = mcd(this.numerador,this.denominador);

		this.numerador = this.numerador / dividir;
		this.denominador /= dividir;

		return this;
	}
	
	public Fraccion invertir(){

		Fraccion fraccionInv = new Fraccion(this.denominador, this.numerador);

		return fraccionInv;
	}
	
	private int mcd(int denominador1, int denominador2) {
		int mcd = 0;
		int a = Math.max(denominador1, denominador2);
		int b = Math.min(denominador1, denominador2);
		do {
			mcd = b;
			b = a%b;
			a = mcd;
		} while(b!=0);
		return mcd;
	}

	private int mcm(int denominador1, int denominador2) {
		int mcm = 0;
		int a = Math.max(denominador1, denominador2);
		int b = Math.min(denominador1, denominador2);
		mcm = (a/mcd(a, b))*b;
		return mcm;
	}

}
