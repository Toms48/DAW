/* Nombre: AlarmaDeTemperatura
 *
 * Básicas:
 * 		- temperatura => int => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO4.Ej8.Clases;

public class AlarmaDeTemperatura {
	
	//Atributos
	private int temperatura;
	
	//Constructor por defecto
	public AlarmaDeTemperatura(){
		temperatura = 40;
	}
	
	//Constructor con parámetros
	public AlarmaDeTemperatura(int temperatura){
		this.temperatura = temperatura;
	}
	
	//Gets
	public int getTemperatura() {
		return temperatura;
	}
	
	//Sets
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "La temperatura actual es: " +getTemperatura();
		
		return s;
	}
	
	//Métos añadidos
	public void activarTimbre(Timbre timbre){
		if(!timbre.isEstado()){
			timbre.setEstado(true);
			timbre.mensaje();
		}
		else{
			System.out.println("La alarma aún sigue activada");
			timbre.mensaje();
		}
	}
	
	public void desactivarTimbre(Timbre timbre){
		if(!timbre.isEstado()){
			System.out.println("La temperatura es normal");
		}
		else{
			timbre.setEstado(false);
			timbre.mensaje();
		}
	}
	
}
