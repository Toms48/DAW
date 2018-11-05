Algoritmo arrayBidimensional
	
	Dimension matriz[5,3]
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			
			Escribir "Introduzca un valor: " Sin saltar
			Leer num
			
			matriz[i,j] = num
			
		Fin Para
	Fin Para
	
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			
			Escribir matriz[i,j] " " Sin saltar
			
		Fin Para
		Escribir " "
	Fin Para
	
FinAlgoritmo
