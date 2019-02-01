package Tests;

import Clases.Persona;

public class TestPersona {
	public static void main(String[] args){
		
		//Constructores
		Persona personaPorDefecto = new Persona();
		Persona persona1 = new Persona("Tomás Mateo", "Núñez Ríos");
		Persona persona2 = new Persona("Jorge", "Obando López");
		
		System.out.println("=-=-=-=-= Constructor por defecto =-=-=-=-=");
		System.out.println(personaPorDefecto.toString());
		
		System.out.println();
		
		System.out.println("=-=-=-=-= Constructor con parámetros =-=-=-=-=");
		System.out.println(persona1.toString());
		
		System.out.println();
		
		System.out.println("=-=-=-=-= Constructor con parámetros (sin notas) =-=-=-=-=");
		System.out.println(persona2.toString());
		
	}
}
