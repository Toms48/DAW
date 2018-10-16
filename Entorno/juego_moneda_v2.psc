funcion cara<-moneda()
	tirada<-azar(2)
	segun tirada
		0: cara="cruz"
		1: cara="cara"	
	FinSegun
FinFuncion

funcion ae<-apuestaeuros()
	escribir "Jugamos a doble o nada...."
	escribir "Introduce tu apuesta de 10 a 100 euros: " sin saltar
	Repetir
		leer ae
	Hasta Que ae>=10 && ae<=100
FinFuncion

funcion ac<-apuestacara()
	escribir "Apuesta.... cara o cruz"
	escribir " 1. cara"
	escribir " 2. cruz"
	escribir ""
	Escribir "Su apuesta es: " sin saltar
	leer c
	segun c
		1: ac<-"cara"
		2: ac<-"cruz"
	FinSegun
FinFuncion


Algoritmo juego_moneda_v2
	
	dineroJugador<-100
	
	repetir
			
			Escribir "Su saldo actual es de: " dineroJugador
			
			euros<-apuestaeuros()
			tirada<-moneda()
			apcara<-apuestacara()
			
			si tirada=apcara
				escribir " enhorabuena.... has ganado " 2*euros " euros.. ha salido " tirada
				dineroJugador<-dineroJugador+(2*euros)
				
				Escribir "Su saldo actual es de: " dineroJugador
				
				escribir " quieres volver a jugar?  s/n"
				leer r
			sino
				dineroJugador<-dineroJugador-euros
				
				Si dineroJugador<=0
					Escribir "Su saldo actual es de: " dineroJugador
					Escribir "Lo siento te has quedado sin dinero"
				SiNo
					escribir " lo siento has perdido tu dinero.. ha salido " tirada
					Escribir "Su saldo actual es de: " dineroJugador
				FinSi
				
			FinSi
		
	hasta que r="n" o r="N" o dineroJugador<10
	
FinAlgoritmo
