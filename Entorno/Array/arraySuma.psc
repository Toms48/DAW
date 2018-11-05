Algoritmo arraySuma
	
	Escribir "Introduzca el numero de filas de la matriz: " Sin Saltar
	Leer f
	
	Dimension  array[f,3]
	
	Para i<-0 Hasta f-1 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			
			Si j!=2 Entonces
				Escribir "Introduzca el numero de " i "," j ": " Sin Saltar
				Leer num
				
				array[i,j] = num
			SiNo
				array[i,j] = array[i,j-2] + array[i,j-1]
			Fin Si
			
		Fin Para
	Fin Para
	
	Para i<-0 Hasta f-1 Con Paso 1 Hacer
		Para j<-0 Hasta 2 Con Paso 1 Hacer
			Escribir array[i,j] " " Sin saltar
		Fin Para
		Escribir " "
	Fin Para
	
FinAlgoritmo
