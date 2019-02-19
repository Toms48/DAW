package Main;

import Clases.Monedero;

public class MainMonedero {
	public static void main(String[] args){
		
		//Declaración de variables
		
		//Inicializaciones
		Monedero monedero1 = new Monedero();
		Monedero monedero2 = new Monedero(500);
		
		System.out.println("=-=-= Cantidad inicial de los monederos =-=-=");
		System.out.println(monedero1.toString());
		System.out.println(monedero2.toString());
		
		System.out.println();
		
		System.out.println("=-=-= Metemos dinero en los monederos =-=-=");
		monedero1.meterDinero(100);
		monedero2.meterDinero(100);
		
	}
}
