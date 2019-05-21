/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosExamen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class Cadenas1Test {
    
    String cadena = "";
    
    public Cadenas1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cadena = "TODO ESTE TEXTO TIENE QUE ESTAR EN MINUSCULAS";
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of pasaMin method, of class Cadenas1.
     */
    @Test
    public void testPasaMin() {
        System.out.println("pasaMin");
        String expResult = "todo este texto tiene que estar en minusculas";
        String result = Cadenas1.pasaMin(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pasaMay method, of class Cadenas1.
     */
    @Test
    public void testPasaMay() {
        System.out.println("pasaMay");
        String expResult = "TODO ESTE ESTO TIENE QUE ESTAR EN MAYUSCULAS";
        String result = Cadenas1.pasaMay(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
