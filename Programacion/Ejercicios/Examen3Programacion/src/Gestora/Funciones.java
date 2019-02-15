/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestora;

/**
 *
 * @author joaquinjimenez
 */
public class Funciones {
    
    
    
    
    public static String abreviar(String anunciante) {

         String primeraLetra = anunciante.substring(0, 1) ;
         String ultimaLetra = anunciante.substring(anunciante.length()-1,anunciante.length());
         
         String anuncianteAbreviado = primeraLetra+ultimaLetra;
         
    return anuncianteAbreviado;
    }
    
    
    public static int precioTotal (int nAnuncios, int tiempoTotal) {
    
    int precio = (nAnuncios*1500)+(tiempoTotal*100);
    
    return precio;
    }
    
    
    public static int descuento (int nAnuncios){
        int descuento;
    
        if (nAnuncios<10) {
        descuento = nAnuncios * nAnuncios; 
        }
        
        else {
        descuento = 1;
        }
        
        return descuento;
    }
   
    
    public static double descuentoAplicado (int precioTotal, int descuento) {
    
        double resultado = (double)precioTotal-(((double)precioTotal*(double)descuento/10));
    
        return resultado;
    }
    
    
    
    
    
}
