//Ejercicio 5. Escribe una funci�n que reciba como par�metros un car�cter , alto y  ancho dibuje por pantalla un  rect�ngulo.
//	Debes utilizar la funci�n del ejercicio4 para dibujar cada linea del rect�ngulo.

Funcion pintarLinea(c,n)
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir c Sin saltar
	Fin Para
FinFuncion


Algoritmo Ej5
	
	Escribir "Introduzca la altura del cuadrado: " Sin Saltar
	Leer alto
	
	Escribir "Introduzca el ancho del cuadrado: " Sin saltar 
	Leer ancho
	
	Escribir "Introduzca el caracter para pintar el cuadrado: " Sin Saltar
	Leer c
	
	Para i<-1 Hasta alto Con Paso 1 Hacer
		pintarLinea(c,ancho)
		Escribir " "
	Fin Para
	
FinAlgoritmo
	