package Gestora;

public class Gestora8IJ {

/**************************************************************************
Interfaz
Comentario: Devuelve verdadero si un numero es capicúa y falso si no lo es
Cabecera: boolean esCapicua(int num)
Precondiciones: No tiene
Entrada: Un int
Salida: Un boolean
E/S: No hay
Postcondiciones:
 	- True si es capicúa
 	- False si no es capicúa
**************************************************************************/

	public static boolean esCapicua(int iNumero){
		boolean resultado = false;
		
		//String sNumero = "";
		int iNumero2 = 0;
		int iNumeroInvertido = 0;
		
		//Inicio
			//Comprobar capicua
			//iNumero = Integer.parseInt(sNumero);
			iNumero2 = iNumero;
			
			while(iNumero != 0) {
				int digit = iNumero % 10;
				iNumeroInvertido = iNumeroInvertido * 10 + digit;
				iNumero = iNumero/10;
			}
			
			//Si numero y su invertido son iguales
			if(iNumero2 == iNumeroInvertido){
				resultado = true;
			}
		//Fin
		
		return resultado;
	}
	
/**************************************************************************
Interfaz
Comentario: Devuelve verdadero si el número que se le pasa es primo y falso si no lo es
Cabecera: boolean esPrimo(int num)
Precondiciones: No tiene
Entrada: Un int
Salida: Un boolean
E/S: No hay
Postcondiciones:
	- True si es primo
	- False si no es primo
**************************************************************************/

	public static boolean esPrimo(int numero){
		
		//Declaración de variables
		boolean resultado = false;
		
		int contadorDivisibles = 0;
		
		//Incio
			//Comprobar si es primo
			for(int i=1; i<=numero; i++){
				if(numero%i == 0){
					contadorDivisibles++;
				}
				
			}
			
			//Si es divisible por dos numeros
			if(contadorDivisibles == 2){
				resultado = true;
			}
		//Fin
		
		return resultado;
	}
	
/**************************************************************************
Interfaz
Comentario: Devuelve el menor primo que es mayor al número que pasamos
Cabecera: int siguientePrimo(int num)
Precondiciones: No tiene
Entrada: Un int
Salida: Un boolean
E/S: No hay
Postcondiciones:
- True si es primo
- False si no es primo
**************************************************************************/

}
