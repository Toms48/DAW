//8) Crea un algoritmo que permita listar las notas finales de los alumnos de una clase de 10 alumnos.
//	Debe usar un arreglo de 10x3 para el nombre y apellidos.
//	Debe usar un arreglo de 10x4 para las notas donde almacenará las notas de los tres trimestres que se introducen por teclado y calculará la nota final del curso como nota media.
//	Debe mostrar la lista de alumnos y notas usando una función que reciba las dos matrices.

Funcion notaAlumnos(arrayN,arrayNotas)
	
	Para i<-0 Hasta 1 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			
			Si j!=3 Entonces
				Escribir arrayN[i,j] " " Sin Saltar
			SiNo
				Escribir arrayNotas[i,3]
			Fin Si
			
		Fin Para
		Escribir " "
	Fin Para
	
FinFuncion


Algoritmo Ej8
	
	Dimension arrayN[2,3] //array para los nombres, por eso la N de nombre
	Dimension arrayNotas[2,4] //array para las notas
	
	Para i<-0 Hasta 1 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			
			Si j==0 Entonces
				Escribir "Introduzca el " i+1 "º nombre por favor (si es nombre compuesto introduzca solo el primero): " Sin Saltar
				Leer nombre
				
				arrayN[i,j] = nombre
			SiNo
				Escribir "Introduzca su " j "º apellido: " Sin saltar
				Leer apellido
				
				arrayN[i,j] = apellido
			Fin Si
			
		Fin Para
		
		Escribir " "
		
	Fin Para
	
	Para i<-0 Hasta 1 Con Paso 1 Hacer
		
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			
			Si j!=3 Entonces
				Escribir "Escriba la " j+1 "ª nota de " arrayN[i,0] " " arrayN[i,1] " " arrayN[i,2] ": " Sin Saltar
				Leer nota
				
				arrayNotas[i,j] = nota
			SiNo
				arrayNotas[i,j] = arrayNotas[i,j-3] + arrayNotas[i,j-2] + arrayNotas[i,j-1]
			Fin Si
			
		Fin Para
		
		Escribir " "
		
	Fin Para
	
	notaAlumnos(arrayN,arrayNotas)
	
FinAlgoritmo
