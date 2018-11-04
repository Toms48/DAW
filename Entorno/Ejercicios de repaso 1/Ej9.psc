//Ejercicio de repaso propuesto 9: Haz un programa que permita calcular la suma de pares de números.
//	Pedirá dos números al usuario y mostrará su suma, volviendo a repetir hasta que ambos números introducidos sean 0.
//	Esta vez deberás usar "Repetir", por lo que tu solución no será igual que la del ejercicio 7, que empleaba "Mientras".

Algoritmo Ej9
	
	Repetir
		Escribir "Introduzca el primer número: " Sin saltar
		Leer num1
		
		Escribir "Introduzca el segundo número: " Sin saltar
		Leer num2
		
		Si num1!=0 || num2!=0 Entonces
			Escribir " "
			Escribir "La suma de sus dos numeros es: " num1+num2
			Escribir " "
		Fin Si
		
	Mientras Que num1!=0 || num2!=0
	
FinAlgoritmo
	