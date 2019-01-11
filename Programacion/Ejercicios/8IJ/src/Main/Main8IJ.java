package Main;

import Gestora.Gestora8IJ;

public class Main8IJ {
	public static void main(String [] args) throws InterruptedException {
		
		//Tests numeroPositivoONegativo
		System.out.println("=-=-=-= Tests numeroPositivoONegativo =-=-=-=");
		System.out.println(Gestora8IJ.numeroPositivoONegativo(3.9));
		System.out.println(Gestora8IJ.numeroPositivoONegativo(3.21));
		System.out.println(Gestora8IJ.numeroPositivoONegativo(-6.8));
		System.out.println(Gestora8IJ.numeroPositivoONegativo(-800.11));
		
		System.out.println("");
		
		//Tests esCapicua
		System.out.println("=-=-=-= Tests esCapicua =-=-=-=");
		System.out.println(Gestora8IJ.esCapicua(78966987));
		System.out.println(Gestora8IJ.esCapicua(2579));
		
		System.out.println("");
		
		//Tests esPrimo
		System.out.println("=-=-=-= Tests esPrimo =-=-=-=");
		System.out.println(Gestora8IJ.esPrimo(21));
		System.out.println(Gestora8IJ.esPrimo(7));
		
		System.out.println("");
		
		//Tests siguientePrimo
		System.out.println("=-=-=-= Tests siguientePrimo =-=-=-=");
		System.out.println(Gestora8IJ.siguientePrimo(21));
		System.out.println(Gestora8IJ.siguientePrimo(151));
		
		System.out.println("");
		
		//Tests potencia
		System.out.println("=-=-=-= Tests potencia =-=-=-=");
		System.out.println(Gestora8IJ.potencia(2,2));
		System.out.println(Gestora8IJ.potencia(0,9));
		System.out.println(Gestora8IJ.potencia(2352352,0));
		
		System.out.println("");
		
		//Tests digitos
		System.out.println("=-=-=-= Tests digitos =-=-=-=");
		System.out.println(Gestora8IJ.digitos(8));
		System.out.println(Gestora8IJ.digitos(-4563));
		System.out.println(Gestora8IJ.digitos(54));
		System.out.println(Gestora8IJ.digitos(999));
		System.out.println(Gestora8IJ.digitos(0));
		
		System.out.println("");
		
		//Tests voltea
		System.out.println("=-=-=-= Tests voltea =-=-=-=");
		System.out.println(Gestora8IJ.voltea(-69));
		System.out.println(Gestora8IJ.voltea(-6));
		System.out.println(Gestora8IJ.voltea(4));
		System.out.println(Gestora8IJ.voltea(857439612));
		
		System.out.println("");
		
		//Tests digitoN
		System.out.println("=-=-=-= Tests digitoN =-=-=-=");
		System.out.println(Gestora8IJ.digitoN(9856,0));
		System.out.println(Gestora8IJ.digitoN(9856,1));
		System.out.println(Gestora8IJ.digitoN(9856,2));
		System.out.println(Gestora8IJ.digitoN(9856,3));
		
		System.out.println(Gestora8IJ.digitoN(9856,4));
		System.out.println(Gestora8IJ.digitoN(9856,8));
		
		System.out.println(Gestora8IJ.digitoN(9856,-1));
		System.out.println(Gestora8IJ.digitoN(9856,-15));

		System.out.println("");

		//Tests posicionDeDigito
		System.out.println("=-=-=-= Tests posicionDeDigito =-=-=-=");
		System.out.println(Gestora8IJ.posicionDeDigito(8222, 8));
		System.out.println(Gestora8IJ.posicionDeDigito(2882, 8));
		System.out.println(Gestora8IJ.posicionDeDigito(2282, 8));
		System.out.println(Gestora8IJ.posicionDeDigito(2228, 8));

		System.out.println(Gestora8IJ.posicionDeDigito(2222, 8));

		System.out.println(Gestora8IJ.posicionDeDigito(25411, 1));

		System.out.println("");

		//Tests quitaPorDetras
		System.out.println("=-=-=-= Tests quitaPorDetras =-=-=-=");
		System.out.println(Gestora8IJ.quitaPorDetras(12345, 4));
		System.out.println(Gestora8IJ.quitaPorDetras(-12345, 1));

		System.out.println(Gestora8IJ.quitaPorDetras(12345, 6));

		System.out.println("");

		//Tests quitaPorDelante
		System.out.println("=-=-=-= Tests quitaPorDelante =-=-=-=");
		System.out.println(Gestora8IJ.quitaPorDelante(12345, 3));
		System.out.println(Gestora8IJ.quitaPorDelante(-12345, 1));

		System.out.println(Gestora8IJ.quitaPorDelante(12345, 6));
		
		System.out.println("");
		
		//Tests pegaPorDetras
		System.out.println("=-=-=-= Tests pegaPorDetras =-=-=-=");
		System.out.println(Gestora8IJ.pegaPorDetras(19, 0));
		System.out.println(Gestora8IJ.pegaPorDetras(1965684, 1));
		
		System.out.println(Gestora8IJ.pegaPorDetras(123, 45));
		System.out.println(Gestora8IJ.pegaPorDetras(-19, 9));
		
		System.out.println("");
		
		//Tests pegaPorDelante
		System.out.println("=-=-=-= Tests pegaPorDelante =-=-=-=");
		System.out.println(Gestora8IJ.pegaPorDelante(19, 0));
		System.out.println(Gestora8IJ.pegaPorDelante(88888888, 1));
		
		System.out.println(Gestora8IJ.pegaPorDelante(123, 45));
		System.out.println(Gestora8IJ.pegaPorDelante(-19, 9));
		
		System.out.println("");
		
		//Tests trozoDeNumero
		System.out.println("=-=-=-= Tests trozoDeNumero =-=-=-=");
		System.out.println(Gestora8IJ.trozoDeNumero(1998, 2, 3));
		
	}
}
