/*
 * Nombre: t5Ej22
 * 
 * Comentario: Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * Análisis
 * 
 * 		Entradas: No tiene
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Para contador=2 mientras contador<=100 aumentar contador
			//Poner el contador de divisibles a 0
			//Calcular cuantos numeros son divisibles por el contador
			//Si el contador es divisible solo por dos numeros (él mismo y 1)
				//Mostrar contador
			//Fin_Si
		//Fin_Para
	//Fin

public class t5Ej22 {
	
	public static void main (String[] args) {
		
		int contadorDivisibles;
		
		//Inicio
			//Para contador=2 mientras contador<=100 aumentar contador
			for(int i=2; i<=100; i++){
				
				//Poner el contador de divisibles a 0
				contadorDivisibles = 0;
				
				//Calcular cuantos numeros son divisibles por el contador
				for(int j=1; j<=i; j++){
					if(i%j == 0){
						contadorDivisibles++;
					}
				}
				
				if(contadorDivisibles==2){	//Si el contador es divisible solo por dos numeros (él mismo y 1)
					//Mostrar contador
					System.out.print(i +" ");
				}//Fin_Si
				
			}//Fin_Para
		//Fin
		
	}
}

