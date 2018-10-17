/*
 * Nombre: tema4Ejercicio16
 * 
 * Comentario: Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel.
 * 				El programa irá haciendo preguntas que el usuario contestará con verdadero o falso.
 * 				Cada pregunta contestada como verdadero sumará 3 puntos.
 * 				Las preguntas contestadas con falso no suman puntos.
 * 				Utiliza el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones del programa.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- char para la respuesta del usuario
 * 
 * 		Salidas: Por pantalla
 * 
 */

/*
1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.
2. Ha aumentado sus gastos de vestuario
3. Ha perdido el interés que mostraba anteriormente por ti
4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)
5. No te deja que mires la agenda de su teléfono móvil
6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante
7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo
9. Has notado que últimamente se perfuma más
10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo

Puntuación entre 0 y 10:
¡Enhorabuena! tu pareja parece ser totalmente fiel.

Puntuación entre 11 y 22:
Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia.
No bajes la guardia.

Puntuación entre 22 y 30
Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.
Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.
*/

//PG
	//Inicio
		//Hacer pregunta 1 y leer respuesta
		//Si es verdad
			//Sumar 3 puntos
		//Fin_Si
		
		//Hacer pregunta 2 y leer respuesta
		//Si es verdad
			//Sumar 3 puntos
		//Fin_Si
		
		//Hacer pregunta 3 y leer respuesta
		//Si es verdad
			//Sumar 3 puntos
		//Fin_Si
		
		//Hacer pregunta 4 y leer respuesta
		//Si es verdad
			//Sumar 3 puntos
		//Fin_Si
		
		//Hacer pregunta 5 y leer respuesta
		//Si es verdad
			//Sumar 3 puntos
		//Fin_Si
		
		//Hacer pregunta 6 y leer respuesta
		//Si es verdad
			//Sumar 3 puntos
		//Fin_Si
		
		//Hacer pregunta 7 y leer respuesta
		//Si es verdad
			//Sumar 3 puntos
		//Fin_Si
		
		//Hacer pregunta 8 y leer respuesta
		//Si es verdad
			//Sumar 3 puntos
		//Fin_Si
		
		//Hacer pregunta 9 y leer respuesta
		//Si es verdad
			//Sumar 3 puntos
		//Fin_Si
		
		//Hacer pregunta 10 y leer respuesta
		//Si es verdad
			//Sumar 3 puntos
		//Fin_Si
		
		//Si la puntuación está entre 0 y 10 (incluidos)
			//Mostrar mensaje
		//Sino
			//Si la puntuación está entre 11 y 22 (incluidos)
				//Mostrar mensaje
			//Sino
				//Mostrar mensaje
			//Fin_Si
		//Fin_Si
		
	//Fin

import java.util.Scanner;

public class tema4Ejercicio16 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		char respuesta = ' ';
		int puntuacion = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Hacer pregunta 1 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 1");
			System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
			System.out.println(" ");
			System.out.print("Responda con una S para Sí o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 2 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 2");
			System.out.println("Ha aumentado sus gastos de vestuario.");
			System.out.println(" ");
			System.out.print("Responda con una S para Sí o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 3 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 3");
			System.out.println("Ha perdido el interés que mostraba anteriormente por ti.");
			System.out.println(" ");
			System.out.print("Responda con una S para Sí o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 4 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 4");
			System.out.println("Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
			System.out.println(" ");
			System.out.print("Responda con una S para Sí o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 5 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 5");
			System.out.println("No te deja que mires la agenda de su teléfono móvil.");
			System.out.println(" ");
			System.out.print("Responda con una S para Sí o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 6 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 6");
			System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
			System.out.println(" ");
			System.out.print("Responda con una S para Sí o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 7 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 7");
			System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
			System.out.println(" ");
			System.out.print("Responda con una S para Sí o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 8 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 8");
			System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
			System.out.println(" ");
			System.out.print("Responda con una S para Sí o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 9 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 9");
			System.out.println("Has notado que últimamente se perfuma más.");
			System.out.println(" ");
			System.out.print("Responda con una S para Sí o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 10 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 10");
			System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
			System.out.println(" ");
			System.out.print("Responda con una S para Sí o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Si la puntuación está entre 0 y 10 (incluidos)
			if(puntuacion>=0 && puntuacion<=10){
				//Mostrar mensaje
				System.out.println(" ");
				System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
			}
			else{
				//Si la puntuación está entre 11 y 22 (incluidos)
				if(puntuacion>=11 && puntuacion<=22){
					//Mostrar mensaje
					System.out.println(" ");
					System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
				}
				else{
					//Mostrar mensaje
					System.out.println(" ");
					System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.");
					System.out.println("Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
				}//Fin_Si
			}//Fin_Si
			
		//Fin
		
	}
}

