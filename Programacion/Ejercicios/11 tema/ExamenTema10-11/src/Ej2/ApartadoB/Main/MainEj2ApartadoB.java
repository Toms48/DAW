package Ej2.ApartadoB.Main;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainEj2ApartadoB {
	public static void main(String[] args){
		
		//Declaracion de variables
		int posicionBarra = 0;
		
		String clave = "";
		String claveAComparar = "";
		
		String valor = "";
		
		//Inicializaciones
		LinkedHashMap<String, String> agenda = new LinkedHashMap<>();
		
		try{
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\ExamenTema10-11\\src\\Ej2\\ApartadoB\\Main\\agendaDuplicada.txt"));
			
			String linea = br.readLine();
			
			while(linea != null){
				
				posicionBarra = linea.indexOf('/');
				
				clave = linea.substring(0,posicionBarra);
				//System.out.println(clave);
				
				valor = linea.substring(posicionBarra+1);
				//System.out.println(valor);
				
				if(!agenda.containsKey(clave)){
					agenda.put(clave,valor);
				}
				
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
		
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\ExamenTema10-11\\src\\Ej2\\ApartadoB\\Main\\agendaDuplicada.txt"));
			
			for (Map.Entry pareja: agenda.entrySet()) {
				//System.out.println(pareja.getValue()+"/"+pareja.getKey());
				bw.write(pareja.getValue()+"/"+pareja.getKey());
				bw.newLine();
			}
			
			bw.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	
	}
}
