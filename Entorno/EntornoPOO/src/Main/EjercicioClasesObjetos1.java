/*
 *   Nombre: EjercicioClasesObjetos1
 *
 *   Comentario:	Crea 3 objetos de la clase persona pidiendo por teclado el nombre, apellidos, la edad, sexo, peso y altura.
 *
 *   				- Para cada objeto, deberá comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
 *   				- Indicar para cada objeto si es mayor de edad.
 *   				- Por último, mostrar toda la información de cada objeto.
 *
 *   Análisis:
 *
 *       Entradas:
 *       	- Un String para el/los nombre
 *       	- Un String para el/los apellidos
 *       	- Un int para la edad
 *       	- Un char para el sexo
 *       	- Un double para el peso
 *       	- Un double para la altura
 *
 *       Salidas: Por pantalla
 *
 * */

/*
//PG
	//Inicio
		//Para contador == 1, mientras sea menor o igual que 3, aumenta contador
			//Leer nombre
			//Leer apellidos
			//Leer edad
			//Leer y validar sexo
			//Leer peso
			//Leer altura
		//Fin_Para
		//Indicar categoria del peso segun su IMC
		//Indicar si son mayores de edad
		//Mostrar toda la informacion del objeto
	//Fin
*/

package Main;

import java.util.Scanner;
import Clases.Persona;

public class EjercicioClasesObjetos1 {
	public static void main(String[] args){
		
		//Declaración de variables
		String nombre = new String();
		String apellidos = new String();
		
		int edad = 0;
		
		double peso = 0;
		double altura = 0;
		
		char sexo = ' ';
		
		//Inicializaciones
		Scanner tecladoS = new Scanner(System.in);
		Scanner tecladoN = new Scanner(System.in);
		
		//Inicio
		//Para contador == 1, mientras sea menor o igual que 3, aumenta contador
		for(int i=1; i<=3; i++) {
			String personaXPersona = "persona"+i;
			
			//Leer nombre
			System.out.print("Introduzca su nombre: ");
			nombre = tecladoS.nextLine();
			
			//Leer apellidos
			System.out.print("");
			apellidos = tecladoS.nextLine();
			
			Persona persona1 = new Persona(nombre,apellidos);
			
			//Leer edad
			System.out.print("");
			edad = tecladoN.nextInt();
			
			//Leer y validar sexo
			System.out.print("");
			sexo = tecladoS.next();
			
			//Leer peso
			System.out.print("");
			peso = tecladoN.nextDouble();
			
			//Leer altura
			System.out.print("");
			altura = tecladoN.nextDouble();
			
			
		}//Fin_Para
		
		//Indicar categoria del peso segun su IMC
		System.out.println();
		
		//Indicar si son mayores de edad
		//Mostrar toda la informacion del objeto
		//Fin
		
	}
}
