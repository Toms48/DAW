package Main;

public class ClaseString {
	public static void main(String[] args){
		
		String nombre = "Tomas";
		String nombre2 = "Alejandro";
		
		String frase = "Algún día pero no hoy aprenderé a usar nuevos métodos de la clase String o no";
		
		//.charAt() sirve para mandar una letra de la cadena, con la posicion que nosotros le demos de 0 a n-1
		System.out.println("=-=-=-=-=-= .charAt() =-=-=-=-=-=");
		System.out.println("La primera letra de " +nombre +" es " +nombre.charAt(0));
		System.out.println("La ultima letra de " +nombre +" es " +nombre.charAt(nombre.length()-1));
		System.out.println();
		System.out.println("La primera letra de " +nombre2 +" es " +nombre2.charAt(0));
		System.out.println("La ultima letra de " +nombre2 +" es " +nombre2.charAt(nombre2.length()-1));
		
		System.out.println();
		System.out.println();
		
		//.substring() sirve para devolver un trozo de cadena desde las posiciones que nosotros le demos
		System.out.println("=-=-=-=-=-= .substring() =-=-=-=-=-=");
		System.out.println(frase.substring(18));
		System.out.println(frase.substring(18,72));
		
		System.out.println();
		System.out.println();
		
		//.toUpperCase() sirve para poner una cadena en mayúsculas
		System.out.println("=-=-=-=-=-= .toUpperCase() =-=-=-=-=-=");
		System.out.println((frase.substring(18)).toUpperCase().charAt(0) +frase.substring(19,frase.length()));
		System.out.println((frase.substring(18)).toUpperCase().charAt(0) +frase.substring(19,72));
		System.out.print("¿" +(frase.substring(22)).toUpperCase().charAt(0) +frase.substring(23,32) +frase.substring(18,21) +frase.substring(31,72) +"?");
		
		if(frase.substring(18,21).equals("hoy") == true){
			System.out.println(" : Sí");
		}
		else{
			System.out.println(" : No");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("=-=-=-=-=-= .equalsIgnoreCase() =-=-=-=-=-=");
		String Cad1 = "ProGraMAción";
		String Cad2 = "Programación";
		
		System.out.println(Cad1.equals(Cad2));
		System.out.println(Cad1.equalsIgnoreCase(Cad2));
		
		System.out.println();
		System.out.println();
		
		System.out.println("=-=-=-=-=-= .startsWith()   /   .endsWith() =-=-=-=-=-=");
		String str = "El primer programa";
		
		System.out.println("¿Empieza por El?: " +str.startsWith("El"));
		System.out.println("¿Termina por programa?: " +str.endsWith("programa"));
		
		System.out.println();
		System.out.println();
		
		System.out.println("=-=-=-=-=-= .indexOf() =-=-=-=-=-=");
		System.out.println(str.indexOf('p'));
		
		System.out.println();
		System.out.println();
		
		System.out.println("=-=-=-=-=-= .compareTo() =-=-=-=-=-=");
		String str3 = "Tomás";
		String str4 = "Alberto";
		
		System.out.println(str3.compareTo(str4));
		System.out.println(str4.compareTo(str3));
		
		System.out.println();
		System.out.println();
		
		System.out.println("=-=-=-=-=-= .valueOf() =-=-=-=-=-=");
		int valor = 10;
		
		String str9 = String.valueOf(valor);
		System.out.println("El " +valor +" de Julia me voy de vacaciones.");
		
		System.out.println();
		System.out.println();
		
		System.out.println("=-=-=-=-=-= .trim() =-=-=-=-=-=");
		String strTrim = "                           12                              ";
		
		System.out.println(strTrim);
		System.out.println(strTrim.trim());
		
		System.out.println();
		
		String str6 = "       12.35   ";
		System.out.println(str6);
		
		double numero3 = Double.valueOf(str6).doubleValue();
		
		System.out.println(numero3);
		
		
	}
}
