public class lecturaString {
	public static void main(String[] args) {
		String nombre;
		
		System.out.print("Por favor, dime c�mo te llamas: ");
		
		nombre = System.console().readLine();
		
		System.out.println("Hola " + nombre + ", �encantado de conocerte!");
	}
}
