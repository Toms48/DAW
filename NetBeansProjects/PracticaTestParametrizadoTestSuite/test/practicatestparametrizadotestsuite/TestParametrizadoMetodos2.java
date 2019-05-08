package practicatestparametrizadotestsuite;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith (value = Parameterized.class)

public class TestParametrizadoMetodos2 {

String cadena;
String caracter;
int expResult;

public TestParametrizadoMetodos2(String cadena, String caracter, int expResult) {
this.cadena = cadena;
this.caracter = caracter;
this.expResult = expResult;
}

@Parameters
public static Collection<Object[]> data() {
Object[][] data = new Object[][] { {"hola","a",1}, {"mama","a",2}, {"piedra","u",5 }} ;
return Arrays.asList(data);
} 

    /**
     * Test of repiteCaracter method, of class metodos2.
     */
    @Test
    public void testRepiteCaracter() {
        System.out.println("repiteCaracter");
        int result = metodos2.repiteCaracter(cadena, caracter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}