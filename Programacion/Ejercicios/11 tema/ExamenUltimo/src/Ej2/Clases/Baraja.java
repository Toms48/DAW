package Ej2.Clases;

import Ej2.Clases.Carta;
import Ej2.Excepciones.ExcepcionCarta;

import java.util.ArrayList;
import java.util.Comparator;

public class Baraja {
	//Atributos
	ArrayList<Carta> baraja = new ArrayList<>();
	
	//Constructor por defecto
	public Baraja() throws ExcepcionCarta {
		
		for(int i=1; i<=4; i++){
			for(int j=1; j<=10; j++) {
				Carta carta = new Carta(j,i);
				baraja.add(carta);
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
		return baraja.get(0);
	}
	
	//Reparte cartas no funciona
	public CartasJugador reparteCartas(){
		
		CartasJugador mano = new CartasJugador();
		
		for(int i=0; i<=4; i++){
			mano.manoJugador.add(getCartaDeArriba());
		}
		
		return mano;
	}
	
}
