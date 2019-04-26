//package Ej3;

import java.io.*;

public class Ej3 {
	public static void main(String[] args){
		
		try{
			//BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin1\\src\\Ej3\\fichero1.txt"));
			//BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin1\\src\\Ej3\\fichero2.txt"));
			
			
			BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin1\\src\\Ej3\\" +args[0]));
			BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin1\\src\\Ej3\\" +args[1]));
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\t-m-1\\Desktop\\GitHub\\DAW\\Programacion\\Ejercicios\\11 tema\\Boletin1\\src\\Ej3\\fichero1y2.txt"));
			
			
			String linea1 = "";
			String linea2 = "";
			
			while (linea1 != null || linea2 != null) {
				if(linea1 == null){
					linea1 = "";
				}
				if(!linea1.equals("") || !linea2.equals("")){
					if(linea1 != null && !linea1.equals("")){
						System.out.println(linea1);
					}
					
					if(linea2 != null){
						System.out.println(linea2);
					}
				}

				linea1 = br1.readLine();
				if(linea1 != null && !linea1.equals("")){
					bw.write(linea1 +" ");
				}
				
				linea2 = br2.readLine();
				if(linea2 != null){
					bw.write(linea2 +" ");
				}
			}
			
			br1.close();
			br2.close();
			bw.close();
		}
		catch (FileNotFoundException e){
			System.out.println("No se ha encontrado el fichero");
		}
		/*catch(NullPointerException nullPointer){
		
		}*/
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		
		
	}
}
