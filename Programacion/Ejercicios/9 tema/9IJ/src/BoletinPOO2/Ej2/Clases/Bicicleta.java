package BoletinPOO2.Ej2.Clases;

public class Bicicleta extends Vehiculo {

    //Artibutos

    //Constructor por defecto
    public Bicicleta(){
        super();
    }

    //Constructor con parámetros
    public Bicicleta(int kilometrosRecorridos){
        super(kilometrosRecorridos);
    }

    //Métodos añadidos
    public void hacerCaballito(){
        System.out.println();
        System.out.println("Felicidades has hecho un caballito tope de mazo guapo, ahora eres el mago del barrio, crack.");
        System.out.println();
    }

}
