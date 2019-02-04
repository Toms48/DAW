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
		System.out.println(persona2.toString());
		
		System.out.println();
		
		System.out.println("=-=-=-=-= Gets y Sets =-=-=-=-="); //Los métodos gets realmente los estoy utilizando to-do el rato con el método toString por lo que ya los estoy testeando
		System.out.println("Persona antes de los sets");
		System.out.println(persona1.toString());
		
		persona1.setEdad(20);
		persona1.setSexo('H');
		persona1.setPeso(75);
		persona1.setAltura(1.72);
		
		System.out.println();
		
		System.out.println("Persona despues de los sets");
		System.out.println(persona1.toString());
		
	}
}
