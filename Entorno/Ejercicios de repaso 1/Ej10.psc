//Ejercicio de repaso propuesto 10: Prepara un programa que divida dos n�meros que introduzca el usuario.
//	Si el segundo n�mero es cero, se le deber� avisar y volver a pedir tantas veces como sea necesario,
//	hasta que introduzca un n�mero distinto de cero, momento en que se calcular� y mostrar� el resultado de la divisi�n.FinSi

Algoritmo Ej10
	Escribir "Introduzca un numero: " Sin Saltar
	Leer num1
	
	Repetir
		Escribir "Introduzca un segundo numero distinto de cero: " Sin Saltar
		Leer num2
	Hasta Que num2!=0
	
	Escribir "La division es " num1 "/" num2 "=" num1/num2
	
FinAlgoritmo
	