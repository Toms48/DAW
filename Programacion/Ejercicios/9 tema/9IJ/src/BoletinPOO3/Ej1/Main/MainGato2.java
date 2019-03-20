package BoletinPOO3.Ej1.Main;

import BoletinPOO3.Ej1.Clases.Gato2;
import BoletinPOO3.Ej1.Enums.Sexo;

import java.util.Scanner;

public class MainGato2 {
	public static void main(String[] args){
	
		//Declaracion de variables
		Gato2[] arrayGatos = new Gato2[4];
		
		String nombre = "";
		int edad = 0;
		String raza = "";
		int intSexo = 0;
		Sexo sexo = Sexo.MACHO;
		
		//Inicializaciones
		Scanner tecladoS = new Scanner(System.in);
		Scanner tecladoN = new Scanner(System.in);
		
		//Bucle para introducir los datos de los gatos
		for(int i=0; i<=arrayGatos.length-1; i++){
			System.out.print("Introduzca el nombre del gato numero " +(i+1) +": ");
			nombre = tecladoS.nextLine();
			
			System.out.print("Introduzca la edad del gato: ");
			edad = tecladoN.nextInt();
			
			System.out.print("Introduzca la raza del gato: ");
			raza = tecladoS.nextLine();
			
			System.out.println("\t1. Macho");
			System.out.println("\t2. Hembra");
			System.out.println("\t3. Hermafrosita");
			System.out.print  ("Introduzca el sexo del gato: ");
			intSexo = tecladoN.nextInt();
			
			switch(intSexo){
				case 1:
					sexo = Sexo.MACHO;
					break;
				
				case 2:
					sexo = Sexo.HEMBRA;
					break;
				
				case 3:
					sexo = Sexo.HERMAFRODITA;
					break;
			}
			
			Gato2 gato = new Gato2(sexo, raza, nombre, edad);
			
			arrayGatos[i] = gato;
			
			System.out.println();
		}
		
		//Bucle para mostrar la lista de los gatos
		for(Gato2 gato : arrayGatos){
			System.out.println(gato.toString());
			System.out.println();
		}
	
	}
}
