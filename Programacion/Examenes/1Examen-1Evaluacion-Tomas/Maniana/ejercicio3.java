/*
 * Nombre: ejercicio3
 * 
 * Comentario:  Un centro de investigaci�n de la flora urbana necesita una aplicaci�n que muestre cu�l es el �rbol m�s alto.
 * 				Para ello se introducir�n por teclado la altura (en cent�metros) de cada �rbol
 * 				(terminando cuando el usuario escrbis "FIN PROGRAMA").
 * 				Los �rboles se identifican mediante etiquetas con n�meros �nicos consecutivos, comenzando por 0.
 * 
 * An�lisis
 * 
 * 		Entradas:
 * 			- Un int para la altura del arbol
 * 			- String para la respuesta del usuario
 * 			(pone que sale solo cuando sea "FIN PROGRAMA" pero yo he puesto que tambi�n sale si lo escribe en minuscula "fin programa")
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
			
			//Si el arbol es m�s alto que la altura maxima registrada
				//Actualizar altura m�xima registrada
				//Actualizar id del arbol m�s grande
			//Fin_Si
			
			//Actualizar id
			
			//Preguntar para salir (y no introducir m�s �rboles en el programa)
		//Mientras respuesta no sea "FIN PROGRAMA"
		
		//Mostrar el arbol mas alto
		//Mostrar etiqueta (o el n�mero identificativo que tiene)
		
	//Fin

import java.util.Scanner;

public class ejercicio3 {
	
	public static void main (String[] args) {
		
		//Declaraci�n de variables
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
				
				//Si el �rbol es m�s alto que la altura maxima registrada
				if(altura>alturaMax){
					//Actualizar altura m�xima registrada
					alturaMax = altura;
					
					//Actualizar id del arbol m�s grande
					idMaxAltura = id;
					
				}//Fin_Si
				
				//Actualizar id
				id++; 
				
				teclado.nextLine(); //Esta linea sirve para que no me salte la lectura de la respuesta despu�s de leerla una vez
				
				//Preguntar y leer respuesta para salir (y no introducir m�s �rboles en el programa)
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
			
			//Mostrar etiqueta (o el n�mero identificativo que tiene)
			System.out.println("Corresponde al arbol con etiqueta: " +idMaxAltura);
			
		//Fin
		
	}
}

