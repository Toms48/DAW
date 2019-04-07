Algoritmo pintarRectangulo
	Escribir "Introduzca ancho del rectangulo:"
	Leer ancho
	
	Escribir "Introduzca altura del rectangulo:"
	Leer altura
	
	Escribir "Introduzca un caracter para pintar el rectangulo:"
	Leer relleno
	
	Para i<-1 Hasta altura Con Paso 1 Hacer //Este "para" controla la cantidad de líneas (o el ancho)
		
		Para j<-1 Hasta ancho Con Paso 1 Hacer //Este "para" controla la cantidad de caracteres por línea (o el ancho de cada línea)
			
			Escribir relleno sin saltar
			
		Fin Para
		
		Escribir ""
		
	Fin Para
	
FinAlgoritmo
