/*
 *   Nombre: t7Ej12
 *
 *   Comentario:    Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 *
 *   				A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
 *
 *   				Seguidamente el programa pedirá dos posiciones a las que llamaremos "inicial" y "final".
 *
 *   				Se debe comprobar que inicial es menor que final y que ambos números están entre 0 y 9.
 *
 *   				El programa deberá colocar el número de la posición inicial en la posición final,
 *   				rotando el resto de números para que no se pierda ninguno.
 *
 *   				Al final se debe mostrar el array resultante.
 *
 *   Análisis:
 *
 *       Entradas: 10 ints
 *
 *       Salidas: Por pantalla
 *
 *       Requisitos:
 *       	- El valor de la posicion "inicial" no puede ser mayor que "final"
 *       	- Los valores de "inicial" y "final" tienen que estar entre 0 y 9
 *
 *
 * */

//PG
	//Inicio
		//Leer y cargar numeros en el array inicial
		//Mostrar array inicial
		//Leer y validar posicion inicial y final
		//Cargar la posicion final del array final con el numero de la posicion inicial del array incial
		
		//Si inicial es 9
			//inicial = 0
		//Sino
			//aumentar inicial
		//Fin_Si
		
		//Para contador=inicial, mientras contador sea menor o igual que 8, aumentar contador
			//array final con posicion contador = array inicial posicion contador
		//Fin_Para
		
		//Mostrar array final
	//Fin

import java.util.Scanner;

public class t7Ej12 {
	public static void main(String[] args){
		
		//Declaración de variables
		int[] arrayInicial = new int[10];
		int[] arrayFinal = new int[10];

		int inicial = 0;
		int finall = 0;

		int otraVariable = 0;
		
		boolean inicialSaltado = false;

		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		//Inicio
			//Leer y cargar numeros en el array inicial
			for(int i=0; i<=9; i++){
				System.out.print("Escriba el numero para la posicion " +(i) +" del array: ");
				arrayInicial[i] = teclado.nextInt();
			}
			
			//Mostrar array inicial
			System.out.println(" ");
			
			System.out.println("o---------------o");
			System.out.println("| Array Inicial |");
			System.out.println("o---------------o");
			for(int i=0; i<=9; i++){
				System.out.printf("Posicion %2d ---> "+arrayInicial[i] +"\n", (i));
			}

			System.out.println(" ");

			//Leer y validar posicion inicial y final
			do{

				do{
					System.out.print("Introduzca el valor de la pocision inicial: ");
					inicial = teclado.nextInt();
				}
				while(inicial<0 || inicial>9);

				do{
					System.out.print("Introduzca el valor de la pocision final: ");
					finall = teclado.nextInt();
				}
				while(finall<0 || finall>9);

				if(inicial>finall){
					System.out.println("La posicion inicial no puede ser mayor que la final.\nVuelva a introducir los datos");
				}
			}
			while(inicial>finall);

			//Cargar la posicion final del array final con el numero de la posicion inicial del array incial
			arrayFinal[finall] = arrayInicial[inicial];
			
			/*//Si inicial es 9
			if(finall==9) {
				//inicial = 0
				finall = 0;
			}
			else {
				//aumentar inicial
				finall++;
			}//Fin_Si*/

		otraVariable = finall+1;

			//Para contador=inicial, mientras contador sea menor o igual que 8, aumentar contador
			for(int i=finall+1; i!=(finall); i++) {
				//array final con posicion contador = array inicial posicion contador



				if(i>9){
					i = 0;
				}

				if((otraVariable-1)==inicial){
					otraVariable++;
					inicialSaltado = true;
				}

				if(otraVariable>10){
					otraVariable = 1;
				}

				arrayFinal[i] = arrayInicial[otraVariable-1];
				
				otraVariable++;
				
				/*if(inicialSaltado==false) {
				
				}
				else{
					otraVariable = otraVariable+2;
				}*/

			}//Fin_Para
			
			//Mostrar array final
			System.out.println(" ");

			System.out.println("o---------------o");
			System.out.println("|  Array Final  |");
			System.out.println("o---------------o");
			for(int i=0; i<=9; i++){
				System.out.printf("Posicion %2d ---> "+arrayFinal[i] +"\n",  i);
			}

		//Fin
		
	}
}
