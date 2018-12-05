package Tema7Parte2;

/*
 *   Nombre: t7Ej4P2
 *
 *   Comentario:	Modifica el programa anterior de tal forma que las sumas parciales y
 *   				la suma total aparezcan en la pantalla con un pequeño retardo,
 *   				dando la impresión de que el ordenador se queda "pensando" antes de mostrar los números.
 *
 *   Análisis:
 *
 *       Entradas: no tiene
 *
 *       Salidas: Por pantalla
 *
 * */

//PG
	//Inicio
		//Generar 20 numeros aleatorios y cargarlos en el array
		//Mostrar la tabla con los sumatorios
	//Fin

public class t7Ej4P2 {
	public static void main(String[] args) throws InterruptedException {
		
		//Declaracion de variables
		int sumatorioH = 0;
		int sumatorioV = 0;
		
		int sumatorioTotal = 0;
		
		int[][] arrayBi = new int[4][5];
		
		//Inicializaciones
		
		//Inicio
			//Generar 20 numeros aleatorios y cargarlos en el array
			for(int i=0; i<=3; i++){
				for(int j=0; j<=4; j++){
					arrayBi[i][j] = (int)(Math.random()*900)+100;
				}
			}
			
			System.out.println(" ");
			
			//Mostrar la tabla con los sumatorios
			for(int i=0; i<=3; i++){
				for(int j=0; j<=4; j++){
					
					Thread.sleep(500);
					
					System.out.print(arrayBi[i][j] +" ");
					sumatorioH = sumatorioH+arrayBi[i][j];
				}
				
				Thread.sleep(2000);
				
				System.out.print(sumatorioH);
				System.out.println(); //Salto de linea
				sumatorioTotal = sumatorioTotal+sumatorioH;
				sumatorioH = 0;
			}
			
			for(int i=0; i<=4; i++){
				for(int j=0; j<=3; j++){
					//System.out.print((arrayBi[j][i]+arrayBi[j][i]+arrayBi[j][i]+arrayBi[j][i]) +" ");
					sumatorioV = sumatorioV+arrayBi[j][i];
				}
				
				Thread.sleep(2000);
				
				System.out.print(sumatorioV +" ");
				sumatorioTotal = sumatorioTotal+sumatorioV;
				sumatorioV = 0;
			}
		
			Thread.sleep(3000);
			
			System.out.print(sumatorioTotal);
		//Fin
	
	}
}
