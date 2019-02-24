/*	Nombre: Pelicula
 *
 * 	Básicas:
 * 		- titulo			=> String 		=> Consultable y Modificable
 * 		- director			=> String 		=> Consultable y Modificable
 * 		- duracion			=> int	  		=> Consultable y Modificable
 * 		- genero			=> enumGenero	=> Consultable y Modificable
 * 		- clasificacionEdad	=> enumCE		=> Consultable y Modificable
 * 		- vecesvista		=> int			=> Consultable y Modificable
 * 		- vista				=> boolean		=> Consultable y Modificable
 * 		- nota				=> int			=> Consultable y Modificable
 *
 * 		- cantidadHorasTotales => double	=> Consultable y Modificable
 *
 * 	Derivadas:
 * 		No tiene
 *
 * 	Compartidas:
 * 		No hay
 *
 * 	Restricciones:
 * 		- La duracion tiene que estar en minutos
 * 		- Las veces que la hemos visto no puede ser menor que 1
 * 			(Porque no puede ser negativo y no puede ser 0 porque si no es que no la hemos visto ni una vez, para eso tenemos un atributo)
 * 		- Si es false es que está pendiente de ver, si es true está vista
 * 		- La nota solo puede ser entre 1 y 10 (ambos incluidos)
 *
 * 	Métodos añadidos:
 * 		No tiene
 */

package Clases;

import Enums.*;

import java.util.Scanner;
import java.util.ArrayList;

public class Pelicula {
	
	//Atributos
	private String titulo = new String();
	private String director = new String();
	private int duracion;
	private enumGenero genero;
	private enumCE clasificacionEdad;
	private int vecesVista;
	private boolean vista;
	private int nota;
	
	private static double horasTotales;
	
	//Constructor por defecto
	public Pelicula(){
		titulo = "Titulo por defecto";
		director = "Director por defecto";
		duracion = 0;
		genero = enumGenero.PorDefecto;
		clasificacionEdad = enumCE.PorDefecto;
		vecesVista = 0;
		vista = false;
		nota = 0;
	}
	
	//Constructor con parámetros
	public Pelicula(String titulo, String director, int duracion, enumGenero genero, enumCE clasificacionEdad, int vecesVista, boolean vista, int nota){
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		this.genero = genero;
		this.clasificacionEdad = clasificacionEdad;
		this.vecesVista = vecesVista;
		this.vista = vista;
		this.nota = nota;
	}
	
	//Constructor con parámetros (solo el titulo)
	public Pelicula(String titulo){
		this.titulo = titulo;
	}
	
	//Gets
	public String getTitulo() {
		return titulo;
	}

	public String getDirector() {
		return director;
	}

	public int getDuracion() {
		return duracion;
	}

	public enumGenero getGenero() {
		return genero;
	}

	public enumCE getClasificacionEdad() {
		return clasificacionEdad;
	}

	public int getVecesVista() {
		return vecesVista;
	}

	public boolean isVista() {
		return vista;
	}

	public int getNota() {
		return nota;
	}

	public static double getHorasTotales() {
		return horasTotales;
	}

	public void setGenero(enumGenero genero) {
		this.genero = genero;
	}

	public void setClasificacionEdad(enumCE clasificacionEdad) {
		this.clasificacionEdad = clasificacionEdad;
	}

	//Sets
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void setVecesVista(int vecesVista) {
		this.vecesVista = vecesVista;
	}

	public void setVista(boolean vista) {
		this.vista = vista;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public static void setHorasTotales(double horasTotales) {
		Pelicula.horasTotales = horasTotales;
	}

	//Métodos sobrescritos
	@Override
	public String toString() {
		
		String s = "Titulo: " +getTitulo() +
				"\nDirector: " +getDirector() +
				"\nDirector: " +getDirector() +
				"\nDirector: " +getDirector() +
				"\nDirector: " +getDirector() +
				"\nDirector: " +getDirector();
		
		return s;
	}

	//Métodos añadidos
	public void actualizarHorasTotales(ArrayList<Pelicula> arrayPeliculas){
		int minutosTotales = 0;

		for(Pelicula peli:arrayPeliculas){
			minutosTotales += peli.getDuracion();
		}

		setHorasTotales(minutosTotales/60);

		System.out.println("Se han actualizado las horas totales.");
	}

	public void editarInfo(){

		int opcionMenuEditar = 0;

		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);

		System.out.println("¿Qué quieres editar?");
		System.out.println("1. Titulo");
		System.out.println("2. Director");
		System.out.println("3. Duracion");
		System.out.println("4. Genero");
		System.out.println("5. Clasificación de edad");
		System.out.println("6. Veces que la has visto");
		System.out.println("7. Si está vista o no");
		System.out.println("8. Nota");
		System.out.println("9. Salir");
		System.out.print  ("Su opcion es: ");
		opcionMenuEditar = tecladoN.nextInt();

		switch (opcionMenuEditar){
			case 1:
				System.out.println("El antiguo título era \"" +getTitulo() +"\"");
				System.out.println();
				System.out.print  ("Introduzca el nuevo título: ");
				setTitulo(tecladoS.nextLine());
			break;

			case 2:
				System.out.println("El antiguo director era " +getDirector());
				System.out.println();
				System.out.print  ("Introduzca el nuevo director: ");
				setDirector(tecladoS.nextLine());
			break;

			case 3:
				System.out.println("Antes duraba " +getDuracion() +" minutos");
				System.out.println();
				System.out.print  ("Introduzca la nueva duracion: ");
				setDuracion(tecladoN.nextInt());
			break;

			case 4:
				System.out.println("El antiguo genero era " +getGenero());
				System.out.println();
				System.out.print  ("Introduzca el nuevo género: ");
				setTitulo(tecladoS.nextLine());
			break;

			case 5:
				System.out.println("La antigua clasificación de edad era " +getClasificacionEdad());
			break;

			case 6:
				System.out.println("Has visto " +getTitulo() +" " +getVecesVista() +" veces");
			break;

			case 7:
				System.out.println("El antiguo titulo era \"" +getTitulo() +"\"");
			break;

			case 8:
				System.out.println("La nota que le tenias puesta era un " +getNota());
			break;
		}

	}

}
