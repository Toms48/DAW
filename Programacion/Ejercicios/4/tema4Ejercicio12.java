/*
 * Nombre: tema4Ejercicio12
 * 
 * Comentario:  Realiza un minicuestionario con 4 preguntas tipo test sobre las asignaturas que se imparten en el curso.
 * 				Cada pregunta acertada sumará un punto.
 * 				El programa mostrará al final la calificación obtenida.
 * 				Pásale el minicuestionario a tus compañeros y
 * 				pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
 * 
 * Análisis
 * 		Entradas: respuesta
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Incio
		//Mostrar pregunta 1 y respuestas
		//Leer respuesta
		//Si es correcta
			//Puntuacion + 1
		//Fin_Si
		
		//Mostrar pregunta 2 y respuestas
		//Leer respuesta
		//Si es correcta
			//Puntuacion + 1
		//Fin_Si
		
		//Mostrar pregunta 3 y respuestas
		//Leer respuesta
		//Si es correcta
			//Puntuacion + 1
		//Fin_Si
		
		//Mostrar pregunta 4 y respuestas
		//Leer respuesta
		//Si es correcta
			//Puntuacion + 1
		//Fin_Si
		
		//Según puntuacion
			//caso 0
			//caso 1
			//caso 2
			//caso 3
			//caso 4
		//Fin_Según
		
	//Fin

import java.util.Scanner;

public class tema4Ejercicio12 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		int respuesta = 0;
		int puntuacion = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Incio
			//Mostrar pregunta 1 y respuestas
			System.out.println("\tPregunta 1");
			System.out.println("¿Qué opción está bien escrita?");
			System.out.println(" ");
			System.out.println("1) system.out.println(\"Hola Mundo!\");");
			System.out.println("2) System.out.print(\"Hola Mundo!\")");
			System.out.println("3) System.out.print(Hola Mundo!)");
			System.out.println("4) Ninguna de las anteriores es correcta");
			
			//Leer respuesta
			System.out.print("Su respuesta es: ");
			respuesta = teclado.nextInt();
			
			//Si es correcta
			if(respuesta == 4){
				//Puntuacion + 1
				puntuacion++;
			}
			//Fin_Si
			
			System.out.println(" ");
			
			//Mostrar pregunta 2 y respuestas
			System.out.println("\tPregunta 2");
			System.out.println("¿Las dos asignaciones están correctamente escritas?");
			System.out.println(" ");
			System.out.println("double decimal1 = 0.0;");
			System.out.println("double decimal2 = 0;");
			System.out.println(" ");
			System.out.println("1) Sí");
			System.out.println("2) No");
			System.out.println("3) Solo es correcta la primera");
			System.out.println("4) Solo es correcta la segunda");
			
			//Leer respuesta
			System.out.print("Su respuesta es: ");
			respuesta = teclado.nextInt();
			
			//Si es correcta
			if(respuesta == 1){
				//Puntuacion + 1
				puntuacion++;
			}
			//Fin_Si
			
			System.out.println(" ");
			
			//Mostrar pregunta 3 y respuestas
			System.out.println("\tPregunta 3");
			System.out.println("¿Se puede utilizar la funcionalidad .next de Scanner para leer un número?");
			System.out.println(" ");
			System.out.println("1) Sí, pero no puedo operar con él");
			System.out.println("2) Sí y encima puedo operar con él porque Scanner es ma-ra-vi-llo-so.");
			System.out.println("3) Sí y punto");
			System.out.println("4) Todas las respuestas son correctas");
			
			//Leer respuesta
			System.out.print("Su respuesta es: ");
			respuesta = teclado.nextInt();
			
			//Si es correcta
			if(respuesta == 1){
				//Puntuacion + 1
				puntuacion++;
			}
			//Fin_Si
			
			System.out.println(" ");
			
			//Mostrar pregunta 4 y respuestas
			System.out.println("\tPregunta 4");
			System.out.println("El if se utiliza para muchas condiciones y el switch para pocos casos");
			System.out.println(" ");
			System.out.println("1) Verdad tio, ese if poderoso que circula por la siudá");
			System.out.println("2) Falso, a mi no me vengas con tonterías eh");
			
			//Leer respuesta
			System.out.print("Su respuesta es: ");
			respuesta = teclado.nextInt();
			
			if(respuesta == 2){
				//Puntuacion + 1
				puntuacion++;
			}
			
			System.out.println(" ");
			
			//Según puntuacion
			switch(puntuacion){
				case 0:
					System.out.println("No has acertado ni una pregunta...");
				break;
				
				case 1:
					System.out.println("Solo has acertado una pregunta, estás más suspenso que yokc, pero menos da una piedra");
				break;
				
				case 2:
					System.out.println("Dos preguntas acertadas, espero que no creas que es como un 5, porque estás suspenso ¯/_('-')_/¯");
				break;
				
				case 3:
					System.out.println("Ea, aprobado por la mínima, tres preguntas acertadas, buen trabajo");
				break;
				
				case 4:
					System.out.println("¡Enhorabuena! Has acertado todas las preguntas");
				break;
			}
			//Fin_Según
			
		//Fin
		
	}
}

