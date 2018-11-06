/*
 * Nombre: tema2Ejercicio5
 * 
 * Comentario: Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
				convertir deberá estar almacenada en una variable.
 * 
 */

import java.text.DecimalFormat;
import java.lang.*;
import java.util.*;

public class tema2Ejercicio5 {
	
	public static void main (String[] args) {
		
		//Declaraciones de variables
		double euroConstante = 1.0;
		double pesetaConstante = 166.0;
		
		double euro = 0.0;
		double peseta = 1000.0;
		
		//Inicializaciones
		//DecimalFormat truncador = new DecimalFormat("#0.00");
		
		//System.out.println(peseta +" peseta/s es en esuro/s: " + truncador.format(((peseta*euroConstante)/pesetaConstante)) );
		euro = (peseta*euroConstante)/pesetaConstante;
		
		System.out.println(peseta +" peseta/s es en euro/s: " +Math.round((euro*100)/100));
		
	}
}

