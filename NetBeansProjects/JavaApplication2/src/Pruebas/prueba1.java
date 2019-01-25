/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import matematicas.Geometria;
import matematicas.Varias;

import java.util.Scanner;

/**
 *
 * @author t-m-1
 */
public class prueba1 {
public static void main(String[] args) {
int n;
Scanner teclado = new Scanner(System.in);
// Prueba esPrimo()
System.out.print("Introduzca un número entero positivo: ");
n = teclado.nextInt();
if (matematicas.Varias.esPrimo(n)) {
System.out.println("El " + n + " es primo.");
} else {
System.out.println("El " + n + " no es primo.");
}
// Prueba digitos()
System.out.print("Introduzca un número entero positivo: ");
n = teclado.nextInt();
System.out.println(n + " tiene " + matematicas.Varias.digitos(n) + " dígitos.");
// Prueba volumenCilindro()
double r, h;
System.out.println("Cálculo del volumen de un cilindro");
System.out.print("Introduzca el radio en metros: ");
r = teclado.nextDouble();
System.out.print("Introduzca la altura en metros: ");
h = teclado.nextDouble();
/*System.out.println("El volumen del cilindro es " + matematicas.Geometria.volumenCilind\
ro(r, h) + " m3");*/
}
}
