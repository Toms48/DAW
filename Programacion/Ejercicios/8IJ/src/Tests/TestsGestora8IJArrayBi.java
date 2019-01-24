package Tests;

import Gestora.Gestora8IJArrayBi;

public class TestsGestora8IJArrayBi {
	public static void main(String[] args){
		
		//Tests Ejercicio 29
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 29 =-=-=-=-=-=-=-=-=-=-=-=-=");
		
		int[][] arrayBiAleatorio = Gestora8IJArrayBi.generaArrayBiInt(3,5,0,9);
		
		for(int i=0; i<=arrayBiAleatorio.length-1; i++){
			for(int j=0; j<=arrayBiAleatorio[0].length-1; j++){
				System.out.print(arrayBiAleatorio[i][j] +" ");
			}
			System.out.println();
		}
		
		//Tests Ejercicio 30
		System.out.println();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 30 =-=-=-=-=-=-=-=-=-=-=-=-=");
		
		int[] arrayFila = Gestora8IJArrayBi.filaDeArrayBiInt(1, arrayBiAleatorio);
		
		for(int i=0; i<=arrayFila.length-1; i++){
			System.out.print(arrayFila[i] +" ");
		}
		
		System.out.println();
		
		//Tests Ejercicio 31
		System.out.println();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 31 =-=-=-=-=-=-=-=-=-=-=-=-=");
		
		int[] arrayColumna = Gestora8IJArrayBi.columnaDeArrayBiInt(2, arrayBiAleatorio);
		
		for(int i=0; i<=arrayColumna.length-1; i++){
			System.out.println(arrayColumna[i]);
		}
		
		System.out.println();
		
		//Tests Ejercicio 32
		System.out.println();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 32 =-=-=-=-=-=-=-=-=-=-=-=-=");
		
		int[] arrayCoordenadas = Gestora8IJArrayBi.coordenadasEnArrayBiInt(5, arrayBiAleatorio);
		
		if(arrayCoordenadas[0]==-1 && arrayCoordenadas[1]==-1){
			System.out.println("Lo siento, pero no he encontrado el numero indicado en el array");
		}
		else{
			System.out.println("Las coordenadas del numero son {" +arrayCoordenadas[0] +"," +arrayCoordenadas[1] +"}");
		}
		
		//Tests Ejercicio 33
		System.out.println();
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= Ejercicio 33 =-=-=-=-=-=-=-=-=-=-=-=-=");
		
		int[][] arr1 = {{7,7,1},
						{9,9,6},
						{7,7,1}};

		int[][] arr2 = {{7,7,6},
						{9,9,6},
						{7,7,1}};

		int[][] arr3 = {{7,7,1},
						{7,7,1},
						{9,9,6},
						{7,7,1},
						{7,7,1}};
		
		Gestora8IJArrayBi.esPuntoDeSilla(2,2, arr3);
		
	}
}
