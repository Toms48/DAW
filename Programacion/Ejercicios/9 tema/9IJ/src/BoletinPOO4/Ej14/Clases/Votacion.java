/* Nombre: Votacion
 *
 * Básicas:
 * 		- numeroVotosTotales => int => Consultable y Modificable
 *		- arrayCandidatos => ArrayList => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO4.Ej14.Clases;

import java.util.ArrayList;

public class Votacion{
	
	//Atributos
	private static int numeroVotosTotales;
	private ArrayList<Candidato> arrayCandidatos = new ArrayList<Candidato>();
	
	//Constructor con parámetros
	public Votacion(ArrayList<Candidato> arrayCandidatos){
		this.arrayCandidatos = arrayCandidatos;
		votosTotales(arrayCandidatos);
	}
	
	//Gets
	public static int getNumeroVotosTotales() {
		return numeroVotosTotales;
	}
	
	public ArrayList<Candidato> getArrayCandidatos() {
		return arrayCandidatos;
	}
	
	//Sets
	public static void setNumeroVotosTotales(int numeroVotosTotales) {
		Votacion.numeroVotosTotales = numeroVotosTotales;
	}
	
	public void setArrayCandidatos(ArrayList<Candidato> arrayCandidatos) {
		this.arrayCandidatos = arrayCandidatos;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "";
		
		return s;
	}
	
	//Métos añadidos
	private void votosTotales(ArrayList<Candidato> arrayCandidatos){
		for(Candidato candidato : arrayCandidatos){
			setNumeroVotosTotales(numeroVotosTotales + candidato.getNumeroVotos());
		}
	}
	
	public void votosCandidatos(ArrayList<Candidato> arrayCandidatos){
		for(Candidato candidato : arrayCandidatos){
			System.out.println(candidato.toString());
			System.out.println();
		}
	}
	
	public void candidatoMasVotado(ArrayList<Candidato> arrayCandidatos){
		
		int maxVotos = 0;
		Candidato candidatoMaxVotos = new Candidato();
		
		for(Candidato candidato : arrayCandidatos){
			if(candidato.getNumeroVotos() > maxVotos){
				maxVotos = candidato.getNumeroVotos();
				candidatoMaxVotos = candidato;
			}
		}
		
		System.out.println("EL primer candidato más votado, con " +maxVotos +" votos es: " +candidatoMaxVotos.getNombre());
	}
	
}
