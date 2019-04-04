package practicatestparametrizado;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class metodos2 {
    public static String leer(){
     Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cadena:");
        String cadena = sc.nextLine(); //leemos la cadena
         return cadena;
    }
    
    public static int repiteCaracter(String cadena, String caracter){ 
       
        //los caracteres entonces leemos como cadena, luego obtenemos el primer
        //caracter para almacenarlo en un char, que seria el char que debemos buscar en
        //la primera cadena ingresada
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
