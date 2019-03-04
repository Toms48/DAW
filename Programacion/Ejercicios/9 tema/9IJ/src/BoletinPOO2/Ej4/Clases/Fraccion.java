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
	public void sumar(Fraccion fraccion2){

		double numerador3 = 0;
		double denominador3 = 0;

		numerador3 = this.numerador*fraccion2.denominador+fraccion2.numerador*this.denominador;
		denominador3 = this.denominador*fraccion2.denominador;

		Fraccion fraccion3 = new Fraccion(numerador3,denominador3);

		fraccion3.toString();
	}
	
	public void restar(Fraccion fraccion2){
		double numerador3 = 0;
		double denominador3 = 0;

		numerador3 = this.numerador*fraccion2.denominador-fraccion2.numerador*this.denominador;
		denominador3 = this.denominador*fraccion2.denominador;

		Fraccion fraccion3 = new Fraccion(numerador3,denominador3);

		fraccion3.toString();
	}
	
	public void multiplicar(Fraccion fraccion2){
		double numerador3 = 0;
		double denominador3 = 0;

		numerador3 = this.numerador*fraccion2.numerador;
		denominador3 = this.denominador*fraccion2.denominador;

		Fraccion fraccion3 = new Fraccion(numerador3,denominador3);

		fraccion3.toString();
	}
	
	public void divir(Fraccion fraccion2){
		double numerador3 = 0;
		double denominador3 = 0;

		numerador3 = this.numerador*fraccion2.denominador;
		denominador3 = this.denominador*fraccion2.numerador;

		Fraccion fraccion3 = new Fraccion(numerador3,denominador3);

		fraccion3.toString();
	}
	
	public Fraccion simplificar(){

		double dividir=mcd();

		this.numerador/=dividir;
		this.denominador/=dividir;

		return this;
	}
	
	public Fraccion invertir(){

		Fraccion fraccionInv = new Fraccion(this.denominador, this.numerador);

		return fraccionInv;
	}

	private double mcd(){	//#EsteCodigoEsHorribleDeFeo #YaLoHaréYoPorQueMeDanPunzadasEnLosOjos

		double u=Math.abs(this.numerador);
		double v=Math.abs(this.denominador);

		if(v==0){
			return u;
		}

		double r;

		while(v!=0){
			r=u%v;
			u=v;
			v=r;
		}
		return u;
	}

}
