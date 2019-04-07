import java.util.Scanner;

public class ej8Extra {
	
	public static void main (String[] args) {
		
		int edad = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Introduzca su edad: ");
		edad = teclado.nextInt();
		
		System.out.println("Su edad el año que viene será: " +(edad+1));
		
	}
}

