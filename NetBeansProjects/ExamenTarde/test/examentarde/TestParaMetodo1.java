package examentarde;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith (value = Parameterized.class)

public class TestParaMetodo1 {

String cadena1;
String cadena2;
String expResult;

public TestParaMetodo1(String cadena1, String cadena2, String expResult) {
this.cadena1 = cadena1;
this.cadena2 = cadena2;
this.expResult = expResult;
}

@Parameters
public static Collection<Object[]> data() {
Object[][] data = new Object[][] { {"ole ole"," los caracole","ole ole los caracole"}, {"El profesor de"," entornos es el mejor","El profesor de entornos es el mejor"}, {"Ho","la","Hola"}} ;
return Arrays.asList(data);
} 

@Test
    public void testJuntarCadenas() {
        System.out.println("juntarCadenas");
        String result = metodos1.juntarCadenas(cadena1, cadena2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}