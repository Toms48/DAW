/*
 * Nombre: tema4Ejercicio15
 * 
 * Comentario: Escribe un programa que pinte una pirámide rellena con un carácter introducido por teclado que podrá ser
 * 				una letra, un número o un símbolo como *, +, -, $, &, etc.
 * 				El programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide está apuntando hacia
 * 				arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 * 
 * Análisis
 * 
 * 		Entradas:
 * 			- char para rellenar la pirámide
 * 
 * 		Salidas: Por pantalla
 * 
 */

//PG
	//Inicio
		//Preguntar y leer caracter de relleno
		//Mostrar menu de orientación de la pirámide y leer opcion
		//Según opcion del menu
			//Caso 1
				//Vertice arriba
			//Caso 2
				//Vertice abajo
			//Caso 3
				//Vertice a la izquierda
			//Caso 4
				//Vertice a la derecha
		//Fin_Segun
	//Fin
	
import java.util.Scanner;

public class tema4Ejercicio15 {
	
	public static void main (String[] args) {
		
		//Declaracion de variables
		char relleno = ' ';
		int opcionMenu = 0;
		
		//Inicializaciones
		Scanner teclado = new Scanner (System.in);
		
		//Inicio
			//Preguntar y leer caracter de relleno
			System.out.print("Introduzca un caracter para rrllenar su piramide: ");
			relleno = teclado.next().charAt(0);
			
			//Mostrar menu de orientación de la pirámide y leer opcion
			System.out.println(" ");
			System.out.println("Indique que orientacion quiere darle a la pirámide");
			System.out.println(" ");
			System.out.println("1) Arriba");
			System.out.println("2) Abajo");
			System.out.println("3) Izquierda");
			System.out.println("4) Derecha");
			System.out.print("Su opcion es: ");
			opcionMenu = teclado.nextInt();
			
			//Según opcion del menu
			switch(opcionMenu){
				
				case 1: //Vertice arriba
					System.out.println("           ");
					System.out.println("     *     ");
					System.out.println("    *"+relleno +"*    ");
					System.out.println("   *"+relleno+relleno+relleno   +"*   ");
					System.out.println("  *"+relleno+relleno+relleno+relleno+relleno     +"*  ");
					System.out.println(" *"+relleno+relleno+relleno+relleno+relleno+relleno+relleno       +"* ");
					System.out.println("***********");
				break;
				
				case 2: //Vertice abajo
					System.out.println("");
					System.out.println("***********");
					System.out.println(" *"+relleno+relleno+relleno+relleno+relleno+relleno+relleno       +"* ");
					System.out.println("  *"+relleno+relleno+relleno+relleno+relleno     +"*  ");
					System.out.println("   *"+relleno+relleno+relleno   +"*   ");
					System.out.println("    *"+relleno +"*    ");
					System.out.println("     *     ");
				break;
				
				case 3: //Vertice a la izquierda
					System.out.println("");
					System.out.println("*");
					System.out.println("*"+relleno +"*");
					System.out.println("*"+relleno+relleno   +"*");
					System.out.println("*"+relleno+relleno+relleno    +"*");
					System.out.println("*"+relleno+relleno+relleno+relleno     +"*");
					System.out.println("*"+relleno+relleno+relleno+relleno+relleno      +"*");
					System.out.println("*"+relleno+relleno+relleno+relleno     +"*");
					System.out.println("*"+relleno+relleno+relleno    +"*");
					System.out.println("*"+relleno+relleno   +"*");
					System.out.println("*"+relleno +"*");
					System.out.println("*");
				break;
				
				case 4: //Vertice a la derecha
					System.out.println("");
					System.out.println(													"       *");
					System.out.println("     *"+relleno 										+"*");
					System.out.println("    *"+relleno+relleno   							+"*");
					System.out.println("   *"+relleno+relleno+relleno    					+"*");
					System.out.println("  *"+relleno+relleno+relleno+relleno     			+"*");
					System.out.println(" *"+relleno+relleno+relleno+relleno+relleno      +"*");
					System.out.println("  *"+relleno+relleno+relleno+relleno     			+"*");
					System.out.println("   *"+relleno+relleno+relleno    					+"*");
					System.out.println("    *"+relleno+relleno  							+"*");
					System.out.println("     *"+relleno 										+"*");
					System.out.println("       *");
				break;
				
			}//Fin_Segun
		//Fin
		
	}
}

