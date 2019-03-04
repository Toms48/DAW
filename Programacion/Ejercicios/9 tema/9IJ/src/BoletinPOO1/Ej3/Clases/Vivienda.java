/* Nombre: Vivienda
 *
 * Básicas:
 * 		- precio   				=> double  => Consultable y Modificable
 * 		- numeroHabitaciones	=> int	   => Consultable y Modificable
 * 		- nombreBarriada    	=> String  => Consultable y Modificable
 * 		- calle					=> String  => Consultable y Modificable
 * 		- tieneBalcon			=> boolean => Consultable y Modificable
 *
 * 		- contadorViviendas		=> int	   => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones:
 *
 *
 */

package BoletinPOO1.Ej3.Clases;

public class Vivienda {

	//Atributos
	private double precio;
	private int numeroHabitaciones;
	private String nombreBarriada = new String();
	private String calle = new String();
	private boolean tieneBalcon;
	
	private static int contadorViviendas;
	
	//Constructor por defecto
	public Vivienda(){
		precio = 0;
		numeroHabitaciones = 0;
		nombreBarriada = "Barriada Por Defecto";
		calle = "Calle Por Defecto";
		tieneBalcon = false;
		setContadorViviendas();
	}
	
	//Constructor con parámetros
	public Vivienda(double precio, int numeroHabitaciones, String nombreBarriada, String calle, boolean tieneBalcon) {
		this.precio = precio;
		this.numeroHabitaciones = numeroHabitaciones;
		this.nombreBarriada = nombreBarriada;
		this.calle = calle;
		this.tieneBalcon = tieneBalcon;
		setContadorViviendas();
	}
	
	//Gets
	public static int getContadorViviendas() {
		return contadorViviendas;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getNumeroHabitaciones() {
		return numeroHabitaciones;
	}
	
	public String getNombreBarriada() {
		return nombreBarriada;
	}
	
	public String getCalle() {
		return calle;
	}
	
	public boolean getTieneBalcon() {
		return tieneBalcon;
	}
	
	//Sets
	public static void setContadorViviendas() {
		Vivienda.contadorViviendas += 1;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setNumeroHabitaciones(int numeroHabitaciones) {
		this.numeroHabitaciones = numeroHabitaciones;
	}
	
	public void setNombreBarriada(String nombreBarriada) {
		this.nombreBarriada = nombreBarriada;
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public void setTieneBalcon(boolean tieneBalcon) {
		this.tieneBalcon = tieneBalcon;
	}
	
	//Métodos sobrecargados
	@Override
	public String toString(){
		
		String s = new String();
		
		if(getTieneBalcon()){
			s = "Vivienda{precio=" +getPrecio() +", numeroDeHabitaciones=" +getNumeroHabitaciones() +
					", nombreBarriada=" +getNombreBarriada() +"}" +
					"\ncalle=" +getCalle() +
					"\nBalcón: Tiene  balcón";
		}
		else{
			s = "Vivienda{precio=" +getPrecio() +", numeroDeHabitaciones=" +getNumeroHabitaciones() +
					   ", nombreBarriada=" +getNombreBarriada() +"}" +
					   "\ncalle=" +getCalle();
		}
		
		return s;
	}
	
}
