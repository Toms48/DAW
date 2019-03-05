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
		
		if(this.denominador == fraccion2.denominador){
			numerador3 = this.numerador + fraccion2.numerador;
			denominador3 = this.denominador;
		}
		else{
		
		}

		numerador3 = this.numerador*fraccion2.denominador+fraccion2.numerador*this.denominador;
		denominador3 = this.denominador*fraccion2.denominador;

		Fraccion fraccion3 = new Fraccion(numerador3,denominador3);

		System.out.println(fraccion3.toString());
	}
	
	public void restar(Fraccion fraccion2){
		int numerador3 = 0;
		int denominador3 = 0;

		numerador3 = this.numerador*fraccion2.denominador-fraccion2.numerador*this.denominador;
		denominador3 = this.denominador*fraccion2.denominador;

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
	
	public void divir(Fraccion fraccion2){
		int numerador3 = 0;
		int denominador3 = 0;

		numerador3 = this.numerador*fraccion2.denominador;
		denominador3 = this.denominador*fraccion2.numerador;

		Fraccion fraccion3 = new Fraccion(numerador3,denominador3);
		
		System.out.println(fraccion3.toString());
	}
	
	public Fraccion simplificar(){
		
		int dividir = mcd();

		this.numerador/=dividir;
		this.denominador/=dividir;

		return this;
	}
	
	public Fraccion invertir(){

		Fraccion fraccionInv = new Fraccion(this.denominador, this.numerador);

		return fraccionInv;
	}

	/*private int mcd(){	//#EsteCodigoEsHorribleDeFeo #YaLoHaréYoPorQueMeDanPunzadasEnLosOjos

		int u=Math.abs(this.numerador);
		int v=Math.abs(this.denominador);

		if(v==0){
			return u;
		}

		int r;

		while(v!=0){
			r=u%v;
			u=v;
			v=r;
		}
		return u;
	}*/
	
	private int mcd(){	//#EsteCodigoEsHorribleDeFeo #YaLoHaréYoPorQueMeDanPunzadasEnLosOjos
		
		int u = 0;
		int v = 0;
		int r = 0;
		
		v = Math.abs(this.denominador);
		
		if(v==0){
			u = Math.abs(this.numerador);
		}
		else{
			
			u = Math.abs(this.numerador);
			
			while(v!=0){
				r = u%v;
				u = v;
				v = r;
			}
		}
		
		return u;
	}
	
	public static int mcd(int num1, int num2) {
		int mcd = 0;
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		do {
			mcd = b;
			b = a%b;
			a = mcd;
		} while(b!=0);
		return mcd;
	}
	
	public static int mcm(int num1, int num2) {
		int mcm = 0;
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		mcm = (a/mcd(a, b))*b;
		return mcm;
	}

}
