//Ejercicio de repaso propuesto 17: Crea un programa que dibuje un rectángulo de asteriscos pidiendo el valor de los lados.
//	
//	Ejemplo para rectángulo de 8x3
//		
//		********
//		********
//		********

Algoritmo Ej17
	
	Escribir "Escriba la altura del rectangulo: " Sin Saltar
	Leer altura
	
	Escribir " Escriba el ancho del rectangulo: " Sin Saltar
	Leer ancho
	
	Para i<-1 Hasta altura Con Paso 1 Hacer
		Para j<-1 Hasta ancho Con Paso 1 Hacer
			Escribir "*" Sin saltar
		Fin Para
		Escribir ""
	Fin Para
	
FinAlgoritmo
	