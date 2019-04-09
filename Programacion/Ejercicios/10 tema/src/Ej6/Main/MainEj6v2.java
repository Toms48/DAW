package Ej6.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEj6v2 {
	public static void main(String[] args){
		
		//Declaraciones de varaibles
		Integer contrasenia = 0;
		String nombre = "";
		
		Integer valor = 0;
		
		//Inicializaciones
		Scanner tecladoS = new Scanner(System.in);
		Scanner tecladoN = new Scanner(System.in);
		
		HashMap<String, Integer> contrasenias = new HashMap<>();
		
		contrasenias.put("Tomas", 123);
		contrasenias.put("Jorge", 234);
		contrasenias.put("Sefran", 345);
		contrasenias.put("Ezhor", 456);
		
		System.out.print  ("Introduzca el nombre: ");
		nombre = tecladoS.nextLine();
		
		System.out.print("Introduzca la contraseña: ");
		contrasenia = tecladoN.nextInt();
		
		valor = contrasenias.get(nombre);
		
		System.out.println(contrasenias.get(nombre));
		
		if(valor == contrasenia){
			System.out.println("\nHa accedido al área restringida");
		}
		else{
			System.out.println("\nLo siento, no tiene acceso al área restringida");
		}
		
	}
}
