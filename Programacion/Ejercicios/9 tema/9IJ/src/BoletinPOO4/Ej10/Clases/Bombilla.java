package BoletinPOO4.Ej10.Clases;

public class Bombilla {
	
	//Atributos
	private boolean estado;		//true cuando esté encendida y false cuando esté apagada
	
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
			//System.out.println("La bombilla está " +toString());
		}
		else{
			System.out.println("Esa bombilla ya está apagada");
		}
	}
	
	public void encender(){
		if(getEstado()){
			System.out.println("Esa bombilla ya está encendida");
		}
		else{
			setEstado(true);
			//System.out.println("La bombilla está " +toString());
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
	
	public void mostrarEstado(String habitacion){
		System.out.println("¿Como está la bombilla del dormitorio?");
		System.out.println("La bombilla del la habitacion -" +habitacion +"- está " +toString());
	}
	
	public static void apagon(){
		System.out.println(" ¿Qué ha ocurrido no hay luz? Habrán saltado los fusibles");
		System.out.println("Luz de la habitación dormitorio se apagó repentinamente");
		System.out.println("Luz de la habitación cocina se apagó repentinamente");
		System.out.println("Luz de la habitación aseo se apagó repentinamente");
		System.out.println("Luz de la habitación portal se apagó repentinamente");
		System.out.println("Luz de la habitación comedor se apagó repentinamente");
	}
	
}
