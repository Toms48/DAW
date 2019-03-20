package BoletinPOO3.Ej1.Clases;

import BoletinPOO3.Ej1.Enums.Sexo;

public class Gato2 extends Gato {
	
	//Atributos
	private String nombre;
	private int edad;
	
	//Constructor con parámetros
	public Gato2(Sexo sexo, String raza, String nombre, int edad){
		super(sexo, raza);
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Gets
	public String getRaza(){
		return super.getRaza();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	//Sets
	public void setRaza(String raza){
		super.setRaza(raza);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public String toString() {
		return "Nombre: " +getNombre() +"\n" +
				"Edad: " +getEdad() +"\n" +
				super.toString();
	}
	
	
}
