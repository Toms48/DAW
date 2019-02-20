/* Nombre: Casilla
 *
 * Básicas:
 * 		- vehiculosCreados	   => int => Consultable y Modificable
 * 		- kilometrosTotales	   => int => Consultable y Modificable
 * 		- kilometrosRecorridos => int => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO2.Clases;

public class Vehiculo {
	
	//Atributos
	private static int vehiculosCreados;
	private static int kilometrosTotales;
	private int kilometrosRecorridos;
	
	//Constructor por defecto
	public Vehiculo(){
		kilometrosRecorridos = 0;
	}
	
	public Vehiculo(int kilometrosRecorridos){
		this.kilometrosRecorridos += kilometrosRecorridos;
	}
	
	//Gets
	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}
	
	public static int getKilometrosTotales() {
		return kilometrosTotales;
	}
	
	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	
	//Sets
	public static void setVehiculosCreados(int vehiculosCreados) {
		Vehiculo.vehiculosCreados = vehiculosCreados;
	}
	
	public static void setKilometrosTotales(int kilometrosTotales) {
		Vehiculo.kilometrosTotales = kilometrosTotales;
	}
	
	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
	
}
