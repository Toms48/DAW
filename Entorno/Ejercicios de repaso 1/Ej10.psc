//Ejercicio de repaso propuesto 10: Prepara un programa que divida dos números que introduzca el usuario.
//	Si el segundo número es cero, se le deberá avisar y volver a pedir tantas veces como sea necesario,
//	hasta que introduzca un número distinto de cero, momento en que se calculará y mostrará el resultado de la división.FinSi

Algoritmo Ej10
	Escribir "Introduzca un numero: " Sin Saltar
	Leer num1
	
	Repetir
		Escribir "Introduzca un segundo numero distinto de cero: " Sin Saltar
		Leer num2
	Hasta Que num2!=0
	
	Escribir "La division es " num1 "/" num2 "=" num1/num2
	
FinAlgoritmo
	