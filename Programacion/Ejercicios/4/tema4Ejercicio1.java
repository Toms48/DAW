/*
 * Nombre: tema4Ejercicio1
 * 
 * Comentario: Escribe un programa que pida por teclado un día de la semana y que diga
 * 				qué asignatura toca a primera hora ese día
 * 
 * Análisis: 
 * 		Entrada: Un String para el dia de la semana
 * 		Salida: Por pantalla 
 */
 
 import java.util.Scanner;

public class tema4Ejercicio1 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		String diaSemana = "";
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un dia de la semana: ");
		diaSemana = teclado.next();
		
		switch(diaSemana.toLowerCase()){
			case "lunes":
				System.out.println("La primero hora del Lunes es SI");
			break;
			
			case "martes":
				System.out.println("La primero hora del Martes es Programacion");
			break;
			
			case "miercoles":
				System.out.println("La primero hora del Miercoles es Programacion");
			break;
			
			case "jueves":
				System.out.println("La primero hora del Jueves es FOL");
			break;
			
			case "viernes":
				System.out.println("La primero hora del Viernes es Programacion");
			break;
			
			case "sabado":
				System.out.println("Yo no se tú pero yo no voy a venir a las 8 de la mañana un Sabado ¯/_(´-´)_/¯");
			break;
			
			case "domingo":
				System.out.println("Tienes mucha fe de que me plante a primera hora un Domingo ¯/_('-')_/¯");
			break;
		}
		
		/*if(diaSemana.toLowerCase().equals("lunes")){
			System.out.println("La primero hora del Lunes es SI");
		}
		else{
			if(diaSemana.toLowerCase().equals("martes")){
				System.out.println("La primero hora del Martes es Programacion");
			}
			else{
				if(diaSemana.toLowerCase().equals("miercoles")){
					System.out.println("La primero hora del Miercoles es Programacion");
				}
				else{
					if(diaSemana.toLowerCase().equals("jueves")){
						System.out.println("La primero hora del Jueves es FOL");
					}
					else{
						if(diaSemana.toLowerCase().equals("viernes")){
							System.out.println("La primero hora del Viernes es Programacion");
						}
						else{
							if(diaSemana.toLowerCase().equals("sabado")){
								System.out.println("Yo no se tú pero yo no voy a venir a las 8 de la mañana un Sabado ¯/_(´-´)_/¯");
							}
							else{
								System.out.println("Tienes mucha fe de que me plante a primera hora un Domingo ¯/_('-')_/¯");
							}
						}
					}
				}
			}
		}*/
		
	}
}

