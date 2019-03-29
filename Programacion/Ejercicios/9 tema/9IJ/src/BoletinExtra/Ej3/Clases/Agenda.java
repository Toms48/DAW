/* Nombre: Agenda
 *
 * Básicas:
 * 		- arrayContactos => Contacto[] => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinExtra.Ej3.Clases;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Agenda {
	
	//Atributos
	private Contacto[] arrayContacto;
	
	//Constructor por defecto
	public Agenda(){
		arrayContacto = new Contacto[10];
	}
	
	//Constructor con parámetros
	public Agenda(Contacto[] arrayContacto){
		this.arrayContacto = arrayContacto;
	}
	
	//Gets
	public Contacto[] getArrayContacto() {
		return arrayContacto;
	}
	
	//Sets
	public void setArrayContacto(Contacto[] arrayContacto) {
		this.arrayContacto = arrayContacto;
	}
	
	//Métodos sobrescritos
	
	
	//Métos añadidos
	public boolean agendaLlena(){
		
		boolean isLleno = true;
		
		for(int i=0; i<=arrayContacto.length-1 && isLleno==true; i++){
			if(arrayContacto[i].getLibre() == true){
				isLleno = false;
			}
		}
		
		return isLleno;
	}
	
	public boolean agendaVacia(){
		
		boolean isVacio = true;
		
		for(int i=0; i<=arrayContacto.length-1 && isVacio==true; i++){
			if(arrayContacto[i].getLibre() == false){  //getLibre es para la variable bandera
				isVacio = false;
			}
		}
		
		return isVacio;
	}
	
	public int huecosLibres(){
		
		int huecos = 0;
		
		for(Contacto contacto : arrayContacto){
			if(contacto.getLibre() == true){
				huecos++;
			}
		}
		
		return huecos;
	}
	
	public void listarContactos(){
		
		System.out.println("=-=-=-=-=-=-= Lista de contactos =-=-=-=-=-=-=");
		
		for(Contacto contacto : arrayContacto){
			if(contacto.getLibre() == false){
				System.out.println("Nombre: " +contacto.getNombre() +" / Teléfono: " +contacto.getTelefono());
			}
			else{
				System.out.println("Contacto libre");
			}
		}
		
	}
	
	public void buscarContacto(String nombre){
		
		boolean encontrado = false;
		
		for(int i=0; i<=arrayContacto.length-1 && encontrado==false; i++){
			if(arrayContacto[i].getNombre().equals(nombre) == true){
				encontrado = true;
				System.out.println(arrayContacto[i].getTelefono());
			}
		}
	}
	
	public boolean existeContacto(Contacto contacto){
		
		boolean existe = false;
		
		for(int i=0; i<=arrayContacto.length-1 && existe==false; i++){
			if(arrayContacto[i].equals(contacto) == true){
				existe = true;
			}
		}
		
		return existe;
	}
	
	public void aniadirContacto(Contacto contacto){
		
		boolean contactoDuplicado = false;
		boolean arrayLleno = true;
		
		int primeraPosicionLibre = 0;
		
		for(int i=0; i<=arrayContacto.length-1 && arrayLleno==true; i++){
			if(arrayContacto[i].getLibre() == true){
				arrayLleno = false;
				primeraPosicionLibre = i;
			}
		}
		
		for(int i=0; i<=arrayContacto.length-1 && contactoDuplicado==false; i++){
			if(arrayContacto[i].equals(contacto) == true){
				contactoDuplicado = true;
			}
		}
		
		if(contactoDuplicado == true){
			System.out.println("El contacto ya existe.");
		}
		else{
			if(arrayLleno == true){
				System.out.println("No se pueden meter más contactos.");
			}
			else{
				arrayContacto[primeraPosicionLibre] = contacto;
				System.out.println(contacto.getNombre() +" se ha añadido correctamente.");
			}
		}
	}
	
	public void eliminarContacto(Contacto contacto){
		
		boolean encontrado = false;
		int contactoAEliminar = 0;
		
		for(int i=0; i<=arrayContacto.length-1 && encontrado==false; i++){
			if(arrayContacto[i].equals(contacto) == true){
				encontrado = true;
				contactoAEliminar = i;
			}
		}
		
		if(encontrado == false){
			System.out.println("No se ha encontrado el contacto para borrarlo.");
		}
		else{
			arrayContacto[contactoAEliminar].setLibre(true);
			System.out.println("Se ha borrado el contacto indicado.");
		}
		
	}

}
