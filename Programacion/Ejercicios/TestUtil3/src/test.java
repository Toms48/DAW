public class test {
	
	public static void printRPG(String cadena) throws InterruptedException{
		
		char[] stringToCharArray = cadena.toCharArray();
		
		for (int i=0; i<=(stringToCharArray.length)-1; i++) {
			//if(i!=' '){
				if(i==','){
					Thread.sleep(900);
				}
				else{
					Thread.sleep(204);
				}
			//}
			System.out.print(stringToCharArray[i]);
		}
	}
	
	public static void printlnRPG(String cadena) throws InterruptedException{
		
		char[] stringToCharArray = cadena.toCharArray();
		
		for (char i : stringToCharArray) {
			System.out.print(i);
			if(i!=' '){
				if(i==','){
					Thread.sleep(900);
				}
				else{
					Thread.sleep(204);
				}
			}
		}
		
		System.out.println("");
		
	}
	
	public static void main(String[] args) throws InterruptedException{
	
		String texto = "";
		
		printRPG(texto);
		//System.out.println("¯\\_(ツ)_/¯");
		
	}
}
