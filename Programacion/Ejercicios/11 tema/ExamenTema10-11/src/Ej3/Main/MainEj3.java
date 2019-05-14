package Ej3.Main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MainEj3 {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int contadorLineas = 0;
		int respuesta = 0;
		
		//Inicializaciones
		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);
		
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\ExamenTema10-11\\src\\Ej3\\Main\\Informatica.txt"));
			
			String linea = br.readLine();
			
			do{
				contadorLineas = 0;
				
				while(linea != null && contadorLineas<24){
					
					System.out.println(linea);
					
					linea = br.readLine();
					contadorLineas++;
				}
				
				do{
					System.out.println("\nQuiere mostrar las 24 siguientes lineas?");
					System.out.println("[0] ---> Sí");
					System.out.println("[1] ---> No y salir");
					System.out.print  ("Su opcion es: ");
					respuesta = tecladoN.nextInt();
				}
				while(respuesta<0 || respuesta>1);
			}
			while(linea != null && respuesta != 1);
			
			br.close();
			
		}
		catch (FileNotFoundException e){
			System.out.println("No se ha encontrado el archivo\n");
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}
