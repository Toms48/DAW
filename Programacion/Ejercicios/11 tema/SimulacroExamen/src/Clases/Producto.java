/* Nombre: Articulo
 *
 * Básicas:
 * 		- codigo 		=> int 		 => Consultable
 *		- descripcion 	=> String 	 => Consultable y Modificable
 *		- precioCompra	=> double	 => Consultable y Modificable
 *		- precioVenta 	=> double	 => Consultable y Modificable
 *		- stock 		=> int		 => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package Clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Producto {

	//Atributos
	//private static int codigoUnico;

	//private int codigoProducto;
	private String nombre = new String();
	private double precio;
	private int stock;

	//Constructor con parámetros
	public Producto(String nombre, double precio, int stock){
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;

		//this.codigoUnico++;

		//this.codigoProducto = ++this.codigoUnico;
	}

	//Gets
	/*public int getCodigoProducto() {
		return codigoProducto;
	}*/

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	//Sets
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	//Métodos sobrescritos
	@Override
	public String toString () {

		String s = "Nombre: " +getNombre() +"\n" +
				"Precio: " +getPrecio() +"\n" +
				"Stock: " +getStock();

		return s;
	}

}