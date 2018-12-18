package salida;

/***********************************************************
 *  Nombre:
 *
 * Comentario:
 *
 * Cabecera:
 *
 * Precondiciones:
 * Entradas:
 * Salidas:
 * E/S:
 * Postcondiciones:
 ***********************************************************/

public class salida {

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

		String texto = "Hello! Sorry to keep you waiting! \n\n Nah, es coña. \n\nS\nE\nN\nD\n\nN\nU\nD\nE\nS";

		printRPG(texto);
		//System.out.println("¯\\_(ツ)_/¯");

	}
	
}
