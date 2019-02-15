package Main;

import Clases.Serie;
import Clases.Videojuego;

import java.util.Scanner;

public class ECO2Refactorizado {
	
	public static Serie[] cargarArraySeries(){
		
		//Declaración de variables
		Serie[] arraySeries = new Serie[5];
		
		String titulo = new String();
		String genero = new String();
		String creador = new String();
		
		//Inicializaciones
		Scanner tecladoS = new Scanner(System.in);
		
		for(int i=0; i<=4; i++) {
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("|       Lectura de la serie numero  " +(i+1) +"       |");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			System.out.print("\tIntroduzca el titulo de la serie: ");
			titulo = tecladoS.nextLine();
			
			System.out.print("\tIntroduzca el genero de la serie: ");
			genero = tecladoS.nextLine();
			
			System.out.print("\tIntroduzca el creador de la serie: ");
			creador = tecladoS.nextLine();
			
			Serie serieI = new Serie(titulo, genero, creador);
			
			arraySeries[i] = serieI;
			
			System.out.println();
			
		}
		
		return arraySeries;
	}
	
	public static Videojuego[] cargarArrayVideojuegos(){
		
		//Declaración de variables
		Videojuego[] arrayVideojuegos = new Videojuego[5];
		
		String titulo = new String();
		String genero = new String();
		String compania = new String();
		
		//Inicializaciones
		Scanner tecladoS = new Scanner(System.in);
		
		for(int i=0; i<=4; i++) {
			
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("|       Lectura del videojuego numero  " +(i+1) +"        |");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			
			System.out.print("\tIntroduzca el titulo del videojuego: ");
			titulo = tecladoS.nextLine();
			
			System.out.print("\tIntroduzca el genero del videojuego: ");
			genero = tecladoS.nextLine();
			
			System.out.print("\tIntroduzca la compania del videojuego: ");
			compania = tecladoS.nextLine();
			
			Videojuego videojuegoI = new Videojuego(titulo, genero, compania);
			
			arrayVideojuegos[i] = videojuegoI;
			
			System.out.println();
			
		}
		
		return arrayVideojuegos;
	}
	
	public static void mostrarSeriesSinAlquilar(Serie arraySeries[]){
		System.out.println("=-=-=-= Lista de Series sin alquilar =-=-=-=");
		for(Serie serie : arraySeries){
			if(serie.isPrestado() == false){
				System.out.println(serie.getTitulo());
			}
		}
	}
	
	public static void mostrarVideojuegosSinAlquilar(Videojuego arrayVideojuegos[]){
		System.out.println("=-=-=-= Lista de Videojuegos sin alquilar =-=-=-=");
		for(Videojuego videojuego : arrayVideojuegos){
			if(videojuego.isPrestado() == false){
				System.out.println(videojuego.getTitulo());
			}
		}
	}
	
	public static int alquilarSeries(Serie arraySeries[]){
		
		//Declaración de variables
		int cantidadAlquilada = 0;
		
		//Inicializaciones
		
		arraySeries[0].alquilar();
		arraySeries[1].alquilar();
		arraySeries[2].alquilar();
		
		System.out.println("=-=-=-= Numero de Series que va a alquilar =-=-=-=");
		for(Serie serie : arraySeries){
			if(serie.isPrestado() == true){
				cantidadAlquilada++;
			}
		}
		
		return cantidadAlquilada;
	}
	
	public static int alquilarVideojuegos(Videojuego arrayVideojuegos[]) {
		
		//Declaración de variables
		int cantidadAlquilada = 0;
		
		//Inicializaciones
		
		arrayVideojuegos[3].alquilar();
		arrayVideojuegos[4].alquilar();
		
		System.out.println("=-=-=-= Numero de Videojuegos que va a alquilar =-=-=-=");
		for(Videojuego videojuego : arrayVideojuegos){
			if(videojuego.isPrestado() == true){
				cantidadAlquilada++;
			}
		}
		
		return cantidadAlquilada;
	}
	
	public static void mostrarSerieMasTemporadas(Serie arraySeries[]){
		
		//Declaracion de variables
		int maxTemporadas = 0;
		int serieMasTemporadas = 0;
		
		//Inicializaciones
		
		for(int i=0; i<=2; i++){
			if(arraySeries[i].getTemporadas()>maxTemporadas){
				maxTemporadas = arraySeries[i].getTemporadas();
				serieMasTemporadas = i;
			}
		}
		System.out.println("La serie con más temporadas es " +arraySeries[serieMasTemporadas].getTitulo() +", tiene " +maxTemporadas +" temporadas.");
	}
	
	public static void mostrarVideojuegoMasHoras(Videojuego arrayVideojuegos[]){
		
		//Declaraciones de variables
		int maxHorasEstimadas = 0;
		int videojuegoMasHoras = 0;
		
		for(int i=0; i<=4; i++){
			if(arrayVideojuegos[i].getHorasEstimadas()>maxHorasEstimadas){
				maxHorasEstimadas = arrayVideojuegos[i].getHorasEstimadas();
				videojuegoMasHoras = i;
			}
		}
		System.out.println("El videojuego con más horas estimadas es " +arrayVideojuegos[videojuegoMasHoras].getTitulo() +", tiene " +maxHorasEstimadas +" horas estimadas de juego.");
		
		
	}
	
	public static void main(String[] args){
		
		//Declaraciones de variables
		Serie[] arraySeries;
		Videojuego[] arrayVideojuegos;
		
		int contadorAlquilado = 0;
		
		//cargarArraySeries
		arraySeries = cargarArraySeries();
		
		//cargarArrayVideojuegos
		arrayVideojuegos = cargarArrayVideojuegos();
		
		//mostrarSeriesSinAlquilar
		mostrarSeriesSinAlquilar(arraySeries);
		
		System.out.println();
		
		//mostrarVideojuegosSinAlquilar
		mostrarVideojuegosSinAlquilar(arrayVideojuegos);
		
		//Cambiamos alguna temporada por defecto
		arraySeries[0].setTemporadas(5);
		arrayVideojuegos[3].setHorasEstimadas(70);
		
		System.out.println();
		
		//alquilarSeries
		contadorAlquilado += alquilarSeries(arraySeries);
		
		System.out.println(contadorAlquilado); //Muestro la cantidad de series alquiladas
		
		System.out.println();
		
		contadorAlquilado = 0;
		
		//alquilarVideojuegos
		contadorAlquilado += alquilarVideojuegos(arrayVideojuegos);
		
		System.out.println(contadorAlquilado); //Muestro la cantidad de videojuegos alquilados
		
		System.out.println();
		
		//mostrarSeriesSinAlquilar
		mostrarSeriesSinAlquilar(arraySeries);
		
		System.out.println();
		
		//mostrarVideojuegosSinAlquilar
		mostrarVideojuegosSinAlquilar(arrayVideojuegos);
		
		System.out.println();
		
		//mostrarSerieMasTemporadas
		mostrarSerieMasTemporadas(arraySeries);
		
		System.out.println();
		
		//mostrarVideojuegoMasHoras
		mostrarVideojuegoMasHoras(arrayVideojuegos);
	}
}
