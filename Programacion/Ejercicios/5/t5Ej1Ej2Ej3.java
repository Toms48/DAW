/*
 * Nombre: t5Ej1Ej2Ej3
 * 
 * Comentario: Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for, while y do-while.
 * 
 * Análisis
 * 
 * 		Entradas: No tiene
 * 
 * 		Salidas: Por pantalla
 * 
 */

public class t5Ej1Ej2Ej3 {
	
	public static void main (String[] args) {
		
		for(int i=0; i<101; i++){
			if((i%10 == 0) || (i%10 == 5)){
				System.out.println(i);
			}
		}
		
		/*
		int numero = 0;
		
		while(numero<101){
			
			if((numero%10 == 0) || (numero%10 == 5)){
				System.out.println(numero);
			}
			
			numero++;
		}
		*/
		
		/*
		int numero = 0;
		
		do{
			if((numero%10 == 0) || (numero%10 == 5)){
				System.out.println(numero);
			}
			
			numero++;
		}
		while(numero<101);
		*/
		
	}
}

