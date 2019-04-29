package Excepciones;

public class ExcepcionCalculadora extends Exception
{
    public ExcepcionCalculadora(String mensaje) {
        System.out.println(mensaje);
    }
}
