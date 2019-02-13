package Gestora;

import java.util.Scanner;

public class GestoraAnuncios {

/**************************************************************************
Interfaz
Comentario: Guardará/Registrará las marcas que introduzca el usuario por pantalla
Cabecera: String[] GestionarMarcas()
Precondiciones: No tiene
Entrada: No tiene
Salida: Un array de String (con las marcas)
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static String[] gestionarMarcas(){
		
		int cantidadAnunciantes = 0;
		
		Scanner tecladoN = new Scanner(System.in); //Scanner para números
		Scanner tecladoS = new Scanner(System.in); //Scanner para Strings
		
		System.out.println("¿Cuantos anunciantes quiere gestionar?");
		cantidadAnunciantes = tecladoN.nextInt();
		
		String[] arrayAnunciantes = new String[cantidadAnunciantes];
		
		for(int i=0; i<=arrayAnunciantes.length-1; i++){
			System.out.print("Inserte el nombre del anunciante (" +(i+1) +"): ");
			arrayAnunciantes[i] = tecladoS.nextLine().toLowerCase();
			
			if(arrayAnunciantes[i].isEmpty()){
				System.out.println("No deje el hueco en blanco, escriba una marca por favor.");
				i--;
			}
			
		}
		
		return arrayAnunciantes;
	}
	
/**************************************************************************
Interfaz
Comentario: Muestra por pantalla el menu de opciones
Cabecera: void mostrarMenu()
Precondiciones: No tiene
Entrada: No tiene
Salida: Por pantalla
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/
	
	public static void mostrarMenu(){
		System.out.println("Elija una de las siguientes opciones: ");
		System.out.println("1. Regitro de anuncios");
		System.out.println("2. Importe gastado");
		System.out.println("3. Porcentaje con descuento");
		System.out.println("4. Total a pagar");
		System.out.println("5. Salir");
		System.out.print("Que opcion quiere elegir: ");
	}
	
/**************************************************************************
Interfaz
Comentario: Se mostrarán, de forma numerada, los nombres de los anunciantes registrados y el usuario deberá seleccionar uno de forma numérica.
 			Se pedirá hora de comienzo (controlar valores no válidos) y duración en segundos del anuncio.
 			Una vez recogidos esos datos, se mostrará la hora y el anunciante con solo la primera y última letra en mayúscula.
 
Cabecera: void registroDeMarcasCantidadAnuncios(String[] arraryMarcas)
Precondiciones: No tiene
Entrada: Un array de String con las marcas
Salida: Por pantalla
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int registroDeMarcasCantidadAnuncios(String[] arrayMarcas){
		
		int contadorAnuncios = 0;
		
		int opcionAnuncio = 0;
		int numero = 1;
		
		int hora = 0;
		int segundos = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(String marca : arrayMarcas){
			
			System.out.print(numero +" ");
			
			if(marca.length()<5){
				
				System.out.print(marca.toUpperCase());
				
				for(int i=1; i<=5-marca.length(); i++){
					System.out.print("-");
				}
				
				System.out.println();
				
			}
			else{
				System.out.println(marca.toUpperCase());
			}
			
			numero++;
		}
		
		System.out.println();
		
		do{
			System.out.println("¿Que anunciante quiere elegir?: ");
			opcionAnuncio = teclado.nextInt();
			opcionAnuncio = opcionAnuncio-1;
		}
		while(opcionAnuncio<0 || opcionAnuncio>arrayMarcas.length-1);
		
		System.out.print("Usted a elegido el anunciante: ");
		
		if(arrayMarcas[opcionAnuncio].length()<5){
			
			System.out.print(arrayMarcas[opcionAnuncio].toUpperCase());
			
			for(int i=1; i<=5-arrayMarcas[opcionAnuncio].length(); i++){
				System.out.print("-");
			}
			
			System.out.println();
			
		}
		else{
			System.out.println(arrayMarcas[opcionAnuncio].toUpperCase());
		}
		
		System.out.println();
		System.out.println();
		
		do{
			System.out.print("¿En que hora da comienzo el anuncio?(escriba solo la hora): ");
			hora = teclado.nextInt();
			
			if(hora<0 || hora>23){
				System.out.println("Escriba una hora entre 0 y 23.");
			}
		}
		while(hora<0 || hora>23);
		
		System.out.print("El anunciante ");
		
		if(arrayMarcas[opcionAnuncio].length()<5){
			
			System.out.print(arrayMarcas[opcionAnuncio].toUpperCase().substring(0,1)+"-");
			
		}
		else{
			System.out.print(arrayMarcas[opcionAnuncio].toUpperCase().substring(0,1) + arrayMarcas[opcionAnuncio].toUpperCase().substring(arrayMarcas[opcionAnuncio].length()-1));
		}
		
		System.out.print(" a registrado un anuncio a las " +hora +" horas");
		
		contadorAnuncios++;
		
		return contadorAnuncios;
	}
	
/**************************************************************************
Interfaz
Comentario: Se mostrarán, de forma numerada, los nombres de los anunciantes registrados y el usuario deberá seleccionar uno de forma numérica.
Se pedirá hora de comienzo (controlar valores no válidos) y duración en segundos del anuncio.
Una vez recogidos esos datos, se mostrará la hora y el anunciante con solo la primera y última letra en mayúscula.

Cabecera: void registroDeMarcasCantidadSegundos(String[] arraryMarcas)
Precondiciones: No tiene
Entrada: Un array de String con las marcas
Salida: Por pantalla
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int registroDeMarcasCantidadSegundos(){
		
		int segundos = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println();
		
		do{
			System.out.print("Duracion del anuncio en segundos: ");
			segundos = teclado.nextInt();
			
			if(segundos<=0){
				System.out.println("Introduzca una cantidad de segundos.");
			}
		}
		while(segundos<=0);
		
		return segundos;
	}
	
/**************************************************************************
Interfaz
Comentario: Al elegir esta opción deberá mostrarse el número de anuncios registrados,
 			la duración total en segundos de todos los anuncios y el importe total gastado teniendo en cuenta que:
 
 - Cada anuncio cuesta 1500€.
 - Cada segundo en pantalla son 100€.

Cabecera: int importeGastado(int cantidadAnuncios, int cantidadSegundos)
Precondiciones: No tiene
Entrada:
 	- Un int para la cantidad de anuncios
 	- Un int para la cantidad de segundos
Salida: UN int
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int importeGastado(int cantidadAnuncios, int cantidadSegundos){
		
		int gastoBaseXcantidadAnuncios = cantidadAnuncios*1500;
		int gastoSegundosXcantidadSegundos = cantidadSegundos*100;
		
		int gastoTotal = gastoBaseXcantidadAnuncios + gastoSegundosXcantidadSegundos;
		
		System.out.println();
		
		System.out.println("Su compañia lleva " +cantidadAnuncios +" anuncios, con un tiempo total de " +cantidadSegundos +" segundos.");
		System.out.println("El importe total es de " +gastoTotal);
		
		System.out.println();
		
		return gastoTotal;
		
	}
	
/**************************************************************************
Interfaz
Comentario: Puesto que la cadena de televisión está interesada en que se contraten muchos anuncios de deportes,
 			aplicará un descuento según el número de anuncios registrados (usar una función o método):
 - Si se emiten 2 anuncios, un 4% de descuento.
 - Si se emiten 3 anuncios, un 9% de descuento.
 - Si se emiten 4 anuncios, un 16% de descuento. Etc..
 
 Nota: Si solo se televisa un anuncio, el porcentaje aplicado será del 1%. Controlar no sobrepasar el 90% de descuento (aplicar el 1% para esos casos)

Cabecera: int porcentajeDescuento(int cantidadAnuncios, int totalGastado)
Precondiciones: No tiene
Entrada:
- Un int para la cantidad de anuncios
- Un int para la cantidad de segundos
Salida: No tiene
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int porcentajeDescuento(int cantidadAnuncios, int totalGastado){
		
		int totalConDescuento = 0;
		int porcentaje = cantidadAnuncios*cantidadAnuncios;
		
		if(cantidadAnuncios == 1 || cantidadAnuncios>9){
			totalConDescuento = totalGastado - (1*totalGastado)/100;
		}
		else{
			totalConDescuento = totalGastado - (porcentaje*totalGastado)/100;
		}
		
		return totalConDescuento;
	}

	public static void mostrarSaludo(int totalGastadoConDescuento){
		
		System.out.println();
		
		if(totalGastadoConDescuento>=15000){
			System.out.println("Hasta pronto.");
		}
		else {
			System.out.println("Le sugerimos contratar más anuncios la próxima vez para un descuento mayor.");
		}
		
		System.out.println();
		
	}

}
