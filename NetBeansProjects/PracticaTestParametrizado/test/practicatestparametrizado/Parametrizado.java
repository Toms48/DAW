package practicatestparametrizado;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio Jesus
 */
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (value = Parameterized.class)


public class Parametrizado {
   
    String Cad,Caracter;
    int resultadoEsperado;
    
    public Parametrizado(String Cad, String Caracter,int resultadoEsperado){
    this.Cad=Cad;
    this.Caracter=Caracter;
    this.resultadoEsperado=resultadoEsperado;
    }
    
   /* @Parameters
public static Collection<Object[]> data() {
return Arrays.asList(new Object[][]{{"antonio","o",2},{"aa","a",2},{"aaeeii","e",2 }});
} */
@Parameters
public static Collection<Object[]> data() {
Object[][] data = new Object[][] { {"antonio","o",2},{"aa","a",2},{"aaeeii","e",2 }} ;
return Arrays.asList(data);
} 

@Test
public void testmetodos2() {
System.out.println("modulo");

metodos2Test instance = new metodos2Test();

int result =instance.testRepiteCaracter(Cad, Caracter);
    System.out.println(Cad+" "+Caracter);
assertEquals(resultadoEsperado, result, 0.0);
    System.out.println(result);

}

}
