/*
 * Nombre: tema3Ejercicio12
 * 
 * Comentario: Escribe un programa que calcule el precio final de un producto según su base imponible,
 * el tipo de IVA aplicado y el código promocional.
 * Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente.
 * Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc
 * que significan respectivamente que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%.
 * El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados.
 * 
 * Análisis: 
 * 		Entradas:
 * 			- Un int para la base imponible
 * 			- Un String para el tipo de IVA
 * 			- Un String para el codigo promocional
 * 		Salidas: Por pantalla
 * 
 */
 
//PG

/*
Inicio
	Preguntar y leer la base imponible
	Preguntar y leer el tipo de IVA
	Preguntar y leer el código promocional
	
	Segun IVA
		caso general (21%)
		caso reducido (10%)
		caso superreducido (4%)
	Fin_Segun
	
	Segun código promocional
		caso nopro (no aplica ninguna promocion)
		caso mitad (reducir el precio a la mitad)
		caso meno5 (menos 5 euros)
		caso 5porc (descontamos el 5%)
	Fin_Segun
	
	Mostrar base imponible
	Mostrar IVA
	Mostrar precio con IVA
	Mostrar código promocional
	Mostrar precio final
Fin
*/

//Según código promocional, Caso meno5
/*
Si el precio con IVA es menor o igual que 5
	Mostrar mensaje de no se aplica promocion
Sino
	aplicar promoción
Fin_Si
*/

import java.util.Scanner;

public class tema3Ejercicio12 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int baseImponible = 0;
		String tipoIVA = " ";
		String tipoCodPro = " ";
		
		int numIVA = 0;
		double iva = 0.0;
		double descuentoPro = 0.0;
		double precioConIVA = 0.0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer la base imponible
			System.out.print("Introduzca la base imponible: ");
			baseImponible = teclado.nextInt();
			
			//Preguntar y leer el tipo de IVA
			System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
			tipoIVA = teclado.next();
			
			//Preguntar y leer el código promocional
			System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
			tipoCodPro = teclado.next();
			
			switch(tipoIVA){ //Segun IVA
				case "general":
					numIVA = 21;
					iva = ((21*baseImponible)/100);
					precioConIVA = baseImponible+iva;
				break;
				
				case "reducido":
					numIVA = 10;
					iva = ((10*baseImponible)/100);
					precioConIVA = baseImponible+iva;
				break;
				
				case "superreducido":
					numIVA = 4;
					iva = ((4*baseImponible)/100);
					precioConIVA = baseImponible+iva;
				break;
				
			} //Fin_Segun
			
			//Segun código promocional
			switch(tipoCodPro){
				case "nopro":
					System.out.println("");
					System.out.println("No se aplica ningún descuento");
					System.out.println("");
				break;
				
				case "mitad":
					descuentoPro = (precioConIVA/2);
				break;
				
				case "meno5":
					//Si el precio con IVA es menor o igual que 5
					if(precioConIVA<=5){
						//Mostrar mensaje de no se aplica promocion
						System.out.println("");
						System.out.println("No se puede aplicar este descuento");
						System.out.println("");
					}
					else{ //Sino
						//Aplicar promoción
						descuentoPro = precioConIVA-5;
					} //Fin_Si
				break;
				
				case "5proc":
					descuentoPro = ((5*precioConIVA)/100);
				break;
				
			} //Fin_Segun
			
			//Mostrar base imponible
			System.out.println("Base imponible\t\t " +baseImponible);
			
			//Mostrar IVA
			System.out.println("IVA ("+numIVA+"%)\t\t " +iva);
			
			//Mostrar precio con IVA
			System.out.println("Precio con IVA\t\t " +precioConIVA);
			
			//Mostrar código promocional
			System.out.println("Cód. promo. (" +tipoCodPro +")\t" +"-"+descuentoPro);
			
			//Mostrar precio final
			System.out.println("TOTAL\t\t\t " +(precioConIVA-descuentoPro));
			
		//Fin
		
	}
}

