package BoletinClases.Main;

import java.util.Scanner;
import BoletinClases.Clases.Bombilla;

public class MainBombilla {
	
	public static void mostrarMenu(){
		System.out.println("o----------------=----------------o");
		System.out.println("|  [1] ---> Encender la bombilla  |");
		System.out.println("|  [2] ---> Apagar la bombilla    |");
		System.out.println("|  [0] ---> Salir                 |");
		System.out.println("o---------------------------------o");
		System.out.print("Su opcion del menu es: ");
	}
	
	public static void main(String[] args){
		
		//Declaración de variables
		int opcionMenu = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		Bombilla bombilla1 = new Bombilla();
		
		do{
			do{
				if(bombilla1.getEstado() == true){
					Bombilla.imprimirBombillaEncendida();
				}
				else{
					Bombilla.imprimirBombillaApagada();
				}
				
				mostrarMenu();
				opcionMenu = teclado.nextInt();
				
				if(bombilla1.getEstado()==true && opcionMenu==0){
					System.out.println();
					System.out.println("No te vayas sin apagar la luz.");
					System.out.println("Como se nota que tú no la pagas.");
					System.out.println();
				}
				
			}
			while((opcionMenu<0 || opcionMenu>2) || (bombilla1.getEstado()==true && opcionMenu==0));
			
			switch(opcionMenu){
				case 0:
					System.out.println();
					System.out.println("Ashta luego!");
				break;
				
				case 1:
					System.out.println();
					bombilla1.encender();
					System.out.println();
				break;
				
				case 2:
					System.out.println();
					bombilla1.apagar();
					System.out.println();
				break;
			}
			
		}
		while(opcionMenu!=0);
	}
}
