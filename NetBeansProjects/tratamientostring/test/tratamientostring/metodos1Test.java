/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tratamientostring;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t-m-1
 */
public class metodos1Test {
    
    public metodos1Test() {
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
     * Test of cuentaVocales method, of class metodos1.
     */
    @Test
    public void testCuentaVocales() {
        System.out.println("cuentaVocales");
        int expResult = 2;
        
        //String cadena = metodos1.leerCadena();
        
        int result = metodos1.cuentaVocales("hola");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of invierteCadena method, of class metodos1.
     */
    @Test
    public void testInvierteCadena() {
        System.out.println("invierteCadena");
        String expResult = "aloh";
        String result = metodos1.invierteCadena("hola");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
