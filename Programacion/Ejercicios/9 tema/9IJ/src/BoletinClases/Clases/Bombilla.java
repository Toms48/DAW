package BoletinClases.Clases;

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
		
		if(getEstado()){
			s = "encendida";
		}
		else{
			s = "apagada";
		}
		
		return s;
	}
	
	//Métodos añadidos
	public void apagar(){
		if(getEstado()){
			
			setEstado(false);
			System.out.println("La bombilla está " +toString());
		}
		else{
			System.out.println("La bombilla ya está apagada");
		}
	}
	
	public void encender(){
		if(getEstado()){
			System.out.println("La bombilla ya está encendida");
		}
		else{
			setEstado(true);
			System.out.println("La bombilla está " +toString());
		}
	}
	
	public static void imprimirBombillaEncendida(){
		System.out.println("                 :                 ");
		System.out.println("             '.  _  .'             ");
		System.out.println("            -=  (~)  =-            ");
		System.out.println("             .'  #  '.             ");
	}
	
	public static void imprimirBombillaApagada(){
		System.out.println("                                   ");
		System.out.println("                 _                 ");
		System.out.println("                (~)                ");
		System.out.println("                 #                 ");
	}
	
}
