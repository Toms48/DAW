//Ejercicio de repaso propuesto 4: Crea una variante del ejercicio 3, en la que emplees varios SI-ENTONCES en vez de SEGUN

Algoritmo Ej4
	Escribir "Introduzca el número de un mes: " Sin Saltar
	Leer numeroMes
	
	Si numeroDia == 1 Entonces
		Escribir "Enero"
	SiNo
		Si numeroDia == 2 Entonces
			Escribir "Febrero"
		SiNo
			Si numeroDia == 3 Entonces
				Escribir "Marzo"
			SiNo
				Si numeroDia == 4 Entonces
					Escribir "Abril"
				SiNo
					Si numeroDia == 5 Entonces
						Escribir "Mayo"
					SiNo
						Si numeroDia == 6 Entonces
							Escribir "Junio"
						SiNo
							Si numeroDia == 7 Entonces
								Escribir "Julio"
							SiNo
								Si numeroDia == 8 Entonces
									Escribir "Agosto"
								SiNo
									Si numeroDia == 9 Entonces
										Escribir "Septiembre"
									SiNo
										Si numeroDia == 10 Entonces
											Escribir "Octubre"
										SiNo
											Si numeroDia == 11 Entonces
												Escribir "Noviembre"
											SiNo
												Si numeroDia == 12 Entonces
													Escribir "Diciembre"
												SiNo
													Escribir "No me has escrito un numer del 1 al 12, no puedo decirte un mes del año."
												Fin Si
											Fin Si
										Fin Si
									Fin Si
								Fin Si
							Fin Si
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo