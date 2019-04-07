Algoritmo numeroPrimoNoPrimo
	J <- 2
	S <- 0
	Escribir 'Introduzca un número para saber si es primo'
	Leer N
	Mientras J=N/2 Hacer
		Si N/J=0 Entonces
			J = J+1
		SiNo
			S = S+1
			J = J+1
		FinSi
	FinMientras
	Si N/J=0 Entonces
		Escribir N,' es primo'
	SiNo
		Escribir N,' no es primo'
	FinSi
FinAlgoritmo

