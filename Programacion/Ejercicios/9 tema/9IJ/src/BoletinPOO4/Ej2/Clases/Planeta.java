/* Nombre: Planeta
 *
 * Básicas:
 * 		- nombre				 => String => Consultable y Modificable
 * 		- masa                   => String => Consultable y Modificable
 * 		- diametro               => float  => Consultable y Modificable
 * 	    - periodoRotacion		 => String => Consultable y Modificable
 * 	    - periodoTraslacion      => int    => Colsultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO4.Ej2.Clases;

public class Planeta {

    //Atributos
	private String nombre = new String();
	private String masa = new String();
	private float diametro;
	private String periodoRotacion = new String();
	private int periodoTraslacion;

    //Constructor por defecto
	public Planeta(){
		nombre = "Nombre PorDefecto";
		masa = "0";
		diametro = 0;
		periodoRotacion = "0";
		periodoTraslacion = 0;
	}

    //Constructor con parámetros
	public Planeta(String nombre, String masa, float diametro, String periodoRotacion, int periodoTraslacion) {
		this.nombre = nombre;
		this.masa = masa;
		this.diametro = diametro;
		this.periodoRotacion = periodoRotacion;
		this.periodoTraslacion = periodoTraslacion;
	}
	
	//Gets
	public String getNombre() {
		return nombre;
	}
	
	public String getMasa() {
		return masa;
	}
	
	public float getDiametro() {
		return diametro;
	}
	
	public String getPeriodoRotacion() {
		return periodoRotacion;
	}
	
	public int getPeriodoTraslacion() {
		return periodoTraslacion;
	}
	
	//Sets
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setMasa(String masa) {
		this.masa = masa;
	}
	
	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}
	
	public void setPeriodoRotacion(String periodoRotacion) {
		this.periodoRotacion = periodoRotacion;
	}
	
	public void setPeriodoTraslacion(int periodoTraslacion) {
		this.periodoTraslacion = periodoTraslacion;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "Nombre: " +getNombre() +"\n" +
				   "Masa: " + getMasa() + "\n" +
				   "Diametro: " + getDiametro() + "\n" +
				   "Periodo de rotacion: " + getPeriodoRotacion() + "\n" +
				   "Periodo de traslacion: " + getPeriodoTraslacion();
		
		return s;
	}
	
	//Métodos añadidos
	
}
