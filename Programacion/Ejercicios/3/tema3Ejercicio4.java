/*
 * Nombre: tema3Ejercicio4
 * 
 * Comentario: Escribe un programa que sume, reste, multiplique y divida dos números
				introducidos por teclado.
 * 
 * Análisis: 
 * 		- Entradas: dos doubles
 * 		- Salidas: Salida por pantalla
 * 
 */
 
//PS
	//Inicio
		//Preguntar primer numero
		//Leer primer numero
		//Preguntar segundo numero
		//Leer segundo numero
		//Calcular la suma
		//Calcular la resta
		//Calcular la multiplicacion
		//Calcular la divicion
		//Mostrar por pantalla la suma, la resta, la multiplicacion y la divicion
	//Fin

import java.util.Scanner;

public class tema3Ejercicio4 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		double num1 = 0.0;
		double num2 = 0.0;
		
		double suma = 0.0;
		double resta = 0.0;
		double multi = 0.0;
		double div = 0.0;
		
		//Inicializacion
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar primer numero
			System.out.print("Introduzca su primer numero: ");
			
			//Leer primer numero
			num1 = teclado.nextDouble();
			
			//Preguntar primer numero
			System.out.print("Introduzca su segundo numero: ");
			
			//Leer primer numero
			num2 = teclado.nextDouble();
			
			//Calcular la suma
			suma = num1+num2;
			
			//Calcular la resta
			resta = num1-num2;
			
			//Calcular la multiplicacion
			multi = num1*num2;
			
			//Calcular la divicion
			div = num1/num2;
			
			System.out.println(" ");
			
			//Mostrar por pantalla la suma, la resta, la multiplicacion y la divicion
			System.out.println("Suma: " +suma);
			System.out.println("Resta: " +resta);
			System.out.println("Multiplicacion: " +multi);
			System.out.println("Divicion: " +div);
			
		//Fin
		
	}
}

