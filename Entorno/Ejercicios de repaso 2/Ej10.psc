//Ejercicio 10. Usando las funciones anteriores escribe un algoritmo que pregunte por un tipo de figura
//	( rectángulo, círculo ó triángulo), pida los valores de sus lados y muestre el valor del área.

Funcion opcionMenu<-fMenu()
	Escribir "Rectangulo ---> 1"
	Escribir "Circulo    ---> 2"
	Escribir "Triangulo  ---> 3"
	Escribir ""
	Escribir "Su opcion es: " Sin Saltar
	Leer opcionMenu
FinFuncion

Funcion areaRectangulo <- fAreaRectangulo(lado1, lado2)
	areaRectangulo = lado1*lado2
FinFuncion

Funcion areaCirculo <- fAreaCirculo(radio)
	areaCirculo = 3.14*(radio*radio)
FinFuncion

Funcion areaTriangulo <- fAreaTriangulo(base, altura)
	areaTriangulo = (base*altura)/2
FinFuncion

Algoritmo Ej10
	
	opcionMenu = fMenu()
	
	Segun opcionMenu Hacer
		1:
			Escribir "Introduzca un lado del rectangulo: " Sin Saltar
			Leer lado1
			
			Escribir "Introduzca el segundo lado del rectangulo: " Sin Saltar
			Leer lado2
			
			Escribir ""
			
			Escribir "El area del rectangulo es: " fAreaRectangulo(lado1,lado2)
		2:
			Escribir "Introduzca el radio del circulo: " Sin Saltar
			Leer radio
			
			Escribir ""
			
			Escribir "El area del circulo es: " fAreaCirculo(radio)
		3:
			Escribir "Introduzca la base del triangulo: " Sin Saltar
			Leer base
			
			Escribir "Introduzca la altura del triangulo: " Sin Saltar
			Leer altura
			
			Escribir ""
			
			Escribir "El area del traingulo es: " fAreaTriangulo(base,altura)
		De Otro Modo:
			Escribir "Introduzca 1, 2 o 3"
	Fin Segun
	
FinAlgoritmo
	