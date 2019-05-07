//package Ej4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ej4 {
	public static void main(String args[]){
	
		//Declaraciones de variables
		//int contador = -1;
		
		//Inicializaciones
		ArrayList<String> palabras = new ArrayList<>();

		try{
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin1\\src\\Ej4\\palabras.txt"));
			//BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin1\\src\\Ej4\\palabras_sort.txt"));

			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));

			String linea = br.readLine();

			while(linea != null){
				//contador++;
				palabras.add(linea);
				//System.out.println(palabras.get(contador));	//Código para ver que salen bien cada una de las líneas(palabras)
				linea = br.readLine();
			}

			Collections.sort(palabras);

			System.out.println();
			System.out.println();
			System.out.println();

			for(String palabra : palabras){
				//System.out.println(palabra);	//Prueba para ver si lo hace todo correctamente sin bucles infinitos
				bw.write(palabra);
				bw.newLine();
			}

			br.close();
			bw.close();

		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
	
	}
}
