//7) Crea un array bidimensional (matriz) de 6x4 que almacene tres n�meros y su media en cada fila.
//El programa pedir� por teclado los tres primeros n�meros y el cuarto lo calcular�.
//Por �ltimo debe mostrar por pantalla usando una funci�n el contenido del arreglo.

Algoritmo Ej7
	
	Dimension  array[6,4]
	
	Para i<-0 Hasta 5 Con Paso 1 Hacer
		Para j<-0 Hasta 3 Con Paso 1 Hacer
			
			Si j!=3 Entonces
				Escribir "Introduzca el numero del " i "�" Sin Saltar
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
