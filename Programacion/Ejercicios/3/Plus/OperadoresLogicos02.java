public class OperadoresLogicos02 {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		
		System.out.println("a = " + a); //true
		System.out.println("b = " + b); //false
		System.out.println("a && b = " + (a && b)); //false
		System.out.println("a || b = " + (a || b)); //true
		System.out.println("!a = " + !a); //false
		System.out.println("a || (6 > 10) = " + (a || (6 > 10))); //true
		System.out.println("((4 <= 4) || false) && (!a) = " + (((4 <= 4) || false) && (!a))); //false
	}
}

