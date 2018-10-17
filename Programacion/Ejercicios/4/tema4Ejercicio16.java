/*
 * Nombre: tema4Ejercicio16
 * 
 * Comentario: Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos est� siendo infiel.
 * 				El programa ir� haciendo preguntas que el usuario contestar� con verdadero o falso.
 * 				Cada pregunta contestada como verdadero sumar� 3 puntos.
 * 				Las preguntas contestadas con falso no suman puntos.
 * 				Utiliza el fichero test_infidelidad.txt para obtener las preguntas y las conclusiones del programa.
 * 
 * An�lisis
 * 
 * 		Entradas:
 * 			- char para la respuesta del usuario
 * 
 * 		Salidas: Por pantalla
 * 
 */

/*
1. Tu pareja parece estar m�s inquieta de lo normal sin ning�n motivo aparente.
2. Ha aumentado sus gastos de vestuario
3. Ha perdido el inter�s que mostraba anteriormente por ti
4. Ahora se afeita y se asea con m�s frecuencia (si es hombre) o ahora se arregla el pelo y se asea con m�s frecuencia (si es mujer)
5. No te deja que mires la agenda de su tel�fono m�vil
6. A veces tiene llamadas que dice no querer contestar cuando est�s t� delante
7. �ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a
8. Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s trabajo
9. Has notado que �ltimamente se perfuma m�s
10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo

Puntuaci�n entre 0 y 10:
�Enhorabuena! tu pareja parece ser totalmente fiel.

Puntuaci�n entre 11 y 22:
Quiz�s exista el peligro de otra persona en su vida o en su mente, aunque seguramente ser� algo sin importancia.
No bajes la guardia.

Puntuaci�n entre 22 y 30
Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.
Te aconsejamos que indagues un poco m�s y averig�es que es lo que est� pasando por su cabeza.
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
		
		//Si la puntuaci�n est� entre 0 y 10 (incluidos)
			//Mostrar mensaje
		//Sino
			//Si la puntuaci�n est� entre 11 y 22 (incluidos)
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
			System.out.println("Tu pareja parece estar m�s inquieta de lo normal sin ning�n motivo aparente.");
			System.out.println(" ");
			System.out.print("Responda con una S para S� o con una N para No: ");
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
			System.out.print("Responda con una S para S� o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 3 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 3");
			System.out.println("Ha perdido el inter�s que mostraba anteriormente por ti.");
			System.out.println(" ");
			System.out.print("Responda con una S para S� o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 4 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 4");
			System.out.println("Ahora se afeita y se asea con m�s frecuencia (si es hombre) o ahora se arregla el pelo y se asea con m�s frecuencia (si es mujer).");
			System.out.println(" ");
			System.out.print("Responda con una S para S� o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 5 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 5");
			System.out.println("No te deja que mires la agenda de su tel�fono m�vil.");
			System.out.println(" ");
			System.out.print("Responda con una S para S� o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 6 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 6");
			System.out.println("A veces tiene llamadas que dice no querer contestar cuando est�s t� delante.");
			System.out.println(" ");
			System.out.print("Responda con una S para S� o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 7 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 7");
			System.out.println("�ltimamente se preocupa m�s en cuidar la l�nea y/o estar bronceado/a.");
			System.out.println(" ");
			System.out.print("Responda con una S para S� o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 8 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 8");
			System.out.println("Muchos d�as viene tarde despu�s de trabajar porque dice tener mucho m�s trabajo.");
			System.out.println(" ");
			System.out.print("Responda con una S para S� o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Hacer pregunta 9 y leer respuesta
			System.out.println(" ");
			System.out.println("\tPregunta 9");
			System.out.println("Has notado que �ltimamente se perfuma m�s.");
			System.out.println(" ");
			System.out.print("Responda con una S para S� o con una N para No: ");
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
			System.out.print("Responda con una S para S� o con una N para No: ");
			respuesta = Character.toLowerCase(teclado.next().charAt(0));
			
			//Si es verdad
			if(respuesta=='s'){
				//Sumar 3 puntos
				puntuacion = puntuacion+3;
			}//Fin_Si
			
			//Si la puntuaci�n est� entre 0 y 10 (incluidos)
			if(puntuacion>=0 && puntuacion<=10){
				//Mostrar mensaje
				System.out.println(" ");
				System.out.println("�Enhorabuena! tu pareja parece ser totalmente fiel.");
			}
			else{
				//Si la puntuaci�n est� entre 11 y 22 (incluidos)
				if(puntuacion>=11 && puntuacion<=22){
					//Mostrar mensaje
					System.out.println(" ");
					System.out.println("Quiz�s exista el peligro de otra persona en su vida o en su mente, aunque seguramente ser� algo sin importancia. No bajes la guardia.");
				}
				else{
					//Mostrar mensaje
					System.out.println(" ");
					System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona.");
					System.out.println("Te aconsejamos que indagues un poco m�s y averig�es que es lo que est� pasando por su cabeza.");
				}//Fin_Si
			}//Fin_Si
			
		//Fin
		
	}
}

