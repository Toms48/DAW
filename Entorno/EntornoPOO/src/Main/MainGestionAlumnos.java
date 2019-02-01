package Main;

import java.util.Scanner;
import Clases.Asignatura;
import Clases.Alumno;

public class MainGestionAlumnos {
	public static void main(String[] args){
		
		//Declaraciones de variables
		int numeroAlumnos = 0;
		
		//Inicializaciones
		Scanner tecladoN = new Scanner(System.in);
		Scanner tecladoS = new Scanner(System.in);
		
		Asignatura As1 = new Asignatura("Programacion", "1DAW");
		Asignatura As2 = new Asignatura("Base de datos", "1DAW");
		Asignatura As3 = new Asignatura("FOL", "1DAW");
		Asignatura As4 = new Asignatura("Entorno de desarrollo", "1DAW");
		Asignatura As5 = new Asignatura("Sistemas", "1DAW");
		
		System.out.print("Por favor introduzca la cantidad de alumnos: ");
		numeroAlumnos = tecladoN.nextInt();
		Alumno[] arrayAlumnos = new Alumno[numeroAlumnos];
		
		for(int i=0; i<=arrayAlumnos.length-1; i++){
			
			Alumno alumno = new Alumno();
			
			String nombre = "";
			String apellidos = "";
			String direccion = "";
			String curso = "";
			String telefono = "";
			
			int notaAs1 = 0;
			int notaAs2 = 0;
			int notaAs3 = 0;
			int notaAs4 = 0;
			int notaAs5 = 0;
			
			System.out.println();
			
			System.out.print("Introduzca el nombre del " +(i+1) +"º alumno: ");
			//System.out.println(nombre);
			nombre = tecladoS.nextLine();
			//System.out.println(nombre);
			alumno.setNombre(nombre);
			
			//tecladoS.next();
			
			System.out.print("Introduzca los apellidos del " +(i+1) +"º alumno: ");
			apellidos = tecladoS.nextLine();
			alumno.setApellidos(apellidos);
			
			//tecladoS.next();
			
			System.out.print("Introduzca la direccion del " +(i+1) +"º alumno: ");
			direccion = tecladoS.nextLine();
			alumno.setDireccion(direccion);
			
			//tecladoS.next();
			
			System.out.print("Introduzca el curso del " +(i+1) +"º alumno: ");
			curso = tecladoS.nextLine();
			alumno.setCurso(curso);
			
			//tecladoS.next();
			
			System.out.print("Introduzca el  telefono del " +(i+1) +"º alumno: ");
			telefono = tecladoS.nextLine();
			alumno.setTelefono(telefono);
			
			//tecladoS.next();
			
			System.out.print("Introduzca la nota de la 1ª asignatura: ");
			notaAs1 = tecladoN.nextInt();
			alumno.setNotaAs1(notaAs1);
			
			System.out.print("Introduzca la nota de la 2ª asignatura: ");
			notaAs2 = tecladoN.nextInt();
			alumno.setNotaAs2(notaAs2);
			
			System.out.print("Introduzca la nota de la 3ª asignatura: ");
			notaAs3 = tecladoN.nextInt();
			alumno.setNotaAs3(notaAs3);
			
			System.out.print("Introduzca la nota de la 4ª asignatura: ");
			notaAs4 = tecladoN.nextInt();
			alumno.setNotaAs4(notaAs4);
			
			System.out.print("Introduzca la nota de la 5ª asignatura: ");
			notaAs5 = tecladoN.nextInt();
			alumno.setNotaAs5(notaAs5);
			
			arrayAlumnos[i] = alumno;
		}
		
		for(int i=0; i<=arrayAlumnos.length-1; i++){
			System.out.print(arrayAlumnos[i].getNombre());
			System.out.println(" " +arrayAlumnos[i].getApellidos());
			System.out.println(arrayAlumnos[i].getDireccion());
			System.out.println(arrayAlumnos[i].getCurso());
			System.out.println(arrayAlumnos[i].getTelefono());
			System.out.println(arrayAlumnos[i].getNotaAs1());
			System.out.println(arrayAlumnos[i].getNotaAs2());
			System.out.println(arrayAlumnos[i].getNotaAs3());
			System.out.println(arrayAlumnos[i].getNotaAs4());
			System.out.println(arrayAlumnos[i].getNotaAs5());
			System.out.println(arrayAlumnos[i].getNotaMedia());
		}
	
	}
}
