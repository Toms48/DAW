package BoletinPOO4.Ej11.Clases;

public class Bombilla {
	
	//Atributos
	private static int vatiosTotales;
	
	private static int identificador;
	
	private int idBombilla;
	private int vatiosConsumidos;
	private boolean estado;
	
	//Constructor por defecto
	public Bombilla(){
		Bombilla.aumentarID();
		idBombilla = identificador;
		vatiosConsumidos = 0;
		estado = false;
	}
	
	//Constructor con parámetros
	public Bombilla(int vatiosConsumidos, boolean estado){
		Bombilla.aumentarID();
		idBombilla = identificador;
		this.vatiosConsumidos = vatiosConsumidos;
		this.estado = estado;
		
		if(estado){
			setVatiosTotales(vatiosConsumidos);
		}
	}
	
	//Constructor con solo los vatios que consume
	public Bombilla(int vatiosConsumidos){
		Bombilla.aumentarID();
		idBombilla = identificador;
		this.vatiosConsumidos = vatiosConsumidos;
		estado = false;	//Por defecto con este constructor la bombilla empezará en estado apagado/false
	}
	
	//Gets
	public int getIdBombilla() {
		return idBombilla;
	}
	
	public int getVatiosConsumidos() {
		return vatiosConsumidos;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	public static int getVatiosTotales() {
		return vatiosTotales;
	}
	
	//Sets
	public static void setVatiosTotales(int vatiosTotales) {
		Bombilla.vatiosTotales += vatiosTotales;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	//Métodos sobrecargados
	@Override
	public String toString(){
		
		String estadoS = new String();
		
		if(isEstado()){
			estadoS = "encendida";
		}
		else{
			estadoS = "apagada";
		}
		
		String s = "La bombilla " +getIdBombilla() +" está " +estadoS;
		
		return s;
	}
	
	//Métodos añadidos
	public static void aumentarID(){
		identificador++;
	}
	
	public void encender(){
		if(isEstado()){
			System.out.println("La bombilla " +getIdBombilla() +" ya está encendida");
		}
		else{
			setEstado(true);
			setVatiosTotales(getVatiosConsumidos());
		}
	}
	
	public void apagar(){
		if(isEstado()){
			
			setEstado(false);
			setVatiosTotales(-getVatiosConsumidos());
		}
		else{
			System.out.println("La bombilla " +getIdBombilla() +" ya está apagada");
		}
	}
	
	public static void mostrarVatiosTotales(){
		System.out.println("Actualmente la potencia total consumida por las bombillas encendidas es: " +getVatiosTotales() +"W");
	}
	
}
