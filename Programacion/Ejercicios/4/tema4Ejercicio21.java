/*
 * Nombre: tema4Ejercicio21
 * 
 * Comentario: Calcula la media del primer trimestre de programación
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- double para la primera nota
 * 			- double para la segunda nota
 * 			- String para la recuperación
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer las notas de los examenes
		//Calcular media de las notas
		//Si la media es mayor o igual que 5
			//Mostrar las notas  y su media (o nota final)
		//Sino
			//Preguntar y leer por el examen de recuperación
			//Si en la recuperación tiene apto
				//Mostrar notas y nota final (5)
			//Sino
				//Mostrar notas y la media (o nota final)
			//Fin_Si
		//Fin_Si
	//Fin
	
import java.util.Scanner;

public class tema4Ejercicio21 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		double nota1 = 0;
		double nota2 = 0;
		double media = 0.0;
		
		String recup = "";
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Preguntar y leer las notas de los examenes
			System.out.print("Nota del primer control: ");
			nota1 = teclado.nextDouble();
			
			System.out.print("Nota del segundo control: ");
			nota2 = teclado.nextDouble();
			
			//Calcular media de las notas
			media = ((nota1+nota2)/2);
			
			//Si la media es mayor o igual que 5
			if(media>=5){
				//Mostrar media (o nota final)
				System.out.println("Tu nota de Programacion es " +media);
			}
			else{
				//Preguntar y leer por el examen de recuperación
				System.out.print("Cual ha sido el resultado de la recuperacion? (apto/no apto): ");
				
				teclado.nextLine(); //Esta lía es para vaciar el buffer de .nextLine para que al utilizarlo para leer la recuperación no nos salte la lectura
				
				recup = teclado.nextLine();
				
				//Si en la recuperación tiene apto
				if(recup.equals("apto")){
					//Mostrar nota final (5)
					System.out.println("Tu nota de Programacion es 5");
				}
				else{
					//Mostrar media (o nota final)
					System.out.println("Tu nota de Programacion es " +media);
				}//Fin_Si
			}//Fin_Si
		//Fin
		
	}
}

