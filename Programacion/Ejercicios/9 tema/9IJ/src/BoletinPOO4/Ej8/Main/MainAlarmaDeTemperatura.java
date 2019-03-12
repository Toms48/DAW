package BoletinPOO4.Ej8.Main;

import BoletinPOO4.Ej8.Clases.AlarmaDeTemperatura;
import BoletinPOO4.Ej8.Clases.Timbre;

import java.util.Scanner;

public class MainAlarmaDeTemperatura {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int lecturaTemperatura = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		AlarmaDeTemperatura alarma = new AlarmaDeTemperatura();
		Timbre timbre = new Timbre();
		
		//Inicio
			System.out.println("La temperatura de la CPU del ordenador está inicialmente a " +alarma.getTemperatura());
			System.out.println("A partir de 80 grados celsius sonará una alarma.");

			do{
				System.out.println();

				System.out.print("Escriba la variacion de temperatura registrada en su CPU: ");
				lecturaTemperatura = teclado.nextInt();

				alarma.setTemperatura(alarma.getTemperatura() + lecturaTemperatura);

				if(alarma.getTemperatura() >= 80){
					alarma.activarTimbre(timbre);
				}
				else{
					if(alarma.getTemperatura() == 0){
						System.out.println("Se ha apagado la CPU");
					}
					else{
						alarma.desactivarTimbre(timbre);
					}
				}

				System.out.println(alarma.toString());

			}
			while(alarma.getTemperatura() != 0);

			System.out.println("\nAshta luego!");
		//Fin
	}
}
