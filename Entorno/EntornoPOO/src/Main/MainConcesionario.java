package Main;

import Clases.Coche;

public class MainConcesionario {
	public static void main(String[] args){
		
		Coche c1 = new Coche("3453 GJT", "Audi", "A5", 'D', 1900, "gris");
		Coche c2 = new Coche("7363 DYU", "Mercedes","220");
		
		System.out.println("El número de ruedas de c1 y c2 es: " +Coche.getRuedas());
		
		System.out.println();
		
		System.out.println("=-=-= Datos de C1 =-=-=");
		System.out.println("Matrícula: " +c1.getMatricula());
		System.out.println("Marca: " +c1.getMarca());
		System.out.println("Modelo: " +c1.getModelo());
		System.out.println("Cilindradas: " +c1.getCilindrada());
		System.out.println("Combustible: " +c1.getCombustible());
		System.out.println("Color: " +c1.getColor());

		System.out.println();
		
		System.out.println("=-=-= Datos de C2 =-=-=");
		System.out.println("Matrícula: " +c2.getMatricula());
		System.out.println("Marca: " +c2.getMarca());
		System.out.println("Modelo: " +c2.getModelo());
		System.out.println("Cilindradas: " +c2.getCilindrada());
		System.out.println("Combustible: " +c2.getCombustible());
		System.out.println("Color: " +c2.getColor());
		
		System.out.println(c1.getRuedas());
		
	}
}
