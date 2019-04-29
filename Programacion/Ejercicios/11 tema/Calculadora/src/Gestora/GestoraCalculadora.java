package Gestora;

import Excepciones.ExcepcionCalculadora;

import java.util.Scanner;

public class GestoraCalculadora {

    double numero1 = 0;
    double numero2 = 0;

    double resultado = 0;

    Scanner tecladoN = new Scanner(System.in);

    public double suma() throws ExcepcionCalculadora {

        System.out.print("Introduzca el primer numero: ");
        numero1 = tecladoN.nextInt();

        System.out.print("Introduzca el segundo numero: ");
        numero2 = tecladoN.nextInt();

        if(numero2 < 0){
            throw new ExcepcionCalculadora("El segundo numero no pude ser menor que cero");
        }
        else{
            resultado = numero1 + numero2;
        }

        return resultado;
    }

    public double resta() throws ExcepcionCalculadora {

        System.out.print("Introduzca el primer numero: ");
        numero1 = tecladoN.nextInt();

        System.out.print("Introduzca el segundo numero: ");
        numero2 = tecladoN.nextInt();

        if(numero2 < 0){
            throw new ExcepcionCalculadora("El segundo numero no pude ser menor que cero");
        }
        else{
            resultado = numero1 - numero2;
        }

        return resultado;
    }

    public double division() throws ExcepcionCalculadora {

        System.out.print("Introduzca el primer numero: ");
        numero1 = tecladoN.nextInt();

        System.out.print("Introduzca el segundo numero: ");
        numero2 = tecladoN.nextInt();

        if(numero2 < 0){
            throw new ExcepcionCalculadora("El segundo numero no pude ser menor que cero");
        }
        else{
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
        }

        return resultado;
    }

    public double multiplicacion() throws ExcepcionCalculadora {

        System.out.print("Introduzca el primer numero: ");
        numero1 = tecladoN.nextInt();

        System.out.print("Introduzca el segundo numero: ");
        numero2 = tecladoN.nextInt();

        if(numero2 < 0){
            throw new ExcepcionCalculadora("El segundo numero no pude ser menor que cero");
        }
        else{
            resultado = numero1 * numero2;
        }

        return resultado;
    }

}
