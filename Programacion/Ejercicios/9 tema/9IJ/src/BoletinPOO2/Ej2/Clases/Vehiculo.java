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

package BoletinPOO2.Ej2.Clases;

public class Vehiculo {
	
	//Atributos
	private static int vehiculosCreados;
	private static int kilometrosTotales;
	private int kilometrosRecorridos;
	
	//Constructor por defecto
	public Vehiculo(){
		kilometrosRecorridos = 0;
	}

	//Constructor con parámetros
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

	//Métodos añadidos
	public void mostrarKilometrosRecorridos(){
		String kmString = "" +getKilometrosTotales();

		System.out.println();
		kmString = "" +getKilometrosRecorridos();
		System.out.print  ("o-------------------");
		for(int i=1; i<=kmString.length(); i++){
			System.out.print("-");
		}
		System.out.println("-----------------o");
		System.out.println("| Se han recorrido " +getKilometrosRecorridos() +" km con el coche. |");
		System.out.print  ("o-------------------");
		for(int i=1; i<=kmString.length(); i++){
			System.out.print("-");
		}
		System.out.println("-----------------o");
		System.out.println();
	}

	public static void mostrarKilometrosTotales(){
		String kmString = "" +getKilometrosTotales();

		System.out.println();
		System.out.print  ("o-------------------");
		for(int i=1; i<=kmString.length(); i++){
			System.out.print("-");
		}
		System.out.println("-------------o");
		System.out.println("| Se han recorrido " +getKilometrosTotales() +" km en total. |");
		System.out.print  ("o-------------------");
		for(int i=1; i<=kmString.length(); i++){
			System.out.print("-");
		}
		System.out.println("-------------o");
		System.out.println();
	}

	public void andar(int kilometrosAndados){
		kilometrosRecorridos += kilometrosAndados;
		kilometrosTotales += kilometrosAndados;
	}

}
