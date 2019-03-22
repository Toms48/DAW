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

package BoletinPOO3.Ej5.Clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Articulo {
	
	//Atributos
	private static int codigoUnico;
	
	private int codigoArticulo;
	private String descripcion = new String();
	private double precioCompra;
	private double precioVenta;
	private int stock;
	
	//Constructor con parámetros
	public Articulo(String descripcion, double precioCompra, double precioVenta, int stock){
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
		
		//this.codigoUnico++;
		
		this.codigoArticulo = ++this.codigoUnico;
	}
	
	//Gets
	public int getCodigoArticulo() {
		return codigoArticulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public double getPrecioCompra() {
		return precioCompra;
	}
	
	public double getPrecioVenta() {
		return precioVenta;
	}
	
	public int getStock() {
		return stock;
	}
	
	//Sets
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "Codigo: " +getCodigoArticulo() +"\n" +
				   "Descripcion: " +getDescripcion() +"\n" +
				   "Precio de compra: " +getPrecioCompra() +"\n" +
				   "Precio de venta: " +getPrecioVenta() +"\n" +
				   "Stock: " +getStock();
		
		return s;
	}
	
	//Métos añadidos
	public void mostrarListado(ArrayList<Articulo> arrayArticulos){
		for (Articulo articulo : arrayArticulos) {
			
			System.out.println();
			System.out.println(articulo.toString());
			System.out.println();
		}
	}
	
	public ArrayList<Articulo> alta(String descripcion, double precioCompra, double precioVenta, int stock, ArrayList<Articulo> arrayArticulos){
		Articulo articulo = new Articulo(descripcion, precioCompra, precioVenta, stock);
		
		arrayArticulos.add(articulo);
		
		return arrayArticulos;
	}
	
	public ArrayList<Articulo> baja(ArrayList<Articulo> arrayArticulos){
		
		int codigoBaja = 0;
		boolean encontrado = false;
		
		Scanner tecladoN = new Scanner(System.in);
		
		mostrarListado(arrayArticulos);
		
		System.out.print("Introduzca el codigo del articulo que quiere dar de baja: ");
		codigoBaja = tecladoN.nextInt();
		
		for(int i=0; i<=arrayArticulos.size() || encontrado==true; i++){
			if(arrayArticulos.get(i).getCodigoArticulo() == codigoBaja){
				encontrado=true;
				arrayArticulos.remove(arrayArticulos.get(i));
			}
		}
		
		return arrayArticulos;
	}
	
	public ArrayList<Articulo> modificacion(ArrayList<Articulo> arrayArticulos){
		
		int codigoModificacion = 0;
		boolean encontrado = false;
		
		int opcionModificar = 0;
		
		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);
		
		mostrarListado(arrayArticulos);
		
		System.out.print("Introduzca el codigo del articulo que quiere modificar: ");
		codigoModificacion = tecladoN.nextInt();
		
		for(int i=0; i<=arrayArticulos.size() || encontrado==true; i++){
			if(arrayArticulos.get(i).getCodigoArticulo() == codigoModificacion){
				encontrado=true;
				
				System.out.println("1. Descripcion");
				System.out.println("2. Precio de compra");
				System.out.println("3. Precio de venta");
				System.out.println("4. Stock");
				System.out.print  ("Que quiere modificar?: ");
				codigoModificacion = tecladoN.nextInt();
				
				switch (opcionModificar){
					case 1:
						System.out.print("Introduzca la nueva descripcion: ");
						arrayArticulos.get(i).setDescripcion(tecladoS.nextLine());
						break;
						
					case 2:
						System.out.print("Introduzca el nuevo precio de compra: ");
						arrayArticulos.get(i).setPrecioCompra(tecladoN.nextDouble());
						break;
						
					case 3:
						System.out.print("Introduzca el nuevo precio de venta: ");
						arrayArticulos.get(i).setPrecioVenta(tecladoN.nextDouble());
						break;
						
					case 4:
						System.out.print("Introduzca el nuevo stock: ");
						arrayArticulos.get(i).setStock(tecladoN.nextInt());
						break;
				}
			}
		}
		
		return arrayArticulos;
	}
	
}