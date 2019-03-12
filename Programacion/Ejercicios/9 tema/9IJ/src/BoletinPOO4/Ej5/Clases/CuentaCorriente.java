/* Nombre: CuentaCorriente
 *
 * Básicas:
 * 		- nombreVariable => tipoVariable => Consultable y Modificable
 *		- nombreVariable => tipoVariable => Consultable y Modificable
 *		- nombreVariable => tipoVariable => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones: No tiene
 */

package BoletinPOO4.Ej5.Clases;

public class CuentaCorriente {

    //Atributos
    private double saldo;

    //Constructor por defecto
    public CuentaCorriente(){
        saldo = 0;
    }

    //Constructor con parámetros
    public CuentaCorriente(double saldo){
        this.saldo = saldo;
    }

    //Gets
    public double getSaldo() {
        return saldo;
    }

    //Sets
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = "Saldo: " +getSaldo();

        return s;
    }

    //Métos añadidos
    public void saldo(){
        System.out.println("Su saldo actual es de " +getSaldo() +"€");
    }

    public void imposicion(double cantidad){
        this.setSaldo(cantidad + this.getSaldo());

        System.out.println("Se ha ingresado una cantidad de " +cantidad +"€ en la cuenta corriente");

        System.out.println();

        this.saldo();
    }

    public void reintegro(double cantidad){
        this.setSaldo(this.getSaldo() - cantidad);

        System.out.println("Se ha extraido una cantidad de " +cantidad +"€ de la cuenta corriente");

        System.out.println();
	
		this.saldo();
    }
    
    public void traspaso(double cantidad, CuentaCorriente cuentaCorriente){
    	
    	if(cantidad > this.getSaldo()){
    		System.out.println("Lo sentimos, no se ha podido completar la operacion, no tiene saldo suficiente.");
    		System.out.println("Ya sabeh, trabaja más.");
		}
		else{
			System.out.println("La cuenta indicada ha recibido " +cantidad +"€");
			
			cuentaCorriente.setSaldo(cantidad + cuentaCorriente.getSaldo());
			this.setSaldo(this.getSaldo() - cantidad);
			
			this.saldo();
			
			System.out.println("La operacion se ha realizado sin problemas.");
		}
	}

}
