//2) Modifica el ejercicio anterior para que insertes los valores numéricos con leer mediante un bucle y los muestre por pantalla.

Algoritmo Ej2
	
	Dimension array[5]
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Escriba el " i+1 "º numero para introducirlo en el array: " Sin saltar
		Leer array[i]
	Fin Para
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "La posicion " i " del array es: " array[i]
	Fin Para
	
FinAlgoritmo
