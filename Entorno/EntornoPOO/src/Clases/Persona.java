/*	Nombre: Persona
 *
 * 	Básicas:
 * 		- nombre    => String => Consultable y Modificable
 * 		- apellidos => String => Consultable y Modificable
 * 	    - edad      => int    => Consultable y Modificable
 * 	    - sexo      => char   => Consultable y Modificable
 * 	    - peso      => double => Consultable y Modificable
 * 	    - altura    => double => Consultable y Modificable
 *
 * 	Derivadas:
 * 		No tiene
 *
 * 	Compartidas:
 * 		No hay
 *
 * 	Restricciones:
 * 		No tiene
 *
 * 	Métodos añadidos:
 * 		- calcularIMC
 * 		- esMayorDeEdad
 * 		- comprobarSexo
 */

package Clases;

public class Persona {
	
	//Atributos
	private String nombre = new String();
	private String apellidos = new String();
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	
	//Constructor por defecto
	public Persona(){
		nombre = "NombrePorDefecto";
		apellidos = "ApellidosPorDefecto";
		edad = 0;
		sexo = 'H';
		peso = 0;
		altura = 0;
	}
	
	//Constructor con parámetros (solo nombre y apellidos)
	public Persona(String nombre, String apellidos){
		this.nombre = nombre;
		this.apellidos = apellidos;
		edad = 0;
		sexo = 'H';
		peso = 0;
		altura = 0;
	}
	
	//Gets
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	//Sets
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Métodos sobrecargados
	public
	
}
