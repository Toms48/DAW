package Clases;

public class Email {
	
	//Atributos
	private String direccionCorreoElectronico = new String();
	private String nombreUsuario = new String();
	
	//Constructor por defecto
	public Email(){
		direccionCorreoElectronico = "PorDefecto@gmail.com";
		nombreUsuario = "PorDefecto";
	}
	
	//Constructor sobrecargado
	public Email(String direccionCorreoElectronico, String nombreUsuario){
		this.direccionCorreoElectronico = direccionCorreoElectronico;
		this.nombreUsuario = nombreUsuario;
	}
	
	//Gets
	public String getDireccionCorreoElectronico() {
		return direccionCorreoElectronico;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	//Sets
	public void setDireccionCorreoElectronico(String direccionCorreoElectronico) {
		this.direccionCorreoElectronico = direccionCorreoElectronico;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	//Métodos sobrecargados
	
	
	//Métodos añadidos
	public void hayArroba(){
		if(direccionCorreoElectronico.indexOf('@') == -1){
			System.out.println("La direccion de correo electronico NO contiene el caracter @");
		}
		else{
			System.out.println("La direccion de correo electronico contiene el caracter @");
		}
	}
	
}
