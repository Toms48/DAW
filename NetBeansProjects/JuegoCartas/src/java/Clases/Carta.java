package Clases;

import java.util.Objects;

public class Carta implements Comparable<Carta> {
	
	//Atributos
	private int valor;
	private int palo;
        private String imagen;
	
	//Constructor por defecto
	public Carta(){
            valor = 0;
            palo = 0;
	}
	
	//Constructor con parámetros
	public Carta(int valor, int palo){
            this.valor = valor;
            this.palo = palo;
	}
	
	//Gets
	public int getValor() {
            return valor;
	}
	
	public int getPalo() {
            return palo;
	}

        public String getImagen() {
            return imagen;
        }
	
	public void setValor(int valor){
            this.valor = valor;
	}
	
	public void setPalo(int palo){
            this.palo = palo;
	}

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }
        
        
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = new String();
		
		switch (getValor()){
			case 1:
				s = "as";
				break;
			
			case 10:
				s = "sota";
				break;
			
			case 11:
				s = "caballo";
				break;
			
			case 12:
				s = "rey";
				break;
			
			default:
				s = Integer.toString(getValor());
				break;
		}
		
		switch (getPalo()){
			case 1:
				s = s +"bastos.png";
				break;
			
			case 2:
				s = s + "copas.png";
				break;
			
			case 3:
				s = s + "espadas.png";
				break;
			
			case 4:
				s = s + "oros.png";
				break;
		}
		
                this.setImagen(s);
                
		return "<img id=\"imagen\" src=\"imagenes/" + imagen +"\">";
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
