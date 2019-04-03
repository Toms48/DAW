/* Nombre: Comensal
 *
 * Básicas:
 * 		- arrayAficiones => String => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package Ej2.Clases;

import java.util.Arrays;

public class Comensal {
	
	//Atributos
	private String[] arrayAficiones;
	
	//Constructor por defecto
	public Comensal(){
		arrayAficiones = new String[5];
		
		arrayAficiones[0] = "vacio";
		arrayAficiones[1] = "vacio";
		arrayAficiones[2] = "vacio";
		arrayAficiones[3] = "vacio";
		arrayAficiones[4] = "vacio";
	}
	
	//Constructor con parámetros
	
	//Gets
	public String[] getArrayAficiones() {
		return arrayAficiones;
	}
	
	//Sets
	public void setArrayAficiones(String[] arrayAficiones) {
		this.arrayAficiones = arrayAficiones;
	}
	
	//Métodos sobrescritos
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Comensal comensal = (Comensal) o;
		return Arrays.equals(arrayAficiones, comensal.arrayAficiones);
	}
	
	//Métos añadidos
	public boolean arrayLleno(){
		
		boolean isLleno = true;
		
		for(int i=0; i<=arrayAficiones.length-1 && isLleno==true; i++){
			if(arrayAficiones[i].equals("vacio")){
				isLleno = false;
			}
		}
		
		return isLleno;
	}
	
	public void agregarAficion(String aficion){
		
		boolean arrayLleno = true;
		
		int primeraPosicionLibre = 0;
		
		for(int i=0; i<=arrayAficiones.length-1 && arrayLleno==true; i++){
			if(arrayAficiones[i].equals("vacio")){
				arrayLleno = false;
				primeraPosicionLibre = i;
			}
		}
		
		if(arrayLleno == true){
			System.out.println("No se pueden añadir más notas");
		}
		else{
			arrayAficiones[primeraPosicionLibre] = aficion;
			//System.out.println(aficion +" se ha añadido correctamente."); //Código de prueba para ver que entra bien en el caso
		}
	}

}
