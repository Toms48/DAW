/*
 * Nombre: ejercicio3
 * 
 * Comentario:  Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es el árbol más alto.
 * 				Para ello se introducirán por teclado la altura (en centímetros) de cada árbol
 * 				(terminando cuando el usuario escrbis "FIN PROGRAMA").
 * 				Los árboles se identifican mediante etiquetas con números únicos consecutivos, comenzando por 0.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- Un int para la altura del arbol
 * 			- String para la respuesta del usuario
 * 			(pone que sale solo cuando sea "FIN PROGRAMA" pero yo he puesto que también sale si lo escribe en minuscula "fin programa")
 * 
 * 		Salidas: Por pantalla
 * 
 * 		Requisito: La altura del arbol no puede ser negativa
 * 
 */

//PG
	//Inicio
		//Hacer
			//Leer y validar altura del arbol
			
			//Si el arbol es más alto que la altura maxima registrada
				//Actualizar altura máxima registrada
				//Actualizar id del arbol más grande
			//Fin_Si
			
			//Actualizar id
			
			//Preguntar para salir (y no introducir más árboles en el programa)
		//Mientras respuesta no sea "FIN PROGRAMA"
		
		//Mostrar el arbol mas alto
		//Mostrar etiqueta (o el número identificativo que tiene)
		
	//Fin

import java.util.Scanner;

public class ejercicio3 {
	
	public static void main (String[] args) {
		
		//Declaración de variables
		int altura = 0;
		String respuesta = "";
		
		int id = 0;
		int alturaMax = 0;
		int idMaxAltura = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Hacer
			do{
				//Leer y validar altura del arbol
				do{
					System.out.print("Altura del arbol (" +id +") en cm: ");
					altura = teclado.nextInt();
					
					if(altura<0){
						System.out.println("La altura debe de ser un numero positivo.");
						System.out.println(" ");
					}
				}
				while(altura<0);
				
				//Si el árbol es más alto que la altura maxima registrada
				if(altura>alturaMax){
					//Actualizar altura máxima registrada
					alturaMax = altura;
					
					//Actualizar id del arbol más grande
					idMaxAltura = id;
					
				}//Fin_Si
				
				//Actualizar id
				id++; 
				
				teclado.nextLine(); //Esta linea sirve para que no me salte la lectura de la respuesta después de leerla una vez
				
				//Preguntar y leer respuesta para salir (y no introducir más árboles en el programa)
				System.out.println(" ");
				System.out.print("Quiere salir? (Escriba: FIN PROGRAMA): ");
				respuesta = teclado.nextLine();
				System.out.println(" ");
			}
			//Mientras respuesta no sea "FIN PROGRAMA"
			while(respuesta.toUpperCase().equals("FIN PROGRAMA")==false);
			
			//Mostrar el arbol mas alto
			System.out.println(" ");
			System.out.println("El arbol mas alto mide: " +alturaMax +"cm");
			
			//Mostrar etiqueta (o el número identificativo que tiene)
			System.out.println("Corresponde al arbol con etiqueta: " +idMaxAltura);
			
		//Fin
		
	}
}

