//Ejercicio de repaso propuesto 7: Programa que genere dos n�meros al azar entre el 0 y el 100,
//	y pida al usuario que calcule e introduzca su suma.
//	Si la respuesta no es correcta, deber� volver a pedirla tantas veces como sea necesario hasta que el usuario acierte. 
//
//	Pista: como ver�s en el apartado 10, para generar un n�mero al azar del 0 al 100 puedes hacer num<- AZAR(101).
//	Debes utilizar MIENTRAS para controlar el bucle.

Algoritmo Ej7
	azar1<-azar(101)
	azar2<-azar(101)
	
	//Escribir azar1+azar2
	
	Repetir
		Escribir "Escriba el resultado que cree que saldr� de la suma de los dos n�meros: " Sin saltar
		Leer suma
		
		Si suma!=azar1+azar2 Entonces
			Escribir " "
			Escribir "Lo siento no has acertado, int�ntelo otra vez."
		Fin Si
		
	Mientras Que suma!=azar1+azar2
	
	Escribir " "
	Escribir "Genial, has acertado"
	
FinAlgoritmo
	