package Gestora;

/**
 *
 * @author t-m-1
 */
public class GestoraPruebasFunciones {
    
    public static int suma3(int num){
        int resultado = 0;
        
        resultado = 3+num;
        
        return resultado;
    }
    
    public static int SumaParesMenores(int num){
        int resultado = 0;
        
        do{
            num = num-2;
            
            resultado = resultado+num;
        }
        while(num!=0);
        
        return resultado;
    }
    
}
