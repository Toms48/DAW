public class lecturaNumeros {
	public static void main(String[] args) {
		String linea;
		
		System.out.print("Por favor, introduce un n�mero: ");
		
		linea = System.console().readLine();
		int primerNumero;
		
		primerNumero = Integer.parseInt( linea );
		
		System.out.print("introduce otro, por favor: ");
		linea = System.console().readLine();
		
		int segundoNumero;
		
		segundoNumero = Integer.parseInt( linea );
		
		int total;
		
		total = (2 * primerNumero) + segundoNumero;
		
		System.out.print("El primer n�mero introducido es " + primerNumero);
		
		System.out.println(" y el segundo es " + segundoNumero);
		
		System.out.print("El doble del primer n�mero m�s el segundo es ");
		System.out.print(total);
	}
}

