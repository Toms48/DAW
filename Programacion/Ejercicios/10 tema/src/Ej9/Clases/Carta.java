/* Nombre: Carta
 *
 * Básicas:
 * 		- valor => String => Consultable
 *		- palo  => String => Consultable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package Ej9.Clases;

import java.util.Objects;

public class Carta implements Comparable<Carta> {

    //Atributos
    private String valor = new String();
    private String palo = new String();

    //Constructor por defecto
    public Carta(){
        valor = "";
        palo = "";
    }

    //Constructor con parámetros
    public Carta(String valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    //Gets
    public String getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = getValor() +" de " +getPalo();

        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(valor, carta.valor) &&
                Objects.equals(palo, carta.palo);
    }

    public int compareTo(Carta carta){

        int ret = 0;

        if(this != carta && intPalo(this) > intPalo(carta)){
            ret = 1;
        }
        else{
            if(intPalo(this) < intPalo(carta)){
                ret = -1;
            }
        }
        
        if(ret==0){
			if(this != carta && intValor(this) > intValor(carta)){
				ret = 1;
			}
			else{
				if(intValor(this) < intValor(carta)){
					ret = -1;
				}
			}
		}

        return ret;
    }
    
    //Métodos añadidos
	public int intValor(Carta carta){
		
		int intValor = 0;
		
		switch(carta.getValor()){
			case "As":
				intValor = 1;
				break;
			
			case "2":
				intValor = 2;
				break;
			
			case "3":
				intValor = 3;
				break;
			
			case "4":
				intValor = 4;
				break;
			
			case "5":
				intValor = 5;
				break;
			
			case "6":
				intValor = 6;
				break;
			
			case "7":
				intValor = 7;
				break;
			
			case "Sota":
				intValor = 10;
				break;
			
			case "Caballo":
				intValor = 11;
				break;
			
			case "Rey":
				intValor = 12;
				break;
		}
    	
    	return intValor;
	}
	
	public int intPalo(Carta carta){
		
		int intPalo = 0;
		
		switch (carta.getPalo()){
			case "Bastos":
				intPalo = 1;
				break;
			
			case "Copas":
				intPalo = 2;
				break;
			
			case "Espadas":
				intPalo = 3;
				break;
			
			case "Oro":
				intPalo = 4;
				break;
		}
		
		return intPalo;
	}
}
