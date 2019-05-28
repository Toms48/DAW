package Clases;

import Clases.Carta;

import java.util.ArrayList;
import java.util.Comparator;

public class Baraja {
	//Atributos
	ArrayList<Carta> baraja = new ArrayList<>();
	
	//Constructor por defecto
	public Baraja(){
		
		for(int i=1; i<=4; i++){
			for(int j=1; j<=12; j++) {
                            if(j!=8 && j!=9){
                                Carta carta = new Carta(j,i);
				baraja.add(carta);
                            }
			}
		}
	}
	
	//Métodos sobrescritos
	@Override
	public String toString () {
		
		String s = new String();
		
		for(Carta carta : baraja){
			s = s + carta.toString()+"\n";
		}
		
		return s;
		
	}
	
	//Métodos añadidos
        public void quitarDeLaBaraja(Carta carta){
            for(int i=0; i<=baraja.size()-1; i++){
                if(baraja.get(i).compareTo(carta)==0){
                    baraja.remove(i);
                }
            }
        }
        
	public void ordenarBaraja(){
		baraja.sort(Carta::compareTo);
	}
	
	public void barajar(){
		Carta cartaAux;
		
		int cartaR1 = 0;
		int cartaR2 = 0;
		
		for(int i=0; i<=1499; i++){
			cartaR1 = (int)(Math.random()*40);
			cartaR2 = (int)(Math.random()*40);
			
			cartaAux = baraja.get(cartaR1);
			baraja.set(cartaR1,baraja.get(cartaR2));
			baraja.set(cartaR2,cartaAux);
		}
	}
	
	public boolean sinCartasEnBaraja(){
		
		boolean vacio = false;
		
		if(baraja.isEmpty()){
			vacio = true;
		}
		
		return vacio;
	}
	
	public int getCartasEnBaraja(){
		return baraja.size();
	}
	
	public Carta getCartaDeArriba(){
                Carta cartaArriba = baraja.get(0);
                baraja.remove(0);
                
		return cartaArriba;
	}
	
}
