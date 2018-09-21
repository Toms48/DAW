/*
 * Nombre: tema1Ejercicio5
 * 
 * Comentario: Muestra por pantalla el horario
 * 
 * Análisis:
 * 		-Entrada: No tiene
 * 		-Salida: Imprime por pantalla muchos Strings 
 */


public class tema1Ejercicio5 {
	
	public static void main (String[] args) {
		
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String morado = "\033[35m";
		String blanco = "\033[37m";
		
		System.out.println(" ");
		System.out.println("\t o-------o-----------o--------------o---------------o----------------o---------------o");
		System.out.println("\t | HORA  |   LUNES   |    MARTES    |   MIERCOLES   |     JUEVES     |    VIERNES    |");
		System.out.println("\t o-------o-----------o--------------o---------------o----------------o---------------o");
		System.out.println("\t | 08:00 | "+morado+"Sistemas"+blanco+"  | "+rojo+"Programacion"+blanco+" | "+rojo+"Programacion"+blanco+"  |       "+verde+"FOL"+blanco+"      | "+rojo+"Programacion"+blanco+"  |");
		System.out.println("\t | 09:00 |           |              |               |                |               |");
		System.out.println("\t o-------o-----------o--------------o---------------o----------------o---------------o");
		System.out.println("\t | 09:00 | "+morado+"Sistemas"+blanco+"  | "+rojo+"Programacion"+blanco+" | "+rojo+"Programacion"+blanco+"  | "+morado+"Sistemas"+blanco+"       | "+rojo+"Programacion"+blanco+"  |");
		System.out.println("\t | 10:00 |           |              |               |                |               |");
		System.out.println("\t o-------o-----------o--------------o---------------o----------------o---------------o");
		System.out.println("\t | 10:00 | Lenguaje  | "+rojo+"Programacion"+blanco+" | "+rojo+"Programacion"+blanco+"  | "+morado+"Sistemas"+blanco+"       | "+naranja+"Entorno"+blanco+"       |");
		System.out.println("\t | 11:00 | de marcas |              |               |                |               |");
		System.out.println("\t o-------o-----------o--------------o---------------o----------------o---------------o");
		System.out.println("\t | 11:00 |           |              |               |                |               |");
		System.out.println("\t | 11:30 |           |              |               |                |               |");
		System.out.println("\t o-------o-----------o--------------o---------------o----------------o---------------o");
		System.out.println("\t | 11:30 | Lenguaje  | "+morado+"Sistemas"+blanco+"     | "+azul+"Base de Datos"+blanco+" | "+azul+"Base de Datos"+blanco+"  | "+naranja+"Entorno"+blanco+"       |");
		System.out.println("\t | 12:30 | de marcas |              |               |                |               |");
		System.out.println("\t o-------o-----------o--------------o---------------o----------------o---------------o");
		System.out.println("\t | 12:30 | "+naranja+"Entorno"+blanco+"   | "+morado+"Sistemas"+blanco+"     | "+azul+"Base de Datos"+blanco+" | "+azul+"Base de Datos"+blanco+"  | Lenguaje de   |");
		System.out.println("\t | 13:30 |           |              |               |                | marcas        |");
		System.out.println("\t o-------o-----------o--------------o---------------o----------------o---------------o");
		System.out.println("\t | 13:30 |    "+verde+"FOL"+blanco+"    |     "+verde+"FOL"+blanco+"      | "+azul+"Base de Datos"+blanco+" | "+azul+"Base de Datos"+blanco+"  | Lenguaje de   |");
		System.out.println("\t | 14:30 |           |              |               |                | marcas        |");
		System.out.println("\t o-------o-----------o--------------o---------------o----------------o---------------o");
		System.out.println(" ");
	}
}

