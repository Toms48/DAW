package Ej4;

import java.io.*;
import java.util.ArrayList;

public class Ej4 {
	public static void main(String args[]){
	
		//Declaraciones de variables
		int contador = -1;
		
		//Inicializaciones
		ArrayList<String> palabras = new ArrayList<>();
		
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin1\\src\\Ej4\\palabras.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin1\\src\\Ej4\\palabras_sort.txt"));
			
			String linea = br.readLine();
			
			while(linea != null){
				contador++;
				palabras.add(linea);
				System.out.println(palabras.get(contador));
				linea = br.readLine();
			}
			
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	
	}
}
