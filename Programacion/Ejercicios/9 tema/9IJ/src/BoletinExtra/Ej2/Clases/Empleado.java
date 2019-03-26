/* Nombre: Empleado
 *
 * Básicas:
 * 		- nombre 	=> String 	=> Consultable y Modificable
 *		- edad 		=> int 		=> Consultable y Modificable
 *		- salario 	=> double 	=> Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinExtra.Ej2.Clases;

public abstract class Empleado {
	
	//Atributos
	private String nombre = new String();
	private int edad;
	private double salario;
	
	private static final double PLUS = 300;
	
	//Constructor por defecto
	public Empleado(){
		nombre = "Nombre PorDefecto";
		edad = 0;
		salario = 0;
	}
	
	//Constructor con parámetros
	public Empleado(String nombre, int edad, double salario){
		nombre = "Nombre PorDefecto";
		edad = 0;
		salario = 0;
	}
	
	//Gets
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double getPLUS() {
		return PLUS;
	}
	
	//Sets
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "Nombre: " +getNombre() +"\n" +
				   "Edad: " +getEdad() +"\n" +
				   "Salario: " +getSalario();
		
		return s;
	}
	
	//Métos añadidos
	public void plus(){
		setSalario(getSalario() + PLUS);
	}
	
}
