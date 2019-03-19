/* Nombre: Candidato
 *
 * Básicas:
 * 		- nombre => String => Consultable y Modificable
 *		- numeroVotos => int => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO4.Ej14.Clases;

public class Candidato {
	
	//Atributos
	private String nombre = new String();
	private int numeroVotos;
	
	//Constructor por defecto
	public Candidato(){
		nombre = "NombrePorDefecto";
		numeroVotos = 0;
	}
	
	//Constructor con parámetros
	public Candidato(String nombre, int numeroVotos){
		this.nombre = nombre;
		this.numeroVotos = numeroVotos;
	}
	
	//Gets
	public String getNombre() {
		return nombre;
	}
	
	public int getNumeroVotos() {
		return numeroVotos;
	}
	
	//Sets
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNumeroVotos(int numeroVotos) {
		this.numeroVotos = numeroVotos;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "Nombre: " +getNombre() +"\n" +
				   "Numero de votos: " +getNumeroVotos();
		
		return s;
	}
	
	//Métos añadidos
	
}