/* Nombre: Cubo
 *
 * Básicas:
 * 		- capacidad => int => Consultable
 *		- contenido => int => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO4.Ej9.Clases;

import java.util.Scanner;

public class Cubo {
	
	//Atributos
	private int capacidad;
	private int contenido;
	
	//Constructor con parámetros
	public Cubo(int capacidad, int contenido){
		this.capacidad = capacidad;
		this.contenido = contenido;
	}
	
	//Constructor con parámetros (solo la capacidad, contenido por defecto a 0)
	public Cubo(int capacidad){
		this.capacidad = capacidad;
		contenido = 0;
	}
	
	//Gets
	public int getCapacidad() {
		return capacidad;
	}
	
	public int getContenido() {
		return contenido;
	}
	
	//Sets
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "Capacidad: " +getCapacidad() +"\n" +
				   "Contenido: " +getContenido();
		
		return s;
	}
	
	//Métos añadidos
	public void verterEn(Cubo cubo){
		
		int contenidoVerter = 0;
		int espacioLibre = cubo.getCapacidad()-cubo.getContenido();
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Introduzca el contenido que a verter: ");
			contenidoVerter = teclado.nextInt();
		}
		while(contenidoVerter<0 || contenidoVerter>this.getContenido());
		
		if(contenidoVerter != 0){
			if( contenidoVerter <= espacioLibre ){
				cubo.setContenido(cubo.getContenido()+contenidoVerter);
				this.setContenido(this.getContenido()-contenidoVerter);
				System.out.println("Se ha vertido todo el contenido correctamente");
			}
			else{
				cubo.setContenido(cubo.getContenido()+espacioLibre);
				this.setContenido(this.getContenido()-espacioLibre);
				System.out.println("Solo hemos podido verter una parte");
			}
		}
	}
	
}
