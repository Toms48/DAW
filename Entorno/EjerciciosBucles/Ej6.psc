//Ejercicio de repaso propuesto 6: Haz un programa que permita calcular la suma de pares de números.
//	Pedirá dos números al usuario y mostrará su suma, volviendo a repetir hasta que ambos números introducidos sean 0.

Algoritmo Ej6
	Repetir
		Escribir "Introduzca su primer numero: " Sin Saltar
		Leer n1
		
		Escribir "Introduzca su segundo numero: " Sin Saltar
		Leer n2
		
		Si n1!=0 || n2!=0  Entonces
			Escribir "La suma de sus dos numeros es: " n1+n2
		SiNo
			Escribir "Ashta lue"
		Fin Si
	Mientras Que n1!=0 || n2!=0 
FinAlgoritmo
