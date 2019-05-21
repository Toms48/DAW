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

public class  {

	public void printRPG(String cadena){

		char[] stringToCharArray = cadena.toCharArray();
		
		for (char i : stringToCharArray) {
			System.out.print(i);
		}
	}
	
	public void printlnRPG(String cadena){
		
		char[] stringToCharArray = cadena.toCharArray();
		
		for (char i : stringToCharArray) {
			System.out.print(i);
		}
		
		System.out.println("");
		
	}
	
}
