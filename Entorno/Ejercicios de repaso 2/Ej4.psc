//Ejercicio 4. Escribe una función que reciba como parámetros un carácter y tamaño (número) y saque por pantalla una linea hecha con ese carácter y tamaño.

Funcion pintarLinea(c,n)
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir c Sin saltar
	Fin Para
FinFuncion


Algoritmo Ej4
	
	Escribir "Introduzca un caracter: " Sin Saltar
	Leer c
	
	Escribir "Introduzca un numero: " Sin saltar
	Leer n
	
	pintarLinea(c,n)
	
	Escribir " "
	
FinAlgoritmo
	