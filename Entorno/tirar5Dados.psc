Funcion resultado<-tirarDado()
	resultado<-azar(6)+1
FinFuncion
 
Funcion pintarDado(nDado)
	
	//Segun nDado Hacer
		//1:
			//Escribir "7"
		//2:
			//Escribir "8"
		//3:
			//Escribir "J"
		//4:
			//Escribir "Q"
		//5:
			//Escribir "K"
		//6:
			//Escribir "AS"
	//Fin Segun
	
	Segun nDado Hacer
		1:
			Escribir "-------"
			Escribir "|o   o|"
			Escribir "|o o o|"
			Escribir "|o   o|"
			Escribir "-------"
		2:
			Escribir "-------"
			Escribir "|o o o|"
			Escribir "|o   o|"
			Escribir "|o o o|"
			Escribir "-------"
		3:
			Escribir "-------"
			Escribir "|     |"
			Escribir "|  J  |"
			Escribir "|     |"
			Escribir "-------"
		4:
			Escribir "-------"
			Escribir "|     |"
			Escribir "|  Q  |"
			Escribir "|     |"
			Escribir "-------"
		5:
			Escribir "-------"
			Escribir "|     |"
			Escribir "|  K  |"
			Escribir "|     |"
			Escribir "-------"
		6:
			Escribir "-------"
			Escribir "|     |"
			Escribir "|  O  |"
			Escribir "|     |"
			Escribir "-------" 
	Fin Segun
FinFuncion

Algoritmo tirar5Dados
	
	Para i<-1 Hasta 5 Con Paso 1 Hacer
		
		pintarDado(tirarDado())
		
	Fin Para
	
FinAlgoritmo
