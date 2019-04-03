package Ej2.Main;

import Ej2.Clases.Comensal;

import java.util.Scanner;

public class MainApartadoA {
	public static void main(String[] args){
		
		//Declaracion de variables
		int contadorAficiones = 0;
		int numeroComensales = 0;
		String aficion = "";
		
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
		for(Comensal comensal : mesa){
			comensal = new Comensal();
		}
		
		System.out.println();
		System.out.println("Recuerde que el numero máximo de aficiones por comensal es: 5");
		
		//Leer aficiones de los comensales
		for(int i=1; i<=mesa.length; i++){
			System.out.println();
			System.out.println("Aficiones del comensal " +i +" (Escriba una palabra y pulse intro, escribe fin para salir):");
			
			for(int j=1; j<=5 && !aficion.equals("fin"); j++){
				System.out.print("Escriba la aficion " +j +" o fin para salir: ");
				aficion = tecladoS.nextLine();
				
				//mesa[j-1].agregarAficion(aficion);
				
				if(!aficion.equals("fin")){
					contadorAficiones++;
				}
			}
			
			aficion = "";
		}
		
		System.out.println();
		System.out.println("Cena no animada");
		System.out.println();
		
		//Mostrar numero de aficiones en la mesa
		System.out.println("El numero de aficiones en la mesa es: " +contadorAficiones);
		
		//Fin
		
	}
}
