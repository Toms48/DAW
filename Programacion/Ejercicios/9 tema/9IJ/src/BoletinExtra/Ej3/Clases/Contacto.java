/* Nombre: Contacto
 *
 * Básicas:
 * 		- nombre 	=> String 	=> Consultable y Modificable
 *		- telefono  => int 		=> Consultable y Modificable
 *		- libre		=> boolean	=> Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinExtra.Ej3.Clases;

import java.util.Objects;

public class Contacto {
	
	//Atributos
	private String nombre = new String();
	private int telefono;
	private boolean libre;
	
	//Constructor por defecto
	public Contacto(){
		nombre = "Nombre PorDefecto";
		telefono = 0;
		libre = true;
	}
	
	//Constructor con parámetros
	public Contacto(String nombre, int telefono){
		this.nombre = nombre;
		this.telefono = telefono;
		libre = false;
	}
	
	//Gets
	public String getNombre() {
		return nombre;
	}
	
	public int getTelefono() {
		return telefono;
	}
	
	public boolean getLibre() {
		return libre;
	}
	
	//Sets
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public void setLibre(boolean libre) {
		this.libre = libre;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "Nombre: " +getNombre() +"\n" +
				   "Telefono: " +getTelefono() +"\n" +
				   "Libre: " +getLibre();
		
		return s;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Contacto contacto = (Contacto) o;
		return Objects.equals(nombre, contacto.nombre);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	
	//Métos añadidos
	
	
}
