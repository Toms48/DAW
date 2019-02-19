package Clases;

public class Monedero {
	
	//Atributos
	int cantidadDinero;
	
	//Constructor por defecto
	public Monedero(){
		cantidadDinero = 0;
	}
	
	//Constructor con parametros
	public Monedero(int dineroInicial){
		cantidadDinero = dineroInicial;
	}
	
	//Gets
	private int getCantidadDinero() {
		return cantidadDinero;
	}
	
	//Sets
	public void setCantidadDinero(int cantidadDinero) {
		this.cantidadDinero = cantidadDinero;
	}
	
	//Métodos sobrescritos
	@Override
	public String toString(){
		
		String s = "El dinero que hay en el monedero es: " +getCantidadDinero() +"€";
		
		return s;
	}
	
	//Métodos sobrecargados
	public void sacarDinero(int cantidadParaSacar){
		
		if(cantidadParaSacar > this.getCantidadDinero()){
			System.out.println("Ji, ni que tuvieras tanto dinero hermanito.");
			System.out.println("Tienes " +this.getCantidadDinero() +" no puedes sacar más de eso.");
		}
		else{
			this.setCantidadDinero(this.getCantidadDinero()-cantidadParaSacar);
		}
	}
	
	public void meterDinero(int cantidadParaMeter){
		this.setCantidadDinero(cantidadParaMeter);
	}
	
	public void consultarDinero(){
		toString();
	}
	
}
