package Ej2.Gestion;

import Ej2.Clases.Comensal;

public class GestionEjercicio2 {
	
	public static boolean cenaAnimada(Comensal[] mesa){
		
		boolean isAnimada = true;
		
		for(int i=0; i<=mesa.length-1 && isAnimada==true; i++){
				if(!mesa[i].getArrayAficiones().equals(mesa[i+1].getArrayAficiones())){
					isAnimada = false;
				}
		}
		
		/*for(Comensal comensal : mesa){
			
			for(int i=0; i<=comensal.getArrayAficiones().length-1; i++){
				if(!comensal.getArrayAficiones()[i].equals("vacio")){
					contadorAficiones++;
				}
			}
			contadorAficionesAux = contadorAficiones;
			
			if(contadorAficiones == contadorAficionesAux){
				mismoNumeroAficiones = true;
			}
			
			contadorAficiones = 0;
		}*/
		
		
		return isAnimada;
	}
	
}
