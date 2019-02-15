package Clases;

import Clases.cubo;

public class TestsCubo {
	public static void main(String[] args){
		
		//Constructor
		System.out.println("=-=-= Test constructor =-=-=");
		cubo cubo1 = new cubo(10);
		
		//Gets
		System.out.println("=-=-= Test Gets =-=-=");
		System.out.println(cubo1.getCapacidad());
		System.out.println(cubo1.getContenido());
		
		//Sets
		System.out.println("=-=-= Test Sets =-=-=");
		cubo1.setContenido(5);
		
		System.out.println(cubo1.getContenido());
		
		//Vacia
		System.out.println("=-=-= Test Vacia =-=-=");
		cubo1.vacia();
		
		System.out.println(cubo1.getContenido());
		
		//Llena
		System.out.println("=-=-= Test Llena =-=-=");
		cubo1.llena();
		
		System.out.println(cubo1.getContenido());
		
		//Pinta
		System.out.println("=-=-= Test Pinta =-=-=");
		cubo1.pinta();
		
		cubo1.setContenido(5);
		
		System.out.println();
		
		cubo1.pinta();
		
	}
}
