/* Nombre: Repartidor
 *
 * Básicas:
 * 		- zona 	=> int => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinExtra.Ej2.Clases;

public class Repartidor extends Empleado {
	
	//Atributos
	private int zona;
	
	//Constructor por defecto
	public Repartidor(){
		super();
		zona = 0;
	}
	
	//Constructor con parámetros
	public Repartidor(String nombre, int edad, double salario, int zona){
		super(nombre, edad, salario);
		this.zona = zona;
	}
	
	//Gets
	public int getZona() {
		return zona;
	}
	
	//Sets
	public void setZona(int zona) {
		this.zona = zona;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = super.toString() +"\n" +
				   "Zona: " +getZona();
		
		return s;
	}
	
	//Métos añadidos
	@Override
	public void plus(){
		if(super.getEdad()<25 && getZona()==3){
			System.out.println("Salario actual de " +super.getNombre() +": " +super.getSalario() +"€");

			super.setSalario(super.getSalario() + super.getPLUS());

			System.out.println("Salario de " +super.getNombre() +" sumando " +super.getPLUS() +"€ de plus: " +super.getSalario() +"€");
		}
		else{
			System.out.println( super.getNombre() +" no reune las condiciones para el plus de sueldo.");
		}
	}
	
}
