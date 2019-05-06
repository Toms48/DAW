package Ej7.Main;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainEj7 {

	public static void mostrarMenu(){
		System.out.println("1) Consultar palabra");
		System.out.println("2) Añadir palabra");
		System.out.println("0) Salir");
		System.out.print  ("Su opcion es: ");
	}

    public static void main(String[] args){

        //Declaraciones de variables
		int opcionMenu = 0;

		String palabra = "";
		
        String clave = "";
        String valor = "";
        
        int posicionComa = 0;
        
        //Inicializaciones
        HashMap<String, String> diccionario = new HashMap<>();
        Scanner tecladoS = new Scanner(System.in);
        Scanner tecladoN = new Scanner(System.in);

        try{
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej7\\Main\\diccionario.dat"));
			//BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Familia\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej7\\Main\\diccionario2.dat"));
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Familia\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej7\\Main\\diccionarioPrueba.dat"));

			String linea = br.readLine();
	
			while(linea != null){
				
				posicionComa = linea.indexOf(',');
				
				clave = linea.substring(0,posicionComa);
				//System.out.println(clave);
				
				valor = linea.substring(posicionComa+1);
				//System.out.println(valor);
				
				diccionario.put(clave,valor);
				
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

		do{
			do{
				mostrarMenu();
				opcionMenu = tecladoN.nextInt();
			}
			while(opcionMenu<0 || opcionMenu>2);

			if(opcionMenu == 1){
				if(diccionario.isEmpty()){
					System.out.println();
					System.out.println("El diccionario se encuentra actualmente vacio, prueba a introducir palabras con la opcion 2 del menu.");
					System.out.println();
				}
				else{
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
					System.out.println();
				}
			}
			else{
				if(opcionMenu == 2){
					System.out.println();
					System.out.print ("Introduzca la palabra en español: ");
					clave = tecladoS.nextLine();

					System.out.print  ("Introduzca la traduccion al ingles de la palabra: ");
					valor = tecladoS.nextLine();

					diccionario.put(clave,valor);

					System.out.println();
				}
			}
		}
		while(opcionMenu!=0);

		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Familia\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin2\\src\\Ej7\\Main\\diccionarioPrueba.dat"));

			for (Map.Entry pareja: diccionario.entrySet()) {
				bw.write(pareja.getKey()+","+pareja.getValue());
				bw.newLine();
			}

			bw.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}

		System.out.println();
		System.out.println("Ashta lue!");

    }
}
