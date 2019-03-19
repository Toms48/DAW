package BoletinPOO4.Ej12.Main;

import BoletinPOO4.Ej12.Clases.Candidato;
import BoletinPOO4.Ej12.Clases.Votacion;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class PruebaVotacion {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int numeroCandidatos = 0;
		String nombreCandidato = "";
		int votosAleatorios = 0;
		
		//Inicializaciones
		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);
		
		ArrayList<Candidato> arrayCandidatos = new ArrayList<Candidato>();
		
		
		
		System.out.println("Cuantos candidatos hay?");
		System.out.print  ("Numero de candidatos: ");
		numeroCandidatos = tecladoN.nextInt();
		
		System.out.println();
		
		for(int i=0; i<=numeroCandidatos-1; i++){
			System.out.print("Introduzca el nombre del " +(i+1) +" candidato: ");
			nombreCandidato = tecladoS.nextLine();
			
			votosAleatorios = (int)(Math.random()*500)+0;
			
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
