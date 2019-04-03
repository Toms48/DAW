/* Nombre: Instrumento
 *
 * Básicas:
 * 		- arrayNotas => Nota => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package Ej1.Clases;

import Ej1.Enums.Nota;

public abstract class Instrumento {
	
	//Atributos
	private Nota[] arrayNotas;
	
	//Constructor por defecto
	public Instrumento(){
		arrayNotas = new Nota[10];
		arrayNotas[0] = Nota.VACIO;
		arrayNotas[1] = Nota.VACIO;
		arrayNotas[2] = Nota.VACIO;
		arrayNotas[3] = Nota.VACIO;
		arrayNotas[4] = Nota.VACIO;
		arrayNotas[5] = Nota.VACIO;
		arrayNotas[6] = Nota.VACIO;
		arrayNotas[7] = Nota.VACIO;
		arrayNotas[8] = Nota.VACIO;
		arrayNotas[9] = Nota.VACIO;
	}
	
	//Constructor con parámetros
	
	//Gets
	public Nota[] getArrayNotas() {
		return arrayNotas;
	}
	
	//Sets
	public void setArrayNotas(Nota[] arrayNotas) {
		this.arrayNotas = arrayNotas;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "";
		
		return s;
	}
	
	//Métos añadidos
	public boolean arrayLleno(){
		
		boolean isLleno = true;
		
		for(int i=0; i<=arrayNotas.length-1 && isLleno==true; i++){
			if(arrayNotas[i] == Nota.VACIO){
				isLleno = false;
			}
		}
		
		return isLleno;
	}
	
	public void agregarNota(Nota nota){
		
		boolean arrayLleno = true;
		
		int primeraPosicionLibre = 0;
		
		for(int i=0; i<=arrayNotas.length-1 && arrayLleno==true; i++){
			if(arrayNotas[i] == Nota.VACIO){
				arrayLleno = false;
				primeraPosicionLibre = i;
			}
		}
		
		if(arrayLleno == true){
			System.out.println("No se pueden añadir más notas");
		}
		else{
			arrayNotas[primeraPosicionLibre] = nota;
			//System.out.println(nota +" se ha añadido correctamente."); //Código de prueba para ver que entra bien en el caso
		}
	}
	
}
