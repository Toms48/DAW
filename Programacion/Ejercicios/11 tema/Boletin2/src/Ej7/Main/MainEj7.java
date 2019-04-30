package Ej7.Main;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class MainEj7 {
    public static void main(String[] args){

        //Declaraciones de variables
		String palabra = "";
		
        String clave = "";
        String valor = "";
        
        int posicionComa = 0;
        
        //Inicializaciones
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner tecladoS = new Scanner(System.in);
	
        try{
			//BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej7\\Main\\diccionario.dat"));
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej7\\Main\\diccionario.dat"));
	
			String linea = br.readLine();
	
			while(linea != null){
				
				posicionComa = linea.indexOf(',');
				
				clave = linea.substring(0,posicionComa);
				System.out.println(clave);
				
				valor = linea.substring(posicionComa+1);
				System.out.println(valor);
				
				diccionario.put(clave,valor);
				
				linea = br.readLine();
			}
		
			br.close();
			
		}
		catch (FileNotFoundException e){
			System.out.println("No se ha encontrado el archivo");
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Diccionario =-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(diccionario.keySet());
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();

        do{
            System.out.print("Introduzca una palabra del diccionario: ");
            palabra = tecladoS.nextLine();
        }
        while(!diccionario.containsKey(palabra));

        System.out.println();

        System.out.println(palabra +" ---> " +diccionario.get(palabra));

    }
}
