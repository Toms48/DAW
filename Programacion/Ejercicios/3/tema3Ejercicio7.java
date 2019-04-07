/*
 * Nombre: tema3Ejercicio7
 * 
 * Comentario: Escribe un programa que calcule el total de una factura a partir de la base
				imponible.
 * 				
 * 				IVA general: 21%
 * 
 * Análisis: 
 * 		- Entradas: un double para la base imponible
 * 		- Salidas: por pantalla
 */
 
//PG
//Incio
	//Preguntar precio del primer producto
	//Leer precio del primer producto
	//Aplicar IVA
	//Actualizar la factura total
	
	//Preguntar precio del segundo producto
	//Leer precio del primer producto
	//Aplicar IVA
	//Actualizar la factura total
	
	//Preguntar precio del tercer producto
	//Leer precio del primer producto
	//Aplicar IVA
	//Actualizar la factura total
	
	//Mostrar factura total
//Fin

import java.util.Scanner;

public class tema3Ejercicio7 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		double producto1 = 0.0;
		double producto2 = 0.0;
		double producto3 = 0.0;
		
		double facturaTotal = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Incio
			//Preguntar precio del primer producto
			System.out.print("Introduzca el precio imponible del primer producto: ");
			
			//Leer precio del primer producto
			producto1 = teclado.nextDouble();
			
			//Actualizar la factura total aplicando el IVA
			facturaTotal = facturaTotal + producto1 + ((21*producto1)/100);
			
			//Preguntar precio del segundo producto
			System.out.print("Introduzca el precio imponible del segundo producto: ");
			
			//Leer precio del primer producto
			producto2 = teclado.nextDouble();
			
			//Actualizar la factura total aplicando el IVA
			facturaTotal = facturaTotal + producto2 + ((21*producto2)/100);
			
			//Preguntar precio del tercer producto
			System.out.print("Introduzca el precio imponible del tercer producto: ");
			
			//Leer precio del primer producto
			producto3 = teclado.nextDouble();
			
			//Actualizar la factura total aplicando el IVA
			facturaTotal = facturaTotal + producto3 + ((21*producto3)/100);
			
			//Mostrar factura total
			System.out.println("Su factura total (con IVA) es de: " +facturaTotal +" Euros");
		//Fin
		
	}
}

