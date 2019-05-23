/*package Ej2.Pruebas;

import Ej2.Clases.Baraja;
import Ej2.Clases.Carta;
import Ej2.Excepciones.ExcepcionCarta;

public class PruebasBaraja {
	public static void main(String[] args) throws ExcepcionCarta {
		
		//Constructor
		Baraja baraja40 = new Baraja();
		
		//Método toString
		System.out.println(baraja40.toString());
		
		System.out.println();
		
		//Método sinCartasEnBaraja
		System.out.println(baraja40.sinCartasEnBaraja());
		
		System.out.println();
		
		//Método getCartasEnBaraja
		System.out.println("La baraja tiene " +baraja40.getCartasEnBaraja() +" cartas");
		
		System.out.println();
		
		//Método getCartaDeArriba
		System.out.println("La carta de arriba de la baraja es: " +baraja40.getCartaDeArriba().toString());
		
		System.out.println();
		
		//Método barajar
		baraja40.barajar();
		System.out.println(baraja40.toString());
		
		System.out.println();
		
		//Método ordenarBaraja
		baraja40.ordenarBaraja();
		System.out.println(baraja40.toString());
		
		System.out.println();
		
		//Método reparteCartas	NO termina de funcionar
		baraja40.barajar();
		
		for(Carta carta : baraja40.reparteCartas()){
			System.out.println(carta.toString());
		}
		
		
	}
}*/
