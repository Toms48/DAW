//Ejercicio de repaso propuesto 18: Dibuja un triángulo creciente de asteriscos, del tamaño que indique el usuario. Por ejemplo, si escoge 4, el resultado debería ser:
//			*
//			**
//			***
//			****

Algoritmo Ej18
	
	Escribir "Escriba la altura de la piramide: " Sin saltar
	Leer num
	
	Para i<-1 Hasta num Con Paso 1 Hacer
		Para j<-1 Hasta i Con Paso 1 Hacer
			Escribir "*" Sin saltar
		Fin Para
		Escribir ""
	Fin Para
	
FinAlgoritmo
	