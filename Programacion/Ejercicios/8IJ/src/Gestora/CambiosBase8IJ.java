package Gestora;

import Gestora.Gestora8IJ;

public class CambiosBase8IJ {

/**************************************************************************
Interfaz
Comentario: Escribe un programa que pase de binario a decimal.
Cabecera: int binarioDecimal(int binario)
Precondiciones:
 	- El número solo estará compuesto de ceros y unos
 	- El número será negativo
Entrada: Un int
Salida: Un int
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int binarioDecimal(int binario){
		
		int aux = 0;
		int decimal = 0;
		int multiploDos = 1;
		
		aux = binario;
		
		for(int i = 1; i<= Gestora8IJ.digitos(aux); i++){
			
			if(binario%10 == 1){
				decimal = decimal + multiploDos;
			}
			
			multiploDos = multiploDos*2;
			binario = binario/10;
			
		}
		
		return decimal;
	}
	
/**************************************************************************
Interfaz
Comentario: Escribe un programa que pase de octal a decimal.
Cabecera: int octalDecimal(int decimal)
Precondiciones:
- El número no será negativo
(se puede representar el negativo en binario poniendo un 1 delante del número
pero no voy a tener en cuenta los negativos porque por ejemplo:
13  ---> 1101
-13 ---> 11101 pero es que este mismo número en decimal es 11101 ---> 29)
Entrada: Un int
Salida: Un int
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

public static int octalDecimal(int octal){
	
	int aux = 0;
	int decimal = 0;
	int multiploOcho = 1;
	
	aux = octal;
	
	for(int i = 1; i<= Gestora8IJ.digitos(aux); i++){
		
		if(octal%10 == 1){
			decimal = decimal + multiploOcho;
		}
		
		multiploOcho = multiploOcho*8;
		octal = octal/10;
		
	}
	
	return decimal;
}

/**************************************************************************
Interfaz
Comentario: Escribe un programa que pase de decimal a binario.
Cabecera: int decimalBinario(int decimal)
Precondiciones:
 	- El número no será negativo
      (se puede representar el negativo en binario poniendo un 1 delante del número
      pero no voy a tener en cuenta los negativos porque por ejemplo:
 			13  ---> 1101
 			-13 ---> 11101 pero es que este mismo número en decimal es 11101 ---> 29)
Entrada: Un int
Salida: Un int
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int decimalBinario(int decimal){

		int binario = 1;
		int resto = 0;
		
		resto = decimal;
		
		do{
			
			if(resto%2==0){
				binario = (binario*10);
			}
			else{
				binario = (binario*10)+1;
			}
			
			resto = resto/2;
			
		}
		while(resto >=1);
		
		binario = (Gestora8IJ.voltea(binario)/10);
		
		return binario;
	}

}
