package Gestora;

public class Gestora8IJ {

/**************************************************************************
Interfaz
Comentario: De vuelve un valor decimal redondeado hacia abajo si es 0 o positivo.
 			en el caso de que sea negativo, redondeamos hacia arriba y le cambiamos el signo
Cabecera: double numeroPositivoONegativo(double num)
Precondiciones: No tiene
Entrada: Un int
Salida: Un boolean
E/S: No hay
Postcondiciones:
	- Si el numero es negativo lo devuelve en positivo
 	- Si es negativo se redondea arriba
 	- Si es positivo se readondea hacia abajo
**************************************************************************/

	public static double numeroPositivoONegativo(double num){
		
		double redondeo = 0;
		
		if(num>=0){
			redondeo = Math.floor(num);
		}
		else{
			redondeo = Math.ceil(-1*num);
		}
		
		return redondeo;
	}

/**************************************************************************
Interfaz
Comentario: Devuelve verdadero si un numero es capicúa y falso si no lo es
Cabecera: boolean esCapicua(int num)
Precondiciones: No tiene
Entrada: Un int
Salida: Un boolean
E/S: No hay
Postcondiciones:
 	- True si es capicúa
 	- False si no es capicúa
**************************************************************************/

	public static boolean esCapicua(int iNumero){
		boolean resultado = false;
		
		//String sNumero = "";
		int iNumero2 = 0;
		int iNumeroInvertido = 0;
		
		//Inicio
			//Comprobar capicua
			//iNumero = Integer.parseInt(sNumero);
			iNumero2 = iNumero;
			
			while(iNumero != 0) {
				int digit = iNumero % 10;
				iNumeroInvertido = iNumeroInvertido * 10 + digit;
				iNumero = iNumero/10;
			}
			
			//Si numero y su invertido son iguales
			if(iNumero2 == iNumeroInvertido){
				resultado = true;
			}
		//Fin
		
		return resultado;
	}
	
/**************************************************************************
Interfaz
Comentario: Devuelve verdadero si el número que se le pasa es primo y falso si no lo es
Cabecera: boolean esPrimo(int num)
Precondiciones: No tiene
Entrada: Un int
Salida: Un boolean
E/S: No hay
Postcondiciones:
	- True si es primo
	- False si no es primo
**************************************************************************/

	public static boolean esPrimo(int numero){
		
		//Declaración de variables
		boolean resultado = false;
		
		int contadorDivisibles = 0;
		
		//Incio
			//Comprobar si es primo
			for(int i=1; i<=numero; i++){
				if(numero%i == 0){
					contadorDivisibles++;
				}
				
			}
			
			//Si es divisible por dos numeros
			if(contadorDivisibles == 2){
				resultado = true;
			}
		//Fin
		
		return resultado;
	}
	
/**************************************************************************
Interfaz
Comentario: Devuelve el menor primo que es mayor al número que pasamos
Cabecera: int siguientePrimo(int num)
Precondiciones: No tiene
Entrada: Un int
Salida: Un int
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int siguientePrimo(int num){
		
		int nextNum = 0;
		int contadorDivisibles = 0;
		
		boolean esPrimo = false;
		
		for(int i=num+1; esPrimo==false; i++){
			for(int j=1; j<=i; j++){
				if(i%j == 0){
					contadorDivisibles++;
				}
				
			}
			
			//Si es divisible por dos numeros
			if(contadorDivisibles == 2){
				esPrimo = true;
				
				nextNum = i;
			}
			
			contadorDivisibles = 0;
			
		}
		
		return nextNum;
	}
	
/**************************************************************************
Interfaz
Comentario: Dada una base y un exponente devuelve la potencia
Cabecera: int potencia(int base, int exponente)
Precondiciones: La base y el exponente no son dos ceros
Entrada:
 	- Un int para la base
 	- Un int para el exponente
Salida: Un int
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int potencia(int base, int exponente){
		
		return (int)(Math.pow((double)(base), (double)(exponente)));
	}
	
/**************************************************************************
Interfaz
Comentario: Cuenta el número de dígitos de un número entero.
Cabecera: int digitos(int num)
Precondiciones: No tiene
Entrada: Un int
Salida: Un int
E/S: No hay
Postcondiciones: No tiene
**************************************************************************/

	public static int digitos(int numero){
		
		int aux = 0;
		int nDigitos = 0;
		
		//Inicio
			//Leer y validar el numero
			aux = numero;
			
			//Si el numero es negativo
			if(numero<0){
				//Pasar numero a positivo
				numero = numero*-1;
			}//Fin_Si
		
			//Contar los digitos del numero
			if(numero==0){
				nDigitos = 1;
			}
			else{
				while(numero>0){
					/***** Código de prueba *****
					 *System.out.println(numero%10); %10 quita la primera cifra del número
					 *System.out.println(numero/10); /10 quita la cifra de las unidades de nuestro número
					 ****************************/
					
					numero = numero/10;
					
					nDigitos++;
				}
			}
		//Fin
		
		return nDigitos;
	}
	
/**************************************************************************
Interfaz
Comentario: Le da la vuelta a un número.
Cabecera: int voltea(int num)
Precondiciones: No tiene
Entrada: Un int
Salida: Un int
E/S: No hay
Postcondiciones: El numero es el mismo pero dado la vuelta
**************************************************************************/

	public static int voltea(int numero){
		
		int numeroInvertido = 0;
		
		//Inicio
			//Mostrar numero al revés
			while(numero != 0){  //(este while no es mio, es de internet)
				int aux = numero % 10;
				numeroInvertido = numeroInvertido * 10 + aux;
				numero = numero/10;
			}
		//Fin
		
		return numeroInvertido;
	}
	
/**************************************************************************
Interfaz
Comentario: Devuelve el dígito que está en la posición n de un número entero.
 			Se empieza contando por el 0 y de izquierda a derecha
Cabecera: int digitoN(int num, int posicion)
Precondiciones: No tiene
Entrada: Un int
Salida: Un int
E/S: No hay
Postcondiciones:
 	- Envia un -1 si la posicion es superior al numero de digitos
 	- Envia un -2 si la posicion del numero que le mandamos es negativa
**************************************************************************/

	public static int digitoN(int numero, int posicion){
		
		int devuelto = 0;
		int delreves = 0;
		
		if(numero<0){
			numero = numero*-1;
		}
		
		if(posicion>(digitos(numero)-1)){
			devuelto = -1;
		}
		else{
			if(posicion<0){
				devuelto = -2;
			}
			else{
				delreves = voltea(numero);
				
				for(int i=1; i<=posicion; i++){
					delreves = delreves/10;
				}
				devuelto = delreves%10;
			}
		}
		
		return devuelto;
	}

}
