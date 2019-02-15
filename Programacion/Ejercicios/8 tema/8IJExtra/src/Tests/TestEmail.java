package Tests;

import Clases.Email;

public class TestEmail {
	public static void main(String[] args){
	
		//Constructores
		Email cuentaPorDefecto = new Email();
		
		Email cuenta1 = new Email("tomasmateo98@gmail.com","Tomas Nuñez");
		Email cuenta2 = new Email("holiARROBAgmail.com","Sub Normal");
		
		//Gets
		System.out.println(cuentaPorDefecto.getDireccionCorreoElectronico());
		System.out.println(cuentaPorDefecto.getNombreUsuario());
		
		System.out.println();
		
		System.out.println(cuenta1.getDireccionCorreoElectronico());
		System.out.println(cuenta1.getNombreUsuario());
		
		System.out.println();
		
		System.out.println(cuenta2.getDireccionCorreoElectronico());
		System.out.println(cuenta2.getNombreUsuario());
		
		//Sets
		cuenta2.setDireccionCorreoElectronico("holicaracoliARROBAgmail.com");
		cuenta2.setNombreUsuario("Si, sub normal");
		
		System.out.println();
		
		System.out.println(cuenta2.getDireccionCorreoElectronico());
		System.out.println(cuenta2.getNombreUsuario());
		
		//hayArroba
		cuentaPorDefecto.hayArroba();
		cuenta1.hayArroba();
		cuenta2.hayArroba();
		
	}
}
