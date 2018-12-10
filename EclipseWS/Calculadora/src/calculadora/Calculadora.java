package calculadora;

public class Calculadora {

	//Atributos
	private double numero1;
	private double numero2;
	
	//Constructor por defecto
	public Calculadora() {
		this.numero1 = 0.0;
		this.numero2 = 0.0;
	}
	
	//Constructor con parámetros
	public Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	//GETS
	public double getNumero1() {
		return numero1;
	}
	
	public double getNumero2() {
		return numero2;
	}
	
	//SETS
	public void setNumero1 (double numero1) {
		this.numero1 = numero1;
	}
	
	public void setNumero2 (double numero2) {
		this.numero2 = numero2;
	}
	
	//Métodos sobrescritos
	
	//Métodos añadidos
	public double suma() {
		return (getNumero1()+getNumero2());
	}
	
}
