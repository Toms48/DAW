package BoletinPOO4.Ej14.Main;

import BoletinPOO4.Ej12.Clases.Candidato;
import BoletinPOO4.Ej12.Clases.Votacion;

import java.util.ArrayList;
import java.util.Scanner;

public class PruebaVotacion2 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int votosTotales = 100;
		String nombreCandidato = "";
		int votosAleatorios = 0;
		
		//Inicializaciones
		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);
		
		ArrayList<Candidato> arrayCandidatos = new ArrayList<Candidato>();
		
		
		
		for(int i=0; i<=4; i++){
			System.out.print("Introduzca el nombre del " +(i+1) +" candidato: ");
			nombreCandidato = tecladoS.nextLine();
			
			votosAleatorios = (int)(Math.random()*votosTotales)+0;
			
			votosTotales -= votosAleatorios;
			
			Candidato candidato = new Candidato(nombreCandidato, votosAleatorios);
			
			arrayCandidatos.add(candidato);
		}
		
		System.out.println();
		
		Votacion votacion = new Votacion(arrayCandidatos);
		
		System.out.println("=-=-=-=-= Resultado de las votaciones =-=-=-=-=");
		votacion.votosCandidatos(arrayCandidatos);
		
		System.out.println("=-=-=-=-= Candidato más votado =-=-=-=-=");
		votacion.candidatoMasVotado(arrayCandidatos);
		
	}
}
