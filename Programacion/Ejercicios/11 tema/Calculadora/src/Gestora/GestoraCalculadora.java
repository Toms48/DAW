package Gestora;

import Excepciones.ExcepcionCalculadora;

public class GestoraCalculadora {
	
    double resultado = 0;

    public double suma(double numero1, double numero2) {

        return numero1 + numero2;
    }

    public double resta(double numero1, double numero2) throws ExcepcionCalculadora {

        if(numero2 < 0){
            throw new ExcepcionCalculadora("El segundo numero no pude ser menor que cero");
        }
        else{
            resultado = numero1 - numero2;
        }

        return resultado;
    }

    public double division(double numero1, double numero2) throws ExcepcionCalculadora {

        if(numero2==0 && numero1==0){
            throw new ExcepcionCalculadora("Imagínate que tiene cero galletas y las repartes entre cero amigos.\n¿Cuántas galletas le tocan a cada amigo?\nNo tiene sentido.\n¿Lo ves?\nAsí que el monstruo de las galletas está triste porque no tiene galletas y tú estás triste porque no tienes amigos");
        }
        else{
            if(numero2 == 0){
                throw new ExcepcionCalculadora("No podemos calcular una división entre 0");
            }
            else{
                resultado = numero1 / numero2;
            }
        }

        return resultado;
    }

    public double multiplicacion(double numero1, double numero2) {
        
        return numero1 * numero2;
    }

}
