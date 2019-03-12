/* Nombre: Timbre
 *
 * Básicas:
 * 		- estado => boolean => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO4.Ej8.Clases;

public class Timbre {
	
	//Atributos
	private boolean estado;
	
	//Constructor por defecto
	public Timbre(){
		estado = false;
	}
	
	//Gets
	public boolean isEstado() {
		return estado;
	}
	
	//Sets
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = new String();
		
		if (isEstado()){
			s = "Estado: Encendido";
		}
		else{
			s = "Estado: Apagado";
		}
		
		return s;
	}
	
	//Métos añadidos
	public void mensaje(){
		if(isEstado()){
			System.out.println("ALARMA ALARMA ALARMA La temperatura está muy alta");
		}
		else{
			System.out.println("Temperatura ha bajado a temperaturas normales");
		}
	}
	
}
