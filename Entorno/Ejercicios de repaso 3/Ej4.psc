//4) Modifica el ejercicio 3 para que pida el tamaño del vector por teclado.

Algoritmo Ej4
	
	Escribir "Escriba el tamanio que quiere para el array: " Sin saltar
	Leer t
	
	Dimension array[t]
	
	Para i<-0 Hasta t-1 Con Paso 1 Hacer
		Escribir "Escriba el " i+1 "º numero para introducirlo en el array: " Sin saltar
		Leer array[i]
		sumatorio = sumatorio + array[i]
	Fin Para
	
	Escribir " "
	
	Para i<-0 Hasta t-1 Con Paso 1 Hacer
		Escribir "La posicion " i " del array es: " array[i]
	Fin Para
	
	Escribir " "
	
	Escribir "La suma de los numeros introducidos es: " sumatorio
	
FinAlgoritmo
