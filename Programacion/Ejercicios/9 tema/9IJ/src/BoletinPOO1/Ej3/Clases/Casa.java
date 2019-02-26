package BoletinPOO1.Ej3.Clases;

public class Casa extends Vivienda {
	
	//Atributos
	private int numeroPlantas;
	private boolean tieneJardin;
	
	//Constructor por defecto
	public Casa(){
		super();
		numeroPlantas = 0;
		tieneJardin = false;
	}
	
	//Cosntructor con parámetros
	public Casa(double precio, int numeroHabitaciones, String nombreBarriada, String calle, boolean tieneBalcon, int numeroPlantas, boolean tieneJardin) {
		super(precio, numeroHabitaciones, nombreBarriada, calle, tieneBalcon);
		this.numeroPlantas = numeroPlantas;
		this.tieneJardin = tieneJardin;
	}
	
	//Gets
	public int getNumeroPlantas() {
		return numeroPlantas;
	}
	
	public boolean getTieneJardin() {
		return tieneJardin;
	}
	
	//Sets
	public void setNumeroPlantas(int numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}
	
	public void setTieneJardin(boolean tieneJardin) {
		this.tieneJardin = tieneJardin;
	}
	
	//Métodos sobrecargados
	
	
	//Métodos añadidos
	
	
}
