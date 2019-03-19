package BoletinPOO4.Ej13.Main;

import java.util.Scanner;
import java.lang.Math;

import BoletinPOO4.Ej13.Clases.Planeta;

public class PruebaPlaneta2 {
	public static void main(String[] args){
		
		//Declaraciones devaraibles
		String nombrePlaneta = "";
		int rotacion = 0;
		int traslacion = 0;
		
		//Inicializaciones
		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);
		
		Planeta[] arrayPlanetas = new Planeta[5];
		
		for(int i=0; i<=4; i++){
			System.out.print("Introduzca el nombre del planeta " +(i+1) +": ");
			nombrePlaneta = tecladoS.nextLine();
			
			rotacion = (int)(Math.random()*5000)+2000;
			traslacion = (int)(Math.random()*5000)+2000;
			
			Planeta planeta = new Planeta(nombrePlaneta, rotacion, traslacion);
			
			arrayPlanetas[i] = planeta;
		}
		
		System.out.println();
		
		System.out.println("=-=-=-=-= Descripcion de los planetas =-=-=-=-=");
		for(Planeta planeta : arrayPlanetas){
			System.out.println(planeta.toString());
			System.out.println();
		}
	
	}
}
