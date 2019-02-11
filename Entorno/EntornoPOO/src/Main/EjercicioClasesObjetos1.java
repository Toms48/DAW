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
		Persona[] arrayPersonas = new Persona[3];

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
		for(int i=0; i<=2; i++) {

			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("|       Lectura de la persona numero  " +(i+1) +"       |");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

			//Leer nombre
			System.out.print("\tIntroduzca su nombre: ");
			nombre = tecladoS.nextLine();
			
			//Leer apellidos
			System.out.print("\tIntroduzca sus apellidos: ");
			apellidos = tecladoS.nextLine();
			
			Persona personaI = new Persona(nombre,apellidos);
			
			//Leer edad
			System.out.print("\tIntroduzca su edad: ");
			personaI.setEdad(tecladoN.nextInt());
			
			//Leer y validar sexo
			System.out.print("\tIntroduzca 'H' para hombre o 'M' para mujer\n\t(se asignará por defecto 'H' si el caracter no es correcto): ");
			personaI.setSexo(Character.toLowerCase(tecladoN.next().charAt(0)));
			System.out.print("\t"); personaI.comprobarSexo();
			
			//Leer peso
			System.out.print("\tIntroduzca su peso en kg: ");
			personaI.setPeso(tecladoN.nextDouble());
			
			//Leer altura
			System.out.print("\tIntroduzca su altura en m: ");
			personaI.setAltura(tecladoN.nextDouble());

			arrayPersonas[i] = personaI;

			System.out.println();

		}//Fin_Para
		
		//Indicar categoria del peso segun su IMC
		for(Persona persona:arrayPersonas){
			if(persona.calcularIMC() == 0){
				System.out.println(persona.getNombre() +" " +persona.getApellidos() +" estás en tu peso ideal");
			}
			else{
				if(persona.calcularIMC() == -1){
					System.out.println(persona.getNombre() +" " +persona.getApellidos() +" estás por debajo de tu peso ideal");
				}
				else{
					System.out.println(persona.getNombre() +" " +persona.getApellidos() +" estás por encima de tu peso ideal");
				}
			}

		}

		System.out.println();

		//Indicar si son mayores de edad
		for(Persona persona:arrayPersonas){
			if(persona.esMayorDeEdad() == true){
				System.out.println(persona.getNombre() +" " +persona.getApellidos() +" es mayor de edad.");
			}
			else{
				System.out.println(persona.getNombre() +" " +persona.getApellidos() +" NO es mayor de edad.");
			}
		}

		//Mostrar toda la informacion del objeto
		for(Persona persona:arrayPersonas){
			System.out.println();

			System.out.print(persona.toString());
		}

		//Fin
		
	}
}
