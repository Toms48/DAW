//Ejercicio 3. Aprovechando las funciones del ejercicio 1 y 2 escribe una función que reciba tres números como parámetros
//		y llamando a las funciones compruebe para cada número si es primo y muestre cual de los tres es el mayor.

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

Funcion primoNoPrimo(num)
	Para i<-1 Hasta num Con Paso 1 Hacer
		Si num%i==0 Entonces
			contadorDivisibles = contadorDivisibles+1
		Fin Si
	Fin Para
	
	Si contadorDivisibles==2 Entonces
		Escribir num " es primo"
	SiNo
		Escribir num " no es primo"
	Fin Si
FinFuncion


Algoritmo Ej3
	
	Escribir "Escriba su primer numero: " Sin Saltar
	Leer a
	
	Escribir "Escriba su segundo numero: " Sin Saltar
	Leer b
	
	Escribir "Escriba su tercer numero: " Sin Saltar
	Leer c
	
	Escribir " "
	
	primoNoPrimo(a)
	primoNoPrimo(b)
	primoNoPrimo(c)
	
	Escribir " "
	
	numeroMayor(a,b,c)
	
FinAlgoritmo
	