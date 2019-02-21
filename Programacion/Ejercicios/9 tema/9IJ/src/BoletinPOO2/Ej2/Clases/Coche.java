package BoletinPOO2.Ej2.Clases;

public class Coche extends Vehiculo {
	
	//Artibutos

    //Constructor por defecto
    public Coche(){
        super();
    }

    //Constructor con parámetros
    public Coche(int kilometrosRecorridos){
        super(kilometrosRecorridos);
    }

    //Métodos añadidos
    public void quemarRueda(){
        System.out.println();
        System.out.println("Has quemao rueda como un rechulón.");
        System.out.println();
    }
	
}
