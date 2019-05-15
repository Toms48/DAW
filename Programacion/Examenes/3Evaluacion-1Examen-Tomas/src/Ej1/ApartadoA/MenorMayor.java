package Ej1.ApartadoA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MenorMayor {
	public static void main(String[] args){
		
		//Declaracion de varaibles
		Double numero;
		
		//Inicializaciones
		ArrayList<Double> arrayNumeros = new ArrayList<>();
		
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\ExamenUltimo\\src\\Ej1\\ApartadoA\\numeros.txt"));
			
			String linea = br.readLine();
			
			while(linea != null){
				
				numero = Double.parseDouble(linea.substring(0,3));
				//System.out.println(numero);
				
				arrayNumeros.add(numero);
				
				linea = br.readLine();
			}
			
			br.close();
			
		}
		catch (FileNotFoundException e){
			System.out.println("No se ha encontrado el archivo\n");
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		/*for(Double dato : arrayNumeros){	//Bucle para ver que se introducian los numeros correctamente
			System.out.println(dato);
		}*/
		
		//Ordenar con el método de la burbuja
		int n = arrayNumeros.size();
		Double aux;
		for(int i=0; i < n; i++){
			for(int j=1; j < (n-i); j++){
				if(arrayNumeros.get(j-1) > arrayNumeros.get(j)){
					//swap elements
					aux = arrayNumeros.get(j-1);
					arrayNumeros.set(j-1,arrayNumeros.get(j));
					arrayNumeros.set(j,aux);
				}
			}
		}
		
		for(Double dato : arrayNumeros){
			System.out.println(dato);
		}
	
	}
}
