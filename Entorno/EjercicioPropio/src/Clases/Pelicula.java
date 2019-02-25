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
		char respuesta = ' ';
		int opcionMenuGenero = 0;

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
				
				System.out.println();
				System.out.println("Se ha actualizado correctamente");
			break;

			case 2:
				System.out.println("El antiguo director era " +getDirector());
				System.out.println();
				System.out.print  ("Introduzca el nuevo director: ");
				setDirector(tecladoS.nextLine());
				
				System.out.println();
				System.out.println("Se ha actualizado correctamente");
			break;

			case 3:
				System.out.println("Antes duraba " +getDuracion() +" minutos");
				System.out.println();
				System.out.print  ("Introduzca la nueva duracion: ");
				setDuracion(tecladoN.nextInt());
				
				System.out.println();
				System.out.println("Se ha actualizado correctamente");
			break;

			case 4:
				do{
					System.out.println("El antiguo genero era " +getGenero());
					System.out.println();
					System.out.println("o-=-=-=-=-=-=-= La lista de Generos =-=-=-=-=-=-=-=-o");
					System.out.println("|                                                   |");
					System.out.println("| 1. Ciencia Ficcion                                |");
					System.out.println("| 2. Terror                                         |");
					System.out.println("| 3. Comedia                                        |");
					System.out.println("| 4. Drama                                          |");
					System.out.println("| 5. Fantasia                                       |");
					System.out.println("|                                                   |");
					System.out.println("o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
					System.out.print  ("Introduzca el nuevo género: ");
					opcionMenuGenero = tecladoN.nextInt();
				}
				while(opcionMenuGenero<1 || opcionMenuGenero>5);
				
				switch (opcionMenuGenero){
					case 1: setGenero(enumGenero.CienciaFiccion); break;
					case 2: setGenero(enumGenero.Terror); break;
					case 3: setGenero(enumGenero.Comedia); break;
					case 4: setGenero(enumGenero.Drama); break;
					case 5: setGenero(enumGenero.Fantasia); break;
				}
				
				System.out.println();
				System.out.println("Se ha actualizado correctamente");
			break;

			case 5:
				
				do{
					System.out.println("El antiguo genero era " +getGenero());
					System.out.println();
					System.out.println("o-=-=-=-=-= La lista de Clasificaciones =-=-=-=-=-=-o");
					System.out.println("|                                                   |");
					System.out.println("| 1. Apto para todos los públicos                   |");
					System.out.println("| 2. Mayores de 7 años                              |");
					System.out.println("| 3. Mayores de 12 años                             |");
					System.out.println("| 4. Mayores de 16 años                             |");
					System.out.println("| 5. Mayores de 18 años                             |");
					System.out.println("|                                                   |");
					System.out.println("o-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-o");
					System.out.print  ("Introduzca el nuevo género: ");
					opcionMenuGenero = tecladoN.nextInt();
				}
				while(opcionMenuGenero<1 || opcionMenuGenero>5);
				
				switch (opcionMenuGenero){
					case 1: setGenero(enumGenero.CienciaFiccion); break;
					case 2: setGenero(enumGenero.Terror); break;
					case 3: setGenero(enumGenero.Comedia); break;
					case 4: setGenero(enumGenero.Drama); break;
					case 5: setGenero(enumGenero.Fantasia); break;
				}
				
				System.out.println();
				System.out.println("Se ha actualizado correctamente");
				
				System.out.println("La antigua clasificación de edad era " +getClasificacionEdad());
				System.out.println();
				System.out.print  ("Introduzca la nueva clasificación: ");
				setClasificacionEdad(tecladoS.nextLine());
				
				System.out.println();
				System.out.println("Se ha actualizado correctamente");
			break;

			case 6:
				if(isVista()){
					do {
						System.out.println("Has visto " + getTitulo() + " " + getVecesVista() + " veces");
						System.out.println();
						System.out.print("Introduzca la nueva cantidad actualizada: ");
						setVecesVista(tecladoN.nextInt());
					}
					while(getVecesVista()<1);
				}
				else{
					do {
						System.out.println("Tienes " + getTitulo() + " marcada como NO VISTA");
						System.out.println();
						System.out.print  ("Introduzca la cantidad de veces que la ha visto (se actualizara la pelicula a VISTA): ");
						setVecesVista(tecladoN.nextInt());
						setVista(true);
					}
					while(getVecesVista()<1);
				}
				
				System.out.println();
				System.out.println("Se ha actualizado correctamente");
			break;

			case 7:
				if(isVista()){
					do{
						System.out.println("La tienes marcada como VISTA");
						System.out.println();
						System.out.print  ("¿Quieres marcarla como NO VISTA? Se actualizara a 0 veces vista. s/n: ");
						respuesta = Character.toLowerCase(tecladoS.next().charAt(0));
					}
					while(respuesta!='s' && respuesta!='n');
					
					if(respuesta == 's'){
						setVista(false);
						setVecesVista(0);
						
						System.out.println();
						System.out.println("Se ha marcado su pelicula como NO VISTA");
					}
					else{
						
						System.out.println();
						System.out.println("Se mantiene como estaba antes");
					}
				}
				else{
					do{
						System.out.println("La tienes marcada como NO VISTA");
						System.out.println();
						System.out.print  ("¿Quieres marcarla como VISTA? Se actualizara a 1 vez vista. s/n: ");
						respuesta = Character.toLowerCase(tecladoS.next().charAt(0));
					}
					while(respuesta!='s' && respuesta!='n');
					
					if(respuesta == 's'){
						setVista(true);
						setVecesVista(1);
						
						System.out.println();
						System.out.println("Se ha marcado su pelicula como VISTA");
					}
					else{
						
						System.out.println();
						System.out.println("Se mantiene como estaba antes");
					}
				}
			break;

			case 8:
				do {
					System.out.println("La nota que le tenias puesta era un " +getNota());
					System.out.println();
					System.out.print("Introduzca la nueva nota que le quieras dar (1-10): ");
					setNota(tecladoN.nextInt());
				}
				while(getNota()<1 || getNota()>10);
				
				System.out.println();
				System.out.println("Se ha actualizado correctamente");
			break;
		}

	}

}
