/* Nombre: Pizza
 *
 * Básicas:
 * 		- tamanio   => String => Consultable
 * 		- tipo      => String => Consultable
 * 		- estado    => String => Consultable y Modificable
 *
 * Derivadas: No tiene
 *
 * Compartidas: No tiene
 *
 * Restricciones:
 *      - El tamanio solo puede ser: mediana o familiar
 *      - El tipo solo puede ser: margarita, cuatro quesos o funghi
 *      - El estado solo puede ser: pedida o servida
 */

package BoletinPOO2.Ej5.Clases;

import BoletinPOO2.Ej5.Enums.*;

public class Pizza {

    //Atributos
    private static int totalPedidas;
    private static int totalServidas;
    private tamanioPizza tamanio;
    private tipoPizza tipo;
    private boolean estado; //False si está pedida y True si está servida
    private int precio;

    //Constructor con parámetros
    public Pizza(tipoPizza tipo, tamanioPizza tamanio){
        this.tamanio = tamanio;
        this.tipo = tipo;
        estado = false;
        this.totalPedidas += 1;
        
        if(tamanio == tamanioPizza.mediana){
        	precio = 7;
		}
		else{
			if(tamanio == tamanioPizza.familiar){
				precio = 12;
			}
		}
    
    }

    //Gets
    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public tamanioPizza getTamanio() {
        return tamanio;
    }

    public String getTipo() {

        String devuelto = "";

        if(tipo == tipoPizza.cuatroQuesos){
            devuelto = "cuatro quesos";
        }
        else{
            devuelto = tipo.toString();
        }

        return devuelto;
    }

    public boolean getEstado() {
        return estado;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    //Sets
    /*public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas += totalPedidas;
    }*/

    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas += totalServidas;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //Métodos sobrescritos
    @Override
    public String toString(){

        String s = "";

        if(getEstado()){
        	s = "Pizza " +getTipo() +" " +getTamanio() +", servida.";
		}
		else{
			s = "Pizza " +getTipo() +" " +getTamanio() +", pedida.";
		}
        
        return s;
    }

    //Métodos añadidos
    public void sirve(){
        if(getEstado()){
            System.out.println("La pizza " +getTamanio() +" de " +getTipo() +" ya se ha servido");
        }
        else{
            setEstado(true);
            setTotalServidas(1);
            
            System.out.println(toString() +" Son " +getPrecio() +"€, que aproveche");
        }
    }
    
    public void isServida(){
    	if(getEstado()){
			System.out.println("Esa pizza ya se ha servido");
		}
		else{
			System.out.println("La pizza " +getTamanio() +" de " +getTipo() +" aún NO está servida");
		}
	}

}
