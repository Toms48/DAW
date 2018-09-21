Algoritmo sin_titulo
	Escribir "SUMA DE DOS NÚMEROS"
	Escribir "-------------------"
	Escribir ""
	
	salir=0
	
	Mientras salir=0 Hacer
		
		Escribir "Introduzca el primer sumando:"
		Leer numero1
		
		Escribir "Introduzca el segundo sumando:"
		Leer numero2
		
		Escribir numero1 " + " numero2 " = " numero1+numero2
		
		Escribir ""
		
		Escribir "¿Quiere volver a sumar dos números? (S/N)"
		
		Leer respuestaRepetir
		
		Si respuestaRepetir='S' Entonces
			salir=0
		SiNo
			salir=1
		Fin Si
		
	Fin Mientras
	
FinAlgoritmo
