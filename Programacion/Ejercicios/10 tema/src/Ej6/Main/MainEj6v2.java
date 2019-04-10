package Ej6.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEj6v2 {
	public static void main(String[] args){
		
		//Declaraciones de varaibles
		int contrasenia = 0;
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
		
		/*System.out.println(contrasenias.get("Jesus sal"));
		System.out.println(contrasenias.get(123));*/
		
		System.out.println();
		
		for (Map.Entry pareja: contrasenias.entrySet()) {
			pareja.setValue(789);
			
		}
		
		for (Map.Entry pareja: contrasenias.entrySet()) {
			System.out.print(pareja.getKey() + "\t");
			System.out.println(pareja.getValue());
		}
		
		System.out.println();

		System.out.println("=-=-=-=-=-=-=-=-= Administradores registrados =-=-=-=-=-=-=-=-=\n");
		System.out.println(contrasenias.keySet());
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println();

		do{
			System.out.print  ("Introduzca el nombre: ");
			nombre = tecladoS.nextLine();
		}
		while(!contrasenias.containsKey(nombre));

		for(int i=2; i>=0; i--){
			System.out.print("Introduzca la contraseña: ");
			contrasenia = tecladoN.nextInt();

			valor = contrasenias.get(nombre);

			//System.out.println(contrasenias.get(nombre));

			if(valor == contrasenia){
				System.out.println("\nHa accedido al área restringida");
				i=0;
			}
			else{
				System.out.println("\nLo siento, no tiene acceso al área restringida");
				if(i != 0){
					System.out.println("Le quedan " +i +" intentos");
				}
				else{
					System.out.println("Ha gastado todos los intentos");
				}
				System.out.println();
			}
		}

		
	}
}
