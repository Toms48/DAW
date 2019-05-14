package Ej2.ApartadoA.Main;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.*;
import java.util.ArrayList;

public class MainEj2ApartadoA {
	public static void main(String[] args){
		
		//Declaracion de variables
		int posicionBarra = 0;
		
		String nombre = "";
		String nombreAComparar = "";
		
		//Inicializaciones
		ArrayList<String> arrayAgenda = new ArrayList<>();
		
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\ExamenTema10-11\\src\\Ej2\\Main\\agendaDuplicada.txt"));
			
			String linea = br.readLine();
			
			while(linea != null){
				
				arrayAgenda.add(linea);
				//System.out.println(linea);
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
		
		for(int j=0; j<=arrayAgenda.size()-1; j++){
			posicionBarra = arrayAgenda.get(j).indexOf('/');
			nombre = arrayAgenda.get(j).substring(0,posicionBarra);
			
			for(int i=j+1; i<=arrayAgenda.size()-1; i++){
				posicionBarra = arrayAgenda.get(i).indexOf('/');
				nombreAComparar = arrayAgenda.get(i).substring(0,posicionBarra);
				//System.out.println(nombreAComparar);
				
				if(nombre.equals(nombreAComparar)){
					arrayAgenda.remove(i);
					i--;
				}
			}
			
			//System.out.println(arrayAgenda.get(j));
		}
		
		try{
			//BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\ExamenTema10-11\\src\\Ej2\\Main\\agendaDuplicadaPRUEBA.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\ExamenTema10-11\\src\\Ej2\\Main\\agendaDuplicada.txt"));
			
			for (String dato : arrayAgenda) {
				bw.write(dato);
				bw.newLine();
			}
			
			bw.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	
	}
}
