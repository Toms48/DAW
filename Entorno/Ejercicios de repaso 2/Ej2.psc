//Ejercicio 2. Escribe una funci�n que reciba un numero como par�metro y muestre por pantalla si es primo o no.

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

Algoritmo Ej2
	
	Escribir 'Introduzca un n�mero para saber si es primo: ' Sin Saltar
	Leer num
	
	primoNoPrimo(num)
	
FinAlgoritmo
	