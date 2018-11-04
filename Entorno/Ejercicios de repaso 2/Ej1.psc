//Ejercicio 1. Escribe una función que reciba tres números como parámetros y muestre por pantalla cual de los tres es el mayor.

Funcion numeroMayor(a,b,c)
	
	Si a>b Entonces
		Si a>c Entonces
			Escribir "El numero mayor es " a
		SiNo
			Escribir "El numero mayor es " c
		Fin Si
	SiNo
		Si b>c Entonces
			Escribir "El numero mayor es " b
		SiNo
			Escribir "El numero mayor es " c
		Fin Si
	Fin Si
	
FinFuncion

Algoritmo Ej1
	
	Escribir "Escriba su primer numero: " Sin Saltar
	Leer a
	
	Escribir "Escriba su segundo numero: " Sin Saltar
	Leer b
	
	Escribir "Escriba su tercer numero: " Sin Saltar
	Leer c
	
	numeroMayor(a,b,c)
	
FinAlgoritmo
	