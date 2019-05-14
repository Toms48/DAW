package Ej1.Excepciones;

public class ExcepcionCalculadora extends Exception
{
    public ExcepcionCalculadora(String mensaje) {
        System.out.println(mensaje);
    }
}
