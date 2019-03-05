package BoletinPOO2.Ej4.Tests;

import BoletinPOO2.Ej4.Clases.Fraccion;

public class TestsFraccion {
	public static void main(String[] args){
		
		//Tests del constructor con parámetros
		System.out.println("=-=-=-=-= Constructor con parámetros =-=-=-=-=");
		Fraccion fr1 = new Fraccion(1,4);
		Fraccion fr2 = new Fraccion(3,4);
		Fraccion fr3 = new Fraccion(5,10);
		
		System.out.println();
		
		//Tests de los gets
		System.out.println("=-=-=-=-=-=-= Gets =-=-=-=-=-=-=");
		System.out.println("Numerador fraccion 1: " +fr1.getNumerador());
		System.out.println("Denominador fraccion 1: " +fr1.getDenominador());
		System.out.println();
		System.out.println("Numerador fraccion 1: " +fr2.getNumerador());
		System.out.println("Denominador fraccion 1: " +fr2.getDenominador());
		
		System.out.println();
		
		//Tests de los sets
		System.out.println("=-=-=-=-=-=-= Sets =-=-=-=-=-=-=");
		System.out.println("Numerador fraccion 3 antes del set: " +fr3.getNumerador());
		System.out.println("Denominador fraccion 3 antes del set: " +fr3.getDenominador());
		
		System.out.println();
		
		fr3.setNumerador(2);
		fr3.setDenominador(2);
		
		System.out.println("Numerador fraccion 3 después del set: " +fr3.getNumerador());
		System.out.println("Denominador fraccion 3 después del set: " +fr3.getDenominador());
		
		System.out.println();
		
		//Tests toString
		System.out.println("=-=-=-=-=-=-= toString =-=-=-=-=-=-=");
		System.out.println(fr1.toString());
		System.out.println();
		System.out.println(fr2.toString());
		System.out.println();
		System.out.println(fr3.toString());
		
		System.out.println();
		
		//Tests sumar
		System.out.println("=-=-=-=-=-=-= sumar =-=-=-=-=-=-=");
		fr1.sumar(fr2);
		
	}
}
