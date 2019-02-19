package Clases;

public class Bombilla {
	
	//Atributos
	boolean estado;		//true cuando esté encendida y false cuando esté apagada
	
	//Constructor
	public Bombilla(){
		this.estado = false;		//Siempre se va a crear una bombilla apagada
	}
	
	//Gets
	public boolean getEstado() {
		return estado;
	}
	
	//Sets
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	//Métodos sobrecargados
	@Override
	public String toString(){
		
		String s = new String();
		
		if(getEstado() == true){
			s = "La bombilla está encendida";
		}
		else{
			s = "La bombilla está apagada";
		}
		
		return s;
	}
	
	//Métodos añadidos
	public void apagar(){
		if(getEstado() == false){
			System.out.println("La bombilla ya está apagada");
		}
		else{
			setEstado(false);
		}
	}
	
	public void encender(){
		if(getEstado() == true){
			System.out.println("La bombilla ya está encendida");
		}
		else{
			setEstado(true);
		}
	}
	
}
