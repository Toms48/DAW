/* Nombre: SintonizadorDigital
 *
 * Básicas:
 * 		- frecuencia	=> double => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones:
 * 		- Empieza por defecto a 80 MHz
 * 		- Frecuencia mínima ---> 80 MHz
 * 		- Frecuencia máxima ---> 108 MHz
 *
 * 		- Si se pasa por arriba o por abajo la frecuencia cambia al extremo contrario (de 80 a 108 y de 108 a 80)
 */

package BoletinPOO4.Ej4.Clases;

public class SintonizadorDigital {
	
	//Atributos
	private double frecuencia;
	
	//Constructor por defecto
	public SintonizadorDigital(){
		frecuencia = 80;
	}
	
	//Constructor con parámetros
	public SintonizadorDigital(double frecuencia){
		this.frecuencia = frecuencia;
	}
	
	//Gets
	public double getFrecuencia() {
		return frecuencia;
	}
	
	//Sets
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = "Frecuencia: " +getFrecuencia() +" MHz";
		
		return s;
	}
	
	//Métos añadidos
	public void up(){
		if( (getFrecuencia() + 0.5) > 108 ){
			setFrecuencia(80);
		}
		else{
			setFrecuencia( getFrecuencia() + 0.5 );
		}
	}
	
	public void down(){
		if( (getFrecuencia() - 0.5) < 80 ){
			setFrecuencia(108);
		}
		else{
			setFrecuencia( getFrecuencia() - 0.5 );
		}
	}
	
}
