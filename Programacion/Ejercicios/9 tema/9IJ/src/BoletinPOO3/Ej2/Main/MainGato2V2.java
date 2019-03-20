package BoletinPOO3.Ej2.Main;

import BoletinPOO3.Ej1.Clases.Gato2;
import BoletinPOO3.Ej1.Enums.Sexo;

import java.util.Scanner;

public class MainGato2V2 {
	public static void main(String[] args){
		
		//Declaracion de variables
		Gato2[] arrayGatos = new Gato2[4];
		
		arrayGatos[0] = new Gato2(Sexo.HEMBRA, "Siames cruzado", "Gorda", 3);
		arrayGatos[1] = new Gato2(Sexo.MACHO, "Tigre", "Mufasa", 2);
		arrayGatos[2] = new Gato2(Sexo.MACHO, "Tigre", "Simba", 2);
		arrayGatos[3] = new Gato2(Sexo.HERMAFRODITA, "Panteresado", "Casetero", 3);
		
		//Inicializaciones
		
		//Bucle para mostrar la lista de los gatos
		for(Gato2 gato : arrayGatos){
			System.out.println(gato.toString());
			System.out.println();
		}
	
	}
}
