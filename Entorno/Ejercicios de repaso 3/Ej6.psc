//6) Crea un vector que almacene 10 números de forma aleatoria.
//A continuación debe mostrar el contenido por pantalla y decir
//	cuantos de esos números son mayores o iguales a 5 y cuales menores que 5.

Algoritmo Ej6
	
	Dimension array[10]
	
	Para i<-0 Hasta 9 Con Paso 1 Hacer
		random = azar(10)+1
		array[i] = random
		
		Si random>=5 Entonces
			contadorMaI = contadorMaI+1
		SiNo
			contadorMe = contadorMe+1
		Fin Si
		
	Fin Para
	
	Escribir "Hay " contadorMaI " mayores o iguales que 5"
	Escribir "Hay " contadorMe " menores que 5"
	
FinAlgoritmo
