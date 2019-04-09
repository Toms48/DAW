package Ej6.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEj6 {
	public static void main(String[] args){
		
		//Declaraciones de varaibles
		Integer contrasenia = 0;
		
		int opcionNombre = 0;
		boolean entrada = false;
		
		Integer valor = 0;
		
		//Inicializaciones
		Scanner tecladoN = new Scanner(System.in);
		
		HashMap<String, Integer> contrasenias = new HashMap<>();
		
		contrasenias.put("Tomas", 123);
		contrasenias.put("Jorge", 234);
		contrasenias.put("Sefran", 345);
		contrasenias.put("Ezhor", 456);
		
		do{
			System.out.println("LISTADO DE ADMINISTRADORES");
			System.out.println("1. Tomás");
			System.out.println("2. Jorge");
			System.out.println("3. Sefran");
			System.out.println("4. Ezhor");
			System.out.print  ("Su opcion es: ");
			opcionNombre = tecladoN.nextInt();
		}
		while(opcionNombre<=0 || opcionNombre>4);
		
		System.out.print("Introduzca la contraseña: ");
		contrasenia = tecladoN.nextInt();
		
		switch (opcionNombre){
			case 1:
				for (Map.Entry pareja : contrasenias.entrySet()) {
					if(pareja.getKey().equals("Tomas") && pareja.getValue() == contrasenia){
						entrada = true;
					}
				}
				break;
				
			case 2:
				for (Map.Entry pareja : contrasenias.entrySet()) {
					if(pareja.getKey().equals("Jorge") && pareja.getValue() == contrasenia){
						entrada = true;
					}
				}
				break;
				
			case 3:
				for (Map.Entry pareja : contrasenias.entrySet()) {
					if(pareja.getKey().equals("Sefran") && pareja.getValue() == contrasenia){
						entrada = true;
					}
				}
				break;
				
			case 4:
				for (Map.Entry pareja : contrasenias.entrySet()) {
					if(pareja.getKey().equals("Ezhor") && pareja.getValue() == contrasenia){
						entrada = true;
					}
				}
				break;
		}
		
		if(entrada){
			System.out.println("\nHa accedido al área restringida");
		}
		else{
			System.out.println("\nLo siento, no tiene acceso al área restringida");
		}
		
	}
}
