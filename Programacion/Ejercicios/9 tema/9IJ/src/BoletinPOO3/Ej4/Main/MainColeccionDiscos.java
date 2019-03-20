package BoletinPOO3.Ej4.Main;

import BoletinPOO3.Ej3.Clases.Disco;

import java.util.ArrayList;
import java.util.Scanner;

public class MainColeccionDiscos {
	
	public static void mostrarMenu(){
		System.out.println("\n\nCOLECCIÓN DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.print("Introduzca una opción: ");
	}
	
	public static void main(String[] args){
		
		//Declaración de variables
		int opcionMenu = 0;
		
		String codigoABuscar = "";
		boolean encontrado = false;
		
		int codigoInt = 1;
		String codigo = "";
		String autor = "";
		String titulo = "";
		String genero = "";
		int duracion = 0;
		
		//Inicializaciones
		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);
		
		ArrayList<Disco> arrayDiscos = new ArrayList<Disco>();
		
		//Inicio
		//Hacer
		do {
			//mostrarMenu, leer y validar opcion
			do {
				mostrarMenu();
				opcionMenu = tecladoN.nextInt();
			}
			while (opcionMenu < 1 || opcionMenu > 5);
			
			System.out.println();
			
			//Segun la opcion del menu
			switch (opcionMenu) {
				case 1:
					System.out.println("      Listado      ");
					System.out.println("===================");
					if (arrayDiscos.isEmpty()) {
						System.out.println("\nLa lista está vacía");
					} else {
						for (Disco disco : arrayDiscos) {
							System.out.println(disco.toString());
						}
					}
					break;
				
				case 2:
					System.out.println("      Nuevo disco      ");
					System.out.println("=======================");
					
					if(arrayDiscos.size() == 5){
						System.out.println("No se permitirá introducir los datos de ningún disco hasta que no se borre alguno de la lista.");
					}
					else{
						codigo = Integer.toString(codigoInt);
						
						System.out.print("Introduzca el autor: ");
						autor = tecladoS.nextLine();
						
						System.out.print("Introduzca el titulo: ");
						titulo = tecladoS.nextLine();
						
						System.out.print("Introduzca el genero: ");
						genero = tecladoS.nextLine();
						
						System.out.print("Introduzca la duracion (en minutos): ");
						duracion = tecladoN.nextInt();
						
						arrayDiscos.add(new Disco(codigo, autor, titulo, genero, duracion));
						
						codigoInt++;
					}
					break;
				
				case 3:
					System.out.println("      Modificar disco      ");
					System.out.println("===========================");
					
					System.out.print("Introduzca el codigo del disco que quiere modificar: ");
					codigoABuscar = tecladoS.nextLine();
					
					for (int i = 0; i <= arrayDiscos.size() - 1 && encontrado == false; i++) {
						if (arrayDiscos.get(i).getCodigo().equals(codigoABuscar)) {
							encontrado = true;
							
							System.out.println("Autor: " + arrayDiscos.get(i).getAutor());
							System.out.print("Introduzca el nuevo autor: ");
							autor = tecladoS.nextLine();
							
							System.out.println();
							
							System.out.println("Titulo: " + arrayDiscos.get(i).getTitulo());
							System.out.print("Introduzca el nuevo titulo: ");
							titulo = tecladoS.nextLine();
							
							System.out.println();
							
							System.out.println("Genero: " + arrayDiscos.get(i).getGenero());
							System.out.print("Introduzca el nuevo genero: ");
							genero = tecladoS.nextLine();
							
							System.out.println();
							
							System.out.println("Duracion: " + arrayDiscos.get(i).getDuracion());
							System.out.print("Introduzca la nueva duracion (en minutos): ");
							duracion = tecladoN.nextInt();
							
							arrayDiscos.set(i, new Disco(codigo, autor, titulo, genero, duracion));
						}
					}
					
					break;
				
				case 4:
					System.out.println("      Borrar disco      ");
					System.out.println("========================");
					
					do{
						System.out.print("Introduzca el codigo del disco que quiere eliminar: ");
						codigoABuscar = tecladoS.nextLine();
						
						for (int i = 0; i <= arrayDiscos.size() - 1 && encontrado == false; i++) {
							if (arrayDiscos.get(i).getCodigo().equals(codigoABuscar)) {
								encontrado = true;
								arrayDiscos.remove(i);
								System.out.println("\nSe ha borrado el elemento seleccionado");
							}
						}
						
						if(encontrado == false){
							System.out.println("\nNo se ha encontrado el disco con el codigo escrito.\n");
						}
						
					}
					while(encontrado==false);
					
					encontrado = false;
					break;
			}
			//Fin_Segun
		}
		while(opcionMenu != 5);	//Mientras la opcion no sea salir
		
		System.out.println("Ashta luego!");
		
		//Fin
		
	}
}
