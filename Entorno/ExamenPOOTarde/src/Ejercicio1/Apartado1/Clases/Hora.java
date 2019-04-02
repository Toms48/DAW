/* Nombre: Hora
 *
 * Básicas:
 * 		- hora    => int => Consultable y Modificable
 *		- minuto  => int => Consultable y Modificable
 *		- segundo => int => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package Ejercicio1.Apartado1.Clases;

public class Hora {
	
	//Atributos
	private int hora;
	private int minuto;
	private int segundo;
	
	//Constructor por defecto
	public Hora(){
		hora = 0;
		minuto = 0;
		segundo = 0;
	}
	
	//Constructor con parámetros
	public Hora(int hora, int minuto, int segundo){
		
		if(segundo>59){
			segundo = segundo/59;
			minuto += segundo%59;
		}
		
		if(minuto>59){
			minuto = minuto/59;
			hora += minuto%59;
		}
		
		if(hora>59){
			hora = hora/59;
		}
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	//Gets
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	//Sets
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = getHora() +":" +getMinuto() +":" +getSegundo();
		
		return s;
	}
	
	//Métos añadidos
	public static Hora sumarSegundo(Hora hora){
		
		hora.setSegundo(hora.getSegundo()+1);
		
		if(hora.getSegundo() > 59){
			hora.setSegundo(0);
			hora.setMinuto(hora.getMinuto()+1);
			if(hora.getMinuto() > 59){
				hora.setMinuto(0);
				hora.setHora(hora.getHora()+1);
				if(hora.getHora() > 23){
					hora.setHora(0);
				}
			}
		}
		
		return hora;
	}
	
}
