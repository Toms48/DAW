//3) Modifica el ejercicio 2 para que calcule y muestre la suma de todos los valores numéricos del vector.

Algoritmo Ej3
	
	Dimension array[5]
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Escriba el " i+1 "º numero para introducirlo en el array: " Sin saltar
		Leer array[i]
		sumatorio = sumatorio + array[i]
	Fin Para
	
	Escribir " "
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "La posicion " i " del array es: " array[i]
	Fin Para
	
	Escribir " "
	
	Escribir "La suma de los numeros introducidos es: " sumatorio
	
FinAlgoritmo
