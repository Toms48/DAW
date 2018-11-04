//Ejercicio de repaso propuesto 2: Crea una variante del ejercicio 1, en la que emplees varios SI-ENTONCES en vez de SEGUN.

Algoritmo Ej2
	Escribir "Introduzca el número de un día de la semana: " Sin Saltar
	Leer numeroDia
	
	Si numeroDia == 1 Entonces
		Escribir "Lunes"
	SiNo
		Si numeroDia == 2 Entonces
			Escribir "Martes"
		SiNo
			Si numeroDia == 3 Entonces
				Escribir "Miercoles"
			SiNo
				Si numeroDia == 4 Entonces
					Escribir "Jueves"
				SiNo
					Si numeroDia == 5 Entonces
						Escribir "Viernes"
					SiNo
						Si numeroDia == 6 Entonces
							Escribir "Sabado"
						SiNo
							Si numeroDia == 7 Entonces
								Escribir "Domingo"
							SiNo
								Escribir "No me has escrito un numer del 1 al 7, no puedo decirte un dia de la semana."
							Fin Si
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo