//Ejercicio de repaso propuesto 9: Haz un programa que permita calcular la suma de pares de n�meros.
//	Pedir� dos n�meros al usuario y mostrar� su suma, volviendo a repetir hasta que ambos n�meros introducidos sean 0.
//	Esta vez deber�s usar "Repetir", por lo que tu soluci�n no ser� igual que la del ejercicio 7, que empleaba "Mientras".

Algoritmo Ej9
	
	Repetir
		Escribir "Introduzca el primer n�mero: " Sin saltar
		Leer num1
		
		Escribir "Introduzca el segundo n�mero: " Sin saltar
		Leer num2
		
		Si num1!=0 || num2!=0 Entonces
			Escribir " "
			Escribir "La suma de sus dos numeros es: " num1+num2
			Escribir " "
		Fin Si
		
	Mientras Que num1!=0 || num2!=0
	
FinAlgoritmo
	