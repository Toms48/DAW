package Gestoras;

public class GestoraBoletin2 {
	
	public static int contadorPalabras(String texto, int letrasMinimas){
		
		int contadorLetrasPalabra = 0;
		int cantidadPalabras = 0;
		char[] arrayChar = new char[texto.length()];
		
		
		arrayChar = texto.toCharArray();
		
		for(int i=0; i<=arrayChar.length-1; i++){
			
			if( (Character.codePointAt(arrayChar,i)>=97 && (Character.codePointAt(arrayChar,i)<=122) || ((Character.codePointAt(arrayChar,i)>=65 && (Character.codePointAt(arrayChar,i)<=90))))){
				contadorLetrasPalabra++;
			}
			else{
				if(contadorLetrasPalabra > letrasMinimas){
					cantidadPalabras++;
				}
				
				contadorLetrasPalabra = 0;
			}
			
			
		}
		
		return cantidadPalabras;
	}
	
	public static int contadorPalabras(String texto){
		
		int cantidadPalabras = 0;
		char[] arrayChar = new char[texto.length()];
		
		
		arrayChar = texto.toCharArray();
		
		for(int i=0; i<=arrayChar.length-1; i++){
			
			if( (Character.codePointAt(arrayChar,i)<=97 || (Character.codePointAt(arrayChar,i)>=122) && ((Character.codePointAt(arrayChar,i)<=65 || (Character.codePointAt(arrayChar,i)>=90))))){
				cantidadPalabras++;
			}
		}
		
		return cantidadPalabras;
	}
	
	public static void contarVocales(String texto){
		
		char[] arrayChar = new char[texto.length()];
		
		int contadorA = 0;
		int contadorE = 0;
		int contadorI = 0;
		int contadorO = 0;
		int contadorU = 0;
		
		arrayChar = texto.toCharArray();
		
		for(char letra:arrayChar){
			switch (letra){
				case 'a':
					contadorA++;
					break;
				
				case 'e':
					contadorE++;
					break;
				
				case 'i':
					contadorI++;
					break;
				
				case 'o':
					contadorO++;
					break;
				
				case 'u':
					contadorU++;
					break;
			}
		}
		
		System.out.println("La cantidad de A es: " +contadorA);
		System.out.println("La cantidad de E es: " +contadorE);
		System.out.println("La cantidad de I es: " +contadorI);
		System.out.println("La cantidad de O es: " +contadorO);
		System.out.println("La cantidad de U es: " +contadorU);
		
	}
	
	public static int porcentajeEspacios(String texto){
		
		int contadorEspacios = 0;
		int porcentaje = 0;
		char[] arrayChar = new char[texto.length()];
		
		
		arrayChar = texto.toCharArray();
		
		for(char letra:arrayChar){
			
			if(letra == ' '){
				contadorEspacios++;
			}
		}
		
		porcentaje = (contadorEspacios*100)/texto.length();
		
		return porcentaje;
	}
	
}
