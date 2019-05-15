package Ej2.Clases;

import Ej2.Excepciones.ExcepcionCarta;

import java.util.Objects;

public class Carta implements Comparable<Carta> {
	
	//Atributos
	private int valor;
	private int palo;
	
	//Constructor por defecto
	public Carta(){
		valor = 0;
		palo = 0;
	}
	
	//Constructor con parámetros
	
	public Carta(int valor, int palo) throws ExcepcionCarta {
		try{
			if(valor<1 || valor>10){
				throw new ExcepcionCarta("Solo pueden ser valores entre 1 y 10");
			}
			else{
				if(palo<1 || palo>4){
					throw new ExcepcionCarta("Solo pueden ser valores entre 1 y 4");
				}
				else{
					this.valor = valor;
					this.palo = palo;
				}
			}
		}
		catch(ExcepcionCarta e){
			System.out.println(e.getMessage());
		}
	}
	
	//Gets
	public int getValor() {
		return valor;
	}
	
	public int getPalo() {
		return palo;
	}
	
	public void setValor(int valor) throws ExcepcionCarta {
		if(valor<1 || valor>10){
			throw new ExcepcionCarta("Solo pueden ser valores entre 1 y 10");
		}
		else{
			this.valor = valor;
		}
	}
	
	public void setPalo(int palo) throws ExcepcionCarta {
		if(palo<1 || palo>4){
			throw new ExcepcionCarta("Solo pueden ser valores entre 1 y 4");
		}
		else{
			this.palo = palo;
		}
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = new String();
		
		switch (getValor()){
			case 1:
				s = "As de ";
				break;
			
			case 8:
				s = "Sota de ";
				break;
			
			case 9:
				s = "Caballo de ";
				break;
			
			case 10:
				s = "Rey de ";
				break;
			
			default:
				s = getValor() + " de ";
				break;
		}
		
		switch (getPalo()){
			case 1:
				s = s +"bastos";
				break;
			
			case 2:
				s = s + "copas";
				break;
			
			case 3:
				s = s + "espadas";
				break;
			
			case 4:
				s = s + "oros";
				break;
		}
		
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

        if(this != carta && this.getPalo() > carta.getPalo()){
        	ret = 1;
		}
		else{
			if(this.getPalo() < carta.getPalo()){
				ret = -1;
			}
			else{
				
				if(this != carta && this.getValor() > carta.getValor()){
					ret = 1;
				}
				else{
					if(this.getValor() < carta.getValor()){
						ret = -1;
					}
				}
				
			}
		}
		
        return ret;
    }
	
}
