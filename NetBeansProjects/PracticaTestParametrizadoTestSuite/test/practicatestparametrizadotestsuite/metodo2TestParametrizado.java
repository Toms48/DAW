/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamientostring;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jesus
 */
@RunWith (value = Parameterized.class)

public class metodo2TestParametrizado {
    String cadena,caracter;
    int expResult;
    public metodo2TestParametrizado(String cadena, String caracter,int expResult) {
        this.cadena=cadena;
        this.caracter=caracter;
        this.expResult=expResult;
    }
   
     @Parameters
public static Collection<Object[]> data() {
Object[][] data = new Object[][] { {"holaa","a",2}, {"labiicidondeesta","i",3}, {"FranciscoJesuDeSistesmasEsMiPadre","e",4}} ;
return Arrays.asList(data);
} 
    /**
     * Test of repiteCaracter method, of class metodo2.
     */
    @Test
    public void testRepiteCaracter() {
        System.out.println("repiteCaracter");
        metodo2TestParametrizado instance = new metodo2TestParametrizado("","",0);
        int result = metodo2.repiteCaracter(cadena, caracter);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
