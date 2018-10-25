//MT
//		Nec: No hay
//		Dev: String
//		Nec/Dev: No hay
//		Restriccion: No hay
//			
//Interfaz
//		Comentario: Función que según un número aleatorio devuelve un String simulando así el ganador de la carrera
//		Cabecera: carrera()
//		Precondiciones: No hay
//		Entrada: No hay
//		Salida: String
//		E/S: No hay
//		Postcondiciones: El String solo puede ser: Trueno, Relampago o Pegasus
funcion ganador<-carrera()
	segun azar(3) //
		0: ganador="Trueno"
		1: ganador="Relampago"
		2: ganador="Pegasus"
	FinSegun
FinFuncion


//MT
//		Nec: No hay
//		Dev: String
//		Nec/Dev: No hay
//		Restriccion: No hay
//			
//Interfaz
//		Comentario: Función que mediante un menú lee la respuesta para saber a que caballo apuesta el usuario
//		Cabecera: apuestacaballo()
//		Precondiciones: No hay
//		Entrada: No hay
//		Salida: String
//		E/S: No hay
//		Postcondiciones: El String solo puede ser: Trueno, Relampago o Pegasus
funcion apc<-apuestacaballo()
	escribir " Introduce tu apuesta"
	escribir "1. Trueno"
	escribir "2. Relampago"
	escribir "3. Pegasus"
	leer a
	segun a
		1: apc="Trueno"
		2: apc="Relampago"
		3: apc="Pegasus"
	FinSegun
FinFuncion


//MT
//		Nec: numero
//		Dev: String
//		Nec/Dev: No hay
//		Restriccion: No hay
//			
//Interfaz
//		Comentario: Función que lee la cantidad que quiere apostar el usuario (siempre que sea menor o igual que ek dinero de la cartera)
//		Cabecera: apdinero(c)
//		Precondiciones: No hay
//		Entrada: numero
//		Salida: numero
//		E/S: No hay
//		Postcondiciones: El numero no será superior al dinero que tiene el usuario en la cartera
funcion cantidad<-apdinero(c) //c es el dinero que tiene el usuario en la cartera
	repetir //Un repetir para validar que el usuario no introduzca más dinero del que tiene
		escribir "Introduce la apuesta en euros"
		leer cantidad
		si cantidad > c 
			escribir " No puedes apostar mas de lo que tienes.."
			escribir " Apuesta otra vez.."
		FinSi
	hasta que cantidad <= c	
	escribir " Has apostado: " cantidad " euros"
FinFuncion


Algoritmo carrera_caballos_Comentado
	escribir " BIENVENIDOS AL HIP?DROMO.."
	escribir " Vamos a pasar un d?a de apuestas..."
	escribir ""
	escribir " Introduce cuento dinero llevas en la cartera "
	leer cartera 
	
	repetir //Repetir para que el usuario pueda salir si quiero o cuando se quede sin dinero (porque no puedes apostar dinero que no tienes)
		apuesta<-apdinero(cartera) //Asignamos el dinero apostado por el usuario
		cartera = cartera-apuesta
		
		apcab<-apuestacaballo() //Asignamos el caballo apostado por el usuario
		gana<-carrera() //Asignamos el caballo ganador
		
		si gana = apcab Entonces
			escribir " Has ganado... el ganador ha sido :" gana
			escribir " has ganado " apuesta*3 " euros"
			cartera=cartera+apuesta*3
			escribir "Tienes ahora en cartera " cartera
		SiNo
			escribir " lo sentimos has perdido ..apostaste a " apcab " y gan? " gana
			escribir "Tienes ahora en cartera " cartera
		FinSi
		
		si cartera>0
			escribir "Quieres salir del hip?dromo? s/n"
			leer salir
		SiNo
			escribir " Lo sentimos pero no te queda dinero en la cartera, tienes que abandonar el hip?dromo"
		FinSi
		
	hasta que salir="s" o salir="S" o cartera=0 
	
	escribir " Te vas del hip?dromo con  " cartera " euros"
	
	
FinAlgoritmo