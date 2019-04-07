funcion num1<-leerNumero()
	Escribir "Introduce un número"
	Leer num1
FinFuncion

Funcion mostrarMenu()
	Escribir "Selecciona la operación a realizar"
	Escribir "----------------------------------"
	
	Escribir ""
	
	Escribir "1. Sumar"
	Escribir "2. Restar"
	Escribir "3. Multiplicar"
	Escribir "4. Dividir"
	Escribir "5. Potencia"
FinFuncion

Funcion suma(num1,num2)
	Escribir "El resultado de la suma es: " num1+num2
	Escribir " Gracias por usar la calculadora......."
FinFuncion

Funcion resta(num1,num2)
	Escribir "El resultado de la resta es: " num1-num2
	Escribir " Gracias por usar la calculadora......."
FinFuncion

Funcion multiplicacion(num1,num2)
	Escribir "El resultado de la multiplicación es: " num1*num2
	Escribir " Gracias por usar la calculadora......."
FinFuncion

Funcion divicion(num1,num2)
	Escribir "El resultado de la divición es: " num1/num2
	Escribir " Gracias por usar la calculadora......."
FinFuncion

Funcion potencia(num1,num2)
	resultadoPotencia = num1
	aux = 0
	
	Para i=1 Hasta num2-1 Con Paso 1 Hacer
		
		aux = resultadoPotencia*num1
		
		resultadoPotencia = aux
		
	Fin Para
	
	Escribir "El resultado de la potencia es: " resultadoPotencia
	Escribir " Gracias por usar la calculadora......."
FinFuncion

Algoritmo calculadoraModulada
	
	Escribir "CALCULADORA DE OPERACIONES BÁSICAS"
	Escribir "-----------------------------------"
	
	num1 <- leerNumero()
	num2 <- leerNumero()
	
	mostrarMenu()
	opcionMenu <- leerNumero
	
	Segun opcionMenu Hacer
		1:
			
			suma(num1,num2)
			
		2:
			
			resta(num1,num2)
			
		3:
			
			multiplicacion(num1,num2)
			
		4:
			
			divicion(num1,num2)
			
		5:
			
			potencia(num1,num2)
			
	Fin Segun
	
FinAlgoritmo
