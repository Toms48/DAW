Algoritmo segunDiagramasFlujoEjer1
	
	Escribir "Introduzca tres números para comparar"
	Leer A, B, C
	
	Si A>B && A>C Entonces
		Escribir A " es el mayor"
	SiNo
		
		Si B>A && B>C Entonces
			Escribir B " es el mayor"
		SiNo
			Escribir C " es el mayor"
		Fin Si
		
	Fin Si
	
FinAlgoritmo
