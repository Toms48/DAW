/*	Nombre: Estanteria
 *
 * 	B�sicas:
 * 		- cantidadLibros	=> int	=> Consultable y Modificable
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
 * 	M�todos a�adidos:
 * 		No tiene
 */

package Clases;

import java.util.ArrayList;

public class Estanteria {
	
	//Atributos
	private int cantidadLibros;
	
	//Constructor por defecto
	public Estanteria(){
		this.cantidadLibros = 0;
	}
	
	//Constructor con par�metros
	public Estanteria(int cantidadLibros){
		this.cantidadLibros = cantidadLibros;
	}
	
	//Gets
	public int getCantidadLibros() {
		return cantidadLibros;
	}
	
	//Sets
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}
	
	//M�todos sobrescritos
	@Override
	public String toString() {
		
		String s = "Cantidad de libros: " +getCantidadLibros();
		
		return s;
	}
	
	//M�todos a�adidos
	public ArrayList<Estanteria> agregarEstanteria(Estanteria estanteria){
	
		//Declaracion de variables
		
		//Inicializacion
		ArrayList<Estanteria> arrayEstanterias = new ArrayList<Estanteria>();
		
		return arrayEstanterias;
	}
	
	
}
