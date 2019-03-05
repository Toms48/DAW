package BoletinPOO2.Ej4.Tests;

import BoletinPOO2.Ej4.Clases.Fraccion;

public class TestsFraccion {
	public static void main(String[] args){
		
		//Tests del constructor con parámetros
		System.out.println("=-=-=-=-= Constructor con parámetros =-=-=-=-=");
		Fraccion fr1 = new Fraccion(1,4);
		Fraccion fr2 = new Fraccion(3,4);
		Fraccion fr3 = new Fraccion(2,2);
		
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
		
		fr3.setNumerador(8);
		fr3.setDenominador(16);
		
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
		System.out.println("Fraccion 1 y Fraccion 2");
		fr1.sumar(fr2);

		System.out.println();

		System.out.println("Fraccion 2 y Fraccion 3");
		fr2.sumar(fr3);

		System.out.println();

		//Tests restar
		System.out.println("=-=-=-=-=-=-= restar =-=-=-=-=-=-=");
		System.out.println("Fraccion 1 y Fraccion 2");
		fr1.restar(fr2);

		System.out.println();

		System.out.println("Fraccion 2 y Fraccion 3");
		fr2.restar(fr3);

		System.out.println();

		//Tests multiplicar
		System.out.println("=-=-=-=-=-=-= multiplicar =-=-=-=-=-=-=");
		System.out.println("Fraccion 1 y Fraccion 2");
		fr1.multiplicar(fr2);

		System.out.println();

		System.out.println("Fraccion 2 y Fraccion 3");
		fr2.multiplicar(fr3);

		System.out.println();

		//Tests dividir
		System.out.println("=-=-=-=-=-=-= dividir =-=-=-=-=-=-=");
		System.out.println("Fraccion 1 y Fraccion 2");
		fr1.dividir(fr2);

		System.out.println();

		System.out.println("Fraccion 2 y Fraccion 3");
		fr2.dividir(fr3);

		System.out.println();

		//Tests simplificar
		System.out.println("=-=-=-=-=-=-= simplificar =-=-=-=-=-=-=");
		System.out.println("Fraccion 1");
		System.out.println(fr1.simplificar());

		System.out.println();

		System.out.println("Fraccion 2");
		System.out.println(fr2.simplificar());

		System.out.println();

		System.out.println("Fraccion 3");
		System.out.println(fr3.simplificar());

	}
}
