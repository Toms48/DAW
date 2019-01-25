package Main;

public class ClaseString {
	public static void main(String[] args){
		
		String nombre = "Tomas";
		String nombre2 = "Alejandro";
		
		String frase = "Algún día pero no hoy aprenderé a usar nuevos métodos de la clase String o no";
		
		System.out.println("=-=-=-=-=-= .charAt() =-=-=-=-=-=");
		System.out.println("La ultima letra de " +nombre +" es " +nombre.charAt(nombre.length()-1));
		System.out.println("La ultima letra de " +nombre2 +" es " +nombre2.charAt(nombre2.length()-1));
		
		System.out.println();
		
		System.out.println("=-=-=-=-=-= .substring() =-=-=-=-=-=");
		System.out.println(frase.substring(18));
		System.out.println(frase.substring(18,72));
		
		System.out.println();
		
		System.out.println("=-=-=-=-=-= .toUpperCase() =-=-=-=-=-=");
		System.out.println((frase.substring(18)).toUpperCase().charAt(0) +frase.substring(19,frase.length()));
		System.out.println((frase.substring(18)).toUpperCase().charAt(0) +frase.substring(19,72));
		System.out.println("¿" +(frase.substring(18)).toUpperCase().charAt(0) +frase.substring(19,72) +"?");
		
	}
}
