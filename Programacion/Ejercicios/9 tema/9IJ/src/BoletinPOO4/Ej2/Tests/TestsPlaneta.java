package BoletinPOO4.Ej2.Tests;

import BoletinPOO4.Ej2.Clases.Planeta;

public class TestsPlaneta {
    public static void main(String[] args){

        Planeta planetaPorDefecto = new Planeta();
        
		Planeta planeta1 = new Planeta("Mercurio", "3.303e+23", 4880, "58 días y 16 horas terrestres", 87);
        Planeta planeta2 = new Planeta("Venus", "4.869e+24", 12100, "243 días terrestres", 224);
        Planeta planeta3 = new Planeta("Tierra", "5.976e+24", 12800, "23 horas, 56 minutos, 4 segundos", 365);
        Planeta planeta4 = new Planeta("Marte", "6.421e+23", 6800, "24 horas y 37 minutos terrestres", 686);
        Planeta planeta5 = new Planeta("Jupiter", "1.9e+27", 143000, "9 horas y 55 minutos terrestres", 4329);
        Planeta planeta6 = new Planeta("Saturno", "5.688e+26", 120000, "10 horas y 40 minutos terrestres", 10585);
        Planeta planeta7 = new Planeta("Urano", "8.686e+25", 51000, "17 horas y 14 minutos terrestres", 30667);
        Planeta planeta8 = new Planeta("Neptuno", "1.024e+26", 49000, "16 horas y 7 minutos terrestres", 60140);
        
        System.out.println(planetaPorDefecto);
	
		System.out.println();
	
		System.out.println(planeta1);
		System.out.println(" o · · · · · · ·");
	
		System.out.println();
	
		System.out.println(planeta2);
		System.out.println(" · o · · · · · ·");
	
		System.out.println();
	
		System.out.println(planeta3);
		System.out.println(" · · o · · · · ·");
	
		System.out.println();
	
		System.out.println(planeta4);
		System.out.println(" · · · o · · · ·");
	
		System.out.println();
	
		System.out.println(planeta5);
		System.out.println(" · · · · o · · ·");
		
		System.out.println();
	
		System.out.println(planeta6);
		System.out.println(" · · · · · o · ·");
	
		System.out.println();
	
		System.out.println(planeta7);
		System.out.println(" · · · · · · o ·");
	
		System.out.println();
	
		System.out.println(planeta8);
		System.out.println(" · · · · · · · o");

    }
}
