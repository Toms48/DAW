/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatestparametrizadotestsuite;

/**
 *
 * @author informatica
 */
public class metodos2 {
    
    public static int repiteCaracter(String cadena, String caracter){
        char car = caracter.charAt(0);
        int cantidadRepeticiones = 0;
        //iteramos hasta que el indice sea menor al tamanio de la cadena
        for (int i = 0 ; i < cadena.length() ; i++) {
            char aux = cadena.charAt(i); //obtenemos el caracter en la posicion i
            if (aux == car) {
                cantidadRepeticiones++;
            }
        }
        //retornamos la cantidad de repeticiones
        return  cantidadRepeticiones;
  }
}
