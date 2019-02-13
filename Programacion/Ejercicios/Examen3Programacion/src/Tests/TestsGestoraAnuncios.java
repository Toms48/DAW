package Tests;

import Gestora.GestoraAnuncios;

public class TestsGestoraAnuncios {
	public static void main(String[] args){
		
		//Tests arrayMarcas
		System.out.println("=-=-=-= Tests arrayMarcas =-=-=-=");
		String[] arrayAnunciantes = GestoraAnuncios.gestionarMarcas();
		
		System.out.println();
		
		for(String marca : arrayAnunciantes){
			System.out.println(marca);
		}
		
		//Tests mostrarMenu
		System.out.println("=-=-=-= Tests mostrarMenu =-=-=-=");
		GestoraAnuncios.mostrarMenu();
		
	}
}
