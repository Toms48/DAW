package Clases;

public class Coche {
	
	//Atributos
	private static int ruedas = 4;	//Este atributo es static porque es común de la clase, todos los objetos de la clase coches tendrán 4 ruedas
	
	private String matricula = new String();
	private String marca = new String();
	private String modelo = new String();
	private char combustible;
	private int cilindrada;
	private String color = new String();
	
	//Constructor 1
	public Coche(String matricula, String marca, String modelo, char combustible, int cilindrada, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.combustible = combustible;
		this.cilindrada = cilindrada;
		this.color = color;
	}
	
	//Constructor 2
	public Coche(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		combustible = 'D';
		cilindrada = 1600;
		color = "blanco";
	}
	
	//Métodos Gets
	public static int getRuedas() {
		return ruedas;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public char getCombustible() {
		return combustible;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public String getColor() {
		return color;
	}
	
	//Métodos Sets
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
}
