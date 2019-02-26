package BoletinPOO1.Ej3.Clases;

public class Piso extends Vivienda {
	
	//Atributos
	private int portal;
	private int planta;
	private char puerta;
	
	//Constructor por defecto
	public Piso(int portal, int planta, char puerta) {
		this.portal = portal;
		this.planta = planta;
		this.puerta = puerta;
	}
	
	//Constructor con parámetros
	public Piso(double precio, int numeroHabitaciones, String nombreBarriada, String calle, boolean tieneBalcon, int portal, int planta, char puerta) {
		super(precio, numeroHabitaciones, nombreBarriada, calle, tieneBalcon);
		this.portal = portal;
		this.planta = planta;
		this.puerta = puerta;
	}
	
	//Gets
	public int getPortal() {
		return portal;
	}
	
	public int getPlanta() {
		return planta;
	}
	
	public char getPuerta() {
		return puerta;
	}
	
	//Sets
	public void setPortal(int portal) {
		this.portal = portal;
	}
	
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	
	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}
	
	//Métodos sobrecargados
	
	//Métodos añadidos
	
}
