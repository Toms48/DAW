funcion caballo<-ganador()
	random<-azar(3)
	segun random
		0: caballo="Espinete"
		1: caballo="Azafran"	
		2: caballo="Rocinante"
	FinSegun
FinFuncion

funcion ae<-apuestaeuros()
	escribir "Jugamos a doble o nada...."
	escribir "Introduce tu apuesta de 10 a 100 euros: " sin saltar
	Repetir
		leer ae
	Hasta Que ae>=10 && ae<=100
FinFuncion

funcion ac<-apuestaCaballo()
	escribir "Apuesta...."
	escribir " 1. Espinete"
	escribir " 2. Azafran"
	escribir " 3. Rocinante"
	escribir ""
	Escribir "Su caballo es: " sin saltar
	leer caballo
	segun caballo
		1: ac<-"Espinete"
		2: ac<-"Azafran"
		3: ac<-"Rocinante"
	FinSegun
FinFuncion


Algoritmo juegoCaballos
	
	dineroJugador<-100
	
	repetir
		
		Escribir "Su saldo actual es de: " dineroJugador
		
		euros<-apuestaeuros()
		caballo<-ganador()
		apCaballo<-apuestaCaballo()
		
		si caballo=apCaballo
			escribir " enhorabuena.... has ganado " 2*euros " euros.. ha salido " caballo
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
				escribir " lo siento has perdido tu dinero.. ha salido " caballo
			FinSi
			
		FinSi
		
	hasta que r="n" o r="N" o dineroJugador<10
	
FinAlgoritmo