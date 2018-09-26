/*
 * Nombre: tema2Ejercicio6
 * 
 * Comentario: Escribe un programa que calcule el total de una factura a partir de la base
				imponible (precio sin IVA). La base imponible estará almacenada en una
				variable.
 * 
 * 
 */


public class tema2Ejercicio6 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		double IVA21 = 21.0;
		double IVA4 = 4.0;
		
		double precioImponible1 = 50.0;
		double precioImponible2 = 12.0;
		
		double precioConIVA1 = 0.0;
		double precioConIVA2 = 0.0;
		
		System.out.println("Producto 1 sin IVA: " +precioImponible1 +" se aplicará el 21% de IVA");
		System.out.println("Producto 2 sin IVA: " +precioImponible2 +" se aplicará el  4% de IVA");
		
		System.out.println(" ");
		
		System.out.println("Producto 1 con IVA: " + (((IVA21*precioImponible1)/100) + precioImponible1));
		precioConIVA1 = (((IVA21*precioImponible1)/100) + precioImponible1);
		
		System.out.println("Producto 2 con IVA: " + (((IVA4*precioImponible2)/100) + precioImponible2));
		precioConIVA2 = (((IVA4*precioImponible2)/100) + precioImponible2);
		
		System.out.println(" ");

		System.out.println("El precio total es: " +(precioConIVA1+precioConIVA2));
		
		
	}
}

