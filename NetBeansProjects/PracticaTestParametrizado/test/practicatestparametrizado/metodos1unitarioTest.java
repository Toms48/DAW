/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatestparametrizado;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Antonio Jesus
 */
public class metodos1unitarioTest {
    
    public metodos1unitarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Leer method, of class metodos1.
     */
   /**
     * Test of cuentaVocales method, of class metodos1.
     */
    @Test
    public void testCuentaVocales() {
        System.out.println("cuentaVocales");
        String cad = "aeiourtwqxnm";
        int expResult = 5;
        int result = metodos1.cuentaVocales(cad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of invierteCadena method, of class metodos1.
     */
    @Test
    public void testInvierteCadena() {
        System.out.println("invierteCadena");
        String cad = "asdf";
        String expResult = "fdsa";
        String result = metodos1.invierteCadena(cad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
