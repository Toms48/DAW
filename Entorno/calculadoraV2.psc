Algoritmo calculadoraV2
	
	Escribir "CALCULADORA DE OPERACIONES B�SICAS"
	Escribir "-----------------------------------"
	
	Escribir ""
	
	salir=0
	
	Mientras salir=0 Hacer
		
		Escribir "Introduce un n�mero"
		Leer num1
		
		Escribir "Introduce otro n�mero"
		Leer num2
		
		Escribir ""
		
		Escribir "Selecciona la operaci�n a realizar"
		Escribir "----------------------------------"
		
		Escribir ""
		
		Escribir "1. Sumar"
		Escribir "2. Restar"
		Escribir "3. Multiplicar"
		Escribir "4. Dividir"
		Escribir "5. Potencia"
		
		Leer opcionMenu
		
		Segun opcionMenu Hacer
			1:
				
				Escribir "El resultado de la suma es: " num1+num2
				Escribir " Gracias por usar la calculadora......."
				
			2:
				
				Escribir "El resultado de la resta es: " num1-num2
				Escribir " Gracias por usar la calculadora......."
				
			3:
				
				Escribir "El resultado de la multiplicaci�n es: " num1*num2
				Escribir " Gracias por usar la calculadora......."
				
			4:
				
				Escribir "El resultado de la divici�n es: " num1/num2
				Escribir " Gracias por usar la calculadora......."
				
			5:
				resultadoPotencia = num1
				aux = 0
				
				Para i=1 Hasta num2-1 Con Paso 1 Hacer
					
					aux = resultadoPotencia*num1
					
					resultadoPotencia = aux
					
				Fin Para
				
				Escribir "El resultado de la potencia es: " resultadoPotencia
				Escribir " Gracias por usar la calculadora......."
				
		Fin Segun
		
		Escribir "�Quiere volver a sumar dos n�meros? (S/N)"
		
		Leer respuestaRepetir
		
		Si respuestaRepetir='S' Entonces
			salir=0
		SiNo
			salir=1
		Fin Si
		
	Fin Mientras
FinAlgoritmo
