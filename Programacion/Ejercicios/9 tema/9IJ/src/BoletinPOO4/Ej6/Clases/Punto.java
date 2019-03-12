/* Nombre: Punto
 *
 * Básicas:
 * 		- x => double => Consultable y Modificable
 *		- y => double => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO4.Ej6.Clases;

import java.lang.Math;

public class Punto {
	
	//Atributos
	private double x;
	private double y;
	
	//Constructor por defecto
	public Punto(){
		x = 0;
		y = 0;
	}
	
	//Constructor con parámetros
	public Punto(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	//Gets
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	//Sets
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "x: " +getX() +
				"\n y: " +getY();
		
		return s;
	}
	
	//Métos añadidos
	public double distanciaDosPuntos(Punto punto2){
	
		double distancia = 0;
		
		distancia = Math.sqrt(Math.pow(punto2.getX() - this.getX(),2) + Math.pow(punto2.getY() - this.getY(),2));
		
		return distancia;
	}
	
}
