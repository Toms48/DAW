/*	Nombre: Habitacion
 *
 * 	Básicas:
 * 		- cantidadEstanterias    => int	   => Consultable y Modificable
 * 		- nombre				 => String => Consultable
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
 * 		No tiene
 */

package Clases;

public class Habitacion {
	
	//Atributos
	private int cantidadEstanterias;
	private String nombreHabitacion = new String();
	
	//Constructor por defecto
	public Habitacion(){
		cantidadEstanterias = 0;
		nombreHabitacion = "NombrePorDefecto";
	}
	
	//Constructor con parámetros
	public Habitacion(String nombreHabitacion, int cantidadEstanterias){
		this.nombreHabitacion = nombreHabitacion;
		this.cantidadEstanterias = cantidadEstanterias;
	}
	
	//Constructor con parámetros sin el numero de estanterias
	public Habitacion(String nombreHabitacion){
		this.nombreHabitacion = nombreHabitacion;
	}
	
	//Gets
	public int getCantidadEstanterias() {
		return cantidadEstanterias;
	}
	
	public String getNombreHabitacion() {
		return nombreHabitacion;
	}
	
	//Sets
	public void setCantidadEstanterias(int cantidadEstanterias) {
		this.cantidadEstanterias = cantidadEstanterias;
	}
	
}
