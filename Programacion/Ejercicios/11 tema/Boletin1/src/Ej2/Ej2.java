package Ej2;

import java.io.*;

public class Ej2 {
	public static void main(String[] args){
		
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\Ficheros\\primos.dat"));
			
			String linea = "";
			
			while (linea != null) {
				if(!linea.equals("")){
					System.out.println(linea);
				}
				linea = br.readLine();
			}
			
			
			br.close();
		}
		catch (FileNotFoundException e){
			System.out.println("No se ha encontrado el fichero");
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		
	}
}
