/*	Nombre: Pelicula
 *
 * 	Básicas:
 * 		- titulo			=> String 		=> Consultable y Modificable
 * 		- director			=> String 		=> Consultable y Modificable
 * 		- duracion			=> int	  		=> Consultable y Modificable
 * 		- genero			=> enumGenero	=> Consultable
 * 		- clasificacionEdad	=> enumCE		=> Consultable
 * 		- vecesvista		=> int			=> Consultable y Modificable
 * 		- vista				=> boolean			=> Consultable y Modificable
 * 		- nota				=> int			=> Consultable y Modificable
 *
 * 		- cantidadHorasTotales => double	=> Consultable y Modificable
 *
 * 	Derivadas:
 * 		No tiene
 *
 * 	Compartidas:
 * 		No hay
 *
 * 	Restricciones:
 * 		- La duracion tiene que estar en minutos
 * 		- Las veces que la hemos visto no puede ser menor que 1
 * 			(Porque no puede ser negativo y no puede ser 0 porque si no es que no la hemos visto ni una vez, para eso tenemos un atributo)
 * 		- Si es false es que está pendiente de ver, si es true está vista
 * 		- La nota solo puede ser entre 1 y 10 (ambos incluidos)
 *
 * 	Métodos añadidos:
 * 		No tiene
 */

package Clases;

import Enums.*;

public class Pelicula {
	
	//Atributos
	private String titulo = new String();
	private String director = new String();
	private int duracion;
	private enumGenero genero;
	private enumCE clasificacionEdad;
	private int vecesVista;
	private boolean vista;
	private int nota;
	
	private static double horasTotales;
	
	//Constructor por defecto
	public Pelicula(){
		cantidadEstanterias = 0;
		nombreHabitacion = "NombrePorDefecto";
	}
	
	//Constructor con parámetros
	public Pelicula(String nombreHabitacion, int cantidadEstanterias){
		this.nombreHabitacion = nombreHabitacion;
		this.cantidadEstanterias = cantidadEstanterias;
	}
	
	//Constructor con parámetros sin el numero de estanterias
	public Pelicula(String nombreHabitacion){
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
	
	//Métodos sobrescritos
	@Override
	public String toString() {
		
		String s = "Nombre: " +getNombreHabitacion() +
				"\nNumero de estanterias: " +getCantidadEstanterias();
		
		return s;
	}
}
