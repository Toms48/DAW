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

package Ej8.Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Articulo {

	//Atributos
	private static int numeroFactura = 1;
	
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

	//Constructor con parámetros
	public Articulo(int codigoArticulo, String descripcion, double precioCompra, double precioVenta, int stock){
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;

		this.codigoArticulo = codigoArticulo;

		codigoUnico = codigoArticulo;
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
	public static void mostrarListado(ArrayList<Articulo> arrayArticulos){

		if(arrayArticulos.isEmpty()){
			System.out.println();
			System.out.println("No hay ningún artículo.");
			System.out.println();
		}
		else{
			for (Articulo articulo : arrayArticulos) {

				System.out.println();
				System.out.println(articulo.toString());
				System.out.println();
			}
		}
	}

	public static ArrayList<Articulo> alta(String descripcion, double precioCompra, double precioVenta, int stock, ArrayList<Articulo> arrayArticulos){
		Articulo articulo = new Articulo(descripcion, precioCompra, precioVenta, stock);

		arrayArticulos.add(articulo);

		return arrayArticulos;
	}

	public static ArrayList<Articulo> volcarDatos(int codigoArticulo,String descripcion, double precioCompra, double precioVenta, int stock, ArrayList<Articulo> arrayArticulos){
		Articulo articulo = new Articulo(codigoArticulo,descripcion, precioCompra, precioVenta, stock);

		arrayArticulos.add(articulo);

		return arrayArticulos;
	}

	public static ArrayList<Articulo> baja(ArrayList<Articulo> arrayArticulos){

		int codigoBaja = 0;
		boolean encontrado = false;

		Scanner tecladoN = new Scanner(System.in);

		mostrarListado(arrayArticulos);

		System.out.print("Introduzca el codigo del articulo que quiere dar de baja: ");
		codigoBaja = tecladoN.nextInt();

		for(int i=0; i<=arrayArticulos.size()-1 || encontrado==false; i++){
			if(arrayArticulos.get(i).getCodigoArticulo() == codigoBaja){
				encontrado=true;
				arrayArticulos.remove(arrayArticulos.get(i));
			}
		}

		return arrayArticulos;
	}

	public static ArrayList<Articulo> modificacion(ArrayList<Articulo> arrayArticulos){

		int codigoModificacion = 0;
		boolean encontrado = false;

		int opcionModificar = 0;

		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);

		mostrarListado(arrayArticulos);

		System.out.print("Introduzca el codigo del articulo que quiere modificar: ");
		codigoModificacion = tecladoN.nextInt();

		for(int i=0; i<=arrayArticulos.size()-1 || encontrado==false; i++){
			if(arrayArticulos.get(i).getCodigoArticulo() == codigoModificacion){
				encontrado=true;

				System.out.println("1. Descripcion");
				System.out.println("2. Precio de compra");
				System.out.println("3. Precio de venta");
				System.out.println("4. Stock");
				System.out.print  ("Que quiere modificar?: ");
				opcionModificar = tecladoN.nextInt();

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

	public static void aniadirMercancia(ArrayList<Articulo> arrayArticulos){

		int codigoArticulo = 0;
		boolean encontrado = false;

		int stockEntrante = 0;

		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);

		mostrarListado(arrayArticulos);

		System.out.print("Introduzca el codigo del articulo que va a añadir más stock: ");
		codigoArticulo = tecladoN.nextInt();

		for(int i=0; i<=arrayArticulos.size()-1 || encontrado==false; i++){
			if(arrayArticulos.get(i).getCodigoArticulo() == codigoArticulo){
				encontrado=true;

				do{
					System.out.print("Introduzca el stock de entrada: ");
					stockEntrante = tecladoN.nextInt();
				}
				while(stockEntrante <= 0);

				arrayArticulos.get(i).setStock(arrayArticulos.get(i).getStock() + stockEntrante);
			}
		}

	}

	public static void eliminarMercancia(ArrayList<Articulo> arrayArticulos){

		char respuesta = ' ';
		char respuestaGuardar = ' ';

		String articuloFactura = "";
		double valorVentaFactura = 0;
		
		final double IVA = 21;
		int codigoArticulo = 0;
		boolean encontrado = false;

		double totalFinal = 0;

		int stockSaliente = 0;

		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);

		HashMap<Integer, String> articulosHM = new HashMap<>();

		for(Articulo articulo : arrayArticulos){
			articulosHM.put(articulo.getCodigoArticulo(), articulo.getDescripcion());
		}

		do{
			do{
				mostrarListado(arrayArticulos);

				System.out.print("Introduzca el código del articulo que va a vender: ");
				codigoArticulo = tecladoN.nextInt();
			}
			while(!articulosHM.containsKey(codigoArticulo));


			for(int i=0; i<=arrayArticulos.size()-1 || encontrado==false; i++){
				if(arrayArticulos.get(i).getCodigoArticulo() == codigoArticulo){
					encontrado=true;

					do{
						System.out.print("Introduzca el stock de salida: ");
						stockSaliente = tecladoN.nextInt();
					}
					while(stockSaliente > arrayArticulos.get(i).getStock());

					arrayArticulos.get(i).setStock(arrayArticulos.get(i).getStock() - stockSaliente);

					totalFinal += arrayArticulos.get(i).getPrecioVenta() * stockSaliente;
				}
			}

			do{
				System.out.print("Quiere introducir otro código de articulo? (s/n): ");
				respuesta = Character.toLowerCase(tecladoS.next().charAt(0));
			}
			while(respuesta!='s' && respuesta!='n');
		}
		while(respuesta == 's');

		System.out.println();
		System.out.println("================== FACTURA ==================");
		System.out.println("Su total a pagar es " +(totalFinal+(totalFinal*(IVA/100))) +"€");
		System.out.println("=============================================");
		System.out.println("Gracias por comprar aquí!");
		System.out.println();
		
		do{
			System.out.print("Quiere guardar la factura? (s/n): ");
			respuestaGuardar = Character.toLowerCase(tecladoS.next().charAt(0));
		}
		while(respuestaGuardar!='s' && respuestaGuardar!='n');
		
		if(respuestaGuardar=='s'){
			try{
				//BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Familia\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej8\\Main\\articulo.dat"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej8\\Main\\factura"+numeroFactura+".dat"));
				
				bw.write("================== FACTURA ==================");
				bw.newLine();
				bw.write("Su total a pagar es " +(totalFinal+(totalFinal*(IVA/100))) +"€");
				bw.newLine();
				bw.write("=============================================");
				bw.newLine();
				bw.write("Gracias por comprar aquí!");
				
				numeroFactura++;
				
				bw.close();
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
		}

	}

}