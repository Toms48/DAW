/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentarde;

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
public class metodos2Test {
    
    public metodos2Test() {
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
     * Test of aMinuscula method, of class metodos2.
     */
    @Test
    public void testAMinuscula() {
        System.out.println("aMinuscula");
        String cadena = "OLE OLE LOS CARACOLE";
        String expResult = "ole ole los caracole";
        String result = metodos2.aMinuscula(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of aMayuscula method, of class metodos2.
     */
    @Test
    public void testAMayuscula() {
        System.out.println("aMayuscula");
        String cadena = "ole ole los caracole";
        String expResult = "OLE OLE LOS CARACOLE";
        String result = metodos2.aMayuscula(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
