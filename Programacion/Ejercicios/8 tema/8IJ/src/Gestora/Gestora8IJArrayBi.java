package Gestora;

import java.lang.Math;

public class Gestora8IJArrayBi {

/**************************************************************************
Interfaz
Comentario: Genera un array de tamaño n x m con número aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
Cabecera: int[][] generaArrayBiInt(int nFilas, int mColumnas, int minimo, int maximo)
Precondiciones:
 	- maximo no puede ser mayor que minimo
 	- nFilas y mColumnas no pueden ser menores o iguales que 0
Entrada:
	- Un int para el numero de filas
	- Un int para el numero de columnas
 	- Un int para el minimo numero aleatorio
 	- UN int para el maximo numero aleatorio
Salida: Un array bidimensional
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int[][] generaArrayBiInt(int nFilas, int mColumnas, int min, int max){
		
		int[][] arrayBi = new int[nFilas][mColumnas];
		
		for(int i=0; i<=nFilas-1; i++){
			for(int j=0; j<=mColumnas-1; j++){
				arrayBi[i][j] = (int)(Math.random()*(max-min+1))+min; //El +1 es porque al restar max y min no tiene en cuenta todos los numeros del rango
				
			}
		}
		
		return arrayBi;
	}
	
/**************************************************************************
Interfaz
Comentario: Devuelve la fila i-ésima del array que se pasa como parámetro.
Cabecera: int[] filaDeArrayBiInt(int fila, int[][] arrayBi)
Precondiciones: No tiene
Entrada:
 	- Un int para la i-ésima fila
 	- Un array bidimensional
Salida: Un array
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int[] filaDeArrayBiInt(int fila, int[][] arrayBi){
		
		int[] arrayFila = new int[arrayBi[fila].length];
		
		for(int i=0; i<=arrayBi[fila].length-1; i++){
			arrayFila[i] = arrayBi[fila][i];
		}
		
		return arrayFila;
	}
	
/**************************************************************************
Interfaz
Comentario: Devuelve la columna j-ésima del array que se pasa como parámetro.
Cabecera: int[] columnaDeArrayBiInt(int columna, int[][] arrayBi)
Precondiciones: No tiene
Entrada:
	- Un int para la j-ésima fila
	- Un array bidimensional
Salida: Un array
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int[] columnaDeArrayBiInt(int columna, int[][] arrayBi){
		
		int[] arrayColumna = new int[arrayBi.length];
		
		for(int i=0; i<=arrayBi.length-1; i++){
			arrayColumna[i] = arrayBi[i][columna];
		}
		
		return arrayColumna;
	}
	
/**************************************************************************
Interfaz
Comentario: Devuelve la fila y la columna (en un array con dos elementos) de la primera ocurrencia de un número dentro de un array bidimensional.
Cabecera: int[] coordenadasEnArrayBiInt(int numero, int[][] arrayBi)
Precondiciones: No tiene
Entrada:
 	- Un int para el número que buscamos
 	- Un array bidimensional donde buscar
Salida: Un array (solo de dos números)
E/S: No hay
Postcondiciones:
 	- Si el número no se encuentra en el array, la función devuelve el array {-1, -1}.
**************************************************************************/

	public static int[] coordenadasEnArrayBiInt(int numero, int[][] arrayBi){
		
		boolean encontrado = false;
		int[] arrayCoordenadas = {-1,-1};
		
		for(int i=0; i<=arrayBi.length-1 && encontrado==false; i++){
			for(int j=0; j<=arrayBi[0].length-1 && encontrado==false; j++){
				if(arrayBi[i][j] == numero){
					arrayCoordenadas[0] = i;
					arrayCoordenadas[1] = j;
					
					encontrado = true;
				}
			}
		}
		
		return arrayCoordenadas;
	}
	
/**************************************************************************
Interfaz
Comentario: Dice si un número es o no punto de silla, es decir, mínimo en su fila y máximo en su columna.
Cabecera: boolean esPuntoDeSilla(int fila, int columna, int[][] arrayBi)
Precondiciones:
 	- Los valores fila y columna no pueden ser menores que 0 ni mayores que el maximo del array
Entrada:
	- Un int para la fila
 	- Un int para la columna
	- Un array bidimensional
Salida: Un boolean
E/S: No hay
Postcondiciones:
 	- Si el número de las coordenadas es punto de silla devuleve true
 	- Si el número de las coordenadas NO es punto de silla devuelve false
**************************************************************************/

	public static boolean esPuntoDeSilla(int fila, int columna, int[][] arrayBi){
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		int posicionMin = -1;
		int posicionMax = -1;
		
		boolean puntoSilla = false;
			
		int[] arrayFila = Gestora8IJArrayBi.filaDeArrayBiInt(fila,arrayBi);
		int[] arrayColumna = Gestora8IJArrayBi.columnaDeArrayBiInt(columna,arrayBi);
		
		System.out.println("Imprime la fila indicada");
		for(int i=0; i<=arrayFila.length-1; i++){
			System.out.print(arrayFila[i] +" ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Imprime la columna indicada");
		for(int i=0; i<=arrayColumna.length-1; i++){
			System.out.println(arrayColumna[i]);
		}

		for(int i=0; i<=arrayFila.length-1; i++){
			if(arrayFila[i]<=min){
				min = arrayFila[i];
				posicionMin = i;
			}
		}

		/*for(int i=0; i<=arrayFila.length-1; i++){

			if(arrayFila[i]<=min){
				if(arrayFila[i]==min && contadorIguales>=2){
					posicionMin = -1;
				}
				else{
					min = arrayFila[i];
					posicionMin = i;

					if(arrayFila[i] == min){
						contadorIguales++;
					}
				}
			}
		}*/
		
		System.out.println();
		System.out.println("El menor valor de la fila es " +min);
		System.out.println("Su posicion en la fila es " +posicionMin);

		//contadorIguales = 1;

		for(int i=0; i<=arrayColumna.length-1; i++){
			if(arrayColumna[i]>=max){
				max = arrayColumna[i];
				posicionMax = i;
			}
		}

		/*for(int i=0; i<=arrayColumna.length-1; i++){

			if(arrayColumna[i]>max){
				max = arrayColumna[i];
				posicionMax = i;
			}
			else{
				if(arrayColumna[i] == max){
					contadorIguales++;
				}
			}

			if(contadorIguales>=2){
				posicionMax = -1;
			}
		}*/
		
		System.out.println();
		System.out.println("El mayor valor de la columna es " +max);
		System.out.println("Su posicion en la columna es " +posicionMax);
		
		if(posicionMin==columna && posicionMax==fila){
			puntoSilla=true;
		}
		
		System.out.println();
		System.out.println(puntoSilla);
		
		return puntoSilla;
	}

}
