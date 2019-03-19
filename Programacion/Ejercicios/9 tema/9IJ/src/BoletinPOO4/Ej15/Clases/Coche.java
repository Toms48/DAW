/* Nombre: Coche
 *
 * Básicas:
 * 		- matricula => String => Consultable y Modificable
 *		- modelo 	=> String => Consultable
 *		- motor 	=> Srting => Consultable y Modificable
 *		- precio	=> double => Consultable y Modificable
 *		- color 	=> String => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO4.Ej15.Clases;

import java.util.Scanner;

public class Coche {
	
	//Atributos
	private String matricula = new String();
	private String modelo = new String();
	private String motor = new String();
	private double precio;
	private String color = new String();
	
	//Constructor por defecto
	public Coche(){
		matricula = "0000 AAA";
		modelo = "Modelo PorDefecto";
		motor = "Motor PorDefecto";
		precio = 0.0;
		color = "Color PorDefecto";
	}
	
	//Constructor con parámetros
	public Coche(String matricula, String modelo, String motor, double precio, String color){
		this.matricula = matricula;
		this.modelo = modelo;
		this.motor = motor;
		this.precio = precio;
		this.color = color;
	}
	
	//Gets
	public String getMatricula() {
		return matricula;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMotor() {
		return motor;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public String getColor() {
		return color;
	}
	
	//Sets
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "Matricula: " +getMatricula() +"\n" +
				   "Modelo: " +getModelo() +"\n" +
				   "Motor: " +getMotor() +"\n" +
				   "Precio: " +getPrecio() +"\n" +
				   "Color: " +getColor();
		
		return s;
	}
	
	//Métos añadidos
	public static Coche[] concesionario(Coche coche){

		Coche[] concesionario = new Coche[1];

		concesionario[0] = coche;

		return concesionario;
	}

	public static double dineroInvertido(Coche[] concesionario){

		double dineroTotal = 0;

		for(Coche coche : concesionario){
			dineroTotal += coche.getPrecio();
		}

		return dineroTotal;
	}
	
	public static Coche[] addCocheConcesionario(Coche[] concesionario){

		String matricula = new String();
		String modelo = new String();
		String motor = new String();
		double precio = 0;
		String color = new String();

		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);

		Coche[] concesionarioPlus = new Coche[concesionario.length+1];

		System.out.print("Introduzca la matricula: ");
		matricula = tecladoS.nextLine();

		System.out.print("Introduzca el modelo: ");
		modelo = tecladoS.nextLine();

		System.out.print("Introduzca el motor: ");
		motor = tecladoS.nextLine();

		System.out.print("Introduzca el precio: ");
		precio = tecladoN.nextDouble();

		System.out.print("Introduzca el color: ");
		color = tecladoS.nextLine();

		System.out.println();

		Coche cocheNuevo = new Coche(matricula, modelo, motor, precio, color);

		for(int i=0; i<=concesionario.length-1; i++){
			concesionarioPlus[i] = concesionario[i];
		}

		concesionarioPlus[concesionario.length] = cocheNuevo;

		return concesionarioPlus;
	}

	public static Coche[] addCocheConcesionario(Coche[] concesionario, Coche coche){

		Coche[] concesionarioPlus = new Coche[concesionario.length+1];

		for(int i=0; i<=concesionario.length-1; i++){
			concesionarioPlus[i] = concesionario[i];
		}

		concesionarioPlus[concesionario.length] = coche;

		return concesionarioPlus;
	}

	public static void mostrarCoche(Coche[] concesionario, int posicionCoche){
		System.out.println("El coche de la posicon " +posicionCoche +" es:");
		System.out.println(concesionario[posicionCoche-1].toString());
	}

	public static void mostrarConcesionario(Coche[] concesionario){
		System.out.println("=-=-=-= Listado de coches en el concesionario =-=-=-=");

		int contador = 0;

		for(Coche coche : concesionario){

			contador++;
			System.out.println("Coche numero " +contador);
			System.out.println(coche.toString());
			System.out.println();


		}
	}

}
