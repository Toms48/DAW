Algoritmo nombreNotaAlumnos
	
	Escribir "Introduzca el número de alumnos: " Sin saltar
	Leer t
	
	Escribir " "
	
	Dimension nombre[t]
	Dimension nota[t]
	
	Para i=0 Hasta t-1 Con Paso 1 Hacer
		
		Escribir "Introduzca el nombre del alumno " i+1 ": " Sin Saltar
		Leer nombreAlumno
		nombre[i]<-nombreAlumno
		
		Escribir "Introduzca la nota del alumno " i+1 ": " Sin Saltar
		Leer notaAlumno
		nota[i]<-notaAlumno
		
		Si notaAlumno>=5 Entonces
			contadorApro<-contadorApro+1
		SiNo
			contadorSusp<-contadorSusp+1
		Fin Si
		
		Escribir " "
		
	Fin Para
	
	Para i<-0 Hasta t-1 Con Paso 1 Hacer
		Escribir "El alumno " nombre[i] " tiene una nota de " nota[i]
	Fin Para
	
	Escribir " "
	
	Escribir  "Hay " contadorApro " alumno/s aprobado/s."
	Escribir  "Hay " contadorSusp " alumno/s aprobado/s."
	
FinAlgoritmo
