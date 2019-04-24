package Ej1;

import java.io.*;

public class Ej1 {
	
	public static boolean esPrimo(int numero){
		
		//Declaración de variables
		boolean resultado = false;
		
		int contadorDivisibles = 0;
		
		//Incio
		//Comprobar si es primo
		for(int i=1; i<=numero; i++){
			if(numero%i == 0){
				contadorDivisibles++;
			}
			
		}
		
		//Si es divisible por dos numeros
		if(contadorDivisibles == 2){
			resultado = true;
		}
		//Fin
		
		return resultado;
	}
	
	public static void main(String[] args){
		
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\Ficheros\\primos.dat"));
			
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\Ficheros\\primos.dat"));
			
			for(int i=1; i<=500; i++){
				if(esPrimo(i)){
					//System.out.print(i +"\n");
					bw.write(i +"\n");
				}
			}
			
			bw.close();
			
			String linea = "";
			
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			
			
			br.close();
		}
		catch (FileNotFoundException e){
			System.out.println("No se ha encontrado el fichero");
		}
		catch (IOException e){
			System.out.println("No se ha podido escribir en el fichero");
		}
	
	}
}
