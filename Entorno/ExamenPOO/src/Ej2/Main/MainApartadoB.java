package Ej2.Main;

import Ej2.Clases.Comensal;
import Ej2.Gestion.GestionEjercicio2;

import java.util.Scanner;

public class MainApartadoB {
	public static void main(String[] args){
		
		//Declaracion de variables
		int contadorAficiones = 0;
		int numeroComensales = 0;
		String aficion = "";
		
		int afinidad1 = 0; //El primer comensal para probar afinidad
		int afinidad2 = 0; //El segundo comensal para probar afinidad
		
		//Inicializaciones
		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);
		
		//Inicio
		//Leer y validar numero de comensales
		do{
			System.out.print("¿Cuántas personas hay sentadas en esta mesa?: ");
			numeroComensales = tecladoN.nextInt();
		}
		while(numeroComensales<=0);
		
		//Crear array de comensales (mesa)
		Comensal[] mesa = new Comensal[numeroComensales];
		
		//Cargar mesa de comensales con valores vacios (para que no de problemas el NULL)
		/*for(Comensal comensal : mesa){
			comensal = new Comensal();
		}*/
		
		for(int i=0; i<=mesa.length-1; i++){
			Comensal comensal = new Comensal();
			mesa[i] = comensal;
		}
		
		//Mostrar lista de aficiones
		System.out.println("La lista de aficiones son: ");
		System.out.println("1: baloncesto");
		System.out.println("2: cine");
		System.out.println("3: futbol");
		System.out.println("4: golf");
		System.out.println("5: lectura");
		System.out.println("6: tenis");
		System.out.println("7: viajes");
		
		System.out.println();
		System.out.println("Recuerde que el numero máximo de aficiones por comensal es: 5");
		
		//Leer aficiones de los comensales
		for(int i=1; i<=mesa.length; i++){
			System.out.println();
			System.out.println("Aficiones del comensal " +i +" (Escriba una palabra y pulse intro, escribe fin para salir):");
			
			for(int j=1; j<=5 && !aficion.equals("fin"); j++){
				System.out.print("Escriba la aficion " +j +" o fin para salir: ");
				aficion = tecladoS.nextLine();
				
				if(!aficion.equals("fin")){
					mesa[i-1].agregarAficion(aficion);
					contadorAficiones++;
				}
			}
			
			aficion = "";
		}
		
		System.out.println();
		if(GestionEjercicio2.cenaAnimada(mesa)){		//La funcion si dice que la cena es animada no la he terminada de sacar, no funciona
			System.out.println("Cena animada :)");
		}
		else{
			System.out.println("Cena no animada :(");
		}
		System.out.println();
		
		//Mostrar numero de aficiones en la mesa
		System.out.println("El numero de aficiones en la mesa es: " +contadorAficiones);
		
		System.out.println();
		
		//Comprobar afinidad entre dos personas
		System.out.println("¿Que personas quieren medir su afinidad?");
		do{
			System.out.print("(Introduzca un número entre 1 y " +numeroComensales +") para el primer comensal: ");
			afinidad1 = tecladoN.nextInt();
		}
		while(afinidad1<=0 || afinidad1>numeroComensales);
		
		do{
			System.out.print("(Introduzca un número entre 1 y " +numeroComensales +") para el segundo comensal: ");
			afinidad2 = tecladoN.nextInt();
		}
		while(afinidad2<=0 || afinidad2>numeroComensales);
		
		System.out.println();
		
		if(mesa[afinidad1-1].equals(mesa[afinidad2-1])){
			System.out.println("AFINIDAD ENCONTRADA DEL 100%");
		}
		else{
			System.out.println("NO SON AFINES");
		}
		
		//Fin
		
	}
}
