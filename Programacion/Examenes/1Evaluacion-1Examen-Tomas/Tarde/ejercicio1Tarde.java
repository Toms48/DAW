/*
 * Nombre: ejercicio1Tarde
 * 
 * Comentario:  ***
 * 
 * Análisis
 * 
 * 		Entradas: No tiene
 * 
 * 		Salidas: Por pantalla
 * 
 */


public class ejercicio1Tarde {
	
	public static void main (String[] args) {
		
		int contadornum = 0;
		
		for(int i=1; i<=100; i++){
			if(i%5!=0 && i%3==0 && i%9!=0){
				if(i==96){
					System.out.print(i);
				}
				else{
					System.out.print(i +",");
				}
			}
			
			contadornum++;
		}
		
		if(contadornum>4){
			System.out.println(" ");
			System.out.println("Se han encontrado muchos resultados");
		}
		
	}
}

