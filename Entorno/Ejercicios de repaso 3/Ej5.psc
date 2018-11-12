//5) Crea dos arrays o arreglos unidimensionales que tengan el mismo tamaño (lo pedirá por teclado),
//	en uno de ellos almacenarás nombres de personas como cadenas,
//	en el otro array o arreglo se almacenará la longitud de los nombres,
//	para ello puedes usar la función LONGITUD(cadena) que viene en PseInt.
//	Usa una funcion para mostrar por pantalla el nombre y la longitud.
//	Esta función debe recibir como parámetros los dos vectores y mostrar su contenido por pantalla.

Funcion mostrarNombreLongitud(arrayN,arrayL,t)
	
	Para i<-0 Hasta t-1 Con Paso 1 Hacer
		Escribir "El " i+1 "º nombre es " arrayN[i] " y tiene una longitud de " arrayL[i] " caracteres."
	Fin Para
	
FinFuncion


Algoritmo Ej5
	
	Escribir "Introduzca el tamanio para los arrays: " Sin Saltar
	Leer t
	
	Dimension arrayN[t] //array para los nombres, por eso la N de nombre
	Dimension arrayL[t] //array para la longitud de las cadenas, por eso la L de longitud
	
	Para i<-0 Hasta t-1 Con Paso 1 Hacer
		Escribir "Escriba el nombre de la " i "º persona: " Sin Saltar
		Leer nombre
		
		arrayN[i] = nombre
		arrayL[i] = Longitud(arrayN[i])
		
	Fin Para
	
	Escribir " "
	
	mostrarNombreLongitud(arrayN,arrayL,t)
	
FinAlgoritmo
